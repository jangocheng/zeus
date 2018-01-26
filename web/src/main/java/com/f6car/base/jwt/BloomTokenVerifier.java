/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.jwt;

import com.f6car.base.constant.Constants;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

import javax.validation.constraints.NotNull;

/**
 * @author qixiaobo
 * @date 2018/1/19
 */
//@Component
@ConditionalOnProperty(name = Constants.PROPERTY_WEB_SECURE, havingValue = Constants.WEB_SECURE_JWT)
public class BloomTokenVerifier implements TokenVerifier {
    @Override
    public boolean verifierToken(@NotNull Jws<Claims> claimsJws) {
        return true;
    }
}
