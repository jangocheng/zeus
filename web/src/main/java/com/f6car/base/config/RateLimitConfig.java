/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author qixiaobo
 */
@ConfigurationProperties(prefix = "web.rate", ignoreUnknownFields = true)
public class RateLimitConfig {
    private Integer limitInSecond = 20;
    private Integer warnUpInSecond = 0;

    public Integer getLimitInSecond() {
        return limitInSecond;
    }

    public void setLimitInSecond(Integer limitInSecond) {
        this.limitInSecond = limitInSecond;
    }

    public Integer getWarnUpInSecond() {
        return warnUpInSecond;
    }

    public void setWarnUpInSecond(Integer warnUpInSecond) {
        this.warnUpInSecond = warnUpInSecond;
    }

}
