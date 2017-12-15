/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.vo.maintain;

import cn.afterturn.easypoi.excel.annotation.Excel;
import com.f6car.base.common.Vo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;




/**
 * Created by qixiaobo on 2017-12-13.
 */
public class TsMaintainVo extends Vo {

    private static final long serialVersionUID = -6920934492324729614L;

    /**
     * 主键
     */
    @NotNull
    @Excel(name = "主键", orderNum = "10")
    private BigInteger pkId;

    /**
     * 单号
     */
    @Size(min = 0, max = 20, message = "长度必须在{min}和{max}之间")
    @Excel(name = "单号", orderNum = "20")
    private String billNo;

    /**
     * 单据日期
     */
    @NotNull
    @Excel(name = "单据日期", orderNum = "30")
    private Date billDate;

    /**
     * 客户ID
     */
    @Excel(name = "客户ID", orderNum = "40")
    private BigInteger idCustomer;

    /**
     * 车辆ID
     */
    @Excel(name = "车辆ID", orderNum = "50")
    private BigInteger idCar;

    /**
     * 会员ID
     */
    @Excel(name = "会员ID", orderNum = "60")
    private BigInteger idMember;

    /**
     * 行驶里程
     */
    @Excel(name = "行驶里程", orderNum = "70")
    private BigDecimal mileage;

    /**
     * 维修类别(工单,零售)
     */
    @Size(min = 0, max = 10, message = "长度必须在{min}和{max}之间")
    @Excel(name = "维修类别(工单,零售)", orderNum = "80")
    private String maintainType;

    /**
     * 业务类型
     */
    @Size(min = 0, max = 4, message = "长度必须在{min}和{max}之间")
    @Excel(name = "业务类型", orderNum = "90")
    private String billType;

    /**
     * 业务分类id
     */
    @Excel(name = "业务分类id", orderNum = "100")
    private BigInteger maintainTypeId;

    /**
     * 单据状态
     */
    @Size(min = 0, max = 4, message = "长度必须在{min}和{max}之间")
    @Excel(name = "单据状态", orderNum = "110")
    private String billStatus;

    /**
     * 结算状态
     */
    @Size(min = 0, max = 4, message = "长度必须在{min}和{max}之间")
    @Excel(name = "结算状态", orderNum = "120")
    private String balanceStatus;

    /**
     * 材料领取状态
     */
    @Size(min = 0, max = 4, message = "长度必须在{min}和{max}之间")
    @Excel(name = "材料领取状态", orderNum = "130")
    private String stockStatus;

    /**
     * 未收金额
     */
    @Excel(name = "未收金额", orderNum = "140")
    private BigDecimal oweAmount;

    /**
     * 已收金额
     */
    @Excel(name = "已收金额", orderNum = "150")
    private BigDecimal receiveAmount;

    /**
     * 材料明细小计
     */
    @Excel(name = "材料明细小计", orderNum = "160")
    private BigDecimal partinfoSubtotal;

    /**
     * 项目明细小计
     */
    @Excel(name = "项目明细小计", orderNum = "170")
    private BigDecimal serviceSubtotal;

    /**
     * 总金额
     */
    @Excel(name = "总金额", orderNum = "180")
    private BigDecimal amount;

    /**
     * 应收
     */
    @NotNull
    @Excel(name = "应收", orderNum = "190")
    private BigDecimal amountAll;

    /**
     * 实收
     */
    @NotNull
    @Excel(name = "实收", orderNum = "200")
    private BigDecimal amountReal;

    /**
     * 会员卡消费金额
     */
    @Excel(name = "会员卡消费金额", orderNum = "210")
    private BigDecimal vipExpense;

    /**
     * 组织
     */
    @Excel(name = "组织", orderNum = "220")
    private BigInteger idOwnOrg;

    /**
     * 是否附表
     */
    @Excel(name = "是否附表", orderNum = "230")
    private Byte isAttached;

    /**
     * 零售单业务员,即员工ID
     */
    @Excel(name = "零售单业务员,即员工ID", orderNum = "240")
    private BigInteger idEmployee;

