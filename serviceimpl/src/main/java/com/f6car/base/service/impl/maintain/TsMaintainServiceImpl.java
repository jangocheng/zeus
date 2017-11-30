/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.service.impl.maintain;

import com.f6car.base.core.AbstractService;
import com.f6car.base.dao2.maintain.TsMaintainMapper;
import com.f6car.base.po.maintain.TsMaintain;
import com.f6car.base.service.maintain.TsMaintainService;
import com.f6car.base.so.maintain.TsMaintainSo;
import com.f6car.base.vo.maintain.TsMaintainVo;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigInteger;


/**
 * Created by qixiaobo on 2017-11-29.
 */
//@Service
@Transactional(rollbackFor = Exception.class, timeout = 1)
public class TsMaintainServiceImpl extends AbstractService<TsMaintain, TsMaintainVo, TsMaintainSo, BigInteger> implements TsMaintainService {
    @Resource
    private TsMaintainMapper tsMaintainMapper;
}
