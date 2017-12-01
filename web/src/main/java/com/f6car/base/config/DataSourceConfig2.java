/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

import static com.f6car.base.config.MyBatisConfigurer2.SECOND_DATA_SOURCE_NAME;

/**
 * @author qixiaobo
 */
@Configuration
@ConfigurationProperties("spring.datasource2")
@ConditionalOnProperty(name = "spring.datasource2.url", matchIfMissing = false)
public class DataSourceConfig2 extends AbstractDataSourceConfig {
    @Bean(SECOND_DATA_SOURCE_NAME)
    public DataSource dataSource2() {
        DataSource datasource = getDatasource();
        return datasource;
    }
}