    /**
     * 交车时间
     */
    @NotNull
    @Excel(name = "交车时间", orderNum = "250")
    private Date deliveryTime;

    /**
     * 保险公司ID
     */
    @Excel(name = "保险公司ID", orderNum = "260")
    private BigInteger idInsurer;

    /**
     * 保存理赔单的保险单号
     */
    @Size(min = 0, max = 30, message = "长度必须在{min}和{max}之间")
    @Excel(name = "保存理赔单的保险单号", orderNum = "270")
    private String insurancepolicyNo;

    /**
     * 保险类型,现阶段用于区分是否为本车自己的保险，后期可以用于定义三责险，车损险，交强险等
     */
    @Size(min = 0, max = 4, message = "长度必须在{min}和{max}之间")
    @Excel(name = "保险类型,现阶段用于区分是否为本车自己的保险，后期可以用于定义三责险，车损险，交强险等", orderNum = "280")
    private String insurancepolicyType;

    /**
     * 预约单id
     */
    @Size(min = 0, max = 30, message = "长度必须在{min}和{max}之间")
    @Excel(name = "预约单id", orderNum = "290")
    private String orderId;

    /**
     * 预约单单号
     */
    @Size(min = 0, max = 20, message = "长度必须在{min}和{max}之间")
    @Excel(name = "预约单单号", orderNum = "300")
    private String reservationNumber;

    /**
     * 完工日期
     */
    @NotNull
    @Excel(name = "完工日期", orderNum = "310")
    private Date complateDate;

    /**
     * 完工人员
     */
    @Excel(name = "完工人员", orderNum = "320")
    private BigInteger completeUser;

    /**
     * 备注
     */
    @Size(min = 0, max = 500, message = "长度必须在{min}和{max}之间")
    @Excel(name = "备注", orderNum = "330")
    private String memo;

    /**
     * 代办费
     */
    @Excel(name = "代办费", orderNum = "340")
    private BigDecimal commissionCost;

    /**
     * 代办费实收
     */
    @Excel(name = "代办费实收", orderNum = "350")
    private BigDecimal commissionCostReal;

    /**
     * 实收中的冲销部分
     */
    @Excel(name = "实收中的冲销部分", orderNum = "360")
    private BigDecimal commissionCostRealCx;

    /**
     * 代办费实收（仅包含结算时优惠）
     */
    @Excel(name = "代办费实收（仅包含结算时优惠）", orderNum = "370")
    private BigDecimal commissionCostRealSettlement;

    /**
     * 诊断费
     */
    @Excel(name = "诊断费", orderNum = "380")
    private BigDecimal diagnosisCost;

    /**
     * 诊断费实收
     */
    @Excel(name = "诊断费实收", orderNum = "390")
    private BigDecimal diagnosisCostReal;

    /**
     * 实收中的冲销部分
     */
    @Excel(name = "实收中的冲销部分", orderNum = "400")
    private BigDecimal diagnosisCostRealCx;

    /**
     * 诊断费实收（仅包含结算时优惠）
     */
    @Excel(name = "诊断费实收（仅包含结算时优惠）", orderNum = "410")
    private BigDecimal diagnosisCostRealSettlement;

    /**
     * 检测费
     */
    @Excel(name = "检测费", orderNum = "420")
    private BigDecimal checkCost;

    /**
     * 检测费实收
     */
    @Excel(name = "检测费实收", orderNum = "430")
    private BigDecimal checkCostReal;

    /**
     * 实收中的冲销部分
     */
    @Excel(name = "实收中的冲销部分", orderNum = "440")
    private BigDecimal checkCostRealCx;

    /**
     * 检测费实收（仅包含结算时优惠）
     */
    @Excel(name = "检测费实收（仅包含结算时优惠）", orderNum = "450")
    private BigDecimal checkCostRealSettlement;

    /**
     * 加工费
     */
    @Excel(name = "加工费", orderNum = "460")
    private BigDecimal processCost;

    /**
     * 加工费实收
     */
    @Excel(name = "加工费实收", orderNum = "470")
    private BigDecimal processCostReal;

