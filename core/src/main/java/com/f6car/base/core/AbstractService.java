/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.core;


import com.f6car.base.common.Po;
import com.f6car.base.common.Service;
import com.f6car.base.common.So;
import com.f6car.base.common.Vo;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.reflect.TypeToken;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 基于通用MyBatis Mapper插件的Service接口的实现
 *
 * @author qixiaobo
 */
public abstract class AbstractService<T extends Po, V extends Vo, S extends So, PK extends Serializable> implements Service<V, S, PK> {

    @Resource
    protected Mapper<T> mapper;
    @Resource
    protected OrikaMapper orikaMapper;
    protected Class<V> voClazz;
    protected Class<T> poClazz;

    public AbstractService() {
        TypeToken<T> poType = new TypeToken<T>(getClass()) {
        };
        TypeToken<V> voType = new TypeToken<V>(getClass()) {
        };
        poClazz = (Class<T>) poType.getRawType();
        voClazz = (Class<V>) voType.getRawType();
    }

    @Override
    public void save(V model) {
        Preconditions.checkArgument(model != null);
        T po = orikaMapper.convert(model, poClazz);
        mapper.insertSelective(po);
    }

    @Override
    public void save(List<V> models) {
        Preconditions.checkArgument(models != null && !models.isEmpty());
        List<T> ts = orikaMapper.convertList(models, poClazz);
        mapper.insertList(ts);
    }

    @Override
    public void deleteById(PK id) {
        Preconditions.checkArgument(id != null);
        mapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteByIds(String ids) {
        Preconditions.checkArgument(!Strings.isNullOrEmpty(ids));
        mapper.deleteByIds(ids);
    }

    @Override
    public void update(V model) {
        Preconditions.checkArgument(model != null);
        T po = orikaMapper.convert(model, poClazz);
        mapper.updateByPrimaryKeySelective(po);
    }

    @Override
    public V findById(PK id) {
        Preconditions.checkArgument(id != null);
        return orikaMapper.convert(mapper.selectByPrimaryKey(id), voClazz);
    }


    @Override
    public List<V> findByIds(String ids) {
        Preconditions.checkArgument(!Strings.isNullOrEmpty(ids));
        return orikaMapper.convertList(mapper.selectByIds(ids), voClazz);
    }

    @Override
    public List<V> findAll() {
        return orikaMapper.convertList(mapper.selectAll(), voClazz);
    }
}
