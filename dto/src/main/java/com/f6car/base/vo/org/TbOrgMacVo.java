package com.f6car.base.vo.org;

import com.f6car.base.common.Vo;
import java.util.Date;
import java.math.BigDecimal;
import java.math.BigInteger;



/**
 * Created by qixiaobo on 2017-11-22.
 */
public class TbOrgMacVo extends Vo {

    private static final long serialVersionUID = -6920934492324729614L;

    private BigInteger   pkId;

    private String   macAddress;

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
