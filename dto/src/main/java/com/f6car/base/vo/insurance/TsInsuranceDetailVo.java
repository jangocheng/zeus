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
import java.math.BigDecimal;
import java.math.BigInteger;


/**
 * Created by qixiaobo on 2018-02-01.
 */
public class TsInsuranceDetailVo extends Vo {

    private static final long serialVersionUID = -6920934492324729614L;

    /**
     * 主键
     */
    @Excel(name = "主键", orderNum = "10")
    private Integer id;

    /**
     * 保险单id
     */
    @NotNull
    @Excel(name = "保险单id", orderNum = "20")
    private Integer idInsurance;

    /**
     * 保单号
     */
    @NotNull
    @Size(min = 0, max = 22, message = "长度必须在{min}和{max}之间")
    @Excel(name = "保单号", orderNum = "30")
    private String policyNo;

    /**
     * 险种id
     */
    @NotNull
    @Excel(name = "险种id", orderNum = "40")
    private Integer idInsuranceType;

    /**
     * 保险类型（0交强险/1商业险）
     */
    @NotNull
    @Excel(name = "保险类型（0交强险/1商业险）", orderNum = "50")
    private Integer insuranceType;

    /**
     * 险种名称
     */
    @NotNull
    @Size(min = 0, max = 20, message = "长度必须在{min}和{max}之间")
    @Excel(name = "险种名称", orderNum = "60")
    private String name;

    /**
     * 保额
     */
    @NotNull
    @Excel(name = "保额", orderNum = "70")
    private BigDecimal amount;

    /**
     * 应收金额(元)
     */
    @NotNull
    @Excel(name = "应收金额(元)", orderNum = "80")
    private BigDecimal receivable;

    /**
     * 折扣
     */
    @Excel(name = "折扣", orderNum = "90")
    private BigDecimal discount;

    /**
     * 优惠金额(元)
     */
    @Excel(name = "优惠金额(元)", orderNum = "100")
    private BigDecimal concessionary;

    /**
     * 实收金额(元)
     */
    @Excel(name = "实收金额(元)", orderNum = "110")
    private BigDecimal paid;

    /**
     * 备注
     */
    @Size(min = 0, max = 50, message = "长度必须在{min}和{max}之间")
    @Excel(name = "备注", orderNum = "120")
    private String memo;

    /**
     * 组织
     */
    @NotNull
    @Excel(name = "组织", orderNum = "130")
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

    public String getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
    }

    public Integer getIdInsuranceType() {
        return idInsuranceType;
    }

    public void setIdInsuranceType(Integer idInsuranceType) {
        this.idInsuranceType = idInsuranceType;
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

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getReceivable() {
        return receivable;
    }

    public void setReceivable(BigDecimal receivable) {
        this.receivable = receivable;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getConcessionary() {
        return concessionary;
    }

    public void setConcessionary(BigDecimal concessionary) {
        this.concessionary = concessionary;
    }

    public BigDecimal getPaid() {
        return paid;
    }

    public void setPaid(BigDecimal paid) {
        this.paid = paid;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public BigInteger getIdOwnOrg() {
        return idOwnOrg;
    }

    public void setIdOwnOrg(BigInteger idOwnOrg) {
        this.idOwnOrg = idOwnOrg;
    }


}
