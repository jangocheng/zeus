/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.vo.insurance;

import cn.afterturn.easypoi.excel.annotation.Excel;
import com.f6car.base.common.Vo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigInteger;


/**
 * Created by qixiaobo on 2018-02-01.
 */
public class TsInsuranceAttachmentVo extends Vo {

    private static final long serialVersionUID = -6920934492324729614L;

    /**
     * 主键
     */
    @Excel(name = "主键", orderNum = "10")
    private Integer id;

    /**
     * 所属保险单id
     */
    @NotNull
    @Excel(name = "所属保险单id", orderNum = "20")
    private Integer idInsurance;

    /**
     * 上传文件自动生成的key
     */
    @NotNull
    @Excel(name = "上传文件自动生成的key", orderNum = "30")
    private BigInteger uid;

    /**
     * 保险类型（0交强险/1商业险）
     */
    @NotNull
    @Excel(name = "保险类型（0交强险/1商业险）", orderNum = "40")
    private Integer insuranceType;

    /**
     * 文件名
     */
    @NotNull
    @Size(min = 0, max = 100, message = "长度必须在{min}和{max}之间")
    @Excel(name = "文件名", orderNum = "50")
    private String name;

    /**
     * 附件路径
     */
    @NotNull
    @Size(min = 0, max = 200, message = "长度必须在{min}和{max}之间")
    @Excel(name = "附件路径", orderNum = "60")
    private String url;

    /**
     * 组织
     */
    @NotNull
    @Excel(name = "组织", orderNum = "70")
    private BigInteger idOwnOrg;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdInsurance() {
        return idInsurance;
    }

    public void setIdInsurance(Integer idInsurance) {
        this.idInsurance = idInsurance;
    }

    public BigInteger getUid() {
        return uid;
    }

    public void setUid(BigInteger uid) {
        this.uid = uid;
    }

    public Integer getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(Integer insuranceType) {
        this.insuranceType = insuranceType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public BigInteger getIdOwnOrg() {
        return idOwnOrg;
    }

    public void setIdOwnOrg(BigInteger idOwnOrg) {
        this.idOwnOrg = idOwnOrg;
    }


}
