/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.controller.maintain;

import com.f6car.base.common.Result;
import com.f6car.base.common.ResultGenerator;
import com.f6car.base.vo.maintain.TsMaintainVo;
import com.f6car.base.so.maintain.TsMaintainSo;
import com.f6car.base.service.maintain.TsMaintainService;
import com.f6car.base.controller.base.AbstractRestController;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;
import java.math.BigInteger;


/**
 * Created by qixiaobo on 2017-12-05.
 */
//@RestController
@RequestMapping("maintain")
public class TsMaintainController extends AbstractRestController<TsMaintainVo, TsMaintainSo, BigInteger> {
    @Resource
    private TsMaintainService tsMaintainService;


}
