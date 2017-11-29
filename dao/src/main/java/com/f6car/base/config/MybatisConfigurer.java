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
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import tk.mybatis.spring.mapper.MapperScannerConfigurer;

import javax.sql.DataSource;

import static com.f6car.base.constant.Constants.MAPPER_PACKAGE;


/**
 * Mybatis & Mapper & PageHelper 配置
 *
 * @author qixiaobo
 */
@Configuration
public class MybatisConfigurer extends AbstractMyBatisConfigurer {

    public static final String PRIMARY_SQL_SESSION_FACTORY_NAME = Constants.LEVEL_PRIMARY + SQL_SESSION_FACTORY_NAME;
    public static final String PRIMARY_TRANSACTION_MANAGER_NAME = Constants.LEVEL_PRIMARY + TRANSACTION_MANAGER_NAME;
    public static final String PRIMARY_DATA_SOURCE_NAME = Constants.LEVEL_PRIMARY + DATA_SOURCE_NAME;


    @Bean(name = PRIMARY_SQL_SESSION_FACTORY_NAME)
    @Primary
    public SqlSessionFactory sqlSessionFactoryBean(@Autowired @Qualifier(PRIMARY_DATA_SOURCE_NAME) DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = getSqlSessionFactoryBean(dataSource);
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath*:mapper/**/*.xml"));
        return sqlSessionFactoryBean.getObject();
    }


    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = getMapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName(PRIMARY_SQL_SESSION_FACTORY_NAME);
        mapperScannerConfigurer.setBasePackage(MAPPER_PACKAGE);
        return mapperScannerConfigurer;
    }


    @Bean(name = PRIMARY_TRANSACTION_MANAGER_NAME)
    @Primary
    public DataSourceTransactionManager transactionManager1(@Autowired @Qualifier(PRIMARY_DATA_SOURCE_NAME) DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);

    }


}

