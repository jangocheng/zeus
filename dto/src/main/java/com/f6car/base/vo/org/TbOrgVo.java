/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.vo.org;

import cn.afterturn.easypoi.excel.annotation.Excel;
import com.f6car.base.common.Vo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;




/**
 * Created by qixiaobo on 2017-12-11.
 */
public class TbOrgVo extends Vo {

    private static final long serialVersionUID = -6920934492324729614L;

   /**
     * 主键
    */
   @NotNull
   @Excel(name = "主键", orderNum = "10")
   private BigInteger pkId;

   /**
     * 机构代码
    */
   @Size(min = 0, max = 20, message = "长度必须在{min}和{max}之间")
   @Excel(name = "机构代码", orderNum = "20")
   private String code;

   /**
     * 机构名称
    */
   @Size(min = 0, max = 100, message = "长度必须在{min}和{max}之间")
   @Excel(name = "机构名称", orderNum = "30")
   private String name;

   /**
     * 联系人
    */
   @Size(min = 0, max = 20, message = "长度必须在{min}和{max}之间")
   @Excel(name = "联系人", orderNum = "40")
   private String contacts;

   /**
     * 联系电话
    */
   @Size(min = 0, max = 20, message = "长度必须在{min}和{max}之间")
   @Excel(name = "联系电话", orderNum = "50")
   private String contactNumber;

   /**
     * 手机
    */
   @Size(min = 0, max = 20, message = "长度必须在{min}和{max}之间")
   @Excel(name = "手机", orderNum = "60")
   private String contactMobile;

   /**
     * 传真
    */
   @Size(min = 0, max = 20, message = "长度必须在{min}和{max}之间")
   @Excel(name = "传真", orderNum = "70")
   private String fax;

   /**
     * 省
    */
   @Size(min = 0, max = 20, message = "长度必须在{min}和{max}之间")
   @Excel(name = "省", orderNum = "80")
   private String province;

   /**
     * 市
    */
   @Size(min = 0, max = 20, message = "长度必须在{min}和{max}之间")
   @Excel(name = "市", orderNum = "90")
   private String city;

   /**
     * 区
    */
   @Size(min = 0, max = 20, message = "长度必须在{min}和{max}之间")
   @Excel(name = "区", orderNum = "100")
   private String area;

   /**
     * 街道
    */
   @Size(min = 0, max = 20, message = "长度必须在{min}和{max}之间")
   @Excel(name = "街道", orderNum = "110")
   private String street;

   /**
     * 地址
    */
   @Size(min = 0, max = 100, message = "长度必须在{min}和{max}之间")
   @Excel(name = "地址", orderNum = "120")
   private String address;

   /**
     * 详细地址：省+市+区+街道+地址
    */
   @Size(min = 0, max = 500, message = "长度必须在{min}和{max}之间")
   @Excel(name = "详细地址：省+市+区+街道+地址", orderNum = "130")
   private String detailAddress;

   /**
     * 邮箱
    */
   @Size(min = 0, max = 50, message = "长度必须在{min}和{max}之间")
   @Excel(name = "邮箱", orderNum = "140")
   private String email;

   /**
     * 父机构ID
    */
    @Excel(name = "父机构ID",orderNum="150")
    private BigInteger   idParent;

   /**
     * 是否删除
    */
    @Excel(name = "是否删除",orderNum="160")
    private Byte   isDel;

   /**
     * DB硬件码
    */
   @Size(min = 0, max = 20, message = "长度必须在{min}和{max}之间")
   @Excel(name = "DB硬件码", orderNum = "170")
   private String entityCode;

   /**
     * bussiness
    */
   @Size(min = 0, max = 50, message = "长度必须在{min}和{max}之间")
   @Excel(name = "bussiness", orderNum = "180")
   private String bussiness;

   /**
     * logo
    */
   @Size(min = 0, max = 100, message = "长度必须在{min}和{max}之间")
   @Excel(name = "logo", orderNum = "190")
   private String logo;

