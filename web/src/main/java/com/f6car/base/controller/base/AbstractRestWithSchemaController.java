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
import com.f6car.base.common.So;
import com.f6car.base.common.Vo;
import com.f6car.base.core.ExcelExport;
import com.f6car.base.core.F6Static;
import com.f6car.base.extend.excel.IExcel;
import com.github.pagehelper.PageHelper;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.Serializable;
import java.util.List;

/**
 * @author qixiaobo
 */
public abstract class AbstractRestWithSchemaController<T extends Vo, V extends Vo, S extends So, PK extends Serializable> extends AbstractRestController<V, S, PK> {
    @Override
    @GetMapping
    @ApiOperation(value = "获取实体列表", notes = "")
    public Result list(S so) {
        PageHelper.startPage(so.getCurrentPage(), so.getPageSize());
        List<V> list = service.findAll();
        IExcel<V> iExcel = newExcelSchemaInstance(list);
        excelExportParam(iExcel);
        return ResultGenerator.genSuccessResult(iExcel);
    }

    protected abstract IExcel<V> newExcelSchemaInstance(List<V> list);

    protected void excelExportParam(IExcel<V> iexcel) {
        excelExportParam();
        if (F6Static.getExcelExportParam().getExcelExport() == ExcelExport.NormalExcel) {
            //需要封装具体的schema
        }

    }


}
