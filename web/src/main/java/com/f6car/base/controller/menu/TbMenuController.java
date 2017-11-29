/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.controller.menu;

import com.f6car.base.controller.base.AbstractRestController;
import com.f6car.base.service.menu.TbMenuService;
import com.f6car.base.so.menu.TbMenuSo;
import com.f6car.base.vo.menu.TbMenuVo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigInteger;


/**
 * Created by qixiaobo on 2017-11-29.
*/
@RestController
@RequestMapping("menu")
public class TbMenuController extends AbstractRestController<TbMenuVo, TbMenuSo, BigInteger> {
    @Resource
    private TbMenuService tbMenuService;


}
