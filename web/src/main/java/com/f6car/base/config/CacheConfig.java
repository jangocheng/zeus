/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.config;

import net.oschina.j2cache.autoconfigure.J2CacheConfig;
import net.oschina.j2cache.autoconfigure.J2CacheIniter;
import org.nutz.j2cache.spring.SpringJ2CacheManager;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cache.CacheManager;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerUtils;
import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:j2cache/j2cache-${spring.profiles.active}.properties")
public class CacheConfig {
    @Value("${ehcache.ehcache.name}")
    private String ehcacheName;

    @Bean("ehCacheManager")
    public net.sf.ehcache.CacheManager ehCacheManager() {
        return EhCacheManagerUtils.buildCacheManager(ehcacheName);
    }

    @DependsOn({"ehCacheManager", "j2CacheIniter"})
    @ConditionalOnProperty(name = "spring.cluster", havingValue = "true")
    @Bean
    @Primary
    public CacheManager springJ2CacheManager() {
        return new SpringJ2CacheManager();
    }


    @Bean
    @ConditionalOnProperty(name = "spring.cluster", havingValue = "false")
    public CacheManager springEhCacheManager(net.sf.ehcache.CacheManager cacheManager) {
        EhCacheCacheManager manager = new EhCacheCacheManager();
        manager.setCacheManager(cacheManager);
        return manager;
    }

    @Bean("j2CacheIniter")
    @ConditionalOnProperty(name = "spring.cluster", havingValue = "true")
    public J2CacheIniter j2CacheIniter(J2CacheConfig j2cacheConfig) {
        return new J2CacheIniter(j2cacheConfig);
    }

}
