/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.web.interceptor;

import com.f6car.base.exception.RateLimitExceedException;
import com.google.common.util.concurrent.RateLimiter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static com.f6car.base.constant.Constants.PROPERTY_WEB_RATE;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE + 9)
@ConditionalOnProperty(name = PROPERTY_WEB_RATE)
public class RateLimitInterceptor extends AbstractExcludeInterceptor {
    @Autowired
    private RateLimiter rateLimiter;


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (rateLimiter.tryAcquire()) {
            rateLimiter.acquire();
            return super.preHandle(request, response, handler);
        } else {
            throw new RateLimitExceedException();

        }
    }
}
