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
import java.math.BigInteger;

@OptimisticLocking("ts_insurance_attachment")
@Table(name = "ts_insurance_attachment")
public class TsInsuranceAttachment extends Po<Integer> {
    /**
     * 所属保险单id
     */
    @Column(name = "id_insurance")
    @NotNull
    private Integer idInsurance;

    /**
     * 上传文件自动生成的key
     */
    @NotNull
    private BigInteger uid;

    /**
     * 保险类型（0交强险/1商业险）
     */
    @Column(name = "insurance_type")
    @NotNull
    private Integer insuranceType;

    /**
     * 文件名
     */
    @NotNull
    @Size(min = 0, max = 100, message = "长度必须在{min}和{max}之间")
    private String name;

    /**
     * 附件路径
     */
    @NotNull
    @Size(min = 0, max = 200, message = "长度必须在{min}和{max}之间")
    private String url;

    /**
     * 组织
     */
    @Column(name = "id_own_org")
    @NotNull
    private BigInteger idOwnOrg;

    /**
     * 获取所属保险单id
     *
     * @return id_insurance - 所属保险单id
     */
    public Integer getIdInsurance() {
        return idInsurance;
    }

    /**
     * 设置所属保险单id
     *
     * @param idInsurance 所属保险单id
     */
    public void setIdInsurance(Integer idInsurance) {
        this.idInsurance = idInsurance;
    }

    /**
     * 获取上传文件自动生成的key
     *
     * @return uid - 上传文件自动生成的key
     */
    public BigInteger getUid() {
        return uid;
    }

    /**
     * 设置上传文件自动生成的key
     *
     * @param uid 上传文件自动生成的key
     */
    public void setUid(BigInteger uid) {
        this.uid = uid;
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
     * 获取文件名
     *
     * @return name - 文件名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置文件名
     *
     * @param name 文件名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取附件路径
     *
     * @return url - 附件路径
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置附件路径
     *
     * @param url 附件路径
     */
    public void setUrl(String url) {
        this.url = url;
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