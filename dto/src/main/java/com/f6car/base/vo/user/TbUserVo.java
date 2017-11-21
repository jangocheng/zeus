/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.vo.user;

import com.f6car.base.common.Vo;


/**
 * Created by qixiaobo on 2017-11-21.
 */
public class TbUserVo extends Vo {

    private static final long serialVersionUID = -6920934492324729614L;

    private String pkId;

    private String username;

    private String cellPhone;

    private String password;

    private Byte isAdmin;

    private String idRole;

    private String idOwnOrg;

    private String idEmployee;

    private Byte isDel;

    private Byte isGuideOpen;

    private String idWxbUser;

    private String idWxbStation;

    private String openid;

    private Byte limitMac;


    public void setPkId(String pkId) {
        this.pkId = pkId;
    }

    public String getPkId() {
        return pkId;
    }


    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }


    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getCellPhone() {
        return cellPhone;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }


    public void setIsAdmIn(Byte isAdmin) {
        this.isAdmin = isAdmin;
    }

    public Byte getIsAdmIn() {
        return isAdmin;
    }


    public void setIdRole(String idRole) {
        this.idRole = idRole;
    }

    public String getIdRole() {
        return idRole;
    }


    public void setIdOwnOrg(String idOwnOrg) {
        this.idOwnOrg = idOwnOrg;
    }

    public String getIdOwnOrg() {
        return idOwnOrg;
    }


    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getIdEmployee() {
        return idEmployee;
    }


    public void setIsDel(Byte isDel) {
        this.isDel = isDel;
    }

    public Byte getIsDel() {
        return isDel;
    }


    public void setIsGuIdeOpen(Byte isGuideOpen) {
        this.isGuideOpen = isGuideOpen;
    }

    public Byte getIsGuIdeOpen() {
        return isGuideOpen;
    }


    public void setIdWxbUser(String idWxbUser) {
        this.idWxbUser = idWxbUser;
    }

    public String getIdWxbUser() {
        return idWxbUser;
    }


    public void setIdWxbStatIon(String idWxbStation) {
        this.idWxbStation = idWxbStation;
    }

    public String getIdWxbStatIon() {
        return idWxbStation;
    }


    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getOpenid() {
        return openid;
    }


    public void setLimitMac(Byte limitMac) {
        this.limitMac = limitMac;
    }

    public Byte getLimitMac() {
        return limitMac;
    }






}
