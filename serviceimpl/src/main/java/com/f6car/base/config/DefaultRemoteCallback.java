/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.config;

import com.air.tqb.rmi.clientInfo.ClientInfo;
import com.air.tqb.rmi.clientInfo.ClientInfoRemoteInvocationFilter;
import com.air.tqb.rmi.clientInfo.RemoteInvocationCallback;
import com.f6car.base.core.F6Static;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author qixiaobo
 */
public class DefaultRemoteCallback implements RemoteInvocationCallback {
    @Value("${spring.application.name}")
    private String from;

    @Override
    public void afterCreateRemoteInvocation(ClientInfoRemoteInvocationFilter clientInfoRemoteInvocationFilter, String s, Object[] objects) {
        // Do nothing
    }

    @Override
    public void beforeCreateRemoteInvocation(ClientInfoRemoteInvocationFilter clientInfoRemoteInvocationFilter, String s, Object[] objects) {
        if (F6Static.getUser() != null) {
            //用户尚未登录
            ClientInfo clientInfo = new ClientInfo();
            clientInfo.setFrom(from);
            clientInfo.setIdOwnOrg(F6Static.getOrg());
            clientInfo.setUser(F6Static.getUser());
            clientInfoRemoteInvocationFilter.setClientInfo(clientInfo);
        }
    }
}
