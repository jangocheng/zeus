/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.jwt;


import com.f6car.base.constant.Constants;
import com.f6car.base.rlt.JwtToken;
import com.google.common.base.Strings;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;
import java.util.UUID;


/**
 * @author qixiaobo
 */
@Component
@ConditionalOnProperty(name = Constants.PROPERTY_WEB_SECURE, havingValue = Constants.WEB_SECURE_JWT)
public class JwtTokenFactory {

    public static final String ORG_CLAIM_NAME = "org";
    public static final String AUTHORITIES_CLAIM_NAME = "scopes";
    private final List<String> DEFAULT_REFRESH_AUTHORITY = Collections.singletonList(Scopes.REFRESH_TOKEN.authority());
    @Autowired
    private JwtConfig config;

    public AccessJwtToken createAccessJwtToken(UserContext userContext) {
        if (Strings.isNullOrEmpty(userContext.getUsername())) {
            throw new IllegalArgumentException("Cannot create JWT Token without username");
        }

        if (userContext.getAuthorities() == null || userContext.getAuthorities().isEmpty()) {
            throw new IllegalArgumentException("User doesn't have any privileges");
        }

        Claims claims = Jwts.claims().setSubject(userContext.getUsername());
        claims.put(AUTHORITIES_CLAIM_NAME, userContext.getAuthorities());
        claims.put(ORG_CLAIM_NAME, userContext.getIdOwnOrg());
        DateTime currentTime = new DateTime();

        String token = Jwts.builder()
                .setClaims(claims)
                .setIssuer(config.getTokenIssuer())
                .setIssuedAt(currentTime.toDate())
                .setExpiration(currentTime.plusMinutes(config.getTokenExpirationTime()).toDate())
                .signWith(config.getSignatureAlgorithm(), config.getTokenSigningKey())
                .compact();

        return new AccessJwtToken(token, claims);
    }

    public JwtToken createRefreshToken(UserContext userContext) {
        if (Strings.isNullOrEmpty(userContext.getUsername())) {
            throw new IllegalArgumentException("Cannot create JWT Token without username");
        }

        DateTime currentTime = new DateTime();

        Claims claims = Jwts.claims().setSubject(userContext.getUsername());
        claims.put(AUTHORITIES_CLAIM_NAME, DEFAULT_REFRESH_AUTHORITY);

        String token = Jwts.builder()
                .setClaims(claims)
                .setIssuer(config.getTokenIssuer())
                .setId(UUID.randomUUID().toString())
                .setIssuedAt(currentTime.toDate())
                .setExpiration(currentTime.plusMinutes(config.getRefreshTokenExpTime()).toDate())
                .signWith(config.getSignatureAlgorithm(), config.getTokenSigningKey())
                .compact();

        return new AccessJwtToken(token, claims);
    }
}
