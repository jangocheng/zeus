/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.po.menu;

import com.f6car.base.common.Po;
import se.spagettikod.optimist.Identity;
import se.spagettikod.optimist.OptimisticLocking;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigInteger;

@OptimisticLocking("tb_menu")
@Table(name = "tb_menu")
public class TbMenu extends Po {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Identity("id")
    private BigInteger id;

    /**
     * url
     */
    @Size(min = 0, max = 100 , message = "长度必须在{min}和{max}之间")
    private String url;

    /**
     * 名称
     */
    @NotNull
    @Size(min = 0, max = 100 , message = "长度必须在{min}和{max}之间")
    private String name;

    /**
     * 角色备注
     */
    @Size(min = 0, max = 500 , message = "长度必须在{min}和{max}之间")
    private String remark;

    /**
     * 图标
     */
    @Size(min = 0, max = 100 , message = "长度必须在{min}和{max}之间")
    private String ico;

    /**
     * 所属模块
     */
    @Size(min = 0, max = 100 , message = "长度必须在{min}和{max}之间")
    private String model;

    /**
     * 父节点
     */
    @Column(name = "p_id")
    private BigInteger pId;

    /**
     * 逻辑删除，0表示不删除
     */
    @Column(name = "is_delete")
    private Integer isDelete;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 符合Shiro格式的权限字符串，例如[maintain:*]
     */
    @NotNull
    @Size(min = 0, max = 250 , message = "长度必须在{min}和{max}之间")
    private String permission;

    /**
     * 选中url
     */
    @Column(name = "active_url")
    @Size(min = 0, max = 100 , message = "长度必须在{min}和{max}之间")
    private String activeUrl;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(BigInteger id) {
        this.id = id;
    }

    /**
     * 获取url
     *
     * @return url - url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置url
     *
     * @param url url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取名称
     *
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取角色备注
     *
     * @return remark - 角色备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置角色备注
     *
     * @param remark 角色备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取图标
     *
     * @return ico - 图标
     */
    public String getIco() {
        return ico;
    }

    /**
     * 设置图标
     *
     * @param ico 图标
     */
    public void setIco(String ico) {
        this.ico = ico;
    }

    /**
     * 获取所属模块
     *
     * @return model - 所属模块
     */
    public String getModel() {
        return model;
    }

    /**
     * 设置所属模块
     *
     * @param model 所属模块
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * 获取父节点
     *
     * @return p_id - 父节点
     */
    public BigInteger getpId() {
        return pId;
    }

    /**
     * 设置父节点
     *
     * @param pId 父节点
     */
    public void setpId(BigInteger pId) {
        this.pId = pId;
    }

    /**
     * 获取逻辑删除，0表示不删除
     *
     * @return is_delete - 逻辑删除，0表示不删除
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * 设置逻辑删除，0表示不删除
     *
     * @param isDelete 逻辑删除，0表示不删除
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * 获取排序
     *
     * @return sort - 排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置排序
     *
     * @param sort 排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 获取符合Shiro格式的权限字符串，例如[maintain:*]
     *
     * @return permission - 符合Shiro格式的权限字符串，例如[maintain:*]
     */
    public String getPermission() {
        return permission;
    }

    /**
     * 设置符合Shiro格式的权限字符串，例如[maintain:*]
     *
     * @param permission 符合Shiro格式的权限字符串，例如[maintain:*]
     */
    public void setPermission(String permission) {
        this.permission = permission;
    }

    /**
     * 获取选中url
     *
     * @return active_url - 选中url
     */
    public String getActiveUrl() {
        return activeUrl;
    }

    /**
     * 设置选中url
     *
     * @param activeUrl 选中url
     */
    public void setActiveUrl(String activeUrl) {
        this.activeUrl = activeUrl;
    }
}