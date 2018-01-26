/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.web.interceptor;

import com.f6car.base.annotation.CSRFTokenRefresh;
import com.f6car.base.annotation.CSRFTokenValidate;
import com.f6car.base.exception.InvalidCSRFTokenException;
import com.google.common.base.Strings;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.context.annotation.Profile;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.lang.reflect.Method;

import static com.f6car.base.constant.Constants.HTTP_HEADER_NAME_CSRF_TOKEN;
import static com.f6car.base.constant.Constants.SESSION_ATTRIBUTE_NAME_CSRF_TOKEN;

/**
 * @author qixiaobo
 */
@Order(Ordered.HIGHEST_PRECEDENCE + 2)
@Component
@Profile("!unit-test")
public class CSRFInterceptor extends AbstractExcludeInterceptor {
    private int length = 10;


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (handler instanceof HandlerMethod) {
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            Method method = handlerMethod.getMethod();
            HttpSession session = request.getSession();
            if (method.isAnnotationPresent(CSRFTokenValidate.class)) {
                CSRFTokenValidate csrfTokenValidate = method.getAnnotation(CSRFTokenValidate.class);
                if (csrfTokenValidate.value()) {
                    String headerCsrf = request.getHeader(HTTP_HEADER_NAME_CSRF_TOKEN);
                    if (Strings.isNullOrEmpty(headerCsrf) || headerCsrf.length() != length) {
                        throw new InvalidCSRFTokenException();
                    }

                    String sessionCsrf = (String) session.getAttribute(SESSION_ATTRIBUTE_NAME_CSRF_TOKEN);
                    if (!headerCsrf.equals(sessionCsrf)) {
                        throw new InvalidCSRFTokenException();
                    }
                    session.removeAttribute(SESSION_ATTRIBUTE_NAME_CSRF_TOKEN);

                }

            }
            if (method.isAnnotationPresent(CSRFTokenRefresh.class)) {
                CSRFTokenRefresh csrfTokenRefresh = method.getAnnotation(CSRFTokenRefresh.class);
                if (csrfTokenRefresh.value()) {
                    String token = generateToken();
                    session.setAttribute(SESSION_ATTRIBUTE_NAME_CSRF_TOKEN, token);
                    response.setHeader(HTTP_HEADER_NAME_CSRF_TOKEN, token);
                }
            }
        }
        return super.preHandle(request, response, handler);
    }


    private String generateToken() {
        return RandomStringUtils.random(length, true, true);
    }
}