   /**
     * 门店logo
    */
   @Size(min = 0, max = 100, message = "长度必须在{min}和{max}之间")
   @Excel(name = "门店logo", orderNum = "200")
   private String storeLogo;

   /**
     * erp左上角图片路径
    */
   @Size(min = 0, max = 200, message = "长度必须在{min}和{max}之间")
   @Excel(name = "erp左上角图片路径", orderNum = "210")
   private String applicationLogo;

   /**
     * responsible
    */
   @Size(min = 0, max = 20, message = "长度必须在{min}和{max}之间")
   @Excel(name = "responsible", orderNum = "220")
   private String responsible;

   /**
     * zipCode
    */
   @Size(min = 0, max = 20, message = "长度必须在{min}和{max}之间")
   @Excel(name = "zipCode", orderNum = "230")
   private String zipCode;

   /**
     * 截止有效期
    */
   @NotNull
   @Excel(name = "截止有效期", orderNum = "240")
   private Date endDate;

   /**
     * qq号码
    */
   @Size(min = 0, max = 20, message = "长度必须在{min}和{max}之间")
   @Excel(name = "qq号码", orderNum = "250")
   private String qq;

   /**
     * 开户银行
    */
   @Size(min = 0, max = 50, message = "长度必须在{min}和{max}之间")
   @Excel(name = "开户银行", orderNum = "260")
   private String bankAccount;

   /**
     * 账号
    */
   @Size(min = 0, max = 50, message = "长度必须在{min}和{max}之间")
   @Excel(name = "账号", orderNum = "270")
   private String accountNumber;

   /**
     * idCustomerCarzone
    */
   @Size(min = 0, max = 20, message = "长度必须在{min}和{max}之间")
   @Excel(name = "idCustomerCarzone", orderNum = "280")
   private String idCustomerCarzone;

   /**
     * idDepartmentCarzone
    */
   @Size(min = 0, max = 20, message = "长度必须在{min}和{max}之间")
   @Excel(name = "idDepartmentCarzone", orderNum = "290")
   private String idDepartmentCarzone;

   /**
     * 是否启用pad端，对工单等可以使用任务模式，0代表不启用，1代表启用
    */
    @Excel(name = "是否启用pad端，对工单等可以使用任务模式，0代表不启用，1代表启用",orderNum="300")
    private Byte   isTaskModeEnable;

    /**
     * 是否允许未完工先收款
     */
    @NotNull
    @Excel(name = "是否允许未完工先收款", orderNum = "310")
    private Byte isAheadGatheringEnable;

   /**
     * positionX
    */
   @Excel(name = "positionX", orderNum = "320")
    private BigDecimal   positionX;

   /**
     * positionY
    */
   @Excel(name = "positionY", orderNum = "330")
    private BigDecimal   positionY;

   /**
     * openTime
    */
   @Excel(name = "openTime", orderNum = "340")
    private Date   openTime;

   /**
     * closeTime
    */
   @Excel(name = "closeTime", orderNum = "350")
    private Date   closeTime;

   /**
     * 门店缩写，用于连锁查询显示门店信息
    */
   @Size(min = 0, max = 10, message = "长度必须在{min}和{max}之间")
   @Excel(name = "门店缩写，用于连锁查询显示门店信息", orderNum = "360")
   private String abbreviation;

   /**
     * 开户来源，0表示从f6开户，1表示从康众开户，2表示从帮您车开户
    */
   @Excel(name = "开户来源，0表示从f6开户，1表示从康众开户，2表示从帮您车开户", orderNum = "370")
    private Integer   fromFlag;

   /**
     * 是否允许供应商导出进销存数据
    */
   @Excel(name = "是否允许供应商导出进销存数据", orderNum = "380")
    private Byte   enableSupplierExport;

