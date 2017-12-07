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
public interface IExcelWithTotal<K extends Vo, V extends Vo> extends IExcel<V> {
    /**
     * @return 返回total数据
     */
    K getTotal();

    void setTotal(K total);

    /**
     * @return 获取total schema
     */
    List<Cell> getTotalCells();

    void setTotalCells(List<Cell> dataCells);
}
