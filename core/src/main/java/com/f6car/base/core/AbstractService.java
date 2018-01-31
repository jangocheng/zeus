/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.core;


import com.f6car.base.annotation.SecurityLog;
import com.f6car.base.common.Po;
import com.f6car.base.common.Service;
import com.f6car.base.common.So;
import com.f6car.base.common.Vo;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 基于通用MyBatis Mapper插件的Service接口的实现
 *
 * @author qixiaobo
 */
@Transactional(timeout = 1, rollbackFor = Exception.class)
public abstract class AbstractService<T extends Po<PK>, V extends Vo, S extends So, PK extends Serializable> implements Service<V, S, PK> {

    @Autowired
    protected Mapper<T, PK> mapper;
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
    @Transactional(timeout = 1, rollbackFor = Exception.class)
    @SecurityLog
    public int saveSelective(V model) {
        Preconditions.checkArgument(model != null);
        T po = orikaMapper.convert(model, poClazz);
        po.setCreationtime(new Date());
        if (F6Static.getUser() != null) {
            po.setCreator(F6Static.getUser());
        }
        return mapper.insertSelective(po);
    }

    @Override
    @Transactional(timeout = 1, rollbackFor = Exception.class)
    @SecurityLog
    public PK saveSelectiveReturnPk(V model) {
        Preconditions.checkArgument(model != null);
        T po = orikaMapper.convert(model, poClazz);
        mapper.insertSelective(po);
        return po.getId();
    }

    @Override
    @Transactional(timeout = 2, rollbackFor = Exception.class)
    @SecurityLog(showArgs = false)
    public int save(List<V> models) {
        Preconditions.checkArgument(models != null && !models.isEmpty());
        List<T> ts = orikaMapper.convertList(models, poClazz);
        Date now = new Date();
        for (T t : ts) {
            t.setCreationtime(now);
            if (F6Static.getUser() != null) {
                t.setCreator(F6Static.getUser());
            }
        }

        return mapper.insertList(ts);
    }


    @Override
    @Transactional(timeout = 1, rollbackFor = Exception.class)
    @SecurityLog
    public int deleteById(PK id) {
        Preconditions.checkArgument(id != null);
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    @Transactional(timeout = 2, rollbackFor = Exception.class)
    @SecurityLog
    public int deleteByIds(String ids) {
        Preconditions.checkArgument(!Strings.isNullOrEmpty(ids));
        return mapper.deleteByIds(ids);
    }

    @Override
    @Transactional(timeout = 2, rollbackFor = Exception.class)
    @SecurityLog
    public int updateByPrimaryKeySelective(V model) {
        Preconditions.checkArgument(model != null);
        T po = orikaMapper.convert(model, poClazz);
        if (F6Static.getUser() != null) {
            po.setModifier(F6Static.getUser());
            po.setModifiedtime(new Date());
        }
        return mapper.updateByPrimaryKeySelective(po);

    }

    @Override
    @Transactional(timeout = 1, rollbackFor = Exception.class)
    @SecurityLog
    public int updateByPrimaryKey(V model) {
        Preconditions.checkArgument(model != null);
        T po = orikaMapper.convert(model, poClazz);
        if (F6Static.getUser() != null) {
            po.setModifier(F6Static.getUser());
            po.setModifiedtime(new Date());
        }
        return mapper.updateByPrimaryKey(po);
    }

    @Override
    @Transactional(timeout = 1, rollbackFor = Exception.class, readOnly = true)
    public V findById(PK id) {
        Preconditions.checkArgument(id != null);
        return orikaMapper.convert(mapper.selectByPrimaryKey(id), voClazz);
    }


    @Override
    @Transactional(timeout = 2, rollbackFor = Exception.class, readOnly = true)
    public List<V> findByIds(String ids) {
        Preconditions.checkArgument(!Strings.isNullOrEmpty(ids));
        return orikaMapper.convertList(mapper.selectByIds(ids), voClazz);
    }

    @Override
    @Transactional(timeout = 2, rollbackFor = Exception.class, readOnly = true)
    public List<V> findAll() {
        return orikaMapper.convertList(mapper.selectAll(), voClazz);
    }

    @Override
    @Transactional(timeout = 1, rollbackFor = Exception.class, readOnly = true)
    public int selectCount(V v) {
        Preconditions.checkArgument(v != null);
        return mapper.selectCount(orikaMapper.convert(v, poClazz));
    }


}
