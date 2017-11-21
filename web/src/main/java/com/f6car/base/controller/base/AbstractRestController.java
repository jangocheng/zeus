/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.controller.base;

import com.f6car.base.common.*;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * @author qixiaobo
 */
@RestController
public abstract class AbstractRestController<V extends Vo, S extends So> {

    @Resource
    private Service<V, S> service;


    @PostMapping()
    @ApiOperation(value = "新建实体", notes = "")
    public Result add(@RequestBody V vo) {
        service.save(vo);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除实体", notes = "")
    public Result delete(@PathVariable Serializable id) {
        service.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }


    @PutMapping
    @ApiOperation(value = "更新实体", notes = "")
    public Result update(@RequestBody V vo) {
        service.update(vo);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping
    @ApiOperation(value = "获取实体列表", notes = "")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "10") Integer size) {
        PageHelper.startPage(page, size);
        List<V> list = service.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "获取单个实体", notes = "")
    public Result detail(@PathVariable Serializable id) {
        V vo = service.findById(id);
        return ResultGenerator.genSuccessResult(vo);
    }
}
