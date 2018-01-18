/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.config;

import com.f6car.base.core.executor.AfterCommitExecutor;
import com.f6car.base.core.executor.AfterCommitExecutorImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author qixiaobo
 */
@Configuration
public class AfterCommitConfig {
    @Bean
    public AfterCommitExecutor afterCommitExecutor() {
        return new AfterCommitExecutorImpl();
    }
}
