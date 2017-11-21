/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.service.impl.menu;

import com.f6car.base.dao.menu.TbMenuMapper;
import com.f6car.base.po.menu.TbMenu;
import com.f6car.base.vo.menu.TbMenuVo;
import com.f6car.base.so.menu.TbMenuSo;
import com.f6car.base.service.menu.TbMenuService;
import com.f6car.base.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by qixiaobo on 2017-11-21.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class TbMenuServiceImpl extends AbstractService<TbMenu, TbMenuVo, TbMenuSo> implements TbMenuService {
    @Resource
    private TbMenuMapper tbMenuMapper;
}
