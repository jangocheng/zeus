/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.controller.user;

import com.f6car.base.common.Result;
import com.f6car.base.common.ResultGenerator;
import com.f6car.base.service.user.TbUserService;
import com.f6car.base.vo.user.TbUserVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * Created by qixiaobo on 2017-11-20.
 */
@RestController
@RequestMapping("/tb/user")
public class TbUserController {
    @Resource
    private TbUserService tbUserService;

    @PutMapping
    public Result add(@RequestBody TbUserVo tbUserVo) {
        tbUserService.save(tbUserVo);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Serializable id) {
        tbUserService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping()
    public Result update(@RequestBody TbUserVo tbUserVo) {
        tbUserService.update(tbUserVo);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<TbUserVo> list = tbUserService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Serializable id) {
        TbUserVo tbUserVo = tbUserService.findById(id);
        return ResultGenerator.genSuccessResult(tbUserVo);
    }
}
