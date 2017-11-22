/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.controller.org;

import com.f6car.base.controller.base.AbstractRestController;
import com.f6car.base.service.org.TbOrgService;
import com.f6car.base.so.org.TbOrgSo;
import com.f6car.base.vo.org.TbOrgVo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by qixiaobo on 2017-11-22.
 */
@RestController
@RequestMapping("org")
public class TbOrgController extends AbstractRestController<TbOrgVo, TbOrgSo> {
    @Resource
    private TbOrgService tbOrgService;


}
