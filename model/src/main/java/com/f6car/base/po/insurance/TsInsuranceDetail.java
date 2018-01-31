/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.po.insurance;

import com.f6car.base.common.Po;
import se.spagettikod.optimist.OptimisticLocking;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.math.BigInteger;

@OptimisticLocking("ts_insurance_detail")
@Table(name = "ts_insurance_detail")
public class TsInsuranceDetail extends Po<Integer> {
    /**
     * 保险单id
     */
    @Column(name = "id_insurance")
    @NotNull
    private Integer idInsurance;

    /**
     * 保单号
     */
    @Column(name = "policy_no")
    @NotNull
    @Size(min = 0, max = 22, message = "长度必须在{min}和{max}之间")
    private String policyNo;

    /**
     * 险种id
     */
    @Column(name = "id_insurance_type")
    @NotNull
    private Integer idInsuranceType;

    /**
     * 保险类型（0交强险/1商业险）
     */
    @Column(name = "insurance_type")
    @NotNull
    private Integer insuranceType;

    /**
     * 险种名称
     */
    @NotNull
    @Size(min = 0, max = 20, message = "长度必须在{min}和{max}之间")
    private String name;

    /**
     * 保额
     */
    @NotNull
    private BigDecimal amount;

    /**
     * 应收金额(元)
     */
    @NotNull
    private BigDecimal receivable;

    /**
     * 折扣
     */
    private BigDecimal discount;

    /**
     * 优惠金额(元)
     */
    private BigDecimal concessionary;

    /**
     * 实收金额(元)
     */
    private BigDecimal paid;

    /**
     * 备注
     */
    @Size(min = 0, max = 50, message = "长度必须在{min}和{max}之间")
    private String memo;

    /**
     * 组织
     */
    @Column(name = "id_own_org")
    @NotNull
    private BigInteger idOwnOrg;

    /**
     * 获取保险单id
     *
     * @return id_insurance - 保险单id
     */
    public Integer getIdInsurance() {
        return idInsurance;
    }

    /**
     * 设置保险单id
     *
     * @param idInsurance 保险单id
     */
    public void setIdInsurance(Integer idInsurance) {
        this.idInsurance = idInsurance;
    }

    /**
     * 获取保单号
     *
     * @return policy_no - 保单号
     */
    public String getPolicyNo() {
        return policyNo;
    }

    /**
     * 设置保单号
     *
     * @param policyNo 保单号
     */
    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
    }

    /**
     * 获取险种id
     *
     * @return id_insurance_type - 险种id
     */
    public Integer getIdInsuranceType() {
        return idInsuranceType;
    }

    /**
     * 设置险种id
     *
     * @param idInsuranceType 险种id
     */
    public void setIdInsuranceType(Integer idInsuranceType) {
        this.idInsuranceType = idInsuranceType;
    }

    /**
     * 获取保险类型（0交强险/1商业险）
     *
     * @return insurance_type - 保险类型（0交强险/1商业险）
     */
    public Integer getInsuranceType() {
        return insuranceType;
    }

    /**
     * 设置保险类型（0交强险/1商业险）
     *
     * @param insuranceType 保险类型（0交强险/1商业险）
     */
    public void setInsuranceType(Integer insuranceType) {
        this.insuranceType = insuranceType;
    }

    /**
     * 获取险种名称
     *
     * @return name - 险种名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置险种名称
     *
     * @param name 险种名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取保额
     *
     * @return amount - 保额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置保额
     *
     * @param amount 保额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 获取应收金额(元)
     *
     * @return receivable - 应收金额(元)
     */
    public BigDecimal getReceivable() {
        return receivable;
    }

    /**
     * 设置应收金额(元)
     *
     * @param receivable 应收金额(元)
     */
    public void setReceivable(BigDecimal receivable) {
        this.receivable = receivable;
    }

    /**
     * 获取折扣
     *
     * @return discount - 折扣
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * 设置折扣
     *
     * @param discount 折扣
     */
    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    /**
     * 获取优惠金额(元)
     *
     * @return concessionary - 优惠金额(元)
     */
    public BigDecimal getConcessionary() {
        return concessionary;
    }

    /**
     * 设置优惠金额(元)
     *
     * @param concessionary 优惠金额(元)
     */
    public void setConcessionary(BigDecimal concessionary) {
        this.concessionary = concessionary;
    }

    /**
     * 获取实收金额(元)
     *
     * @return paid - 实收金额(元)
     */
    public BigDecimal getPaid() {
        return paid;
    }

    /**
     * 设置实收金额(元)
     *
     * @param paid 实收金额(元)
     */
    public void setPaid(BigDecimal paid) {
        this.paid = paid;
    }

    /**
     * 获取备注
     *
     * @return memo - 备注
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 设置备注
     *
     * @param memo 备注
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * 获取组织
     *
     * @return id_own_org - 组织
     */
    public BigInteger getIdOwnOrg() {
        return idOwnOrg;
    }

    /**
     * 设置组织
     *
     * @param idOwnOrg 组织
     */
    public void setIdOwnOrg(BigInteger idOwnOrg) {
        this.idOwnOrg = idOwnOrg;
    }
}