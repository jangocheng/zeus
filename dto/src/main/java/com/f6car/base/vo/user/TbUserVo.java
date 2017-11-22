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

import java.math.BigInteger;




/**
 * Created by qixiaobo on 2017-11-22.
 */
public class TbUserVo extends Vo {

    private static final long serialVersionUID = -6920934492324729614L;

    @Excel(name = "pkId", orderNum = "10")
    private BigInteger   pkId;

    @Excel(name = "username", orderNum = "20")
    private String   username;

    @Excel(name = "cellPhone", orderNum = "30")
    private String   cellPhone;

    @Excel(name = "password", orderNum = "40")
    private String   password;

    @Excel(name = "isAdmin", orderNum = "50")
    private Byte   isAdmin;

    @Excel(name = "idRole", orderNum = "60")
    private BigInteger   idRole;

    @Excel(name = "idOwnOrg", orderNum = "70")
    private BigInteger   idOwnOrg;

    @Excel(name = "idEmployee", orderNum = "80")
    private BigInteger   idEmployee;

    @Excel(name = "isDel", orderNum = "90")
    private Byte   isDel;

    @Excel(name = "isGuideOpen", orderNum = "100")
    private Byte   isGuideOpen;

    @Excel(name = "idWxbUser", orderNum = "110")
    private String   idWxbUser;

    @Excel(name = "idWxbStation", orderNum = "120")
    private String   idWxbStation;

    @Excel(name = "openid", orderNum = "130")
    private String   openid;

    @Excel(name = "limitMac", orderNum = "140")
    private Byte   limitMac;


    public void setPkId(BigInteger pkId) {
            this.pkId = pkId;
       }

    public BigInteger getPkId() {
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

    public Byte getIsAdmin() {
          return isAdmin;
      }

    public void setIsAdmin(Byte isAdmin) {
        this.isAdmin = isAdmin;
    }


    public void setIdRole(BigInteger idRole) {
            this.idRole = idRole;
       }

    public BigInteger getIdRole() {
          return idRole;
      }


    public void setIdOwnOrg(BigInteger idOwnOrg) {
            this.idOwnOrg = idOwnOrg;
       }

    public BigInteger getIdOwnOrg() {
          return idOwnOrg;
      }


    public void setIdEmployee(BigInteger idEmployee) {
            this.idEmployee = idEmployee;
       }

    public BigInteger getIdEmployee() {
          return idEmployee;
      }


    public void setIsDel(Byte isDel) {
            this.isDel = isDel;
       }

    public Byte getIsDel() {
          return isDel;
      }

    public Byte getIsGuideOpen() {
          return isGuideOpen;
      }

    public void setIsGuideOpen(Byte isGuideOpen) {
        this.isGuideOpen = isGuideOpen;
    }


    public void setIdWxbUser(String idWxbUser) {
            this.idWxbUser = idWxbUser;
       }

    public String getIdWxbUser() {
          return idWxbUser;
      }

    public String getIdWxbStation() {
          return idWxbStation;
      }

    public void setIdWxbStation(String idWxbStation) {
        this.idWxbStation = idWxbStation;
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
