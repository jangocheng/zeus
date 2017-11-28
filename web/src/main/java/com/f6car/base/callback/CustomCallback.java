/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.callback;

import com.air.tqb.realm.LoginCallback;
import com.air.tqb.service.user.UserService;
import com.baomidou.kisso.SSOToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class CustomCallback implements LoginCallback {
    @Autowired(required = false)
    private UserService userService;

    @Override
    public void callback(HttpServletRequest httpServletRequest, SSOToken ssoToken) {
        userService.getUserInfoById(ssoToken.getData());
    }
}
