package com.f6car.base.service.impl.org;

import com.f6car.base.dao.org.TbOrgMapper;
import com.f6car.base.po.org.TbOrg;
import com.f6car.base.vo.org.TbOrgVo;
import com.f6car.base.so.org.TbOrgSo;
import com.f6car.base.service.org.TbOrgService;
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
public class TbOrgServiceImpl extends AbstractService<TbOrg,TbOrgVo,TbOrgSo,BigInteger> implements TbOrgService {
    @Resource
    private TbOrgMapper tbOrgMapper;
}
