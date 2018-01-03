/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.core;

import com.f6car.base.common.So;
import com.f6car.base.constant.Constants;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.google.common.base.Joiner;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;

import java.util.Properties;

/**
 * @author qixiaobo
 */
@Intercepts(@Signature(type = Executor.class, method = "query", args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class}))
public class SoInterceptor implements Interceptor {
    private static final Joiner SORT_JOINER = Joiner.on(Constants.COMMA);

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        Object paramter = invocation.getArgs()[1];
        if (paramter instanceof So) {
            So so = (So) paramter;
            Page<Object> page = PageHelper.startPage(so.getCurrentPage(), so.getPageSize(), so.isEnableCount());
            page.setOrderByOnly(so.isOrderByOnly());
            if (so.getSorts() != null && !so.getSorts().isEmpty()) {
                page.setOrderBy(SORT_JOINER.join(so.getSorts()));
            }
            try {
                return invocation.proceed();
            } finally {
                PageHelper.clearPage();
            }
        }
        return invocation.proceed();
    }

    @Override
    public Object plugin(Object target) {
        if (target instanceof Executor) {
            return Plugin.wrap(target, this);
        } else {
            return target;
        }
    }

    @Override
    public void setProperties(Properties properties) {
        // Do nothing
    }
}
