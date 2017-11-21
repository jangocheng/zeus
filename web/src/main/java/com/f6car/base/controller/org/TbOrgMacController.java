/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

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

/**
 * Created by qixiaobo on 2017-11-21.
 */
@RestController
@RequestMapping("org/mac")
public class TbOrgMacController extends AbstractRestController<TbOrgMacVo, TbOrgMacSo> {
    @Resource
    private TbOrgMacService tbOrgMacService;


}
