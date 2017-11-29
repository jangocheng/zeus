/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.config;

import com.air.tqb.realm.CustomRpcRealm;
import com.air.tqb.shiro.api.RpcRealm;
import com.baomidou.kisso.SSOConfig;
import com.f6car.base.web.shiro.ReturnUrlParamFilter;
import com.google.common.collect.Maps;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.filter.mgt.DefaultFilter;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.nutz.j2cache.shiro.J2CacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import javax.servlet.Filter;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author qixiaobo
 */
@Configuration
public class ShiroConfig {
    @Bean(name = "shiroFilter")
    public ShiroFilterFactoryBean shirFilter(SecurityManager securityManager) {
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        //拦截器.
        Map<String, String> filterChainDefinitionMap = new LinkedHashMap<>();
        // 配置不会被拦截的链接 顺序判断
        filterChainDefinitionMap.put("/static/**", DefaultFilter.anon.toString());
        filterChainDefinitionMap.put("/view/static/**", DefaultFilter.anon.toString());
        filterChainDefinitionMap.put("/**", DefaultFilter.authc.toString());
        shiroFilterFactoryBean.setLoginUrl(SSOConfig.getInstance().getLoginUrl());
        shiroFilterFactoryBean.setSuccessUrl("/index");
        Map<String, Filter> filterMap = Maps.newHashMap();
        filterMap.put(DefaultFilter.authc.toString(), new ReturnUrlParamFilter());
        shiroFilterFactoryBean.setFilters(filterMap);
        //未授权界面;
        shiroFilterFactoryBean.setUnauthorizedUrl("/403");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
        return shiroFilterFactoryBean;
    }

    @Bean
    public CustomRpcRealm customRpcRealm(RpcRealm rpcRealm) {
        CustomRpcRealm customRpcRealm = new CustomRpcRealm();
        customRpcRealm.setRpcRealm(rpcRealm);
        return customRpcRealm;
    }

    @Bean
    public SecurityManager securityManager(CustomRpcRealm realm) {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(realm);
        securityManager.setCacheManager(j2cacheManager());
        return securityManager;
    }

    @Bean
    public LifecycleBeanPostProcessor lifecycleBeanPostProcessor() {
        return new LifecycleBeanPostProcessor();
    }

    @Bean
    @DependsOn({"ehCacheManager", "j2CacheIniter"})
    public J2CacheManager j2cacheManager() {
        return new J2CacheManager();
    }

}