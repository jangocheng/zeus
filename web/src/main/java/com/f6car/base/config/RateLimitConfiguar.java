/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.config;

import com.google.common.util.concurrent.RateLimiter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

import static com.f6car.base.constant.Constants.PROPERTY_WEB_RATE;

/**
 * @author qixiaobo
 */
@Configuration
@ConditionalOnProperty(name = PROPERTY_WEB_RATE, havingValue = "true")
public class RateLimitConfiguar {

    @Bean
    @ConditionalOnMissingBean(RateLimitConfig.class)
    public RateLimitConfig rateLimit() {
        return new RateLimitConfig();
    }

    @Bean
    @ConditionalOnMissingBean(RateLimiter.class)
    public RateLimiter rateLimiter(RateLimitConfig rateLimitConfig) {
        RateLimiter rateLimiter = RateLimiter.create(rateLimitConfig.getLimitInSecond(), rateLimitConfig.getWarnUpInSecond(), TimeUnit.SECONDS);
        return rateLimiter;
    }
}
