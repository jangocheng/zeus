/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.po.user;

import com.f6car.base.common.Po;
import se.spagettikod.optimist.Identity;
import se.spagettikod.optimist.OptimisticLocking;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigInteger;
import java.util.Date;

@OptimisticLocking("tb_user")
@Table(name = "tb_user")
public class TbUser extends Po {
    /**
     * 主键
     */
    @Id
    @Column(name = "pk_id")
    @NotNull
    @Identity("pk_id")
    private BigInteger pkId;

    /**
     * 用户名
     */
    @Size(min = 0, max = 20 , message = "长度必须在{min}和{max}之间")
    private String username;

    @Column(name = "cell_phone")
    @NotNull
    @Size(min = 0, max = 20 , message = "长度必须在{min}和{max}之间")
    private String cellPhone;

    /**
     * 密码
     */
    @Size(min = 0, max = 50 , message = "长度必须在{min}和{max}之间")
    private String password;

    /**
     * 是否管理员
     */
    @Column(name = "is_admin")
    private Byte isAdmin;

    /**
     * 角色ID
     */
    @Column(name = "id_role")
    private BigInteger idRole;

    /**
     * 创建人
     */
    private BigInteger creator;

    /**
     * 修改人
     */
    private BigInteger modifier;

    /**
     * 修改日期
     */
    private Date modifiedtime;

    /**
     * 创建日期
     */
    @NotNull
    private Date creationtime;

    /**
     * 组织
     */
    @Column(name = "id_own_org")
    private BigInteger idOwnOrg;

    /**
     * 员工ID
     */
    @Column(name = "id_employee")
    private BigInteger idEmployee;

    @Column(name = "is_del")
    private Byte isDel;

    /**
     * 向导默认开关：0默认关闭，1默认打开
     */
    @Column(name = "is_guide_open")
    @NotNull
    private Byte isGuideOpen;

    /**
     * 维小宝用户ID
     */
    @Column(name = "id_wxb_user")
    @Size(min = 0, max = 20 , message = "长度必须在{min}和{max}之间")
    private String idWxbUser;

    /**
     * 维小宝店铺ID
     */
    @Column(name = "id_wxb_station")
    @Size(min = 0, max = 20 , message = "长度必须在{min}和{max}之间")
    private String idWxbStation;

    @Size(min = 0, max = 40 , message = "长度必须在{min}和{max}之间")
    private String openid;

    /**
     * 是否限定PC登录设备 0 不选中 1 选中
     */
    @Column(name = "limit_mac")
    private Byte limitMac;

    /**
     * 获取主键
     *
     * @return pk_id - 主键
     */
    public BigInteger getPkId() {
        return pkId;
    }

    /**
     * 设置主键
     *
     * @param pkId 主键
     */
    public void setPkId(BigInteger pkId) {
        this.pkId = pkId;
    }

    /**
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return cell_phone
     */
    public String getCellPhone() {
        return cellPhone;
    }

    /**
     * @param cellPhone
     */
    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取是否管理员
     *
     * @return is_admin - 是否管理员
     */
    public Byte getIsAdmin() {
        return isAdmin;
    }

    /**
     * 设置是否管理员
     *
     * @param isAdmin 是否管理员
     */
    public void setIsAdmin(Byte isAdmin) {
        this.isAdmin = isAdmin;
    }

    /**
     * 获取角色ID
     *
     * @return id_role - 角色ID
     */
    public BigInteger getIdRole() {
        return idRole;
    }

    /**
     * 设置角色ID
     *
     * @param idRole 角色ID
     */
    public void setIdRole(BigInteger idRole) {
        this.idRole = idRole;
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
     * 获取员工ID
     *
     * @return id_employee - 员工ID
     */
    public BigInteger getIdEmployee() {
        return idEmployee;
    }

    /**
     * 设置员工ID
     *
     * @param idEmployee 员工ID
     */
    public void setIdEmployee(BigInteger idEmployee) {
        this.idEmployee = idEmployee;
    }

    /**
     * @return is_del
     */
    public Byte getIsDel() {
        return isDel;
    }

    /**
     * @param isDel
     */
    public void setIsDel(Byte isDel) {
        this.isDel = isDel;
    }

    /**
     * 获取向导默认开关：0默认关闭，1默认打开
     *
     * @return is_guide_open - 向导默认开关：0默认关闭，1默认打开
     */
    public Byte getIsGuideOpen() {
        return isGuideOpen;
    }

    /**
     * 设置向导默认开关：0默认关闭，1默认打开
     *
     * @param isGuideOpen 向导默认开关：0默认关闭，1默认打开
     */
    public void setIsGuideOpen(Byte isGuideOpen) {
        this.isGuideOpen = isGuideOpen;
    }

    /**
     * 获取维小宝用户ID
     *
     * @return id_wxb_user - 维小宝用户ID
     */
    public String getIdWxbUser() {
        return idWxbUser;
    }

    /**
     * 设置维小宝用户ID
     *
     * @param idWxbUser 维小宝用户ID
     */
    public void setIdWxbUser(String idWxbUser) {
        this.idWxbUser = idWxbUser;
    }

    /**
     * 获取维小宝店铺ID
     *
     * @return id_wxb_station - 维小宝店铺ID
     */
    public String getIdWxbStation() {
        return idWxbStation;
    }

    /**
     * 设置维小宝店铺ID
     *
     * @param idWxbStation 维小宝店铺ID
     */
    public void setIdWxbStation(String idWxbStation) {
        this.idWxbStation = idWxbStation;
    }

    /**
     * @return openid
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * @param openid
     */
    public void setOpenid(String openid) {
        this.openid = openid;
    }

    /**
     * 获取是否限定PC登录设备 0 不选中 1 选中
     *
     * @return limit_mac - 是否限定PC登录设备 0 不选中 1 选中
     */
    public Byte getLimitMac() {
        return limitMac;
    }

    /**
     * 设置是否限定PC登录设备 0 不选中 1 选中
     *
     * @param limitMac 是否限定PC登录设备 0 不选中 1 选中
     */
    public void setLimitMac(Byte limitMac) {
        this.limitMac = limitMac;
    }
}