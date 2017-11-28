package com.f6car.base.controller.user;
import com.f6car.base.common.Result;
import com.f6car.base.common.ResultGenerator;
import com.f6car.base.vo.user.TbUserVo;
import com.f6car.base.so.user.TbUserSo;
import com.f6car.base.service.user.TbUserService;
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
@RequestMapping("user")
public class TbUserController extends AbstractRestController<TbUserVo, TbUserSo, BigInteger> {
    @Resource
    private TbUserService tbUserService;


}
