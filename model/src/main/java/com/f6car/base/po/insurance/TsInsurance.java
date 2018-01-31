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
import se.spagettikod.optimist.Version;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

@OptimisticLocking("ts_insurance")
@Table(name = "ts_insurance")
public class TsInsurance extends Po<Integer> {
    /**
     * 单号
     */
    @Column(name = "bill_no")
    @NotNull
    @Size(min = 0, max = 14, message = "长度必须在{min}和{max}之间")
    private String billNo;

    /**
     * 客户pk_id
     */
    @Column(name = "id_customer")
    @NotNull
    private BigInteger idCustomer;

    /**
     * 客户姓名
     */
    @Column(name = "customer_name")
    @NotNull
    @Size(min = 0, max = 100, message = "长度必须在{min}和{max}之间")
    private String customerName;

    /**
     * 客户手机
     */
    @Column(name = "cell_phone")
    @NotNull
    @Size(min = 0, max = 20, message = "长度必须在{min}和{max}之间")
    private String cellPhone;

    /**
     * 车辆pk_id
     */
    @Column(name = "id_car")
    @NotNull
    private BigInteger idCar;

    /**
     * 车牌号
     */
    @Column(name = "car_no")
    @NotNull
    @Size(min = 0, max = 20, message = "长度必须在{min}和{max}之间")
    private String carNo;

    /**
     * 车辆vin码
     */
    @NotNull
    @Size(min = 0, max = 20, message = "长度必须在{min}和{max}之间")
    private String vin;

    /**
     * 品牌车型全称
     */
    @Column(name = "car_model")
    @Size(min = 0, max = 500, message = "长度必须在{min}和{max}之间")
    private String carModel;

    /**
     * 投保日期
     */
    @Column(name = "insure_date")
    @NotNull
    private Date insureDate;

    /**
     * 开始日期
     */
    @Column(name = "start_date")
    @NotNull
    private Date startDate;

    /**
     * 结束日期
     */
    @Column(name = "end_date")
    @NotNull
    private Date endDate;

    /**
     * 保险公司id
     */
    @Column(name = "id_insurance_company")
    @NotNull
    private BigInteger idInsuranceCompany;

    /**
     * 保险公司名称
     */
    @Column(name = "insurance_company_name")
    @NotNull
    @Size(min = 0, max = 50, message = "长度必须在{min}和{max}之间")
    private String insuranceCompanyName;

    /**
     * 保险公司联系人
     */
    @Size(min = 0, max = 100, message = "长度必须在{min}和{max}之间")
    private String contacts;

    /**
     * 保险公司联系人手机号
     */
    @Column(name = "contact_mobile")
    @Size(min = 0, max = 20, message = "长度必须在{min}和{max}之间")
    private String contactMobile;

    /**
     * 是否续保，0否/1是
     */
    private Integer renewal;

    /**
     * 单据状态(0001制单/0002已审核)
     */
    @Column(name = "bill_status")
    @Size(min = 0, max = 4, message = "长度必须在{min}和{max}之间")
    private String billStatus;

    /**
     * 车船税
     */
    @Column(name = "v_tax")
    private BigDecimal vTax;

    /**
     * 交强险金额
     */
    @Column(name = "compulsory_amount")
    private BigDecimal compulsoryAmount;

    /**
     * 商业险金额
     */
    @Column(name = "commercial_amount")
    private BigDecimal commercialAmount;

    /**
     * 优惠金额
     */
    @Column(name = "preferential_amount")
    private BigDecimal preferentialAmount;

    /**
     * 实收金额
     */
    @Column(name = "receive_amount")
    private BigDecimal receiveAmount;

    /**
     * 服务顾问id
     */
    @Column(name = "id_employee")
    @NotNull
    private BigInteger idEmployee;

    /**
     * 服务顾问姓名
     */
    @Column(name = "employee_name")
    @Size(min = 0, max = 50, message = "长度必须在{min}和{max}之间")
    private String employeeName;

    /**
     * 备注
     */
    @Size(min = 0, max = 200, message = "长度必须在{min}和{max}之间")
    private String memo;

    /**
     * 单据是否已经删除 1:删除
     */
    @Column(name = "del_flag")
    private Byte delFlag;

    /**
     * 组织
     */
    @Column(name = "id_own_org")
    @NotNull
    private BigInteger idOwnOrg;

