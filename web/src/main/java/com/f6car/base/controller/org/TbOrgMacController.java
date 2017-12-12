/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.controller.org;

import com.f6car.base.controller.base.AbstractRestController;
import com.f6car.base.service.org.TbOrgMacService;
import com.f6car.base.so.org.TbOrgMacSo;
import com.f6car.base.vo.org.TbOrgMacVo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigInteger;


/**
 * Created by qixiaobo on 2017-12-11.
*/
@RestController
@RequestMapping("org/mac")
public class TbOrgMacController extends AbstractRestController<TbOrgMacVo, TbOrgMacSo, BigInteger> {
    @Resource
    private TbOrgMacService tbOrgMacService;


}
