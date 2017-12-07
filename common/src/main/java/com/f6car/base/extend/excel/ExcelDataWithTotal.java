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
public class ExcelDataWithTotal<K extends Vo, V extends Vo> extends ExcelData<V> implements IExcelWithTotal<K, V> {
    private K total;
    private List<Cell> totalCells;

    public ExcelDataWithTotal(List<V> data) {
        super(data);
    }

    @Override
    public K getTotal() {
        return total;
    }

    @Override
    public void setTotal(K total) {
        this.total = total;
    }

    @Override
    public List<Cell> getTotalCells() {
        return totalCells;
    }

    @Override
    public void setTotalCells(List<Cell> totalCells) {
        this.totalCells = totalCells;
    }
}
