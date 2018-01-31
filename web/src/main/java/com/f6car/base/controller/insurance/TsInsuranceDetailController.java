/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.controller.insurance;

import com.f6car.base.controller.base.AbstractRestController;
import com.f6car.base.service.insurance.TsInsuranceDetailService;
import com.f6car.base.so.insurance.TsInsuranceDetailSo;
import com.f6car.base.vo.insurance.TsInsuranceDetailVo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * Created by qixiaobo on 2018-02-01.
 */
@RestController
@RequestMapping("insurance/detail")
public class TsInsuranceDetailController extends AbstractRestController<TsInsuranceDetailVo, TsInsuranceDetailSo, Integer> {
    @Resource
    private TsInsuranceDetailService tsInsuranceDetailService;


}
