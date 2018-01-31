/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.web.interceptor;

import com.f6car.base.constant.Constants;
import com.f6car.base.core.F6Static;
import com.f6car.base.exception.AuthenticationFailedException;
import com.f6car.base.exception.AuthenticationVerifyFailedException;
import com.f6car.base.jwt.JwtConfig;
import com.f6car.base.jwt.TokenExtractor;
import com.f6car.base.jwt.TokenVerifier;
import com.google.common.collect.Lists;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigInteger;
import java.util.Collections;
import java.util.List;

import static com.f6car.base.constant.Constants.AUTHENTICATION;
import static com.f6car.base.constant.Constants.AUTHORIZATION;
import static com.f6car.base.jwt.JwtTokenFactory.ORG_CLAIM_NAME;

/**
 * @author qixiaobo
 * @date 2018/1/18
 */
@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
@ConditionalOnProperty(name = Constants.PROPERTY_WEB_SECURE, havingValue = Constants.WEB_SECURE_JWT)
public class JWTTokenAuthInterceptor extends AbstractExcludeInterceptor {
    private static final Logger logger = LoggerFactory.getLogger(JWTTokenAuthInterceptor.class);
    @Autowired
    private List<TokenVerifier> verifiers = Collections.emptyList();
    @Autowired
    private TokenExtractor tokenExtractor;
    @Autowired
    private JwtConfig config;


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String authorizationHeader = request.getHeader(AUTHORIZATION);
        String authenticationHeader = request.getHeader(AUTHENTICATION);

        // Check for authorization header presence
        String authHeader;
        if (StringUtils.isEmpty(authorizationHeader)) {
            if (StringUtils.isEmpty(authenticationHeader)) {
                authHeader = null;
            } else {
                authHeader = authenticationHeader;
                if (logger.isDebugEnabled()) {
                    logger.debug("authentication: " + authenticationHeader);
                }
            }
        } else {
            authHeader = authorizationHeader;
            if (logger.isDebugEnabled()) {
                logger.debug("authorization: " + authorizationHeader);
            }
        }

        try {
            Jws<Claims> claimsJws = Jwts.parser().setSigningKey(config.getTokenSigningKey())

                    .parseClaimsJws(tokenExtractor.extract(authHeader));
            if (this.verifiers != null && !this.verifiers.isEmpty()) {
                for (TokenVerifier verifier : this.verifiers) {
                    if (!verifier.verifierToken(claimsJws)) {
                        throw new AuthenticationVerifyFailedException("verify failed !\r\ntoken:" + claimsJws + " \r\n" + verifier.getClass().getSimpleName());
                    }
                }
            }
            Claims body = claimsJws.getBody();
            request.setAttribute("claims", body);
            F6Static.setUser(new BigInteger(body.getSubject()));
            F6Static.setOrg(new BigInteger(body.get(ORG_CLAIM_NAME, String.class)));
            // Now since the authentication process if finished
            // move the request forward
        } catch (final Exception e) {
            throw new AuthenticationFailedException("Invalid token. Cause:" + e.getMessage());
        }
        return super.preHandle(request, response, handler);
    }

    @Override
    public List<String> getExcludePath() {
        return Lists.newArrayList("/api/auth/**");
    }
}
