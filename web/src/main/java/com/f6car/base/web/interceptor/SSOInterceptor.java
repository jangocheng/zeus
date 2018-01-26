/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.web.interceptor;

import com.baomidou.kisso.web.interceptor.SSOSpringInterceptor;
import com.f6car.base.constant.Constants;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Profile;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author qixiaobo
 */
@Order(Ordered.HIGHEST_PRECEDENCE)
@Component
@Profile("!unit-test")
@ConditionalOnProperty(name = Constants.PROPERTY_WEB_SECURE, havingValue = Constants.WEB_SECURE_KISSO)
public class SSOInterceptor extends SSOSpringInterceptor {
}
