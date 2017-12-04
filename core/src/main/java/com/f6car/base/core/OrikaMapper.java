/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.core;

import com.f6car.base.core.orika.converter.BigIntegerConverter;
import com.github.pagehelper.Page;
import com.google.common.collect.Lists;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.List;

/**
 * @author qixiaobo
 * @see com.f6car.base.core.OrikaRegisty
 */
public class OrikaMapper {
    private MapperFacade mapperFacade = null;

    private MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
    @Autowired(required = false)
    private List<OrikaRegisty> orikaRegistyList = Lists.newArrayList();

    /**
     * 初始化Orika注册
     */
    @PostConstruct
    private void init() {
        if (!orikaRegistyList.isEmpty()) {
            for (OrikaRegisty orikaRegisty : orikaRegistyList) {
                orikaRegisty.register(mapperFactory);
            }
        }
        mapperFactory.getConverterFactory().registerConverter(BigIntegerConverter.class.getSimpleName(), new BigIntegerConverter());
        mapperFacade = mapperFactory.getMapperFacade();
    }


    public <V, P> P convert(V base, Class<P> target) {

        return mapperFacade.map(base, target);
    }

    public <V, P> List<P> convertList(List<V> baseList, Class<P> target) {
        List<P> list = baseList.isEmpty() ? Collections.<P>emptyList() : mapperFacade.mapAsList(baseList, target);
        if (baseList instanceof Page) {
            Page oldPage = (Page) baseList;
            Page page = new Page();
            page.setPageSize(oldPage.getPageSize());
            page.setPages(oldPage.getPages());
            page.setPageNum(oldPage.getPageNum());
            page.setTotal(oldPage.getTotal());
            page.addAll(list);
            return page;

        }
        return list;
    }


}

