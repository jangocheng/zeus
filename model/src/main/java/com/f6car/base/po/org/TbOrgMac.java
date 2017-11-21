/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.po.org;

import com.f6car.base.common.Po;

import java.math.BigInteger;
import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_org_mac")
public class TbOrgMac extends Po {
    /**
     * 主键id
     */
    @Id
    @Column(name = "pk_id")
    private BigInteger pkId;

    /**
     * mac地址
     */
    @Column(name = "mac_address")
    private String macAddress;

    /**
     * 组织
     */
    @Column(name = "id_own_org")
    private BigInteger idOwnOrg;

    /**
     * 创建人
     */
    private BigInteger creator;

    /**
     * 创建日期
     */
    private Date creationtime;

    /**
     * 修改人
     */
    private BigInteger modifier;

    /**
     * 修改日期
     */
    private Date modifiedtime;

    /**
     * 获取主键id
     *
     * @return pk_id - 主键id
     */
    public BigInteger getPkId() {
        return pkId;
    }

    /**
     * 设置主键id
     *
     * @param pkId 主键id
     */
    public void setPkId(BigInteger pkId) {
        this.pkId = pkId;
    }

    /**
     * 获取mac地址
     *
     * @return mac_address - mac地址
     */
    public String getMacAddress() {
        return macAddress;
    }

    /**
     * 设置mac地址
     *
     * @param macAddress mac地址
     */
    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
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

    /**
     * 获取创建人
     *
     * @return creator - 创建人
     */
    public BigInteger getCreator() {
        return creator;
    }

    /**
     * 设置创建人
     *
     * @param creator 创建人
     */
    public void setCreator(BigInteger creator) {
        this.creator = creator;
    }

    /**
     * 获取创建日期
     *
     * @return creationtime - 创建日期
     */
    public Date getCreationtime() {
        return creationtime;
    }

    /**
     * 设置创建日期
     *
     * @param creationtime 创建日期
     */
    public void setCreationtime(Date creationtime) {
        this.creationtime = creationtime;
    }

    /**
     * 获取修改人
     *
     * @return modifier - 修改人
     */
    public BigInteger getModifier() {
        return modifier;
    }

    /**
     * 设置修改人
     *
     * @param modifier 修改人
     */
    public void setModifier(BigInteger modifier) {
        this.modifier = modifier;
    }

    /**
     * 获取修改日期
     *
     * @return modifiedtime - 修改日期
     */
    public Date getModifiedtime() {
        return modifiedtime;
    }

    /**
     * 设置修改日期
     *
     * @param modifiedtime 修改日期
     */
    public void setModifiedtime(Date modifiedtime) {
        this.modifiedtime = modifiedtime;
    }
}