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
import java.util.Date;


/**
 * Created by qixiaobo on 2018-02-01.
 */
public class TsInsuranceVo extends Vo {

    private static final long serialVersionUID = -6920934492324729614L;

    /**
     * 主键
     */
    @Excel(name = "主键", orderNum = "10")
    private Integer id;

    /**
     * 单号
     */
    @NotNull
    @Size(min = 0, max = 14, message = "长度必须在{min}和{max}之间")
    @Excel(name = "单号", orderNum = "20")
    private String billNo;

    /**
     * 客户pk_id
     */
    @NotNull
    @Excel(name = "客户pk_id", orderNum = "30")
    private BigInteger idCustomer;

    /**
     * 客户姓名
     */
    @NotNull
    @Size(min = 0, max = 100, message = "长度必须在{min}和{max}之间")
    @Excel(name = "客户姓名", orderNum = "40")
    private String customerName;

    /**
     * 客户手机
     */
    @NotNull
    @Size(min = 0, max = 20, message = "长度必须在{min}和{max}之间")
    @Excel(name = "客户手机", orderNum = "50")
    private String cellPhone;

    /**
     * 车辆pk_id
     */
    @NotNull
    @Excel(name = "车辆pk_id", orderNum = "60")
    private BigInteger idCar;

    /**
     * 车牌号
     */
    @NotNull
    @Size(min = 0, max = 20, message = "长度必须在{min}和{max}之间")
    @Excel(name = "车牌号", orderNum = "70")
    private String carNo;

    /**
     * 车辆vin码
     */
    @NotNull
    @Size(min = 0, max = 20, message = "长度必须在{min}和{max}之间")
    @Excel(name = "车辆vin码", orderNum = "80")
    private String vin;

    /**
     * 品牌车型全称
     */
    @Size(min = 0, max = 500, message = "长度必须在{min}和{max}之间")
    @Excel(name = "品牌车型全称", orderNum = "90")
    private String carModel;

    /**
     * 投保日期
     */
    @NotNull
    @Excel(name = "投保日期", orderNum = "100")
    private Date insureDate;

    /**
     * 开始日期
     */
    @NotNull
    @Excel(name = "开始日期", orderNum = "110")
    private Date startDate;

    /**
     * 结束日期
     */
    @NotNull
    @Excel(name = "结束日期", orderNum = "120")
    private Date endDate;

    /**
     * 保险公司id
     */
    @NotNull
    @Excel(name = "保险公司id", orderNum = "130")
    private BigInteger idInsuranceCompany;

    /**
     * 保险公司名称
     */
    @NotNull
    @Size(min = 0, max = 50, message = "长度必须在{min}和{max}之间")
    @Excel(name = "保险公司名称", orderNum = "140")
    private String insuranceCompanyName;

    /**
     * 保险公司联系人
     */
    @Size(min = 0, max = 100, message = "长度必须在{min}和{max}之间")
    @Excel(name = "保险公司联系人", orderNum = "150")
    private String contacts;

    /**
     * 保险公司联系人手机号
     */
    @Size(min = 0, max = 20, message = "长度必须在{min}和{max}之间")
    @Excel(name = "保险公司联系人手机号", orderNum = "160")
    private String contactMobile;

    /**
     * 是否续保，0否/1是
     */
    @Excel(name = "是否续保，0否/1是", orderNum = "170")
    private Integer renewal;

    /**
     * 单据状态(0001制单/0002已审核)
     */
    @Size(min = 0, max = 4, message = "长度必须在{min}和{max}之间")
    @Excel(name = "单据状态(0001制单/0002已审核)", orderNum = "180")
    private String billStatus;

    /**
     * 车船税
     */
    @Excel(name = "车船税", orderNum = "190")
    private BigDecimal vTax;

    /**
     * 交强险金额
     */
    @Excel(name = "交强险金额", orderNum = "200")
    private BigDecimal compulsoryAmount;

    /**
     * 商业险金额
     */
    @Excel(name = "商业险金额", orderNum = "210")
    private BigDecimal commercialAmount;

