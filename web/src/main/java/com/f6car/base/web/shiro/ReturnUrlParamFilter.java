/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.web.shiro;

import com.baomidou.kisso.SSOConfig;
import com.google.common.collect.Maps;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.web.util.SavedRequest;
import org.apache.shiro.web.util.WebUtils;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Map;

/**
 * @author qixiaobo
 */
public class ReturnUrlParamFilter extends FormAuthenticationFilter {
    @Override
    public String getLoginUrl() {
        return SSOConfig.getInstance().getLoginUrl();
    }

    @Override
    protected void redirectToLogin(ServletRequest request, ServletResponse response) throws IOException {
        SavedRequest savedRequest = WebUtils.getSavedRequest(request);
        if (savedRequest != null) {
            String loginUrl = getLoginUrl();
            Map<String, String> map = Maps.newHashMapWithExpectedSize(1);
            map.put(SSOConfig.getInstance().getParamReturl(), request.getScheme() + "://" + ((HttpServletRequest) request).getHeader("host") + savedRequest.getRequestUrl());
            WebUtils.issueRedirect(request, response, loginUrl, map);
        } else {
            super.redirectToLogin(request, response);
        }

    }
}
