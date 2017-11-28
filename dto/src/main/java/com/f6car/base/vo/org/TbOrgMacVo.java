package com.f6car.base.vo.org;

import com.f6car.base.common.Vo;
import java.util.Date;
import java.math.BigDecimal;
import java.math.BigInteger;
import cn.afterturn.easypoi.excel.annotation.Excel;




/**
 * Created by qixiaobo on 2017-11-28.
 */
public class TbOrgMacVo extends Vo {

    private static final long serialVersionUID = -6920934492324729614L;

    @Excel(name = "pkId",orderNum="10")
    private BigInteger   pkId;

    @Excel(name = "macAddress",orderNum="20")
    private String   macAddress;

    @Excel(name = "idOwnOrg",orderNum="30")
    private BigInteger   idOwnOrg;


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