    /**
     * 实收中的冲销部分
     */
    @Excel(name = "实收中的冲销部分", orderNum = "480")
    private BigDecimal processCostRealCx;

    /**
     * 加工费实收（仅包含结算时优惠）
     */
    @Excel(name = "加工费实收（仅包含结算时优惠）", orderNum = "490")
    private BigDecimal processCostRealSettlement;

    /**
     * 管理费
     */
    @Excel(name = "管理费", orderNum = "500")
    private BigDecimal managementCost;

    /**
     * 管理费实收
     */
    @Excel(name = "管理费实收", orderNum = "510")
    private BigDecimal managementCostReal;

    /**
     * 实收中的冲销部分
     */
    @Excel(name = "实收中的冲销部分", orderNum = "520")
    private BigDecimal managementCostRealCx;

    /**
     * 管理费实收（仅包含结算时优惠）
     */
    @Excel(name = "管理费实收（仅包含结算时优惠）", orderNum = "530")
    private BigDecimal managementCostRealSettlement;

    /**
     * 送修人
     */
    @Size(min = 0, max = 20, message = "长度必须在{min}和{max}之间")
    @Excel(name = "送修人", orderNum = "540")
    private String repairPerson;

    /**
     * 送修人联系方式
     */
    @Size(min = 0, max = 20, message = "长度必须在{min}和{max}之间")
    @Excel(name = "送修人联系方式", orderNum = "550")
    private String repairPersonContact;

    /**
     * 送修人性别
     */
    @Size(min = 0, max = 5, message = "长度必须在{min}和{max}之间")
    @Excel(name = "送修人性别", orderNum = "560")
    private String contactSex;

    /**
     * 送修人证件号
     */
    @Size(min = 0, max = 20, message = "长度必须在{min}和{max}之间")
    @Excel(name = "送修人证件号", orderNum = "570")
    private String contactCredentialsNumber;

    /**
     * 送修人证件类型
     */
    @Size(min = 0, max = 20, message = "长度必须在{min}和{max}之间")
    @Excel(name = "送修人证件类型", orderNum = "580")
    private String contactCredentialsType;

    /**
     * 送修人详细地址
     */
    @Size(min = 0, max = 500, message = "长度必须在{min}和{max}之间")
    @Excel(name = "送修人详细地址", orderNum = "590")
    private String contactDetailAddress;

    /**
     * 下次保养日期
     */
    @Size(min = 0, max = 20, message = "长度必须在{min}和{max}之间")
    @Excel(name = "下次保养日期", orderNum = "600")
    private String nextMaintainDate;

    /**
     * 下次保养里程
     */
    @Excel(name = "下次保养里程", orderNum = "610")
    private BigDecimal nextMileage;

    /**
     * 当前油量
     */
    @Excel(name = "当前油量", orderNum = "620")
    private Integer oilCapacity;

    /**
     * version
     */
    @NotNull
    @Excel(name = "version", orderNum = "630")
    private BigInteger version;

    /**
     * 删除flag，{0:未删除，1:已删除}
     */
    @NotNull
    @Excel(name = "删除flag，{0:未删除，1:已删除}", orderNum = "640")
    private Integer isDel;

    /**
     * 迁移flag 0:非迁移数据 1:迁移数据
     */
    @NotNull
    @Excel(name = "迁移flag 0:非迁移数据 1:迁移数据", orderNum = "650")
    private Integer isMigration;

    /**
     * 工单的来源工单ID，适用于创建返厂单的情况
     */
    @Excel(name = "工单的来源工单ID，适用于创建返厂单的情况", orderNum = "660")
    private BigInteger fromMaintainId;

    /**
     * 通过单据生成单据时的类型（例，创建返厂单时为FCD）
     */
    @Size(min = 0, max = 10, message = "长度必须在{min}和{max}之间")
    @Excel(name = "通过单据生成单据时的类型（例，创建返厂单时为FCD）", orderNum = "670")
    private String fromMaintainType;

