/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.controller.base;

import com.f6car.base.common.Result;
import com.f6car.base.common.ResultGenerator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qixiaobo
 */
@RestController
public class SystemController {
    @RequestMapping("csrf")
    public Result csrfToken() {
        return ResultGenerator.genSuccessResult();
    }

    @RequestMapping("time")
    public Result time() {
        return ResultGenerator.genSuccessResult(System.currentTimeMillis());
    }
}
