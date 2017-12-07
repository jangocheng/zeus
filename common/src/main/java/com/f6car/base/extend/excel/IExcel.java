/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.extend.excel;

import com.f6car.base.common.Vo;

import java.io.Serializable;
import java.util.List;

/**
 * @author qixiaobo
 */
public interface IExcel<V extends Vo> extends Serializable {
    /**
     * @return 获取导出详情数据
     */
    List<V> getData();

    void setData(List<V> data);

    /**
     * @return 获取数据schema
     */
    List<Cell> getDataCells();

    void setDataCells(List<Cell> dataCells);

}
