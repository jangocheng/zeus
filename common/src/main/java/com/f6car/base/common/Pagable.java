/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.common;

/**
 * Created by qixiaobo on 2016/11/24.
 */
public interface Pagable {

    public int getCurrentPage();

    public void setCurrentPage(int currentPage);

    public int getPageSize();

    public void setPageSize(int pagesize);

    public boolean isEnableCount();

    public void setEnableCount(boolean enable);


}
