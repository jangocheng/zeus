package com.f6car.base.controller.org;
import com.f6car.base.common.Result;
import com.f6car.base.common.ResultGenerator;
import com.f6car.base.vo.org.TbOrgVo;
import com.f6car.base.so.org.TbOrgSo;
import com.f6car.base.service.org.TbOrgService;
import com.f6car.base.controller.base.AbstractRestController;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;
import java.math.BigInteger;


/**
* Created by qixiaobo on 2017-11-28.
*/
@RestController
@RequestMapping("org")
public class TbOrgController extends AbstractRestController<TbOrgVo, TbOrgSo, BigInteger> {
    @Resource
    private TbOrgService tbOrgService;


}