   /**
     * 快捷搜索项目时是否能够搜索平台项目（0：不可，1：可）
    */
   @NotNull
   @Excel(name = "快捷搜索项目时是否能够搜索平台项目（0：不可，1：可）", orderNum = "390")
   private Byte isCloudItemSearchable;

   /**
     * 快捷搜索材料时是否能够搜索平台材料（0：不可，1：可）
    */
   @NotNull
   @Excel(name = "快捷搜索材料时是否能够搜索平台材料（0：不可，1：可）", orderNum = "400")
   private Byte isCloudPartSearchable;

   /**
     * pc端是否需要扫码登录。0:不需要；1:需要扫码
    */
   @Excel(name = "pc端是否需要扫码登录。0:不需要；1:需要扫码", orderNum = "410")
    private Byte   needScanLogin;

   /**
     * 移动端登录是否需要检查设备uuid。0：不需要；1:需要检查uuid
    */
   @Excel(name = "移动端登录是否需要检查设备uuid。0：不需要；1:需要检查uuid", orderNum = "420")
    private Byte   needCheckUuid;

   /**
     * 该门店可以登录的移动设备uuid的上限数
    */
   @Excel(name = "该门店可以登录的移动设备uuid的上限数", orderNum = "430")
    private Integer   uuidCountLimit;


    public void setPkId(BigInteger pkId) {
       this.pkId = pkId;
    }

    public BigInteger getPkId() {
       return pkId;
    }


    public void setCode(String code) {
       this.code = code;
    }

    public String getCode() {
       return code;
    }


    public void setName(String name) {
       this.name = name;
    }

    public String getName() {
       return name;
    }


    public void setContacts(String contacts) {
       this.contacts = contacts;
    }

    public String getContacts() {
       return contacts;
    }


    public void setContactNumber(String contactNumber) {
       this.contactNumber = contactNumber;
    }

    public String getContactNumber() {
       return contactNumber;
    }


    public void setContactMobile(String contactMobile) {
       this.contactMobile = contactMobile;
    }

    public String getContactMobile() {
       return contactMobile;
    }


    public void setFax(String fax) {
       this.fax = fax;
    }

    public String getFax() {
       return fax;
    }


    public void setProvince(String province) {
       this.province = province;
    }

    public String getProvince() {
       return province;
    }


    public void setCity(String city) {
       this.city = city;
    }

    public String getCity() {
       return city;
    }


    public void setArea(String area) {
       this.area = area;
    }

    public String getArea() {
       return area;
    }


    public void setStreet(String street) {
       this.street = street;
    }

    public String getStreet() {
       return street;
    }


    public void setAddress(String address) {
       this.address = address;
    }

    public String getAddress() {
       return address;
    }


    public void setDetailAddress(String detailAddress) {
       this.detailAddress = detailAddress;
    }

    public String getDetailAddress() {
       return detailAddress;
    }


    public void setEmail(String email) {
       this.email = email;
    }

    public String getEmail() {
       return email;
    }


    public void setIdParent(BigInteger idParent) {
       this.idParent = idParent;
    }

    public BigInteger getIdParent() {
       return idParent;
    }


    public void setIsDel(Byte isDel) {
       this.isDel = isDel;
    }

    public Byte getIsDel() {
       return isDel;
    }


    public void setEntityCode(String entityCode) {
       this.entityCode = entityCode;
    }

    public String getEntityCode() {
       return entityCode;
    }


    public void setBussiness(String bussiness) {
       this.bussiness = bussiness;
    }

    public String getBussiness() {
       return bussiness;
    }


    public void setLogo(String logo) {
       this.logo = logo;
    }

    public String getLogo() {
       return logo;
    }


    public void setStoreLogo(String storeLogo) {
       this.storeLogo = storeLogo;
    }

    public String getStoreLogo() {
       return storeLogo;
    }


    public void setApplicationLogo(String applicationLogo) {
       this.applicationLogo = applicationLogo;
    }

    public String getApplicationLogo() {
       return applicationLogo;
    }