    /**
     * 版本号
     */
    @NotNull
    @Version("version")
    private Integer version;

    /**
     * 原单号
     */
    @Column(name = "id_source_bill")
    private Integer idSourceBill;

    /**
     * 获取单号
     *
     * @return bill_no - 单号
     */
    public String getBillNo() {
        return billNo;
    }

    /**
     * 设置单号
     *
     * @param billNo 单号
     */
    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    /**
     * 获取客户pk_id
     *
     * @return id_customer - 客户pk_id
     */
    public BigInteger getIdCustomer() {
        return idCustomer;
    }

    /**
     * 设置客户pk_id
     *
     * @param idCustomer 客户pk_id
     */
    public void setIdCustomer(BigInteger idCustomer) {
        this.idCustomer = idCustomer;
    }

    /**
     * 获取客户姓名
     *
     * @return customer_name - 客户姓名
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * 设置客户姓名
     *
     * @param customerName 客户姓名
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * 获取客户手机
     *
     * @return cell_phone - 客户手机
     */
    public String getCellPhone() {
        return cellPhone;
    }

    /**
     * 设置客户手机
     *
     * @param cellPhone 客户手机
     */
    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    /**
     * 获取车辆pk_id
     *
     * @return id_car - 车辆pk_id
     */
    public BigInteger getIdCar() {
        return idCar;
    }

    /**
     * 设置车辆pk_id
     *
     * @param idCar 车辆pk_id
     */
    public void setIdCar(BigInteger idCar) {
        this.idCar = idCar;
    }

    /**
     * 获取车牌号
     *
     * @return car_no - 车牌号
     */
    public String getCarNo() {
        return carNo;
    }

    /**
     * 设置车牌号
     *
     * @param carNo 车牌号
     */
    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    /**
     * 获取车辆vin码
     *
     * @return vin - 车辆vin码
     */
    public String getVin() {
        return vin;
    }

    /**
     * 设置车辆vin码
     *
     * @param vin 车辆vin码
     */
    public void setVin(String vin) {
        this.vin = vin;
    }

    /**
     * 获取品牌车型全称
     *
     * @return car_model - 品牌车型全称
     */
    public String getCarModel() {
        return carModel;
    }

    /**
     * 设置品牌车型全称
     *
     * @param carModel 品牌车型全称
     */
    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    /**
     * 获取投保日期
     *
     * @return insure_date - 投保日期
     */
    public Date getInsureDate() {
        return insureDate;
    }

    /**
     * 设置投保日期
     *
     * @param insureDate 投保日期
     */
    public void setInsureDate(Date insureDate) {
        this.insureDate = insureDate;
    }

    /**
     * 获取开始日期
     *
     * @return start_date - 开始日期
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * 设置开始日期
     *
     * @param startDate 开始日期
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * 获取结束日期
     *
     * @return end_date - 结束日期
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * 设置结束日期
     *
     * @param endDate 结束日期
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * 获取保险公司id
     *
     * @return id_insurance_company - 保险公司id
     */
    public BigInteger getIdInsuranceCompany() {
        return idInsuranceCompany;
    }

    /**
     * 设置保险公司id
     *
     * @param idInsuranceCompany 保险公司id
     */
    public void setIdInsuranceCompany(BigInteger idInsuranceCompany) {
        this.idInsuranceCompany = idInsuranceCompany;
    }

    /**
     * 获取保险公司名称
     *
     * @return insurance_company_name - 保险公司名称
     */
    public String getInsuranceCompanyName() {
        return insuranceCompanyName;
    }

    /**
     * 设置保险公司名称
     *
     * @param insuranceCompanyName 保险公司名称
     */
    public void setInsuranceCompanyName(String insuranceCompanyName) {
        this.insuranceCompanyName = insuranceCompanyName;
    }

    /**
     * 获取保险公司联系人
     *
     * @return contacts - 保险公司联系人
     */
    public String getContacts() {
        return contacts;
    }

    /**
     * 设置保险公司联系人
     *
     * @param contacts 保险公司联系人
     */
    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    /**
     * 获取保险公司联系人手机号
     *
     * @return contact_mobile - 保险公司联系人手机号
     */
    public String getContactMobile() {
        return contactMobile;
    }

