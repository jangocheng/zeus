/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.core;

import com.google.common.collect.Lists;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.List;

/**
 * @author qixiaobo
 */
public class OrikaMapper {
    private MapperFacade mapperFacade = null;

    private MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
    @Autowired(required = false)
    private List<OrikaRegisty> orikaRegistyList = Lists.newArrayList();

    @PostConstruct
    private void init() {
        if (!orikaRegistyList.isEmpty()) {
            for (OrikaRegisty orikaRegisty : orikaRegistyList) {
                orikaRegisty.register(mapperFactory);
            }
        }
        mapperFacade = mapperFactory.getMapperFacade();
    }


    public <V, P> P convert(V base, Class<P> target) {

        return mapperFacade.map(base, target);
    }

    public <V, P> List<P> convertList(List<V> baseList, Class<P> target) {

        return mapperFacade.mapAsList(baseList, target);
    }


}

