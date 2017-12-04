/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.core.orika.converter;

import ma.glasnost.orika.MappingContext;
import ma.glasnost.orika.converter.BidirectionalConverter;
import ma.glasnost.orika.metadata.Type;

import java.math.BigInteger;

/**
 * @author qixiaobo
 */
public class BigIntegerConverter extends BidirectionalConverter<String, BigInteger> {

    @Override
    public BigInteger convertTo(String source, Type<BigInteger> destinationType, MappingContext mappingContext) {
        return source == null ? null : new BigInteger(source);
    }

    @Override
    public String convertFrom(BigInteger source, Type<String> destinationType, MappingContext mappingContext) {
        return source == null ? null : source.toString();
    }
}