    public void setResponsible(String responsible) {
       this.responsible = responsible;
    }

    public String getResponsible() {
       return responsible;
    }


    public void setZipCode(String zipCode) {
       this.zipCode = zipCode;
    }

    public String getZipCode() {
       return zipCode;
    }


    public void setEndDate(Date endDate) {
       this.endDate = endDate;
    }

    public Date getEndDate() {
       return endDate;
    }


    public void setQq(String qq) {
       this.qq = qq;
    }

    public String getQq() {
       return qq;
    }


    public void setBankAccount(String bankAccount) {
       this.bankAccount = bankAccount;
    }

    public String getBankAccount() {
       return bankAccount;
    }


    public void setAccountNumber(String accountNumber) {
       this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
       return accountNumber;
    }


    public void setIdCustomerCarzone(String idCustomerCarzone) {
       this.idCustomerCarzone = idCustomerCarzone;
    }

    public String getIdCustomerCarzone() {
       return idCustomerCarzone;
    }


    public void setIdDepartmentCarzone(String idDepartmentCarzone) {
       this.idDepartmentCarzone = idDepartmentCarzone;
    }

    public String getIdDepartmentCarzone() {
       return idDepartmentCarzone;
    }


    public void setIsTaskModeEnable(Byte isTaskModeEnable) {
       this.isTaskModeEnable = isTaskModeEnable;
    }

    public Byte getIsTaskModeEnable() {
       return isTaskModeEnable;
    }

    public Byte getIsAheadGatheringEnable() {
        return isAheadGatheringEnable;
    }

    public void setIsAheadGatheringEnable(Byte isAheadGatheringEnable) {
        this.isAheadGatheringEnable = isAheadGatheringEnable;
    }


    public void setPositionX(BigDecimal positionX) {
       this.positionX = positionX;
    }

    public BigDecimal getPositionX() {
       return positionX;
    }


    public void setPositionY(BigDecimal positionY) {
       this.positionY = positionY;
    }

    public BigDecimal getPositionY() {
       return positionY;
    }


    public void setOpenTime(Date openTime) {
       this.openTime = openTime;
    }

    public Date getOpenTime() {
       return openTime;
    }


    public void setCloseTime(Date closeTime) {
       this.closeTime = closeTime;
    }

    public Date getCloseTime() {
       return closeTime;
    }


    public void setAbbreviation(String abbreviation) {
       this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
       return abbreviation;
    }


    public void setFromFlag(Integer fromFlag) {
       this.fromFlag = fromFlag;
    }

    public Integer getFromFlag() {
       return fromFlag;
    }


    public void setEnableSupplierExport(Byte enableSupplierExport) {
       this.enableSupplierExport = enableSupplierExport;
    }

    public Byte getEnableSupplierExport() {
       return enableSupplierExport;
    }


    public void setIsCloudItemSearchable(Byte isCloudItemSearchable) {
       this.isCloudItemSearchable = isCloudItemSearchable;
    }

    public Byte getIsCloudItemSearchable() {
       return isCloudItemSearchable;
    }


    public void setIsCloudPartSearchable(Byte isCloudPartSearchable) {
       this.isCloudPartSearchable = isCloudPartSearchable;
    }

    public Byte getIsCloudPartSearchable() {
       return isCloudPartSearchable;
    }


    public void setNeedScanLogin(Byte needScanLogin) {
       this.needScanLogin = needScanLogin;
    }

    public Byte getNeedScanLogin() {
       return needScanLogin;
    }


    public void setNeedCheckUuid(Byte needCheckUuid) {
       this.needCheckUuid = needCheckUuid;
    }

    public Byte getNeedCheckUuid() {
       return needCheckUuid;
    }


    public void setUuidCountLimit(Integer uuidCountLimit) {
       this.uuidCountLimit = uuidCountLimit;
    }

    public Integer getUuidCountLimit() {
       return uuidCountLimit;
    }






}
