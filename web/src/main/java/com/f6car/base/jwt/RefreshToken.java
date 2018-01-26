/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.jwt;


import com.f6car.base.rlt.JwtToken;
import com.google.common.base.Optional;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;

import java.util.List;

/**
 * Created by qixiaobo on 2018/1/23.
 */
public class RefreshToken implements JwtToken {

    private static final long serialVersionUID = -4800854817455646424L;
    private Jws<Claims> claims;

    private RefreshToken(Jws<Claims> claims) {
        this.claims = claims;
    }


    public static Optional<RefreshToken> create(RawAccessJwtToken token, String signingKey) {
        Jws<Claims> claims = token.parseClaims(signingKey);
        List scopes = claims.getBody().get("scopes", List.class);
        if (scopes == null || scopes.isEmpty()
                || !scopes.contains(Scopes.REFRESH_TOKEN.authority())) {
            return Optional.absent();
        }
        return Optional.of(new RefreshToken(claims));
    }

    @Override
    public String getToken() {
        return null;
    }

    public Jws<Claims> getClaims() {
        return claims;
    }

    public String getJti() {
        return claims.getBody().getId();
    }

    public String getSubject() {
        return claims.getBody().getSubject();
    }
}
