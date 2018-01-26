/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.web.interceptor;

import com.air.tqb.realm.LoginCallback;
import com.baomidou.kisso.SSOHelper;
import com.baomidou.kisso.SSOToken;
import com.baomidou.kisso.common.shiro.SSOAuthToken;
import com.f6car.base.constant.Constants;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Profile;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

/**
 * @author qixiaobo
 */
@Order(Ordered.HIGHEST_PRECEDENCE + 1)
@Component
@Profile("!unit-test")
@ConditionalOnProperty(name = Constants.PROPERTY_WEB_SECURE, havingValue = Constants.WEB_SECURE_KISSO)
public class KissoShiroInterceptor extends AbstractExcludeInterceptor {
    private static final Logger logger = Logger.getLogger("KissoShiroInterceptor");
    @Autowired
    private List<LoginCallback> loginCallbackList = Collections.emptyList();
    private static final String X_AUTH_HEADER = "X-Authenticate";

    public KissoShiroInterceptor() {
    }

    public void setLoginCallbackList(List<LoginCallback> loginCallbackList) {
        this.loginCallbackList = loginCallbackList;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (handler instanceof HandlerMethod) {
            SSOToken token = (SSOToken) SSOHelper.attrToken(request);
            if (token == null) {
                return true;
            }

            Subject currentUser = SecurityUtils.getSubject();
            if (currentUser.isAuthenticated() && !token.getUid().equals(currentUser.getPrincipal())) {
                currentUser.logout();
            }
            if (!currentUser.isAuthenticated()) {
                currentUser.login(new SSOAuthToken(token));
                if (!this.loginCallbackList.isEmpty()) {
                    for (LoginCallback callback : loginCallbackList) {
                        callback.callback(request, token);
                    }

                }
                response.addHeader(X_AUTH_HEADER, (String) currentUser.getPrincipal());
                logger.fine(" shiro callback success. ");
            }
        }

        return true;
    }
}