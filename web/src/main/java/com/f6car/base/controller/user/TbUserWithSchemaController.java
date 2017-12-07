/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.controller.user;

import com.f6car.base.controller.base.AbstractRestWithSchemaController;
import com.f6car.base.extend.excel.Cell;
import com.f6car.base.extend.excel.EmptyCell;
import com.f6car.base.extend.excel.ExcelDataWithTotal;
import com.f6car.base.extend.excel.IExcel;
import com.f6car.base.service.user.TbUserService;
import com.f6car.base.so.user.TbUserSo;
import com.f6car.base.vo.user.TbUserTotalVo;
import com.f6car.base.vo.user.TbUserVo;
import com.google.common.collect.Lists;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigInteger;
import java.util.List;


/**
 * @author qixiaobo
 * @date 2017-11-29
 */
@RestController
@RequestMapping("userWithSchema")
public class TbUserWithSchemaController extends AbstractRestWithSchemaController<TbUserTotalVo, TbUserVo, TbUserSo, BigInteger> {
    List<Cell> totalCells = Lists.newArrayList(new Cell("name", 3), EmptyCell.getEmptyCell(), new Cell("number", 2), EmptyCell.getEmptyCell(), new Cell("total"));
    @Resource
    private TbUserService tbUserService;

    @Override
    protected IExcel<TbUserVo> newExcelSchemaInstance(List<TbUserVo> list) {
        ExcelDataWithTotal<TbUserTotalVo, TbUserVo> voTbUserVoExcelDataWithTotal = new ExcelDataWithTotal<>(list);
        TbUserTotalVo vo = new TbUserTotalVo();
        vo.setName("总计(" + list.size() + "条)");
        vo.setTotal("100000");
        vo.setNumber("XXXXXX");
        voTbUserVoExcelDataWithTotal.setTotal(vo);

        voTbUserVoExcelDataWithTotal.setTotalCells(totalCells);
        return voTbUserVoExcelDataWithTotal;
    }
}
