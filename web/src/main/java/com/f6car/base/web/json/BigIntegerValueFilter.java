/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.web.json;

import com.alibaba.fastjson.serializer.ValueFilter;

import java.math.BigInteger;

/**
 * @author qixiaobo
 */
public class BigIntegerValueFilter implements ValueFilter {
    @Override
    public Object process(Object object, String name, Object value) {
        if (value != null && value instanceof BigInteger) {
            return value.toString();
        }
        return value;
    }
}
