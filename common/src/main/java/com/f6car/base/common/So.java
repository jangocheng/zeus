/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.common;


import java.util.List;

public class So implements java.io.Serializable, Pagable, Sortable {

    private static final long serialVersionUID = -828171499994153332L;

    @Override
    public int getCurrentPage() {
        return 0;
    }

    @Override
    public void setCurrentPage(int currentPage) {

    }

    @Override
    public int getPageSize() {
        return 0;
    }

    @Override
    public void setPageSize(int pagesize) {

    }

    @Override
    public boolean isEnableCount() {
        return false;
    }

    @Override
    public void setEnableCount(boolean enable) {

    }

    @Override
    public List<Sort> getSorts() {
        return null;
    }

    @Override
    public void addSort(Sort sort) {

    }
}
