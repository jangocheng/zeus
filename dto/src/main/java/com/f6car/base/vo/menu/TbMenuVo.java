/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.vo.menu;

import cn.afterturn.easypoi.excel.annotation.Excel;
import com.f6car.base.common.Vo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigInteger;




/**
 * Created by qixiaobo on 2017-12-11.
 */
public class TbMenuVo extends Vo {

    private static final long serialVersionUID = -6920934492324729614L;

   /**
     * 主键
    */
    @Excel(name = "主键",orderNum="10")
    private BigInteger   id;

   /**
     * url
    */
   @Size(min = 0, max = 100, message = "长度必须在{min}和{max}之间")
   @Excel(name = "url", orderNum = "20")
   private String url;

   /**
     * 名称
    */
   @NotNull
   @Size(min = 0, max = 100, message = "长度必须在{min}和{max}之间")
   @Excel(name = "名称", orderNum = "30")
   private String name;

   /**
     * 角色备注
    */
   @Size(min = 0, max = 500, message = "长度必须在{min}和{max}之间")
   @Excel(name = "角色备注", orderNum = "40")
   private String remark;

   /**
     * 图标
    */
   @Size(min = 0, max = 100, message = "长度必须在{min}和{max}之间")
   @Excel(name = "图标", orderNum = "50")
   private String ico;

   /**
     * 所属模块
    */
   @Size(min = 0, max = 100, message = "长度必须在{min}和{max}之间")
   @Excel(name = "所属模块", orderNum = "60")
   private String model;

   /**
     * 父节点
    */
    @Excel(name = "父节点",orderNum="70")
    private BigInteger   pId;

   /**
     * 逻辑删除，0表示不删除
    */
    @Excel(name = "逻辑删除，0表示不删除",orderNum="80")
    private Integer   isDelete;

   /**
     * 排序
    */
    @Excel(name = "排序",orderNum="90")
    private Integer   sort;

   /**
     * 符合Shiro格式的权限字符串，例如[maintain:*]
    */
   @NotNull
   @Size(min = 0, max = 250, message = "长度必须在{min}和{max}之间")
   @Excel(name = "符合Shiro格式的权限字符串，例如[maintain:*]", orderNum = "100")
   private String permission;

   /**
     * 选中url
    */
   @Size(min = 0, max = 100, message = "长度必须在{min}和{max}之间")
   @Excel(name = "选中url", orderNum = "110")
   private String activeUrl;


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
