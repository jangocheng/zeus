/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.controller.base;


import com.f6car.base.common.Result;
import com.f6car.base.common.ResultGenerator;
import com.f6car.base.constant.Constants;
import com.f6car.base.exception.AuthenticationFailedException;
import com.f6car.base.exception.AuthenticationVerifyFailedException;
import com.f6car.base.jwt.*;
import com.f6car.base.rlt.AuthResponse;
import com.f6car.base.rlt.JwtToken;
import com.google.common.base.Optional;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

/**
 * @author qixiaobo
 */
@RestController
@RequestMapping("/api/auth")
@ConditionalOnProperty(name = Constants.PROPERTY_WEB_SECURE, havingValue = Constants.WEB_SECURE_JWT)
public class AuthController {
    private static final Logger logger = LoggerFactory.getLogger(AuthController.class);
    @Autowired
    private TokenExtractor tokenExtractor;
    @Autowired
    private JwtTokenFactory tokenFactory;
    @Autowired
    private List<TokenVerifier> verifiers = Collections.emptyList();
    @Autowired
    private JwtConfig jwtConfig;

    @PostMapping(value = "refresh", produces = {MediaType.APPLICATION_JSON_VALUE})
    @ApiOperation(value = "刷新授权", notes = "")
    public Result refreshToken(@RequestHeader(Constants.AUTHENTICATION) String authenticationHeader) {
        logger.debug("auth header:{}", authenticationHeader);
        RawAccessJwtToken rawToken = new RawAccessJwtToken(tokenExtractor.extract(authenticationHeader));
        Optional<RefreshToken> refreshTokenOptional = RefreshToken.create(rawToken, jwtConfig.getTokenSigningKey());
        if (!refreshTokenOptional.isPresent()) {
            throw new AuthenticationFailedException("parse failed!\r\nheader:" + authenticationHeader);
        }
        RefreshToken refreshToken = refreshTokenOptional.get();
        Jws<Claims> chaims = refreshToken.getClaims();
        if (this.verifiers != null && !this.verifiers.isEmpty()) {
            for (TokenVerifier verifier : this.verifiers) {
                if (!verifier.verifierToken(chaims)) {
                    throw new AuthenticationVerifyFailedException("verify failed !\r\ntoken:" + chaims + " \r\n" + verifier.getClass().getSimpleName());
                }
            }
        }

        String subject = refreshToken.getSubject();
        logger.debug("auth subject:{}", subject);
        AccessJwtToken token = tokenFactory.createAccessJwtToken(UserContext.create(subject, Collections.singletonList(Scopes.ACCESS_TOKEN.authority())));
        return ResultGenerator.genSuccessResult(new AuthResponse(token, null));

    }

    @PostMapping(value = "", produces = {MediaType.APPLICATION_JSON_VALUE})
    @ApiOperation(value = "授权", notes = "")
    public Result authToken(String userName, String password) {
        logger.debug("username:{},password:{}", userName, password);
        //TODO
        UserContext userContext = UserContext.create(null, Collections.<String>emptyList());
        JwtToken accessToken = tokenFactory.createAccessJwtToken(userContext);
        JwtToken refreshToken = tokenFactory.createRefreshToken(userContext);
        return ResultGenerator.genSuccessResult(new AuthResponse(accessToken, refreshToken));

    }
}