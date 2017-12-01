/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.config;

import com.f6car.base.core.MybatisTransactionTimeoutInterceptor;
import com.f6car.base.core.SoInterceptor;
import com.github.pagehelper.PageHelper;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.ExecutorType;
import org.mybatis.spring.SqlSessionFactoryBean;
import tk.mybatis.spring.mapper.MapperScannerConfigurer;

import javax.sql.DataSource;
import java.util.Properties;

import static com.f6car.base.constant.Constants.MAPPER_INTERFACE_REFERENCE;
import static com.f6car.base.constant.Constants.MODEL_PACKAGE;

/**
 * @author qixiaobo
 */
public class AbstractMyBatisConfigurer {
    protected static final String SQL_SESSION_FACTORY_NAME = "SqlSessionFactoryBean";
    protected static final String TRANSACTION_MANAGER_NAME = "TransactionManager";
    protected static final String DATA_SOURCE_NAME = "DataSource";

    protected SqlSessionFactoryBean getSqlSessionFactoryBean(DataSource dataSource) {
        SqlSessionFactoryBean factory = new SqlSessionFactoryBean();
        factory.setDataSource(dataSource);
        factory.setTypeAliasesPackage(MODEL_PACKAGE);

        //配置分页插件，详情请查阅官方文档
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.setProperty("pageSizeZero", "true");
        //分页尺寸为0时查询所有纪录不再执行分页
        properties.setProperty("reasonable", "true");
        //页码<=0 查询第一页，页码>=总页数查询最后一页
        properties.setProperty("supportMethodsArguments", "false");
        //支持通过 Mapper 接口参数来传递分页参数
        pageHelper.setProperties(properties);

        //添加插件
        factory.setPlugins(new Interceptor[]{new MybatisTransactionTimeoutInterceptor(), new SoInterceptor(), pageHelper});

        org.apache.ibatis.session.Configuration config = new org.apache.ibatis.session.Configuration();
        config.setDefaultStatementTimeout(5);
        config.setDefaultFetchSize(10000);
        config.setDefaultExecutorType(ExecutorType.REUSE);
        factory.setConfiguration(config);
        return factory;
    }

    protected MapperScannerConfigurer getMapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        //配置通用Mapper，详情请查阅官方文档
        Properties properties = new Properties();
        properties.setProperty("mappers", MAPPER_INTERFACE_REFERENCE);
        properties.setProperty("notEmpty", "false");
        //insert、update是否判断字符串类型!='' 即 test="str != null"表达式内是否追加 and str != ''
        properties.setProperty("IDENTITY", "MYSQL");
        mapperScannerConfigurer.setProperties(properties);
        return mapperScannerConfigurer;
    }
}
