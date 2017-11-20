/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.controller.user;

import com.f6car.base.controller.base.AbstractRestController;
import com.f6car.base.service.user.TbUserService;
import com.f6car.base.so.user.TbUserSo;
import com.f6car.base.vo.user.TbUserVo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 *
 * @author qixiaobo
 * @date 2017-11-20
 */
@RestController
@RequestMapping("/tb/user")
public class TbUserController extends AbstractRestController<TbUserVo, TbUserSo> {
    @Resource
    private TbUserService tbUserService;


}
