/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.common;

import java.io.Serializable;

/**
 * Created by qixiaobo on 2016/11/24.
 */
public class Sort implements Serializable {

    private static final long serialVersionUID = 7739709965769082011L;
    private static final String DEFAULT_PREFIX = "p";
    private static final String SQL_DOT = ".";
    private String orderField;//排序字段
    private OrderType orderType;//排序类型
    private boolean enablePrefix = true;

    private Sort() {
    }

    private Sort(String orderField, OrderType orderType, boolean enablePrefix) {
        assert orderField != null;
        this.orderField = orderField;
        this.orderType = orderType;
        this.enablePrefix = enablePrefix;
    }


    private Sort(String orderField) {
        this(orderField, OrderType.ASC, true);
    }

    public static Sort valueOf(String sortString) {

        return new Sort(sortString);
    }

    public static Sort valueOf(String sortKey, OrderType orderType) {
        return new Sort(sortKey, orderType, true);
    }

    public static Sort valueOf(String sortKey, OrderType orderType, boolean enablePrefix) {
        return new Sort(sortKey, orderType, enablePrefix);
    }

    public String getOrderField() {
        if (orderField.contains(SQL_DOT) || !enablePrefix) {
            return orderField;
        } else {
            return DEFAULT_PREFIX + SQL_DOT + orderField;
        }
    }

    public void setOrderField(String orderField) {
        this.orderField = orderField;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }

    public boolean isEnablePrefix() {
        return enablePrefix;
    }

    public void setEnablePrefix(boolean enablePrefix) {
        this.enablePrefix = enablePrefix;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sort{");
        sb.append("orderField='").append(orderField).append('\'');
        sb.append(", orderType=").append(orderType);
        sb.append(", enablePrefix=").append(enablePrefix);
        sb.append('}');
        return sb.toString();
    }
}
