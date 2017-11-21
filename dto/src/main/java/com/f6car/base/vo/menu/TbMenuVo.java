/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.vo.menu;

import com.f6car.base.common.Vo;

import java.util.Date;
import java.math.BigDecimal;
import java.math.BigInteger;



/**
 * Created by qixiaobo on 2017-11-21.
 */
public class TbMenuVo extends Vo {

    private static final long serialVersionUID = -6920934492324729614L;

    private BigInteger id;

    private String url;

    private String name;

    private String remark;

    private String ico;

    private String model;

    private BigInteger pId;

    private Integer isDelete;

    private Integer sort;

    private String permission;

    private String activeUrl;


    public void setId(BigInteger id) {
        this.id = id;
    }

    public BigInteger getId() {
        return id;
    }


    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setRemaRk(String remark) {
        this.remark = remark;
    }

    public String getRemaRk() {
        return remark;
    }


    public void setIco(String ico) {
        this.ico = ico;
    }

    public String getIco() {
        return ico;
    }


    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }


    public void setPId(BigInteger pId) {
        this.pId = pId;
    }

    public BigInteger getPId() {
        return pId;
    }


    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getIsDelete() {
        return isDelete;
    }


    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getSort() {
        return sort;
    }


    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }


    public void setActiveUrl(String activeUrl) {
        this.activeUrl = activeUrl;
    }

    public String getActiveUrl() {
        return activeUrl;
    }






}
