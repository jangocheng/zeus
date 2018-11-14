/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.config;

import com.air.tqb.realm.CustomRpcRealm;
import com.air.tqb.shiro.api.RpcRealm;
import com.baomidou.kisso.SSOConfig;
import org.apache.shiro.cache.CacheManager;
import org.apache.shiro.cache.ehcache.EhCacheManager;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.session.mgt.SessionManager;
import org.apache.shiro.session.mgt.eis.EnterpriseCacheSessionDAO;
import org.apache.shiro.session.mgt.eis.SessionDAO;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.filter.mgt.DefaultFilter;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.servlet.Cookie;
import org.apache.shiro.web.servlet.SimpleCookie;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.nutz.j2cache.shiro.J2CacheManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.*;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author qixiaobo
 */
@Configuration
@Lazy
public class ShiroConfig {

    @Bean
    public FilterRegistrationBean corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);
        config.addAllowedOrigin("*");
        config.addAllowedHeader("*");
        config.addAllowedMethod("*");
        config.addExposedHeader("X-Authorization");
        config.addExposedHeader("X-Authenticate");
        source.registerCorsConfiguration("/**", config);
        FilterRegistrationBean bean = new FilterRegistrationBean(new CorsFilter(source));
        bean.setOrder(0);
        return bean;
    }

    @Bean(name = "shiroFilter")
    public ShiroFilterFactoryBean shiroFilter(SecurityManager securityManager, ResourceHandlerConfig resourceHandlerConfig) {

        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        //拦截器.
        Map<String, String> filterChainDefinitionMap = new LinkedHashMap<>();
        // 配置不会被拦截的链接 顺序判断
        filterChainDefinitionMap.put("/**", DefaultFilter.anon.toString());
        shiroFilterFactoryBean.setLoginUrl(SSOConfig.getInstance().getLoginUrl());
        shiroFilterFactoryBean.setSuccessUrl("/index");
        //未授权界面
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
    public SecurityManager securityManager(CustomRpcRealm realm, CacheManager cacheManager, SessionManager sessionManager) {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setSessionManager(sessionManager);
        securityManager.setRealm(realm);
        securityManager.setCacheManager(cacheManager);
        return securityManager;
    }

    @Bean
    @ConditionalOnProperty(name = "spring.cluster", havingValue = "false")
    public EhCacheManager shiroEhCacheManager(net.sf.ehcache.CacheManager ehCachemanager) {
        EhCacheManager manager = new EhCacheManager();
        manager.setCacheManager(ehCachemanager);
        return manager;
    }

    @Bean
    public LifecycleBeanPostProcessor lifecycleBeanPostProcessor() {
        return new LifecycleBeanPostProcessor();
    }


    @Bean
    @Profile("!unit-test")
    public DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator() {
        DefaultAdvisorAutoProxyCreator creator = new DefaultAdvisorAutoProxyCreator();
        creator.setProxyTargetClass(true);
        return creator;
    }

    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(SecurityManager manager) {
        AuthorizationAttributeSourceAdvisor advisor = new AuthorizationAttributeSourceAdvisor();
        advisor.setSecurityManager(manager);
        return advisor;
    }

    @Bean
    @ConditionalOnProperty(name = "spring.cluster", havingValue = "true")
    @DependsOn({"ehCacheManager", "j2CacheIniter"})
    @Primary
    public J2CacheManager j2cacheManager() {
        return new J2CacheManager();
    }

    @Bean
    @ConditionalOnProperty(name = "spring.cluster", havingValue = "true")
    public SessionManager sessionManager(SessionDAO sessionDAO, Cookie sessionIdCookie) {
        DefaultWebSessionManager defaultWebSessionManager = new DefaultWebSessionManager();
        defaultWebSessionManager.setSessionDAO(sessionDAO);
        defaultWebSessionManager.setSessionIdCookie(sessionIdCookie);
        return defaultWebSessionManager;
    }

    @Bean
    public Cookie sessionIdCookie(CookieConfig cookieConfig) {
        Cookie cookie = new SimpleCookie();
        cookie.setName(cookieConfig.getName());
        cookie.setHttpOnly(cookieConfig.isHttpOnly());
        cookie.setSecure(cookieConfig.isSecure());
        cookie.setDomain(cookieConfig.getDomain());
        cookie.setPath(cookieConfig.getPath());
        return cookie;
    }

    @Bean
    public CookieConfig cookieConfig() {
        return new CookieConfig();
    }

    @Bean
    @ConditionalOnProperty(name = "spring.cluster", havingValue = "false")
    public SessionManager defaultSessionManager(Cookie sessionIdCookie) {
        DefaultWebSessionManager defaultWebSessionManager = new DefaultWebSessionManager();
        defaultWebSessionManager.setSessionIdCookie(sessionIdCookie);
        return defaultWebSessionManager;
    }

    @Bean
    @ConditionalOnProperty(name = "spring.cluster", havingValue = "true")
    public SessionDAO sessionDAO(CacheManager cacheManager) {
        EnterpriseCacheSessionDAO enterpriseCacheSessionDAO = new EnterpriseCacheSessionDAO();
        enterpriseCacheSessionDAO.setCacheManager(cacheManager);
        return enterpriseCacheSessionDAO;
    }

}