    /**
     * 优惠金额
     */
    @Excel(name = "优惠金额", orderNum = "220")
    private BigDecimal preferentialAmount;

    /**
     * 实收金额
     */
    @Excel(name = "实收金额", orderNum = "230")
    private BigDecimal receiveAmount;

    /**
     * 服务顾问id
     */
    @NotNull
    @Excel(name = "服务顾问id", orderNum = "240")
    private BigInteger idEmployee;

    /**
     * 服务顾问姓名
     */
    @Size(min = 0, max = 50, message = "长度必须在{min}和{max}之间")
    @Excel(name = "服务顾问姓名", orderNum = "250")
    private String employeeName;

    /**
     * 备注
     */
    @Size(min = 0, max = 200, message = "长度必须在{min}和{max}之间")
    @Excel(name = "备注", orderNum = "260")
    private String memo;

    /**
     * 单据是否已经删除 1:删除
     */
    @Excel(name = "单据是否已经删除 1:删除", orderNum = "270")
    private Byte delFlag;

    /**
     * 组织
     */
    @NotNull
    @Excel(name = "组织", orderNum = "280")
    private BigInteger idOwnOrg;

    /**
     * 版本号
     */
    @NotNull
    @Excel(name = "版本号", orderNum = "290")
    private Integer version;

    /**
     * 原单号
     */
    @Excel(name = "原单号", orderNum = "300")
    private Integer idSourceBill;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public BigInteger getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(BigInteger idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public BigInteger getIdCar() {
        return idCar;
    }

    public void setIdCar(BigInteger idCar) {
        this.idCar = idCar;
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public Date getInsureDate() {
        return insureDate;
    }

    public void setInsureDate(Date insureDate) {
        this.insureDate = insureDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public BigInteger getIdInsuranceCompany() {
        return idInsuranceCompany;
    }

    public void setIdInsuranceCompany(BigInteger idInsuranceCompany) {
        this.idInsuranceCompany = idInsuranceCompany;
    }

    public String getInsuranceCompanyName() {
        return insuranceCompanyName;
    }

    public void setInsuranceCompanyName(String insuranceCompanyName) {
        this.insuranceCompanyName = insuranceCompanyName;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getContactMobile() {
        return contactMobile;
    }

    public void setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
    }

    public Integer getRenewal() {
        return renewal;
    }

    public void setRenewal(Integer renewal) {
        this.renewal = renewal;
    }

    public String getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(String billStatus) {
        this.billStatus = billStatus;
    }

    public BigDecimal getVTax() {
        return vTax;
    }

    public void setVTax(BigDecimal vTax) {
        this.vTax = vTax;
    }

    public BigDecimal getCompulsoryAmount() {
        return compulsoryAmount;
    }

    public void setCompulsoryAmount(BigDecimal compulsoryAmount) {
        this.compulsoryAmount = compulsoryAmount;
    }

    public BigDecimal getCommercialAmount() {
        return commercialAmount;
    }

    public void setCommercialAmount(BigDecimal commercialAmount) {
        this.commercialAmount = commercialAmount;
    }

    public BigDecimal getPreferentialAmount() {
        return preferentialAmount;
    }

    public void setPreferentialAmount(BigDecimal preferentialAmount) {
        this.preferentialAmount = preferentialAmount;
    }

    public BigDecimal getReceiveAmount() {
        return receiveAmount;
    }

    public void setReceiveAmount(BigDecimal receiveAmount) {
        this.receiveAmount = receiveAmount;
    }

    public BigInteger getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(BigInteger idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Byte getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Byte delFlag) {
        this.delFlag = delFlag;
    }

    public BigInteger getIdOwnOrg() {
        return idOwnOrg;
    }

    public void setIdOwnOrg(BigInteger idOwnOrg) {
        this.idOwnOrg = idOwnOrg;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getIdSourceBill() {
        return idSourceBill;
    }

    public void setIdSourceBill(Integer idSourceBill) {
        this.idSourceBill = idSourceBill;
    }


}
