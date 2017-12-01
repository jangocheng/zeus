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
import com.air.tqb.vo.TbUserVo;
import com.baomidou.kisso.SSOToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

import static com.f6car.base.constant.Constants.SESSION_ATTRIBUTE_NAME_USER;

/**
 * @author qixiaobo
 */
@Component
@ConditionalOnBean(UserService.class)
public class CustomCallback implements LoginCallback {
    @Autowired(required = false)
    private UserService userService;

    @Override
    public void callback(HttpServletRequest httpServletRequest, SSOToken ssoToken) {
        TbUserVo userInfoById = userService.getUserInfoById(ssoToken.getData());
        httpServletRequest.getSession().setAttribute(SESSION_ATTRIBUTE_NAME_USER, userInfoById);
    }
}
