/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.controller.base;

import com.f6car.base.annotation.CSRFTokenRefresh;
import com.f6car.base.common.Result;
import com.f6car.base.common.ResultGenerator;
import com.f6car.base.rlt.CsbParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qixiaobo
 */
@RestController
public class SystemController {
    @GetMapping("csrf")
    @CSRFTokenRefresh
    public Result csrfToken() {
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("time")
    public Result time() {
        return ResultGenerator.genSuccessResult(System.currentTimeMillis());
    }

    @PostMapping("csb")
    public Result csb(@RequestBody CsbParam csbParam) {
        return ResultGenerator.genSuccessResult();
    }
}
