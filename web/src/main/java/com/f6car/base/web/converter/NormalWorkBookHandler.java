/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.web.converter;

import cn.afterturn.easypoi.excel.export.ExcelExportServer;
import com.f6car.base.core.ExcelExport;
import com.f6car.base.core.ExcelExportParam;
import com.f6car.base.extend.excel.IExcel;
import com.f6car.base.extend.excel.IExcelWithTotal;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Component;

import java.util.Collection;

import static com.f6car.base.core.F6Static.getExcelExportParam;

/**
 * @author qixiaobo
 */
@Component
public class NormalWorkBookHandler extends AbstractWorkBookHandler {
    @Override
    public void preProcess(IExcel iExcel) {
        //TODO 需要解析Excel注解
    }

    @Override
    public void process(Workbook workbook, Collection collection) {
        ExcelExportParam excelExportParam = getExcelExportParam();
        new ExcelExportServer().createSheet(workbook, excelExportParam.getExportParams(),
                (Class<?>) excelExportParam.getClazz(),
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
