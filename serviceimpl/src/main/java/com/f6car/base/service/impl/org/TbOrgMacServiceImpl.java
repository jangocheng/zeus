package com.f6car.base.service.impl.org;

import com.f6car.base.dao.org.TbOrgMacMapper;
import com.f6car.base.po.org.TbOrgMac;
import com.f6car.base.vo.org.TbOrgMacVo;
import com.f6car.base.so.org.TbOrgMacSo;
import com.f6car.base.service.org.TbOrgMacService;
import com.f6car.base.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.math.BigInteger;

import javax.annotation.Resource;


/**
 * Created by qixiaobo on 2017-11-22.
 */
 @Service
 @Transactional(rollbackFor = Exception.class)
public class TbOrgMacServiceImpl extends AbstractService<TbOrgMac,TbOrgMacVo,TbOrgMacSo,BigInteger> implements TbOrgMacService {
    @Resource
    private TbOrgMacMapper tbOrgMacMapper;
}
