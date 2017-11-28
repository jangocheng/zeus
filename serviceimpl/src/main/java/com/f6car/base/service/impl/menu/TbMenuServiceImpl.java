package com.f6car.base.service.impl.menu;

import com.f6car.base.dao.menu.TbMenuMapper;
import com.f6car.base.po.menu.TbMenu;
import com.f6car.base.vo.menu.TbMenuVo;
import com.f6car.base.so.menu.TbMenuSo;
import com.f6car.base.service.menu.TbMenuService;
import com.f6car.base.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.math.BigInteger;

import javax.annotation.Resource;


/**
 * Created by qixiaobo on 2017-11-28.
 */
 @Service
 @Transactional(rollbackFor = Exception.class,timeout=1)
public class TbMenuServiceImpl extends AbstractService<TbMenu,TbMenuVo,TbMenuSo,BigInteger> implements TbMenuService {
    @Resource
    private TbMenuMapper tbMenuMapper;
}
