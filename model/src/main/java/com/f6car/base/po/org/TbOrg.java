/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.po.org;

import com.f6car.base.common.Po;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "tb_org")
public class TbOrg extends Po {
    /**
     * 主键
     */
    @Id
    @Column(name = "pk_id")
    private String pkId;

    /**
     * 机构代码
     */
    private String code;

    /**
     * 机构名称
     */
    private String name;

    /**
     * 联系人
     */
    private String contacts;

    /**
     * 联系电话
     */
    @Column(name = "contact_number")
    private String contactNumber;

    /**
     * 手机
     */
    @Column(name = "contact_mobile")
    private String contactMobile;

    /**
     * 传真
     */
    private String fax;

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 区
     */
    private String area;

    /**
     * 街道
     */
    private String street;

    /**
     * 地址
     */
    private String address;

    /**
     * 详细地址：省+市+区+街道+地址
     */
    @Column(name = "detail_address")
    private String detailAddress;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 创建日期
     */
    private Date creationtime;

    /**
     * 修改日期
     */
    private Date modifiedtime;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 修改人
     */
    private String modifier;

    /**
     * 父机构ID
     */
    @Column(name = "id_parent")
    private String idParent;

    /**
     * 是否删除
     */
    @Column(name = "is_del")
    private Byte isDel;

    /**
     * DB硬件码
     */
    @Column(name = "entity_code")
    private String entityCode;

    private String bussiness;

    private String logo;

    /**
     * 门店logo
     */
    @Column(name = "store_logo")
    private String storeLogo;

    /**
     * erp左上角图片路径
     */
    @Column(name = "application_logo")
    private String applicationLogo;

    private String responsible;

    @Column(name = "zip_code")
    private String zipCode;

    /**
     * 截止有效期
     */
    @Column(name = "end_date")
    private Date endDate;

    /**
     * qq号码
     */
    private String qq;

    /**
     * 开户银行
     */
    @Column(name = "bank_account")
    private String bankAccount;

    /**
     * 账号
     */
    @Column(name = "account_number")
    private String accountNumber;

    @Column(name = "id_customer_carzone")
    private String idCustomerCarzone;

    @Column(name = "id_department_carzone")
    private String idDepartmentCarzone;

    /**
     * 是否启用pad端，对工单等可以使用任务模式，0代表不启用，1代表启用
     */
    @Column(name = "is_task_mode_enable")
    private Byte isTaskModeEnable;

    @Column(name = "position_x")
    private BigDecimal positionX;

    @Column(name = "position_y")
    private BigDecimal positionY;

    @Column(name = "open_time")
    private Date openTime;

    @Column(name = "close_time")
    private Date closeTime;

    /**
     * 门店缩写，用于连锁查询显示门店信息
     */
    private String abbreviation;

    /**
     * 开户来源，0表示从f6开户，1表示从康众开户，2表示从帮您车开户
     */
    @Column(name = "from_flag")
    private Integer fromFlag;

    /**
     * 是否允许供应商导出进销存数据
     */
    @Column(name = "enable_supplier_export")
    private Byte enableSupplierExport;

    /**
     * 快捷搜索项目时是否能够搜索平台项目（0：不可，1：可）
     */
    @Column(name = "is_cloud_item_searchable")
    private Byte isCloudItemSearchable;

    /**
     * 快捷搜索材料时是否能够搜索平台材料（0：不可，1：可）
     */
    @Column(name = "is_cloud_part_searchable")
    private Byte isCloudPartSearchable;

    /**
     * pc端是否需要扫码登录。0:不需要；1:需要扫码
     */
    @Column(name = "need_scan_login")
    private Byte needScanLogin;

    /**
     * 移动端登录是否需要检查设备uuid。0：不需要；1:需要检查uuid
     */
    @Column(name = "need_check_uuid")
    private Byte needCheckUuid;

    /**
     * 该门店可以登录的移动设备uuid的上限数
     */
    @Column(name = "uuid_count_limit")
    private Integer uuidCountLimit;

    /**
     * 获取主键
     *
     * @return pk_id - 主键
     */
    public String getPkId() {
        return pkId;
    }

