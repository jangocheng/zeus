/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.extend.excel;

import com.f6car.base.common.Vo;

import java.util.List;

/**
 * @author qixiaobo
 */
public class ExcelData<V extends Vo> implements IExcel<V> {
    private static final long serialVersionUID = -5673716568016909172L;
    private List<V> data;
    private List<? extends Cell> dataCells;

    public ExcelData(List<V> data) {
        this.data = data;
    }

    @Override
    public List<V> getData() {
        return data;
    }

    @Override
    public void setData(List<V> data) {
        this.data = data;
    }

    @Override
    public List<? extends Cell> getDataCells() {
        return dataCells;
    }

    @Override
    public void setDataCells(List<? extends Cell> dataCells) {
        this.dataCells = dataCells;
    }
}