    /**
     * 与工单关联的车辆预检单ID
     */
    @Excel(name = "与工单关联的车辆预检单ID", orderNum = "680")
    private BigInteger carpreviewMaintainId;

    /**
     * 工单质检状态，未质检（9000），合格（9100），不合格（9200），返工合格（9300）
     */
    @NotNull
    @Size(min = 0, max = 4, message = "长度必须在{min}和{max}之间")
    @Excel(name = "工单质检状态，未质检（9000），合格（9100），不合格（9200），返工合格（9300）", orderNum = "690")
    private String qualityCheckStatus;

    /**
     * 综合会员卡/计次卡/套餐卡的优惠金额
     */
    @NotNull
    @Excel(name = "综合会员卡/计次卡/套餐卡的优惠金额", orderNum = "700")
    private BigDecimal vipExpenseFavourable;

    /**
     * 套餐优惠总金额
     */
    @Excel(name = "套餐优惠总金额", orderNum = "710")
    private BigDecimal packageFavourable;

    /**
     * 项目折扣优惠
     */
    @NotNull
    @Excel(name = "项目折扣优惠", orderNum = "720")
    private BigDecimal serviceDiscountFavourable;

    /**
     * 材料折扣优惠
     */
    @NotNull
    @Excel(name = "材料折扣优惠", orderNum = "730")
    private BigDecimal partinfoDiscountFavourable;

    /**
     * 储值卡消费金额
     */
    @Excel(name = "储值卡消费金额", orderNum = "740")
    private BigDecimal czkExpense;

    /**
     * 储值卡消费优惠金额
     */
    @Excel(name = "储值卡消费优惠金额", orderNum = "750")
    private BigDecimal czkExpenseFavourable;

    /**
     * 服务项目客户等级优惠金额
     */
    @Excel(name = "服务项目客户等级优惠金额", orderNum = "760")
    private BigDecimal serviceFavourable;

    /**
     * 服务项目客户等级优惠金额
     */
    @Excel(name = "服务项目客户等级优惠金额", orderNum = "770")
    private BigDecimal serviceFavourableBackup;

    /**
     * 材料项目客户等级优惠金额
     */
    @Excel(name = "材料项目客户等级优惠金额", orderNum = "780")
    private BigDecimal partinfoFavourable;

    /**
     * 材料项目客户等级优惠金额
     */
    @Excel(name = "材料项目客户等级优惠金额", orderNum = "790")
    private BigDecimal partinfoFavourableBackup;

    /**
     * 积分优惠金额
     */
    @Excel(name = "积分优惠金额", orderNum = "800")
    private BigDecimal pointFavourable;

    /**
     * 使用积分
     */
    @Excel(name = "使用积分", orderNum = "810")
    private BigDecimal usePoint;

    /**
     * 结清优惠
     */
    @Excel(name = "结清优惠", orderNum = "820")
    private BigDecimal discountFavourable;

    /**
     * 来源单号
     */
    @Size(min = 0, max = 20, message = "长度必须在{min}和{max}之间")
    @Excel(name = "来源单号", orderNum = "830")
    private String sourceBillNo;

    /**
     * 来源id
     */
    @Excel(name = "来源id", orderNum = "840")
    private BigInteger idSourceBill;

    /**
     * 收银优惠
     */
    @NotNull
    @Excel(name = "收银优惠", orderNum = "850")
    private BigDecimal gatheringFavourable;

    /**
     * 车辆分类
     */
    @Excel(name = "车辆分类", orderNum = "860")
    private BigInteger carCategoryId;

    /**
     * idChannel
     */
    @Excel(name = "idChannel", orderNum = "870")
    private BigInteger idChannel;

    /**
     * insuranceContacts
     */
    @Size(min = 0, max = 100, message = "长度必须在{min}和{max}之间")
    @Excel(name = "insuranceContacts", orderNum = "880")
    private String insuranceContacts;

    /**
     * insuranceContactTelephone
     */
    @Size(min = 0, max = 20, message = "长度必须在{min}和{max}之间")
    @Excel(name = "insuranceContactTelephone", orderNum = "890")
    private String insuranceContactTelephone;

