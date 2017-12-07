/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.web.converter;

import cn.afterturn.easypoi.excel.entity.params.ExcelExportEntity;
import cn.afterturn.easypoi.excel.export.ExcelExportServer;
import com.f6car.base.core.ExcelExport;
import com.f6car.base.core.ExcelExportParam;
import com.f6car.base.extend.excel.Cell;
import com.f6car.base.extend.excel.IExcel;
import com.f6car.base.extend.excel.IExcelWithTotal;
import com.google.common.base.Function;
import com.google.common.collect.Lists;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static com.f6car.base.core.F6Static.getExcelExportParam;

/**
 * @author qixiaobo
 */
@Component
public class MapWorkBookHandler extends AbstractWorkBookHandler {
    @Override
    public void preProcess(IExcel iExcel) {
        List excelExportEntities = getExcelExportParam().getExcelExportEntities();
        Collections.sort(excelExportEntities);
        List<Cell> transform = Lists.transform(excelExportEntities, new Function<ExcelExportEntity, Cell>() {
            @Override
            public Cell apply(ExcelExportEntity input) {
                return new Cell(input.getName());
            }
        });
        iExcel.setDataCells(Lists.newArrayList(transform));
    }

    @Override
    public void process(Workbook workbook, Collection collection) {
        ExcelExportParam excelExportParam = getExcelExportParam();
        new ExcelExportServer().createSheetForMap(workbook, excelExportParam.getExportParams(),
                excelExportParam.getExcelExportEntities(),
                collection);
    }

    @Override
    public void afterProcess(Workbook workbook, IExcelWithTotal iExcelWithTotal) {
        processTotal(workbook, iExcelWithTotal, 0);
    }

    @Override
    public boolean canProcess(ExcelExport type) {
        return type == ExcelExport.NormalExcel;
    }
}
