/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.config;

import com.alibaba.druid.filter.config.ConfigFilter;
import com.alibaba.druid.filter.encoding.EncodingConvertFilter;
import com.alibaba.druid.filter.logging.CommonsLogFilter;
import com.alibaba.druid.filter.logging.Log4j2Filter;
import com.alibaba.druid.filter.logging.Log4jFilter;
import com.alibaba.druid.filter.logging.Slf4jLogFilter;
import com.alibaba.druid.filter.stat.StatFilter;
import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.wall.WallFilter;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author qixiaobo
 */

public abstract class AbstractDataSourceConfig extends DruidDataSource {
    @Autowired(required = false)
    public void addStatFilter(StatFilter statFilter) {
        super.filters.add(statFilter);
    }

    @Autowired(required = false)
    public void addConfigFilter(ConfigFilter configFilter) {
        super.filters.add(configFilter);
    }

    @Autowired(required = false)
    public void addEncodingConvertFilter(EncodingConvertFilter encodingConvertFilter) {
        super.filters.add(encodingConvertFilter);
    }

    @Autowired(required = false)
    public void addSlf4jLogFilter(Slf4jLogFilter slf4jLogFilter) {
        super.filters.add(slf4jLogFilter);
    }

    @Autowired(required = false)
    public void addLog4jFilter(Log4jFilter log4jFilter) {
        super.filters.add(log4jFilter);
    }

    @Autowired(required = false)
    public void addLog4j2Filter(Log4j2Filter log4j2Filter) {
        super.filters.add(log4j2Filter);
    }

    @Autowired(required = false)
    public void addCommonsLogFilter(CommonsLogFilter commonsLogFilter) {
        super.filters.add(commonsLogFilter);
    }

    @Autowired(required = false)
    public void addWallFilter(WallFilter wallFilter) {
        super.filters.add(wallFilter);
    }
}