    /**
     * 设置主键
     *
     * @param pkId 主键
     */
    public void setPkId(String pkId) {
        this.pkId = pkId;
    }

    /**
     * 获取机构代码
     *
     * @return code - 机构代码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置机构代码
     *
     * @param code 机构代码
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取机构名称
     *
     * @return name - 机构名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置机构名称
     *
     * @param name 机构名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取联系人
     *
     * @return contacts - 联系人
     */
    public String getContacts() {
        return contacts;
    }

    /**
     * 设置联系人
     *
     * @param contacts 联系人
     */
    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    /**
     * 获取联系电话
     *
     * @return contact_number - 联系电话
     */
    public String getContactNumber() {
        return contactNumber;
    }

    /**
     * 设置联系电话
     *
     * @param contactNumber 联系电话
     */
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    /**
     * 获取手机
     *
     * @return contact_mobile - 手机
     */
    public String getContactMobile() {
        return contactMobile;
    }

    /**
     * 设置手机
     *
     * @param contactMobile 手机
     */
    public void setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
    }

    /**
     * 获取传真
     *
     * @return fax - 传真
     */
    public String getFax() {
        return fax;
    }

    /**
     * 设置传真
     *
     * @param fax 传真
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * 获取省
     *
     * @return province - 省
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置省
     *
     * @param province 省
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 获取市
     *
     * @return city - 市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置市
     *
     * @param city 市
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取区
     *
     * @return area - 区
     */
    public String getArea() {
        return area;
    }

    /**
     * 设置区
     *
     * @param area 区
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * 获取街道
     *
     * @return street - 街道
     */
    public String getStreet() {
        return street;
    }

    /**
     * 设置街道
     *
     * @param street 街道
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * 获取地址
     *
     * @return address - 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址
     *
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取详细地址：省+市+区+街道+地址
     *
     * @return detail_address - 详细地址：省+市+区+街道+地址
     */
    public String getDetailAddress() {
        return detailAddress;
    }

    /**
     * 设置详细地址：省+市+区+街道+地址
     *
     * @param detailAddress 详细地址：省+市+区+街道+地址
     */
    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
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
     * 获取创建人
     *
     * @return creator - 创建人
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 设置创建人
     *
     * @param creator 创建人
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * 获取修改人
     *
     * @return modifier - 修改人
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * 设置修改人
     *
     * @param modifier 修改人
     */
    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    /**
     * 获取父机构ID
     *
     * @return id_parent - 父机构ID
     */
    public String getIdParent() {
        return idParent;
    }

    /**
     * 设置父机构ID
     *
     * @param idParent 父机构ID
     */
    public void setIdParent(String idParent) {
        this.idParent = idParent;
    }

    /**
     * 获取是否删除
     *
     * @return is_del - 是否删除
     */
    public Byte getIsDel() {
        return isDel;
    }

    /**
     * 设置是否删除
     *
     * @param isDel 是否删除
     */
    public void setIsDel(Byte isDel) {
        this.isDel = isDel;
    }

    /**
     * 获取DB硬件码
     *
     * @return entity_code - DB硬件码
     */
    public String getEntityCode() {
        return entityCode;
    }

    /**
     * 设置DB硬件码
     *
     * @param entityCode DB硬件码
     */
    public void setEntityCode(String entityCode) {
        this.entityCode = entityCode;
    }

    /**
     * @return bussiness
     */
    public String getBussiness() {
        return bussiness;
    }

    /**
     * @param bussiness
     */
    public void setBussiness(String bussiness) {
        this.bussiness = bussiness;
    }

    /**
     * @return logo
     */
    public String getLogo() {
        return logo;
    }

    /**
     * @param logo
     */
    public void setLogo(String logo) {
        this.logo = logo;
    }

    /**
     * 获取门店logo
     *
     * @return store_logo - 门店logo
     */
    public String getStoreLogo() {
        return storeLogo;
    }

    /**
     * 设置门店logo
     *
     * @param storeLogo 门店logo
     */
    public void setStoreLogo(String storeLogo) {
        this.storeLogo = storeLogo;
    }

    /**
     * 获取erp左上角图片路径
     *
     * @return application_logo - erp左上角图片路径
     */
    public String getApplicationLogo() {
        return applicationLogo;
    }

    /**
     * 设置erp左上角图片路径
     *
     * @param applicationLogo erp左上角图片路径
     */
    public void setApplicationLogo(String applicationLogo) {
        this.applicationLogo = applicationLogo;
    }

    /**
     * @return responsible
     */
    public String getResponsible() {
        return responsible;
    }

    /**
     * @param responsible
     */
    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }

    /**
     * @return zip_code
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * @param zipCode
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * 获取截止有效期
     *
     * @return end_date - 截止有效期
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * 设置截止有效期
     *
     * @param endDate 截止有效期
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * 获取qq号码
     *
     * @return qq - qq号码
     */
    public String getQq() {
        return qq;
    }

    /**
     * 设置qq号码
     *
     * @param qq qq号码
     */
    public void setQq(String qq) {
        this.qq = qq;
    }

    /**
     * 获取开户银行
     *
     * @return bank_account - 开户银行
     */
    public String getBankAccount() {
        return bankAccount;
    }

    /**
     * 设置开户银行
     *
     * @param bankAccount 开户银行
     */
    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    /**
     * 获取账号
     *
     * @return account_number - 账号
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * 设置账号
     *
     * @param accountNumber 账号
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * @return id_customer_carzone
     */
    public String getIdCustomerCarzone() {
        return idCustomerCarzone;
    }

    /**
     * @param idCustomerCarzone
     */
    public void setIdCustomerCarzone(String idCustomerCarzone) {
        this.idCustomerCarzone = idCustomerCarzone;
    }

    /**
     * @return id_department_carzone
     */
    public String getIdDepartmentCarzone() {
        return idDepartmentCarzone;
    }

    /**
     * @param idDepartmentCarzone
     */
    public void setIdDepartmentCarzone(String idDepartmentCarzone) {
        this.idDepartmentCarzone = idDepartmentCarzone;
    }

    /**
     * 获取是否启用pad端，对工单等可以使用任务模式，0代表不启用，1代表启用
     *
     * @return is_task_mode_enable - 是否启用pad端，对工单等可以使用任务模式，0代表不启用，1代表启用
     */
    public Byte getIsTaskModeEnable() {
        return isTaskModeEnable;
    }

    /**
     * 设置是否启用pad端，对工单等可以使用任务模式，0代表不启用，1代表启用
     *
     * @param isTaskModeEnable 是否启用pad端，对工单等可以使用任务模式，0代表不启用，1代表启用
     */
    public void setIsTaskModeEnable(Byte isTaskModeEnable) {
        this.isTaskModeEnable = isTaskModeEnable;
    }

    /**
     * @return position_x
     */
    public BigDecimal getPositionX() {
        return positionX;
    }

    /**
     * @param positionX
     */
    public void setPositionX(BigDecimal positionX) {
        this.positionX = positionX;
    }

    /**
     * @return position_y
     */
    public BigDecimal getPositionY() {
        return positionY;
    }

    /**
     * @param positionY
     */
    public void setPositionY(BigDecimal positionY) {
        this.positionY = positionY;
    }

    /**
     * @return open_time
     */
    public Date getOpenTime() {
        return openTime;
    }

    /**
     * @param openTime
     */
    public void setOpenTime(Date openTime) {
        this.openTime = openTime;
    }

    /**
     * @return close_time
     */
    public Date getCloseTime() {
        return closeTime;
    }

    /**
     * @param closeTime
     */
    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    /**
     * 获取门店缩写，用于连锁查询显示门店信息
     *
     * @return abbreviation - 门店缩写，用于连锁查询显示门店信息
     */
    public String getAbbreviation() {
        return abbreviation;
    }

    /**
     * 设置门店缩写，用于连锁查询显示门店信息
     *
     * @param abbreviation 门店缩写，用于连锁查询显示门店信息
     */
    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    /**
     * 获取开户来源，0表示从f6开户，1表示从康众开户，2表示从帮您车开户
     *
     * @return from_flag - 开户来源，0表示从f6开户，1表示从康众开户，2表示从帮您车开户
     */
    public Integer getFromFlag() {
        return fromFlag;
    }

    /**
     * 设置开户来源，0表示从f6开户，1表示从康众开户，2表示从帮您车开户
     *
     * @param fromFlag 开户来源，0表示从f6开户，1表示从康众开户，2表示从帮您车开户
     */
    public void setFromFlag(Integer fromFlag) {
        this.fromFlag = fromFlag;
    }

    /**
     * 获取是否允许供应商导出进销存数据
     *
     * @return enable_supplier_export - 是否允许供应商导出进销存数据
     */
    public Byte getEnableSupplierExport() {
        return enableSupplierExport;
    }

    /**
     * 设置是否允许供应商导出进销存数据
     *
     * @param enableSupplierExport 是否允许供应商导出进销存数据
     */
    public void setEnableSupplierExport(Byte enableSupplierExport) {
        this.enableSupplierExport = enableSupplierExport;
    }

    /**
     * 获取快捷搜索项目时是否能够搜索平台项目（0：不可，1：可）
     *
     * @return is_cloud_item_searchable - 快捷搜索项目时是否能够搜索平台项目（0：不可，1：可）
     */
    public Byte getIsCloudItemSearchable() {
        return isCloudItemSearchable;
    }

    /**
     * 设置快捷搜索项目时是否能够搜索平台项目（0：不可，1：可）
     *
     * @param isCloudItemSearchable 快捷搜索项目时是否能够搜索平台项目（0：不可，1：可）
     */
    public void setIsCloudItemSearchable(Byte isCloudItemSearchable) {
        this.isCloudItemSearchable = isCloudItemSearchable;
    }

    /**
     * 获取快捷搜索材料时是否能够搜索平台材料（0：不可，1：可）
     *
     * @return is_cloud_part_searchable - 快捷搜索材料时是否能够搜索平台材料（0：不可，1：可）
     */
    public Byte getIsCloudPartSearchable() {
        return isCloudPartSearchable;
    }

    /**
     * 设置快捷搜索材料时是否能够搜索平台材料（0：不可，1：可）
     *
     * @param isCloudPartSearchable 快捷搜索材料时是否能够搜索平台材料（0：不可，1：可）
     */
    public void setIsCloudPartSearchable(Byte isCloudPartSearchable) {
        this.isCloudPartSearchable = isCloudPartSearchable;
    }

    /**
     * 获取pc端是否需要扫码登录。0:不需要；1:需要扫码
     *
     * @return need_scan_login - pc端是否需要扫码登录。0:不需要；1:需要扫码
     */
    public Byte getNeedScanLogin() {
        return needScanLogin;
    }

    /**
     * 设置pc端是否需要扫码登录。0:不需要；1:需要扫码
     *
     * @param needScanLogin pc端是否需要扫码登录。0:不需要；1:需要扫码
     */
    public void setNeedScanLogin(Byte needScanLogin) {
        this.needScanLogin = needScanLogin;
    }

    /**
     * 获取移动端登录是否需要检查设备uuid。0：不需要；1:需要检查uuid
     *
     * @return need_check_uuid - 移动端登录是否需要检查设备uuid。0：不需要；1:需要检查uuid
     */
    public Byte getNeedCheckUuid() {
        return needCheckUuid;
    }

    /**
     * 设置移动端登录是否需要检查设备uuid。0：不需要；1:需要检查uuid
     *
     * @param needCheckUuid 移动端登录是否需要检查设备uuid。0：不需要；1:需要检查uuid
     */
    public void setNeedCheckUuid(Byte needCheckUuid) {
        this.needCheckUuid = needCheckUuid;
    }

    /**
     * 获取该门店可以登录的移动设备uuid的上限数
     *
     * @return uuid_count_limit - 该门店可以登录的移动设备uuid的上限数
     */
    public Integer getUuidCountLimit() {
        return uuidCountLimit;
    }

    /**
     * 设置该门店可以登录的移动设备uuid的上限数
     *
     * @param uuidCountLimit 该门店可以登录的移动设备uuid的上限数
     */
    public void setUuidCountLimit(Integer uuidCountLimit) {
        this.uuidCountLimit = uuidCountLimit;
    }
}