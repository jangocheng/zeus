/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.service.impl.org;

import com.f6car.base.core.AbstractService;
import com.f6car.base.dao.org.TbOrgMacMapper;
import com.f6car.base.po.org.TbOrgMac;
import com.f6car.base.service.org.TbOrgMacService;
import com.f6car.base.so.org.TbOrgMacSo;
import com.f6car.base.vo.org.TbOrgMacVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by qixiaobo on 2017-11-22.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class TbOrgMacServiceImpl extends AbstractService<TbOrgMac, TbOrgMacVo, TbOrgMacSo> implements TbOrgMacService {
    @Resource
    private TbOrgMacMapper tbOrgMacMapper;
}
