package com.f6car.base.vo.menu;

import com.f6car.base.common.Vo;
import java.util.Date;
import java.math.BigDecimal;
import java.math.BigInteger;
import cn.afterturn.easypoi.excel.annotation.Excel;




/**
 * Created by qixiaobo on 2017-11-28.
 */
public class TbMenuVo extends Vo {

    private static final long serialVersionUID = -6920934492324729614L;

    @Excel(name = "id",orderNum="10")
    private BigInteger   id;

    @Excel(name = "url",orderNum="20")
    private String   url;

    @Excel(name = "name",orderNum="30")
    private String   name;

    @Excel(name = "remark",orderNum="40")
    private String   remark;

    @Excel(name = "ico",orderNum="50")
    private String   ico;

    @Excel(name = "model",orderNum="60")
    private String   model;

    @Excel(name = "pId",orderNum="70")
    private BigInteger   pId;

    @Excel(name = "isDelete",orderNum="80")
    private Integer   isDelete;

    @Excel(name = "sort",orderNum="90")
    private Integer   sort;

    @Excel(name = "permission",orderNum="100")
    private String   permission;

    @Excel(name = "activeUrl",orderNum="110")
    private String   activeUrl;


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


    public void setRemark(String remark) {
            this.remark = remark;
    }

    public String getRemark() {
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