    public BigInteger getPkId() {
        return pkId;
    }

    public void setPkId(BigInteger pkId) {
        this.pkId = pkId;
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public BigInteger getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(BigInteger idCustomer) {
        this.idCustomer = idCustomer;
    }

    public BigInteger getIdCar() {
        return idCar;
    }

    public void setIdCar(BigInteger idCar) {
        this.idCar = idCar;
    }

    public BigInteger getIdMember() {
        return idMember;
    }

    public void setIdMember(BigInteger idMember) {
        this.idMember = idMember;
    }

    public BigDecimal getMileage() {
        return mileage;
    }

    public void setMileage(BigDecimal mileage) {
        this.mileage = mileage;
    }

    public String getMaintainType() {
        return maintainType;
    }

    public void setMaintainType(String maintainType) {
        this.maintainType = maintainType;
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    public BigInteger getMaintainTypeId() {
        return maintainTypeId;
    }

    public void setMaintainTypeId(BigInteger maintainTypeId) {
        this.maintainTypeId = maintainTypeId;
    }

    public String getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(String billStatus) {
        this.billStatus = billStatus;
    }

    public String getBalanceStatus() {
        return balanceStatus;
    }

    public void setBalanceStatus(String balanceStatus) {
        this.balanceStatus = balanceStatus;
    }

    public String getStockStatus() {
        return stockStatus;
    }

    public void setStockStatus(String stockStatus) {
        this.stockStatus = stockStatus;
    }

    public BigDecimal getOweAmount() {
        return oweAmount;
    }

    public void setOweAmount(BigDecimal oweAmount) {
        this.oweAmount = oweAmount;
    }

    public BigDecimal getReceiveAmount() {
        return receiveAmount;
    }

    public void setReceiveAmount(BigDecimal receiveAmount) {
        this.receiveAmount = receiveAmount;
    }

    public BigDecimal getPartinfoSubtotal() {
        return partinfoSubtotal;
    }

    public void setPartinfoSubtotal(BigDecimal partinfoSubtotal) {
        this.partinfoSubtotal = partinfoSubtotal;
    }

    public BigDecimal getServiceSubtotal() {
        return serviceSubtotal;
    }

    public void setServiceSubtotal(BigDecimal serviceSubtotal) {
        this.serviceSubtotal = serviceSubtotal;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAmountAll() {
        return amountAll;
    }

    public void setAmountAll(BigDecimal amountAll) {
        this.amountAll = amountAll;
    }

    public BigDecimal getAmountReal() {
        return amountReal;
    }

    public void setAmountReal(BigDecimal amountReal) {
        this.amountReal = amountReal;
    }

    public BigDecimal getVipExpense() {
        return vipExpense;
    }

    public void setVipExpense(BigDecimal vipExpense) {
        this.vipExpense = vipExpense;
    }

    public BigInteger getIdOwnOrg() {
        return idOwnOrg;
    }

    public void setIdOwnOrg(BigInteger idOwnOrg) {
        this.idOwnOrg = idOwnOrg;
    }

    public Byte getIsAttached() {
        return isAttached;
    }

    public void setIsAttached(Byte isAttached) {
        this.isAttached = isAttached;
    }

    public BigInteger getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(BigInteger idEmployee) {
        this.idEmployee = idEmployee;
    }

    public Date getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public BigInteger getIdInsurer() {
        return idInsurer;
    }

    public void setIdInsurer(BigInteger idInsurer) {
        this.idInsurer = idInsurer;
    }

    public String getInsurancepolicyNo() {
        return insurancepolicyNo;
    }

    public void setInsurancepolicyNo(String insurancepolicyNo) {
        this.insurancepolicyNo = insurancepolicyNo;
    }

    public String getInsurancepolicyType() {
        return insurancepolicyType;
    }

    public void setInsurancepolicyType(String insurancepolicyType) {
        this.insurancepolicyType = insurancepolicyType;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getReservationNumber() {
        return reservationNumber;
    }

    public void setReservationNumber(String reservationNumber) {
        this.reservationNumber = reservationNumber;
    }

    public Date getComplateDate() {
        return complateDate;
    }

    public void setComplateDate(Date complateDate) {
        this.complateDate = complateDate;
    }

    public BigInteger getCompleteUser() {
        return completeUser;
    }

    public void setCompleteUser(BigInteger completeUser) {
        this.completeUser = completeUser;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public BigDecimal getCommissionCost() {
        return commissionCost;
    }

    public void setCommissionCost(BigDecimal commissionCost) {
        this.commissionCost = commissionCost;
    }

    public BigDecimal getCommissionCostReal() {
        return commissionCostReal;
    }

    public void setCommissionCostReal(BigDecimal commissionCostReal) {
        this.commissionCostReal = commissionCostReal;
    }

    public BigDecimal getCommissionCostRealCx() {
        return commissionCostRealCx;
    }

    public void setCommissionCostRealCx(BigDecimal commissionCostRealCx) {
        this.commissionCostRealCx = commissionCostRealCx;
    }

    public BigDecimal getCommissionCostRealSettlement() {
        return commissionCostRealSettlement;
    }

    public void setCommissionCostRealSettlement(BigDecimal commissionCostRealSettlement) {
        this.commissionCostRealSettlement = commissionCostRealSettlement;
    }

    public BigDecimal getDiagnosisCost() {
        return diagnosisCost;
    }

    public void setDiagnosisCost(BigDecimal diagnosisCost) {
        this.diagnosisCost = diagnosisCost;
    }

    public BigDecimal getDiagnosisCostReal() {
        return diagnosisCostReal;
    }

    public void setDiagnosisCostReal(BigDecimal diagnosisCostReal) {
        this.diagnosisCostReal = diagnosisCostReal;
    }

    public BigDecimal getDiagnosisCostRealCx() {
        return diagnosisCostRealCx;
    }

    public void setDiagnosisCostRealCx(BigDecimal diagnosisCostRealCx) {
        this.diagnosisCostRealCx = diagnosisCostRealCx;
    }

    public BigDecimal getDiagnosisCostRealSettlement() {
        return diagnosisCostRealSettlement;
    }

    public void setDiagnosisCostRealSettlement(BigDecimal diagnosisCostRealSettlement) {
        this.diagnosisCostRealSettlement = diagnosisCostRealSettlement;
    }

    public BigDecimal getCheckCost() {
        return checkCost;
    }

    public void setCheckCost(BigDecimal checkCost) {
        this.checkCost = checkCost;
    }

    public BigDecimal getCheckCostReal() {
        return checkCostReal;
    }

    public void setCheckCostReal(BigDecimal checkCostReal) {
        this.checkCostReal = checkCostReal;
    }

    public BigDecimal getCheckCostRealCx() {
        return checkCostRealCx;
    }

    public void setCheckCostRealCx(BigDecimal checkCostRealCx) {
        this.checkCostRealCx = checkCostRealCx;
    }

    public BigDecimal getCheckCostRealSettlement() {
        return checkCostRealSettlement;
    }

    public void setCheckCostRealSettlement(BigDecimal checkCostRealSettlement) {
        this.checkCostRealSettlement = checkCostRealSettlement;
    }

    public BigDecimal getProcessCost() {
        return processCost;
    }

    public void setProcessCost(BigDecimal processCost) {
        this.processCost = processCost;
    }

    public BigDecimal getProcessCostReal() {
        return processCostReal;
    }

    public void setProcessCostReal(BigDecimal processCostReal) {
        this.processCostReal = processCostReal;
    }

    public BigDecimal getProcessCostRealCx() {
        return processCostRealCx;
    }

    public void setProcessCostRealCx(BigDecimal processCostRealCx) {
        this.processCostRealCx = processCostRealCx;
    }

    public BigDecimal getProcessCostRealSettlement() {
        return processCostRealSettlement;
    }

    public void setProcessCostRealSettlement(BigDecimal processCostRealSettlement) {
        this.processCostRealSettlement = processCostRealSettlement;
    }

    public BigDecimal getManagementCost() {
        return managementCost;
    }

    public void setManagementCost(BigDecimal managementCost) {
        this.managementCost = managementCost;
    }

    public BigDecimal getManagementCostReal() {
        return managementCostReal;
    }

    public void setManagementCostReal(BigDecimal managementCostReal) {
        this.managementCostReal = managementCostReal;
    }

    public BigDecimal getManagementCostRealCx() {
        return managementCostRealCx;
    }

    public void setManagementCostRealCx(BigDecimal managementCostRealCx) {
        this.managementCostRealCx = managementCostRealCx;
    }

    public BigDecimal getManagementCostRealSettlement() {
        return managementCostRealSettlement;
    }

    public void setManagementCostRealSettlement(BigDecimal managementCostRealSettlement) {
        this.managementCostRealSettlement = managementCostRealSettlement;
    }

    public String getRepairPerson() {
        return repairPerson;
    }

    public void setRepairPerson(String repairPerson) {
        this.repairPerson = repairPerson;
    }

    public String getRepairPersonContact() {
        return repairPersonContact;
    }

    public void setRepairPersonContact(String repairPersonContact) {
        this.repairPersonContact = repairPersonContact;
    }

    public String getContactSex() {
        return contactSex;
    }

    public void setContactSex(String contactSex) {
        this.contactSex = contactSex;
    }

    public String getContactCredentialsNumber() {
        return contactCredentialsNumber;
    }

    public void setContactCredentialsNumber(String contactCredentialsNumber) {
        this.contactCredentialsNumber = contactCredentialsNumber;
    }

    public String getContactCredentialsType() {
        return contactCredentialsType;
    }

    public void setContactCredentialsType(String contactCredentialsType) {
        this.contactCredentialsType = contactCredentialsType;
    }

    public String getContactDetailAddress() {
        return contactDetailAddress;
    }

    public void setContactDetailAddress(String contactDetailAddress) {
        this.contactDetailAddress = contactDetailAddress;
    }

    public String getNextMaintainDate() {
        return nextMaintainDate;
    }

    public void setNextMaintainDate(String nextMaintainDate) {
        this.nextMaintainDate = nextMaintainDate;
    }

    public BigDecimal getNextMileage() {
        return nextMileage;
    }

    public void setNextMileage(BigDecimal nextMileage) {
        this.nextMileage = nextMileage;
    }

    public Integer getOilCapacity() {
        return oilCapacity;
    }

    public void setOilCapacity(Integer oilCapacity) {
        this.oilCapacity = oilCapacity;
    }

    public BigInteger getVersion() {
        return version;
    }

    public void setVersion(BigInteger version) {
        this.version = version;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Integer getIsMigration() {
        return isMigration;
    }

    public void setIsMigration(Integer isMigration) {
        this.isMigration = isMigration;
    }

    public BigInteger getFromMaintainId() {
        return fromMaintainId;
    }

    public void setFromMaintainId(BigInteger fromMaintainId) {
        this.fromMaintainId = fromMaintainId;
    }

    public String getFromMaintainType() {
        return fromMaintainType;
    }

    public void setFromMaintainType(String fromMaintainType) {
        this.fromMaintainType = fromMaintainType;
    }

    public BigInteger getCarpreviewMaintainId() {
        return carpreviewMaintainId;
    }

    public void setCarpreviewMaintainId(BigInteger carpreviewMaintainId) {
        this.carpreviewMaintainId = carpreviewMaintainId;
    }

    public String getQualityCheckStatus() {
        return qualityCheckStatus;
    }

    public void setQualityCheckStatus(String qualityCheckStatus) {
        this.qualityCheckStatus = qualityCheckStatus;
    }

    public BigDecimal getVipExpenseFavourable() {
        return vipExpenseFavourable;
    }

    public void setVipExpenseFavourable(BigDecimal vipExpenseFavourable) {
        this.vipExpenseFavourable = vipExpenseFavourable;
    }

    public BigDecimal getPackageFavourable() {
        return packageFavourable;
    }

    public void setPackageFavourable(BigDecimal packageFavourable) {
        this.packageFavourable = packageFavourable;
    }

    public BigDecimal getServiceDiscountFavourable() {
        return serviceDiscountFavourable;
    }

    public void setServiceDiscountFavourable(BigDecimal serviceDiscountFavourable) {
        this.serviceDiscountFavourable = serviceDiscountFavourable;
    }

    public BigDecimal getPartinfoDiscountFavourable() {
        return partinfoDiscountFavourable;
    }

    public void setPartinfoDiscountFavourable(BigDecimal partinfoDiscountFavourable) {
        this.partinfoDiscountFavourable = partinfoDiscountFavourable;
    }

    public BigDecimal getCzkExpense() {
        return czkExpense;
    }

    public void setCzkExpense(BigDecimal czkExpense) {
        this.czkExpense = czkExpense;
    }

    public BigDecimal getCzkExpenseFavourable() {
        return czkExpenseFavourable;
    }

    public void setCzkExpenseFavourable(BigDecimal czkExpenseFavourable) {
        this.czkExpenseFavourable = czkExpenseFavourable;
    }

    public BigDecimal getServiceFavourable() {
        return serviceFavourable;
    }

    public void setServiceFavourable(BigDecimal serviceFavourable) {
        this.serviceFavourable = serviceFavourable;
    }

    public BigDecimal getServiceFavourableBackup() {
        return serviceFavourableBackup;
    }

    public void setServiceFavourableBackup(BigDecimal serviceFavourableBackup) {
        this.serviceFavourableBackup = serviceFavourableBackup;
    }

    public BigDecimal getPartinfoFavourable() {
        return partinfoFavourable;
    }

    public void setPartinfoFavourable(BigDecimal partinfoFavourable) {
        this.partinfoFavourable = partinfoFavourable;
    }

    public BigDecimal getPartinfoFavourableBackup() {
        return partinfoFavourableBackup;
    }

    public void setPartinfoFavourableBackup(BigDecimal partinfoFavourableBackup) {
        this.partinfoFavourableBackup = partinfoFavourableBackup;
    }

    public BigDecimal getPointFavourable() {
        return pointFavourable;
    }

    public void setPointFavourable(BigDecimal pointFavourable) {
        this.pointFavourable = pointFavourable;
    }

    public BigDecimal getUsePoint() {
        return usePoint;
    }

    public void setUsePoint(BigDecimal usePoint) {
        this.usePoint = usePoint;
    }

    public BigDecimal getDiscountFavourable() {
        return discountFavourable;
    }

    public void setDiscountFavourable(BigDecimal discountFavourable) {
        this.discountFavourable = discountFavourable;
    }

    public String getSourceBillNo() {
        return sourceBillNo;
    }

    public void setSourceBillNo(String sourceBillNo) {
        this.sourceBillNo = sourceBillNo;
    }

    public BigInteger getIdSourceBill() {
        return idSourceBill;
    }

    public void setIdSourceBill(BigInteger idSourceBill) {
        this.idSourceBill = idSourceBill;
    }

    public BigDecimal getGatheringFavourable() {
        return gatheringFavourable;
    }

    public void setGatheringFavourable(BigDecimal gatheringFavourable) {
        this.gatheringFavourable = gatheringFavourable;
    }

    public BigInteger getCarCategoryId() {
        return carCategoryId;
    }

    public void setCarCategoryId(BigInteger carCategoryId) {
        this.carCategoryId = carCategoryId;
    }

    public BigInteger getIdChannel() {
        return idChannel;
    }

    public void setIdChannel(BigInteger idChannel) {
        this.idChannel = idChannel;
    }

    public String getInsuranceContacts() {
        return insuranceContacts;
    }

    public void setInsuranceContacts(String insuranceContacts) {
        this.insuranceContacts = insuranceContacts;
    }

    public String getInsuranceContactTelephone() {
        return insuranceContactTelephone;
    }

    public void setInsuranceContactTelephone(String insuranceContactTelephone) {
        this.insuranceContactTelephone = insuranceContactTelephone;
    }


}
