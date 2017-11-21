/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.vo.org;

import com.f6car.base.common.Vo;

import java.util.Date;
import java.math.BigDecimal;
import java.math.BigInteger;



/**
 * Created by qixiaobo on 2017-11-21.
 */
public class TbOrgMacVo extends Vo {

    private static final long serialVersionUID = -6920934492324729614L;

    private BigInteger pkId;

    private String macAddress;

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
