/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.core;

import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.afterturn.easypoi.excel.entity.params.ExcelExportEntity;
import com.f6car.base.common.Vo;

import java.util.List;

public class ExcelExportParam<V extends Vo> {
    private ExcelExport excelExport;
    private Class<V> clazz;
    private List<ExcelExportEntity> excelExportEntities;
    private ExportParams exportParams;
    private String fileName;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public ExcelExport getExcelExport() {
        return excelExport;
    }

    public void setExcelExport(ExcelExport excelExport) {
        this.excelExport = excelExport;
    }

    public Class<V> getClazz() {
        return clazz;
    }

    public void setClazz(Class<V> clazz) {
        this.clazz = clazz;
    }

    public List<ExcelExportEntity> getExcelExportEntities() {
        return excelExportEntities;
    }

    public void setExcelExportEntities(List<ExcelExportEntity> excelExportEntities) {
        this.excelExportEntities = excelExportEntities;
    }


    public ExportParams getExportParams() {
        return exportParams;
    }

    public void setExportParams(ExportParams exportParams) {
        this.exportParams = exportParams;
    }
}
