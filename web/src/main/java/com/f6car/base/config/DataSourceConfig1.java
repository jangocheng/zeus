/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

import static com.f6car.base.config.MybatisConfigurer.PRIMARY_DATA_SOURCE_NAME;

/**
 * @author qixiaobo
 */
@Configuration
@ConfigurationProperties("spring.datasource")
public class DataSourceConfig1 extends AbstractDataSourceConfig {
    @Bean(PRIMARY_DATA_SOURCE_NAME)
    @Primary
    public DataSource dataSource1() {
        return this;
    }
}
