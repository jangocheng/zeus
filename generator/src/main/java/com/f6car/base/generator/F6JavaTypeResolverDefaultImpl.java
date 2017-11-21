/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.generator;

import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.internal.types.JavaTypeResolverDefaultImpl;

import java.math.BigInteger;
import java.sql.Types;

public class F6JavaTypeResolverDefaultImpl extends JavaTypeResolverDefaultImpl {
    public F6JavaTypeResolverDefaultImpl() {
        super();
        //bigint unsigned!
        typeMap.put(Types.BIGINT, new JdbcTypeInformation("BIGINT",
                new FullyQualifiedJavaType(BigInteger.class.getName())));
    }
}
