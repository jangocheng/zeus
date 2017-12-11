/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.vo.user;

import cn.afterturn.easypoi.excel.annotation.Excel;
import com.f6car.base.common.Vo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigInteger;




/**
 * Created by qixiaobo on 2017-12-11.
 */
public class TbUserVo extends Vo {

    private static final long serialVersionUID = -6920934492324729614L;

    /**
     * 主键
     */
    @NotNull
    @Excel(name = "主键", orderNum = "10")
    private BigInteger   pkId;

    /**
     * 用户名
     */
    @Size(min = 0, max = 20, message = "长度必须在{min}和{max}之间")
    @Excel(name = "用户名", orderNum = "20")
    private String   username;

    /**
     * cellPhone
     */
    @NotNull
    @Size(min = 0, max = 20, message = "长度必须在{min}和{max}之间")
    @Excel(name = "cellPhone",orderNum="30")
    private String   cellPhone;

    /**
     * 密码
     */
    @Size(min = 0, max = 50, message = "长度必须在{min}和{max}之间")
    @Excel(name = "密码", orderNum = "40")
    private String   password;

    /**
     * 是否管理员
     */
    @Excel(name = "是否管理员", orderNum = "50")
    private Byte   isAdmin;

    /**
     * 角色ID
     */
    @Excel(name = "角色ID", orderNum = "60")
    private BigInteger   idRole;

    /**
     * 组织
     */
    @Excel(name = "组织", orderNum = "70")
    private BigInteger   idOwnOrg;

    /**
     * 员工ID
     */
    @Excel(name = "员工ID", orderNum = "80")
    private BigInteger   idEmployee;

    /**
     * isDel
     */
    @Excel(name = "isDel",orderNum="90")
    private Byte   isDel;

    /**
     * 向导默认开关：0默认关闭，1默认打开
     */
    @NotNull
    @Excel(name = "向导默认开关：0默认关闭，1默认打开", orderNum = "100")
    private Byte   isGuideOpen;

    /**
     * 维小宝用户ID
     */
    @Size(min = 0, max = 20, message = "长度必须在{min}和{max}之间")
    @Excel(name = "维小宝用户ID", orderNum = "110")
    private String   idWxbUser;

    /**
     * 维小宝店铺ID
     */
    @Size(min = 0, max = 20, message = "长度必须在{min}和{max}之间")
    @Excel(name = "维小宝店铺ID", orderNum = "120")
    private String   idWxbStation;

    /**
     * openid
     */
    @Size(min = 0, max = 40, message = "长度必须在{min}和{max}之间")
    @Excel(name = "openid",orderNum="130")
    private String openid;

    /**
     * 是否限定PC登录设备 0 不选中 1 选中
     */
    @Excel(name = "是否限定PC登录设备 0 不选中 1 选中", orderNum = "140")
    private Byte   limitMac;

    public BigInteger getPkId() {
        return pkId;
    }

    public void setPkId(BigInteger pkId) {
        this.pkId = pkId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Byte getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Byte isAdmin) {
        this.isAdmin = isAdmin;
    }

    public BigInteger getIdRole() {
        return idRole;
    }

    public void setIdRole(BigInteger idRole) {
        this.idRole = idRole;
    }

    public BigInteger getIdOwnOrg() {
        return idOwnOrg;
    }

    public void setIdOwnOrg(BigInteger idOwnOrg) {
        this.idOwnOrg = idOwnOrg;
    }

    public BigInteger getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(BigInteger idEmployee) {
        this.idEmployee = idEmployee;
    }

    public Byte getIsDel() {
        return isDel;
    }

    public void setIsDel(Byte isDel) {
        this.isDel = isDel;
    }

    public Byte getIsGuideOpen() {
        return isGuideOpen;
    }

    public void setIsGuideOpen(Byte isGuideOpen) {
        this.isGuideOpen = isGuideOpen;
    }

    public String getIdWxbUser() {
        return idWxbUser;
    }

    public void setIdWxbUser(String idWxbUser) {
        this.idWxbUser = idWxbUser;
    }

    public String getIdWxbStation() {
        return idWxbStation;
    }

    public void setIdWxbStation(String idWxbStation) {
        this.idWxbStation = idWxbStation;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public Byte getLimitMac() {
        return limitMac;
    }

    public void setLimitMac(Byte limitMac) {
        this.limitMac = limitMac;
    }


}
