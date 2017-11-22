package com.f6car.base.controller.org;
import com.f6car.base.common.Result;
import com.f6car.base.common.ResultGenerator;
import com.f6car.base.vo.org.TbOrgMacVo;
import com.f6car.base.so.org.TbOrgMacSo;
import com.f6car.base.service.org.TbOrgMacService;
import com.f6car.base.controller.base.AbstractRestController;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;
import java.math.BigInteger;


/**
* Created by qixiaobo on 2017-11-22.
*/
@RestController
@RequestMapping("org/mac")
public class TbOrgMacController extends AbstractRestController<TbOrgMacVo, TbOrgMacSo, BigInteger> {
    @Resource
    private TbOrgMacService tbOrgMacService;


}
