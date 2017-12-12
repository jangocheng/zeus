/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.vo.org;

import cn.afterturn.easypoi.excel.annotation.Excel;
import com.f6car.base.common.Vo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigInteger;




/**
 * Created by qixiaobo on 2017-12-11.
 */
public class TbOrgMacVo extends Vo {

    private static final long serialVersionUID = -6920934492324729614L;

   /**
     * 主键id
    */
    @Excel(name = "主键id",orderNum="10")
    private BigInteger   pkId;

   /**
     * mac地址
    */
   @NotNull
   @Size(min = 0, max = 500, message = "长度必须在{min}和{max}之间")
   @Excel(name = "mac地址", orderNum = "20")
   private String macAddress;

   /**
     * 组织
    */
   @NotNull
   @Excel(name = "组织", orderNum = "30")
   private BigInteger idOwnOrg;


    public void setPkId(BigInteger pkId) {
       this.pkId = pkId;
    }

    public BigInteger getPkId() {
       return pkId;
    }


    public void setMacAddress(String macAddress) {
       this.macAddress = macAddress;
    }

    public String getMacAddress() {
       return macAddress;
    }


    public void setIdOwnOrg(BigInteger idOwnOrg) {
       this.idOwnOrg = idOwnOrg;
    }

    public BigInteger getIdOwnOrg() {
       return idOwnOrg;
    }






}
