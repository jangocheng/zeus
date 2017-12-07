/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.web.converter;

import com.f6car.base.core.ExcelExport;
import com.f6car.base.extend.excel.IExcel;
import com.f6car.base.extend.excel.IExcelWithTotal;
import org.apache.poi.ss.usermodel.Workbook;

import java.util.Collection;

/**
 * @author qixiaobo
 */
public interface WorkBookHandler {
    void preProcess(IExcel iExcel);

    void process(Workbook workbook, Collection collection);

    void afterProcess(Workbook workbook, IExcelWithTotal iExcelWithTotal);

    boolean canProcess(ExcelExport type);
}
