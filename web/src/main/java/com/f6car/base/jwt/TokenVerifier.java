/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;

import javax.validation.constraints.NotNull;

/**
 * Created by qixiaobo on 2018/1/19.
 */
public interface TokenVerifier {

    boolean verifierToken(@NotNull Jws<Claims> claimsJws);
}
