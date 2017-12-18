/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.config;

import main.java.com.UpYun;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/**
 * @author qixiaobo
 */
@Configuration
@Lazy
public class UpYunConfigurer {
    @Bean
    public UpYun upYun(UpYunConfig upYunConfig) {
        UpYun upYun = new UpYun(upYunConfig.getBucketName(), upYunConfig.getUserName(), upYunConfig.getPassword());
        if (upYunConfig.getTimeout() != null && upYunConfig.getTimeout() > 0) {
            upYun.setTimeout(upYunConfig.getTimeout());
        }
        return upYun;
    }

    @Bean
    public UpYunConfig upYunConfig() {
        return new UpYunConfig();
    }
}
