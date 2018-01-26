/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.jwt;

import com.f6car.base.constant.Constants;
import com.f6car.base.exception.AuthCredentialsMissingException;
import com.google.common.base.Strings;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * @author qixiaobo
 * @date 2017/2/24
 */
@Component
public class DefaultTokenExtractor implements TokenExtractor {
    @Override
    public String extract(String authHeader) {
        if (StringUtils.isEmpty(authHeader) || !authHeader.startsWith(Constants.AUTH_HEADER_START_STR)) {
            throw new AuthCredentialsMissingException("Missing or invalid Authorization header." + Strings.nullToEmpty(authHeader));
        }
        // The part after "Bearer "
        return authHeader.substring(Constants.AUTH_HEADER_START_STR.length());

    }
}