    /**
     * 设置保险公司联系人手机号
     *
     * @param contactMobile 保险公司联系人手机号
     */
    public void setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
    }

    /**
     * 获取是否续保，0否/1是
     *
     * @return renewal - 是否续保，0否/1是
     */
    public Integer getRenewal() {
        return renewal;
    }

    /**
     * 设置是否续保，0否/1是
     *
     * @param renewal 是否续保，0否/1是
     */
    public void setRenewal(Integer renewal) {
        this.renewal = renewal;
    }

    /**
     * 获取单据状态(0001制单/0002已审核)
     *
     * @return bill_status - 单据状态(0001制单/0002已审核)
     */
    public String getBillStatus() {
        return billStatus;
    }

    /**
     * 设置单据状态(0001制单/0002已审核)
     *
     * @param billStatus 单据状态(0001制单/0002已审核)
     */
    public void setBillStatus(String billStatus) {
        this.billStatus = billStatus;
    }

    /**
     * 获取车船税
     *
     * @return v_tax - 车船税
     */
    public BigDecimal getvTax() {
        return vTax;
    }

    /**
     * 设置车船税
     *
     * @param vTax 车船税
     */
    public void setvTax(BigDecimal vTax) {
        this.vTax = vTax;
    }

    /**
     * 获取交强险金额
     *
     * @return compulsory_amount - 交强险金额
     */
    public BigDecimal getCompulsoryAmount() {
        return compulsoryAmount;
    }

    /**
     * 设置交强险金额
     *
     * @param compulsoryAmount 交强险金额
     */
    public void setCompulsoryAmount(BigDecimal compulsoryAmount) {
        this.compulsoryAmount = compulsoryAmount;
    }

    /**
     * 获取商业险金额
     *
     * @return commercial_amount - 商业险金额
     */
    public BigDecimal getCommercialAmount() {
        return commercialAmount;
    }

    /**
     * 设置商业险金额
     *
     * @param commercialAmount 商业险金额
     */
    public void setCommercialAmount(BigDecimal commercialAmount) {
        this.commercialAmount = commercialAmount;
    }

    /**
     * 获取优惠金额
     *
     * @return preferential_amount - 优惠金额
     */
    public BigDecimal getPreferentialAmount() {
        return preferentialAmount;
    }

    /**
     * 设置优惠金额
     *
     * @param preferentialAmount 优惠金额
     */
    public void setPreferentialAmount(BigDecimal preferentialAmount) {
        this.preferentialAmount = preferentialAmount;
    }

    /**
     * 获取实收金额
     *
     * @return receive_amount - 实收金额
     */
    public BigDecimal getReceiveAmount() {
        return receiveAmount;
    }

    /**
     * 设置实收金额
     *
     * @param receiveAmount 实收金额
     */
    public void setReceiveAmount(BigDecimal receiveAmount) {
        this.receiveAmount = receiveAmount;
    }

    /**
     * 获取服务顾问id
     *
     * @return id_employee - 服务顾问id
     */
    public BigInteger getIdEmployee() {
        return idEmployee;
    }

    /**
     * 设置服务顾问id
     *
     * @param idEmployee 服务顾问id
     */
    public void setIdEmployee(BigInteger idEmployee) {
        this.idEmployee = idEmployee;
    }

    /**
     * 获取服务顾问姓名
     *
     * @return employee_name - 服务顾问姓名
     */
    public String getEmployeeName() {
        return employeeName;
    }

    /**
     * 设置服务顾问姓名
     *
     * @param employeeName 服务顾问姓名
     */
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
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
     * 获取单据是否已经删除 1:删除
     *
     * @return del_flag - 单据是否已经删除 1:删除
     */
    public Byte getDelFlag() {
        return delFlag;
    }

    /**
     * 设置单据是否已经删除 1:删除
     *
     * @param delFlag 单据是否已经删除 1:删除
     */
    public void setDelFlag(Byte delFlag) {
        this.delFlag = delFlag;
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
     * 获取版本号
     *
     * @return version - 版本号
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 设置版本号
     *
     * @param version 版本号
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * 获取原单号
     *
     * @return id_source_bill - 原单号
     */
    public Integer getIdSourceBill() {
        return idSourceBill;
    }

    /**
     * 设置原单号
     *
     * @param idSourceBill 原单号
     */
    public void setIdSourceBill(Integer idSourceBill) {
        this.idSourceBill = idSourceBill;
    }
}