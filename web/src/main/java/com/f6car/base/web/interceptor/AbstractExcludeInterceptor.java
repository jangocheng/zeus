/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.web.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import java.util.Collections;
import java.util.List;

/**
 * @author qixiaobo
 */
public abstract class AbstractExcludeInterceptor extends HandlerInterceptorAdapter implements ExcludePathable {
    @Override
    public List<String> getExcludePath() {
        return Collections.emptyList();
    }
}
