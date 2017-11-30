/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.config;

import com.f6car.base.constant.Constants;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import tk.mybatis.spring.mapper.MapperScannerConfigurer;

import javax.sql.DataSource;

import static com.f6car.base.config.MyBatisConfigurer2.SECOND_DATA_SOURCE_NAME;
import static com.f6car.base.constant.Constants.MAPPER_PACKAGE;

/**
 * @author qixiaobo
 */
@Configuration
@ConditionalOnBean(name = SECOND_DATA_SOURCE_NAME)
public class MyBatisConfigurer2 extends AbstractMyBatisConfigurer {
    public static final String SECOND_TRANSACTION_MANAGER_NAME = Constants.LEVEL_SECOND + TRANSACTION_MANAGER_NAME;
    public static final String SECOND_SQL_SESSION_FACTORY_NAME = Constants.LEVEL_SECOND + SQL_SESSION_FACTORY_NAME;
    public static final String SECOND_DATA_SOURCE_NAME = Constants.LEVEL_SECOND + DATA_SOURCE_NAME;


    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer2() {
        MapperScannerConfigurer mapperScannerConfigurer = getMapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName(SECOND_SQL_SESSION_FACTORY_NAME);
        mapperScannerConfigurer.setBasePackage(MAPPER_PACKAGE + "2");
        return mapperScannerConfigurer;
    }

    @Bean(name = SECOND_TRANSACTION_MANAGER_NAME)
    public DataSourceTransactionManager transactionManager2(@Autowired @Qualifier(SECOND_DATA_SOURCE_NAME) DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);

    }

    @Bean(name = SECOND_SQL_SESSION_FACTORY_NAME)
    public SqlSessionFactory sqlSessionFactoryBean2(@Autowired @Qualifier(SECOND_DATA_SOURCE_NAME) DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = getSqlSessionFactoryBean(dataSource);
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath*:mapper2/**/*.xml"));
        return sqlSessionFactoryBean.getObject();
    }
}
