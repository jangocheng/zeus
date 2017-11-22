package com.f6car.base.controller.menu;
import com.f6car.base.common.Result;
import com.f6car.base.common.ResultGenerator;
import com.f6car.base.vo.menu.TbMenuVo;
import com.f6car.base.so.menu.TbMenuSo;
import com.f6car.base.service.menu.TbMenuService;
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
@RequestMapping("menu")
public class TbMenuController extends AbstractRestController<TbMenuVo, TbMenuSo, BigInteger> {
    @Resource
    private TbMenuService tbMenuService;


}
