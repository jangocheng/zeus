/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.service.impl.maintain;

import com.f6car.base.dao.maintain.TsMaintainMapper;
import com.f6car.base.po.maintain.TsMaintain;
import com.f6car.base.vo.maintain.TsMaintainVo;
import com.f6car.base.so.maintain.TsMaintainSo;
import com.f6car.base.service.maintain.TsMaintainService;
import com.f6car.base.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.math.BigInteger;

import javax.annotation.Resource;


/**
 * Created by qixiaobo on 2017-12-05.
 */
@Service
@Transactional(rollbackFor = Exception.class, timeout = 1)
public class TsMaintainServiceImpl extends AbstractService<TsMaintain, TsMaintainVo, TsMaintainSo, BigInteger> implements TsMaintainService {
    @Resource
    private TsMaintainMapper tsMaintainMapper;
}
