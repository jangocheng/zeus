/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.service.impl.org;

import com.f6car.base.core.AbstractService;
import com.f6car.base.dao.org.TbOrgMapper;
import com.f6car.base.po.org.TbOrg;
import com.f6car.base.service.org.TbOrgService;
import com.f6car.base.so.org.TbOrgSo;
import com.f6car.base.vo.org.TbOrgVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigInteger;


/**
 * Created by qixiaobo on 2017-12-11.
 */
 @Service
 @Transactional(rollbackFor = Exception.class,timeout=1)
public class TbOrgServiceImpl extends AbstractService<TbOrg,TbOrgVo,TbOrgSo,BigInteger> implements TbOrgService {
    @Resource
    private TbOrgMapper tbOrgMapper;
}
