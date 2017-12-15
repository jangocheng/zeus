/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.po.maintain;

import com.f6car.base.common.Po;
import se.spagettikod.optimist.Identity;
import se.spagettikod.optimist.OptimisticLocking;
import se.spagettikod.optimist.Version;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

@OptimisticLocking("ts_maintain")
@Table(name = "ts_maintain")
public class TsMaintain extends Po {
    /**
     * 主键
     */
    @Id
    @Column(name = "pk_id")
    @NotNull
    @Identity("pk_id")
    private BigInteger pkId;

    /**
     * 单号
     */
    @Column(name = "bill_no")
    @Size(min = 0, max = 20, message = "长度必须在{min}和{max}之间")
    private String billNo;

    /**
     * 单据日期
     */
    @Column(name = "bill_date")
    @NotNull
    private Date billDate;

    /**
     * 客户ID
     */
    @Column(name = "id_customer")
    private BigInteger idCustomer;

    /**
     * 车辆ID
     */
    @Column(name = "id_car")
    private BigInteger idCar;

    /**
     * 会员ID
     */
    @Column(name = "id_member")
    private BigInteger idMember;

    /**
     * 行驶里程
     */
    private BigDecimal mileage;

    /**
     * 维修类别(工单,零售)
     */
    @Column(name = "maintain_type")
    @Size(min = 0, max = 10, message = "长度必须在{min}和{max}之间")
    private String maintainType;

    /**
     * 业务类型
     */
    @Column(name = "bill_type")
    @Size(min = 0, max = 4, message = "长度必须在{min}和{max}之间")
    private String billType;

    /**
     * 业务分类id
     */
    @Column(name = "maintain_type_id")
    private BigInteger maintainTypeId;

    /**
     * 单据状态
     */
    @Column(name = "bill_status")
    @Size(min = 0, max = 4, message = "长度必须在{min}和{max}之间")
    private String billStatus;

    /**
     * 结算状态
     */
    @Column(name = "balance_status")
    @Size(min = 0, max = 4, message = "长度必须在{min}和{max}之间")
    private String balanceStatus;

    /**
     * 材料领取状态
     */
    @Column(name = "stock_status")
    @Size(min = 0, max = 4, message = "长度必须在{min}和{max}之间")
    private String stockStatus;

    /**
     * 未收金额
     */
    @Column(name = "owe_amount")
    private BigDecimal oweAmount;

    /**
     * 已收金额
     */
    @Column(name = "receive_amount")
    private BigDecimal receiveAmount;

    /**
     * 材料明细小计
     */
    @Column(name = "partinfo_subtotal")
    private BigDecimal partinfoSubtotal;

    /**
     * 项目明细小计
     */
    @Column(name = "service_subtotal")
    private BigDecimal serviceSubtotal;

    /**
     * 总金额
     */
    private BigDecimal amount;

    /**
     * 应收
     */
    @Column(name = "amount_all")
    @NotNull
    private BigDecimal amountAll;

    /**
     * 实收
     */
    @Column(name = "amount_real")
    @NotNull
    private BigDecimal amountReal;

    /**
     * 会员卡消费金额
     */
    @Column(name = "vip_expense")
    private BigDecimal vipExpense;

    /**
     * 创建日期
     */
    @NotNull
    private Date creationtime;

    /**
     * 修改日期
     */
    private Date modifiedtime;

    /**
     * 创建人
     */
    private BigInteger creator;

    /**
     * 修改人
     */
    private BigInteger modifier;

    /**
     * 组织
     */
    @Column(name = "id_own_org")
    private BigInteger idOwnOrg;

    /**
     * 是否附表
     */
    @Column(name = "is_attached")
    private Byte isAttached;

    /**
     * 零售单业务员,即员工ID
     */
    @Column(name = "id_employee")
    private BigInteger idEmployee;

    /**
     * 交车时间
     */
    @Column(name = "delivery_time")
    @NotNull
    private Date deliveryTime;

    /**
     * 保险公司ID
     */
    @Column(name = "id_insurer")
    private BigInteger idInsurer;

    /**
     * 保存理赔单的保险单号
     */
    @Column(name = "insurancepolicy_no")
    @Size(min = 0, max = 30, message = "长度必须在{min}和{max}之间")
    private String insurancepolicyNo;

    /**
     * 保险类型,现阶段用于区分是否为本车自己的保险，后期可以用于定义三责险，车损险，交强险等
     */
    @Column(name = "insurancepolicy_type")
    @Size(min = 0, max = 4, message = "长度必须在{min}和{max}之间")
    private String insurancepolicyType;

    /**
     * 预约单id
     */
    @Column(name = "order_id")
    @Size(min = 0, max = 30, message = "长度必须在{min}和{max}之间")
    private String orderId;

    /**
     * 预约单单号
     */
    @Column(name = "reservation_number")
    @Size(min = 0, max = 20, message = "长度必须在{min}和{max}之间")
    private String reservationNumber;

    /**
     * 完工日期
     */
    @Column(name = "complate_date")
    @NotNull
    private Date complateDate;

    /**
     * 完工人员
     */
    @Column(name = "complete_user")
    private BigInteger completeUser;

    /**
     * 备注
     */
    @Size(min = 0, max = 500, message = "长度必须在{min}和{max}之间")
    private String memo;

    /**
     * 代办费
     */
    @Column(name = "commission_cost")
    private BigDecimal commissionCost;

    /**
     * 代办费实收
     */
    @Column(name = "commission_cost_real")
    private BigDecimal commissionCostReal;

    /**
     * 实收中的冲销部分
     */
    @Column(name = "commission_cost_real_cx")
    private BigDecimal commissionCostRealCx;

    /**
     * 代办费实收（仅包含结算时优惠）
     */
    @Column(name = "commission_cost_real_settlement")
    private BigDecimal commissionCostRealSettlement;

    /**
     * 诊断费
     */
    @Column(name = "diagnosis_cost")
    private BigDecimal diagnosisCost;

    /**
     * 诊断费实收
     */
    @Column(name = "diagnosis_cost_real")
    private BigDecimal diagnosisCostReal;

    /**
     * 实收中的冲销部分
     */
    @Column(name = "diagnosis_cost_real_cx")
    private BigDecimal diagnosisCostRealCx;

    /**
     * 诊断费实收（仅包含结算时优惠）
     */
    @Column(name = "diagnosis_cost_real_settlement")
    private BigDecimal diagnosisCostRealSettlement;

    /**
     * 检测费
     */
    @Column(name = "check_cost")
    private BigDecimal checkCost;

    /**
     * 检测费实收
     */
    @Column(name = "check_cost_real")
    private BigDecimal checkCostReal;

    /**
     * 实收中的冲销部分
     */
    @Column(name = "check_cost_real_cx")
    private BigDecimal checkCostRealCx;

    /**
     * 检测费实收（仅包含结算时优惠）
     */
    @Column(name = "check_cost_real_settlement")
    private BigDecimal checkCostRealSettlement;

    /**
     * 加工费
     */
    @Column(name = "process_cost")
    private BigDecimal processCost;

    /**
     * 加工费实收
     */
    @Column(name = "process_cost_real")
    private BigDecimal processCostReal;

    /**
     * 实收中的冲销部分
     */
    @Column(name = "process_cost_real_cx")
    private BigDecimal processCostRealCx;

    /**
     * 加工费实收（仅包含结算时优惠）
     */
    @Column(name = "process_cost_real_settlement")
    private BigDecimal processCostRealSettlement;

    /**
     * 管理费
     */
    @Column(name = "management_cost")
    private BigDecimal managementCost;

    /**
     * 管理费实收
     */
    @Column(name = "management_cost_real")
    private BigDecimal managementCostReal;

    /**
     * 实收中的冲销部分
     */
    @Column(name = "management_cost_real_cx")
    private BigDecimal managementCostRealCx;

    /**
     * 管理费实收（仅包含结算时优惠）
     */
    @Column(name = "management_cost_real_settlement")
    private BigDecimal managementCostRealSettlement;

    /**
     * 送修人
     */
    @Column(name = "repair_person")
    @Size(min = 0, max = 20, message = "长度必须在{min}和{max}之间")
    private String repairPerson;

    /**
     * 送修人联系方式
     */
    @Column(name = "repair_person_contact")
    @Size(min = 0, max = 20, message = "长度必须在{min}和{max}之间")
    private String repairPersonContact;

    /**
     * 送修人性别
     */
    @Column(name = "contact_sex")
    @Size(min = 0, max = 5, message = "长度必须在{min}和{max}之间")
    private String contactSex;

    /**
     * 送修人证件号
     */
    @Column(name = "contact_credentials_number")
    @Size(min = 0, max = 20, message = "长度必须在{min}和{max}之间")
    private String contactCredentialsNumber;

    /**
     * 送修人证件类型
     */
    @Column(name = "contact_credentials_type")
    @Size(min = 0, max = 20, message = "长度必须在{min}和{max}之间")
    private String contactCredentialsType;

    /**
     * 送修人详细地址
     */
    @Column(name = "contact_detail_address")
    @Size(min = 0, max = 500, message = "长度必须在{min}和{max}之间")
    private String contactDetailAddress;

    /**
     * 下次保养日期
     */
    @Column(name = "next_maintain_date")
    @Size(min = 0, max = 20, message = "长度必须在{min}和{max}之间")
    private String nextMaintainDate;

    /**
     * 下次保养里程
     */
    @Column(name = "next_mileage")
    private BigDecimal nextMileage;

    /**
     * 当前油量
     */
    @Column(name = "oil_capacity")
    private Integer oilCapacity;

    @NotNull
    @Version("version")
    private BigInteger version;

    /**
     * 删除flag，{0:未删除，1:已删除}
     */
    @Column(name = "is_del")
    @NotNull
    private Integer isDel;

    /**
     * 迁移flag 0:非迁移数据 1:迁移数据
     */
    @Column(name = "is_migration")
    @NotNull
    private Integer isMigration;

    /**
     * 工单的来源工单ID，适用于创建返厂单的情况
     */
    @Column(name = "from_maintain_id")
    private BigInteger fromMaintainId;

    /**
     * 通过单据生成单据时的类型（例，创建返厂单时为FCD）
     */
    @Column(name = "from_maintain_type")
    @Size(min = 0, max = 10, message = "长度必须在{min}和{max}之间")
    private String fromMaintainType;

    /**
     * 与工单关联的车辆预检单ID
     */
    @Column(name = "carpreview_maintain_id")
    private BigInteger carpreviewMaintainId;

    /**
     * 工单质检状态，未质检（9000），合格（9100），不合格（9200），返工合格（9300）
     */
    @Column(name = "quality_check_status")
    @NotNull
    @Size(min = 0, max = 4, message = "长度必须在{min}和{max}之间")
    private String qualityCheckStatus;

    /**
     * 综合会员卡/计次卡/套餐卡的优惠金额
     */
    @Column(name = "vip_expense_favourable")
    @NotNull
    private BigDecimal vipExpenseFavourable;

    /**
     * 套餐优惠总金额
     */
    @Column(name = "package_favourable")
    private BigDecimal packageFavourable;

    /**
     * 项目折扣优惠
     */
    @Column(name = "service_discount_favourable")
    @NotNull
    private BigDecimal serviceDiscountFavourable;

    /**
     * 材料折扣优惠
     */
    @Column(name = "partinfo_discount_favourable")
    @NotNull
    private BigDecimal partinfoDiscountFavourable;

    /**
     * 储值卡消费金额
     */
    @Column(name = "czk_expense")
    private BigDecimal czkExpense;

    /**
     * 储值卡消费优惠金额
     */
    @Column(name = "czk_expense_favourable")
    private BigDecimal czkExpenseFavourable;

    /**
     * 服务项目客户等级优惠金额
     */
    @Column(name = "service_favourable")
    private BigDecimal serviceFavourable;

    /**
     * 服务项目客户等级优惠金额
     */
    @Column(name = "service_favourable_backup")
    private BigDecimal serviceFavourableBackup;

    /**
     * 材料项目客户等级优惠金额
     */
    @Column(name = "partinfo_favourable")
    private BigDecimal partinfoFavourable;

    /**
     * 材料项目客户等级优惠金额
     */
    @Column(name = "partinfo_favourable_backup")
    private BigDecimal partinfoFavourableBackup;

    /**
     * 积分优惠金额
     */
    @Column(name = "point_favourable")
    private BigDecimal pointFavourable;

    /**
     * 使用积分
     */
    @Column(name = "use_point")
    private BigDecimal usePoint;

    /**
     * 结清优惠
     */
    @Column(name = "discount_favourable")
    private BigDecimal discountFavourable;

    /**
     * 来源单号
     */
    @Column(name = "source_bill_no")
    @Size(min = 0, max = 20, message = "长度必须在{min}和{max}之间")
    private String sourceBillNo;

    /**
     * 来源id
     */
    @Column(name = "id_source_bill")
    private BigInteger idSourceBill;

    /**
     * 收银优惠
     */
    @Column(name = "gathering_favourable")
    @NotNull
    private BigDecimal gatheringFavourable;

    /**
     * 车辆分类
     */
    @Column(name = "car_category_id")
    private BigInteger carCategoryId;

    @Column(name = "id_channel")
    private BigInteger idChannel;

    @Column(name = "insurance_contacts")
    @Size(min = 0, max = 100, message = "长度必须在{min}和{max}之间")
    private String insuranceContacts;

    @Column(name = "insurance_contact_telephone")
    @Size(min = 0, max = 20, message = "长度必须在{min}和{max}之间")
    private String insuranceContactTelephone;

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
     * 获取单据日期
     *
     * @return bill_date - 单据日期
     */
    public Date getBillDate() {
        return billDate;
    }

    /**
     * 设置单据日期
     *
     * @param billDate 单据日期
     */
    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    /**
     * 获取客户ID
     *
     * @return id_customer - 客户ID
     */
    public BigInteger getIdCustomer() {
        return idCustomer;
    }

    /**
     * 设置客户ID
     *
     * @param idCustomer 客户ID
     */
    public void setIdCustomer(BigInteger idCustomer) {
        this.idCustomer = idCustomer;
    }

    /**
     * 获取车辆ID
     *
     * @return id_car - 车辆ID
     */
    public BigInteger getIdCar() {
        return idCar;
    }

    /**
     * 设置车辆ID
     *
     * @param idCar 车辆ID
     */
    public void setIdCar(BigInteger idCar) {
        this.idCar = idCar;
    }

    /**
     * 获取会员ID
     *
     * @return id_member - 会员ID
     */
    public BigInteger getIdMember() {
        return idMember;
    }

    /**
     * 设置会员ID
     *
     * @param idMember 会员ID
     */
    public void setIdMember(BigInteger idMember) {
        this.idMember = idMember;
    }

    /**
     * 获取行驶里程
     *
     * @return mileage - 行驶里程
     */
    public BigDecimal getMileage() {
        return mileage;
    }

    /**
     * 设置行驶里程
     *
     * @param mileage 行驶里程
     */
    public void setMileage(BigDecimal mileage) {
        this.mileage = mileage;
    }

    /**
     * 获取维修类别(工单,零售)
     *
     * @return maintain_type - 维修类别(工单,零售)
     */
    public String getMaintainType() {
        return maintainType;
    }

    /**
     * 设置维修类别(工单,零售)
     *
     * @param maintainType 维修类别(工单,零售)
     */
    public void setMaintainType(String maintainType) {
        this.maintainType = maintainType;
    }

    /**
     * 获取业务类型
     *
     * @return bill_type - 业务类型
     */
    public String getBillType() {
        return billType;
    }

    /**
     * 设置业务类型
     *
     * @param billType 业务类型
     */
    public void setBillType(String billType) {
        this.billType = billType;
    }

    /**
     * 获取业务分类id
     *
     * @return maintain_type_id - 业务分类id
     */
    public BigInteger getMaintainTypeId() {
        return maintainTypeId;
    }

    /**
     * 设置业务分类id
     *
     * @param maintainTypeId 业务分类id
     */
    public void setMaintainTypeId(BigInteger maintainTypeId) {
        this.maintainTypeId = maintainTypeId;
    }

    /**
     * 获取单据状态
     *
     * @return bill_status - 单据状态
     */
    public String getBillStatus() {
        return billStatus;
    }

    /**
     * 设置单据状态
     *
     * @param billStatus 单据状态
     */
    public void setBillStatus(String billStatus) {
        this.billStatus = billStatus;
    }

    /**
     * 获取结算状态
     *
     * @return balance_status - 结算状态
     */
    public String getBalanceStatus() {
        return balanceStatus;
    }

    /**
     * 设置结算状态
     *
     * @param balanceStatus 结算状态
     */
    public void setBalanceStatus(String balanceStatus) {
        this.balanceStatus = balanceStatus;
    }

    /**
     * 获取材料领取状态
     *
     * @return stock_status - 材料领取状态
     */
    public String getStockStatus() {
        return stockStatus;
    }

    /**
     * 设置材料领取状态
     *
     * @param stockStatus 材料领取状态
     */
    public void setStockStatus(String stockStatus) {
        this.stockStatus = stockStatus;
    }

    /**
     * 获取未收金额
     *
     * @return owe_amount - 未收金额
     */
    public BigDecimal getOweAmount() {
        return oweAmount;
    }

    /**
     * 设置未收金额
     *
     * @param oweAmount 未收金额
     */
    public void setOweAmount(BigDecimal oweAmount) {
        this.oweAmount = oweAmount;
    }

    /**
     * 获取已收金额
     *
     * @return receive_amount - 已收金额
     */
    public BigDecimal getReceiveAmount() {
        return receiveAmount;
    }

    /**
     * 设置已收金额
     *
     * @param receiveAmount 已收金额
     */
    public void setReceiveAmount(BigDecimal receiveAmount) {
        this.receiveAmount = receiveAmount;
    }

    /**
     * 获取材料明细小计
     *
     * @return partinfo_subtotal - 材料明细小计
     */
    public BigDecimal getPartinfoSubtotal() {
        return partinfoSubtotal;
    }

    /**
     * 设置材料明细小计
     *
     * @param partinfoSubtotal 材料明细小计
     */
    public void setPartinfoSubtotal(BigDecimal partinfoSubtotal) {
        this.partinfoSubtotal = partinfoSubtotal;
    }

    /**
     * 获取项目明细小计
     *
     * @return service_subtotal - 项目明细小计
     */
    public BigDecimal getServiceSubtotal() {
        return serviceSubtotal;
    }

    /**
     * 设置项目明细小计
     *
     * @param serviceSubtotal 项目明细小计
     */
    public void setServiceSubtotal(BigDecimal serviceSubtotal) {
        this.serviceSubtotal = serviceSubtotal;
    }

    /**
     * 获取总金额
     *
     * @return amount - 总金额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置总金额
     *
     * @param amount 总金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 获取应收
     *
     * @return amount_all - 应收
     */
    public BigDecimal getAmountAll() {
        return amountAll;
    }

    /**
     * 设置应收
     *
     * @param amountAll 应收
     */
    public void setAmountAll(BigDecimal amountAll) {
        this.amountAll = amountAll;
    }

    /**
     * 获取实收
     *
     * @return amount_real - 实收
     */
    public BigDecimal getAmountReal() {
        return amountReal;
    }

    /**
     * 设置实收
     *
     * @param amountReal 实收
     */
    public void setAmountReal(BigDecimal amountReal) {
        this.amountReal = amountReal;
    }

    /**
     * 获取会员卡消费金额
     *
     * @return vip_expense - 会员卡消费金额
     */
    public BigDecimal getVipExpense() {
        return vipExpense;
    }

    /**
     * 设置会员卡消费金额
     *
     * @param vipExpense 会员卡消费金额
     */
    public void setVipExpense(BigDecimal vipExpense) {
        this.vipExpense = vipExpense;
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
     * 获取是否附表
     *
     * @return is_attached - 是否附表
     */
    public Byte getIsAttached() {
        return isAttached;
    }

    /**
     * 设置是否附表
     *
     * @param isAttached 是否附表
     */
    public void setIsAttached(Byte isAttached) {
        this.isAttached = isAttached;
    }

    /**
     * 获取零售单业务员,即员工ID
     *
     * @return id_employee - 零售单业务员,即员工ID
     */
    public BigInteger getIdEmployee() {
        return idEmployee;
    }

    /**
     * 设置零售单业务员,即员工ID
     *
     * @param idEmployee 零售单业务员,即员工ID
     */
    public void setIdEmployee(BigInteger idEmployee) {
        this.idEmployee = idEmployee;
    }

    /**
     * 获取交车时间
     *
     * @return delivery_time - 交车时间
     */
    public Date getDeliveryTime() {
        return deliveryTime;
    }

    /**
     * 设置交车时间
     *
     * @param deliveryTime 交车时间
     */
    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    /**
     * 获取保险公司ID
     *
     * @return id_insurer - 保险公司ID
     */
    public BigInteger getIdInsurer() {
        return idInsurer;
    }

    /**
     * 设置保险公司ID
     *
     * @param idInsurer 保险公司ID
     */
    public void setIdInsurer(BigInteger idInsurer) {
        this.idInsurer = idInsurer;
    }

    /**
     * 获取保存理赔单的保险单号
     *
     * @return insurancepolicy_no - 保存理赔单的保险单号
     */
    public String getInsurancepolicyNo() {
        return insurancepolicyNo;
    }

    /**
     * 设置保存理赔单的保险单号
     *
     * @param insurancepolicyNo 保存理赔单的保险单号
     */
    public void setInsurancepolicyNo(String insurancepolicyNo) {
        this.insurancepolicyNo = insurancepolicyNo;
    }

    /**
     * 获取保险类型,现阶段用于区分是否为本车自己的保险，后期可以用于定义三责险，车损险，交强险等
     *
     * @return insurancepolicy_type - 保险类型,现阶段用于区分是否为本车自己的保险，后期可以用于定义三责险，车损险，交强险等
     */
    public String getInsurancepolicyType() {
        return insurancepolicyType;
    }

    /**
     * 设置保险类型,现阶段用于区分是否为本车自己的保险，后期可以用于定义三责险，车损险，交强险等
     *
     * @param insurancepolicyType 保险类型,现阶段用于区分是否为本车自己的保险，后期可以用于定义三责险，车损险，交强险等
     */
    public void setInsurancepolicyType(String insurancepolicyType) {
        this.insurancepolicyType = insurancepolicyType;
    }

    /**
     * 获取预约单id
     *
     * @return order_id - 预约单id
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置预约单id
     *
     * @param orderId 预约单id
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取预约单单号
     *
     * @return reservation_number - 预约单单号
     */
    public String getReservationNumber() {
        return reservationNumber;
    }

    /**
     * 设置预约单单号
     *
     * @param reservationNumber 预约单单号
     */
    public void setReservationNumber(String reservationNumber) {
        this.reservationNumber = reservationNumber;
    }

    /**
     * 获取完工日期
     *
     * @return complate_date - 完工日期
     */
    public Date getComplateDate() {
        return complateDate;
    }

    /**
     * 设置完工日期
     *
     * @param complateDate 完工日期
     */
    public void setComplateDate(Date complateDate) {
        this.complateDate = complateDate;
    }

    /**
     * 获取完工人员
     *
     * @return complete_user - 完工人员
     */
    public BigInteger getCompleteUser() {
        return completeUser;
    }

    /**
     * 设置完工人员
     *
     * @param completeUser 完工人员
     */
    public void setCompleteUser(BigInteger completeUser) {
        this.completeUser = completeUser;
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
     * 获取代办费
     *
     * @return commission_cost - 代办费
     */
    public BigDecimal getCommissionCost() {
        return commissionCost;
    }

    /**
     * 设置代办费
     *
     * @param commissionCost 代办费
     */
    public void setCommissionCost(BigDecimal commissionCost) {
        this.commissionCost = commissionCost;
    }

    /**
     * 获取代办费实收
     *
     * @return commission_cost_real - 代办费实收
     */
    public BigDecimal getCommissionCostReal() {
        return commissionCostReal;
    }

    /**
     * 设置代办费实收
     *
     * @param commissionCostReal 代办费实收
     */
    public void setCommissionCostReal(BigDecimal commissionCostReal) {
        this.commissionCostReal = commissionCostReal;
    }

    /**
     * 获取实收中的冲销部分
     *
     * @return commission_cost_real_cx - 实收中的冲销部分
     */
    public BigDecimal getCommissionCostRealCx() {
        return commissionCostRealCx;
    }

    /**
     * 设置实收中的冲销部分
     *
     * @param commissionCostRealCx 实收中的冲销部分
     */
    public void setCommissionCostRealCx(BigDecimal commissionCostRealCx) {
        this.commissionCostRealCx = commissionCostRealCx;
    }

    /**
     * 获取代办费实收（仅包含结算时优惠）
     *
     * @return commission_cost_real_settlement - 代办费实收（仅包含结算时优惠）
     */
    public BigDecimal getCommissionCostRealSettlement() {
        return commissionCostRealSettlement;
    }

    /**
     * 设置代办费实收（仅包含结算时优惠）
     *
     * @param commissionCostRealSettlement 代办费实收（仅包含结算时优惠）
     */
    public void setCommissionCostRealSettlement(BigDecimal commissionCostRealSettlement) {
        this.commissionCostRealSettlement = commissionCostRealSettlement;
    }

    /**
     * 获取诊断费
     *
     * @return diagnosis_cost - 诊断费
     */
    public BigDecimal getDiagnosisCost() {
        return diagnosisCost;
    }

    /**
     * 设置诊断费
     *
     * @param diagnosisCost 诊断费
     */
    public void setDiagnosisCost(BigDecimal diagnosisCost) {
        this.diagnosisCost = diagnosisCost;
    }

    /**
     * 获取诊断费实收
     *
     * @return diagnosis_cost_real - 诊断费实收
     */
    public BigDecimal getDiagnosisCostReal() {
        return diagnosisCostReal;
    }

    /**
     * 设置诊断费实收
     *
     * @param diagnosisCostReal 诊断费实收
     */
    public void setDiagnosisCostReal(BigDecimal diagnosisCostReal) {
        this.diagnosisCostReal = diagnosisCostReal;
    }

    /**
     * 获取实收中的冲销部分
     *
     * @return diagnosis_cost_real_cx - 实收中的冲销部分
     */
    public BigDecimal getDiagnosisCostRealCx() {
        return diagnosisCostRealCx;
    }

    /**
     * 设置实收中的冲销部分
     *
     * @param diagnosisCostRealCx 实收中的冲销部分
     */
    public void setDiagnosisCostRealCx(BigDecimal diagnosisCostRealCx) {
        this.diagnosisCostRealCx = diagnosisCostRealCx;
    }

    /**
     * 获取诊断费实收（仅包含结算时优惠）
     *
     * @return diagnosis_cost_real_settlement - 诊断费实收（仅包含结算时优惠）
     */
    public BigDecimal getDiagnosisCostRealSettlement() {
        return diagnosisCostRealSettlement;
    }

    /**
     * 设置诊断费实收（仅包含结算时优惠）
     *
     * @param diagnosisCostRealSettlement 诊断费实收（仅包含结算时优惠）
     */
    public void setDiagnosisCostRealSettlement(BigDecimal diagnosisCostRealSettlement) {
        this.diagnosisCostRealSettlement = diagnosisCostRealSettlement;
    }

    /**
     * 获取检测费
     *
     * @return check_cost - 检测费
     */
    public BigDecimal getCheckCost() {
        return checkCost;
    }

    /**
     * 设置检测费
     *
     * @param checkCost 检测费
     */
    public void setCheckCost(BigDecimal checkCost) {
        this.checkCost = checkCost;
    }

    /**
     * 获取检测费实收
     *
     * @return check_cost_real - 检测费实收
     */
    public BigDecimal getCheckCostReal() {
        return checkCostReal;
    }

    /**
     * 设置检测费实收
     *
     * @param checkCostReal 检测费实收
     */
    public void setCheckCostReal(BigDecimal checkCostReal) {
        this.checkCostReal = checkCostReal;
    }

    /**
     * 获取实收中的冲销部分
     *
     * @return check_cost_real_cx - 实收中的冲销部分
     */
    public BigDecimal getCheckCostRealCx() {
        return checkCostRealCx;
    }

    /**
     * 设置实收中的冲销部分
     *
     * @param checkCostRealCx 实收中的冲销部分
     */
    public void setCheckCostRealCx(BigDecimal checkCostRealCx) {
        this.checkCostRealCx = checkCostRealCx;
    }

    /**
     * 获取检测费实收（仅包含结算时优惠）
     *
     * @return check_cost_real_settlement - 检测费实收（仅包含结算时优惠）
     */
    public BigDecimal getCheckCostRealSettlement() {
        return checkCostRealSettlement;
    }

    /**
     * 设置检测费实收（仅包含结算时优惠）
     *
     * @param checkCostRealSettlement 检测费实收（仅包含结算时优惠）
     */
    public void setCheckCostRealSettlement(BigDecimal checkCostRealSettlement) {
        this.checkCostRealSettlement = checkCostRealSettlement;
    }

    /**
     * 获取加工费
     *
     * @return process_cost - 加工费
     */
    public BigDecimal getProcessCost() {
        return processCost;
    }

    /**
     * 设置加工费
     *
     * @param processCost 加工费
     */
    public void setProcessCost(BigDecimal processCost) {
        this.processCost = processCost;
    }

    /**
     * 获取加工费实收
     *
     * @return process_cost_real - 加工费实收
     */
    public BigDecimal getProcessCostReal() {
        return processCostReal;
    }

    /**
     * 设置加工费实收
     *
     * @param processCostReal 加工费实收
     */
    public void setProcessCostReal(BigDecimal processCostReal) {
        this.processCostReal = processCostReal;
    }

    /**
     * 获取实收中的冲销部分
     *
     * @return process_cost_real_cx - 实收中的冲销部分
     */
    public BigDecimal getProcessCostRealCx() {
        return processCostRealCx;
    }

    /**
     * 设置实收中的冲销部分
     *
     * @param processCostRealCx 实收中的冲销部分
     */
    public void setProcessCostRealCx(BigDecimal processCostRealCx) {
        this.processCostRealCx = processCostRealCx;
    }

    /**
     * 获取加工费实收（仅包含结算时优惠）
     *
     * @return process_cost_real_settlement - 加工费实收（仅包含结算时优惠）
     */
    public BigDecimal getProcessCostRealSettlement() {
        return processCostRealSettlement;
    }

    /**
     * 设置加工费实收（仅包含结算时优惠）
     *
     * @param processCostRealSettlement 加工费实收（仅包含结算时优惠）
     */
    public void setProcessCostRealSettlement(BigDecimal processCostRealSettlement) {
        this.processCostRealSettlement = processCostRealSettlement;
    }

    /**
     * 获取管理费
     *
     * @return management_cost - 管理费
     */
    public BigDecimal getManagementCost() {
        return managementCost;
    }

    /**
     * 设置管理费
     *
     * @param managementCost 管理费
     */
    public void setManagementCost(BigDecimal managementCost) {
        this.managementCost = managementCost;
    }

    /**
     * 获取管理费实收
     *
     * @return management_cost_real - 管理费实收
     */
    public BigDecimal getManagementCostReal() {
        return managementCostReal;
    }

    /**
     * 设置管理费实收
     *
     * @param managementCostReal 管理费实收
     */
    public void setManagementCostReal(BigDecimal managementCostReal) {
        this.managementCostReal = managementCostReal;
    }

    /**
     * 获取实收中的冲销部分
     *
     * @return management_cost_real_cx - 实收中的冲销部分
     */
    public BigDecimal getManagementCostRealCx() {
        return managementCostRealCx;
    }

    /**
     * 设置实收中的冲销部分
     *
     * @param managementCostRealCx 实收中的冲销部分
     */
    public void setManagementCostRealCx(BigDecimal managementCostRealCx) {
        this.managementCostRealCx = managementCostRealCx;
    }

    /**
     * 获取管理费实收（仅包含结算时优惠）
     *
     * @return management_cost_real_settlement - 管理费实收（仅包含结算时优惠）
     */
    public BigDecimal getManagementCostRealSettlement() {
        return managementCostRealSettlement;
    }

    /**
     * 设置管理费实收（仅包含结算时优惠）
     *
     * @param managementCostRealSettlement 管理费实收（仅包含结算时优惠）
     */
    public void setManagementCostRealSettlement(BigDecimal managementCostRealSettlement) {
        this.managementCostRealSettlement = managementCostRealSettlement;
    }

    /**
     * 获取送修人
     *
     * @return repair_person - 送修人
     */
    public String getRepairPerson() {
        return repairPerson;
    }

    /**
     * 设置送修人
     *
     * @param repairPerson 送修人
     */
    public void setRepairPerson(String repairPerson) {
        this.repairPerson = repairPerson;
    }

    /**
     * 获取送修人联系方式
     *
     * @return repair_person_contact - 送修人联系方式
     */
    public String getRepairPersonContact() {
        return repairPersonContact;
    }

    /**
     * 设置送修人联系方式
     *
     * @param repairPersonContact 送修人联系方式
     */
    public void setRepairPersonContact(String repairPersonContact) {
        this.repairPersonContact = repairPersonContact;
    }

    /**
     * 获取送修人性别
     *
     * @return contact_sex - 送修人性别
     */
    public String getContactSex() {
        return contactSex;
    }

    /**
     * 设置送修人性别
     *
     * @param contactSex 送修人性别
     */
    public void setContactSex(String contactSex) {
        this.contactSex = contactSex;
    }

    /**
     * 获取送修人证件号
     *
     * @return contact_credentials_number - 送修人证件号
     */
    public String getContactCredentialsNumber() {
        return contactCredentialsNumber;
    }

    /**
     * 设置送修人证件号
     *
     * @param contactCredentialsNumber 送修人证件号
     */
    public void setContactCredentialsNumber(String contactCredentialsNumber) {
        this.contactCredentialsNumber = contactCredentialsNumber;
    }

    /**
     * 获取送修人证件类型
     *
     * @return contact_credentials_type - 送修人证件类型
     */
    public String getContactCredentialsType() {
        return contactCredentialsType;
    }

    /**
     * 设置送修人证件类型
     *
     * @param contactCredentialsType 送修人证件类型
     */
    public void setContactCredentialsType(String contactCredentialsType) {
        this.contactCredentialsType = contactCredentialsType;
    }

    /**
     * 获取送修人详细地址
     *
     * @return contact_detail_address - 送修人详细地址
     */
    public String getContactDetailAddress() {
        return contactDetailAddress;
    }

    /**
     * 设置送修人详细地址
     *
     * @param contactDetailAddress 送修人详细地址
     */
    public void setContactDetailAddress(String contactDetailAddress) {
        this.contactDetailAddress = contactDetailAddress;
    }

    /**
     * 获取下次保养日期
     *
     * @return next_maintain_date - 下次保养日期
     */
    public String getNextMaintainDate() {
        return nextMaintainDate;
    }

    /**
     * 设置下次保养日期
     *
     * @param nextMaintainDate 下次保养日期
     */
    public void setNextMaintainDate(String nextMaintainDate) {
        this.nextMaintainDate = nextMaintainDate;
    }

    /**
     * 获取下次保养里程
     *
     * @return next_mileage - 下次保养里程
     */
    public BigDecimal getNextMileage() {
        return nextMileage;
    }

    /**
     * 设置下次保养里程
     *
     * @param nextMileage 下次保养里程
     */
    public void setNextMileage(BigDecimal nextMileage) {
        this.nextMileage = nextMileage;
    }

    /**
     * 获取当前油量
     *
     * @return oil_capacity - 当前油量
     */
    public Integer getOilCapacity() {
        return oilCapacity;
    }

    /**
     * 设置当前油量
     *
     * @param oilCapacity 当前油量
     */
    public void setOilCapacity(Integer oilCapacity) {
        this.oilCapacity = oilCapacity;
    }

    /**
     * @return version
     */
    public BigInteger getVersion() {
        return version;
    }

    /**
     * @param version
     */
    public void setVersion(BigInteger version) {
        this.version = version;
    }

    /**
     * 获取删除flag，{0:未删除，1:已删除}
     *
     * @return is_del - 删除flag，{0:未删除，1:已删除}
     */
    public Integer getIsDel() {
        return isDel;
    }

    /**
     * 设置删除flag，{0:未删除，1:已删除}
     *
     * @param isDel 删除flag，{0:未删除，1:已删除}
     */
    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    /**
     * 获取迁移flag 0:非迁移数据 1:迁移数据
     *
     * @return is_migration - 迁移flag 0:非迁移数据 1:迁移数据
     */
    public Integer getIsMigration() {
        return isMigration;
    }

    /**
     * 设置迁移flag 0:非迁移数据 1:迁移数据
     *
     * @param isMigration 迁移flag 0:非迁移数据 1:迁移数据
     */
    public void setIsMigration(Integer isMigration) {
        this.isMigration = isMigration;
    }

    /**
     * 获取工单的来源工单ID，适用于创建返厂单的情况
     *
     * @return from_maintain_id - 工单的来源工单ID，适用于创建返厂单的情况
     */
    public BigInteger getFromMaintainId() {
        return fromMaintainId;
    }

    /**
     * 设置工单的来源工单ID，适用于创建返厂单的情况
     *
     * @param fromMaintainId 工单的来源工单ID，适用于创建返厂单的情况
     */
    public void setFromMaintainId(BigInteger fromMaintainId) {
        this.fromMaintainId = fromMaintainId;
    }

    /**
     * 获取通过单据生成单据时的类型（例，创建返厂单时为FCD）
     *
     * @return from_maintain_type - 通过单据生成单据时的类型（例，创建返厂单时为FCD）
     */
    public String getFromMaintainType() {
        return fromMaintainType;
    }

    /**
     * 设置通过单据生成单据时的类型（例，创建返厂单时为FCD）
     *
     * @param fromMaintainType 通过单据生成单据时的类型（例，创建返厂单时为FCD）
     */
    public void setFromMaintainType(String fromMaintainType) {
        this.fromMaintainType = fromMaintainType;
    }

    /**
     * 获取与工单关联的车辆预检单ID
     *
     * @return carpreview_maintain_id - 与工单关联的车辆预检单ID
     */
    public BigInteger getCarpreviewMaintainId() {
        return carpreviewMaintainId;
    }

    /**
     * 设置与工单关联的车辆预检单ID
     *
     * @param carpreviewMaintainId 与工单关联的车辆预检单ID
     */
    public void setCarpreviewMaintainId(BigInteger carpreviewMaintainId) {
        this.carpreviewMaintainId = carpreviewMaintainId;
    }

    /**
     * 获取工单质检状态，未质检（9000），合格（9100），不合格（9200），返工合格（9300）
     *
     * @return quality_check_status - 工单质检状态，未质检（9000），合格（9100），不合格（9200），返工合格（9300）
     */
    public String getQualityCheckStatus() {
        return qualityCheckStatus;
    }

    /**
     * 设置工单质检状态，未质检（9000），合格（9100），不合格（9200），返工合格（9300）
     *
     * @param qualityCheckStatus 工单质检状态，未质检（9000），合格（9100），不合格（9200），返工合格（9300）
     */
    public void setQualityCheckStatus(String qualityCheckStatus) {
        this.qualityCheckStatus = qualityCheckStatus;
    }

    /**
     * 获取综合会员卡/计次卡/套餐卡的优惠金额
     *
     * @return vip_expense_favourable - 综合会员卡/计次卡/套餐卡的优惠金额
     */
    public BigDecimal getVipExpenseFavourable() {
        return vipExpenseFavourable;
    }

    /**
     * 设置综合会员卡/计次卡/套餐卡的优惠金额
     *
     * @param vipExpenseFavourable 综合会员卡/计次卡/套餐卡的优惠金额
     */
    public void setVipExpenseFavourable(BigDecimal vipExpenseFavourable) {
        this.vipExpenseFavourable = vipExpenseFavourable;
    }

    /**
     * 获取套餐优惠总金额
     *
     * @return package_favourable - 套餐优惠总金额
     */
    public BigDecimal getPackageFavourable() {
        return packageFavourable;
    }

    /**
     * 设置套餐优惠总金额
     *
     * @param packageFavourable 套餐优惠总金额
     */
    public void setPackageFavourable(BigDecimal packageFavourable) {
        this.packageFavourable = packageFavourable;
    }

    /**
     * 获取项目折扣优惠
     *
     * @return service_discount_favourable - 项目折扣优惠
     */
    public BigDecimal getServiceDiscountFavourable() {
        return serviceDiscountFavourable;
    }

    /**
     * 设置项目折扣优惠
     *
     * @param serviceDiscountFavourable 项目折扣优惠
     */
    public void setServiceDiscountFavourable(BigDecimal serviceDiscountFavourable) {
        this.serviceDiscountFavourable = serviceDiscountFavourable;
    }

    /**
     * 获取材料折扣优惠
     *
     * @return partinfo_discount_favourable - 材料折扣优惠
     */
    public BigDecimal getPartinfoDiscountFavourable() {
        return partinfoDiscountFavourable;
    }

    /**
     * 设置材料折扣优惠
     *
     * @param partinfoDiscountFavourable 材料折扣优惠
     */
    public void setPartinfoDiscountFavourable(BigDecimal partinfoDiscountFavourable) {
        this.partinfoDiscountFavourable = partinfoDiscountFavourable;
    }

    /**
     * 获取储值卡消费金额
     *
     * @return czk_expense - 储值卡消费金额
     */
    public BigDecimal getCzkExpense() {
        return czkExpense;
    }

    /**
     * 设置储值卡消费金额
     *
     * @param czkExpense 储值卡消费金额
     */
    public void setCzkExpense(BigDecimal czkExpense) {
        this.czkExpense = czkExpense;
    }

    /**
     * 获取储值卡消费优惠金额
     *
     * @return czk_expense_favourable - 储值卡消费优惠金额
     */
    public BigDecimal getCzkExpenseFavourable() {
        return czkExpenseFavourable;
    }

    /**
     * 设置储值卡消费优惠金额
     *
     * @param czkExpenseFavourable 储值卡消费优惠金额
     */
    public void setCzkExpenseFavourable(BigDecimal czkExpenseFavourable) {
        this.czkExpenseFavourable = czkExpenseFavourable;
    }

    /**
     * 获取服务项目客户等级优惠金额
     *
     * @return service_favourable - 服务项目客户等级优惠金额
     */
    public BigDecimal getServiceFavourable() {
        return serviceFavourable;
    }

    /**
     * 设置服务项目客户等级优惠金额
     *
     * @param serviceFavourable 服务项目客户等级优惠金额
     */
    public void setServiceFavourable(BigDecimal serviceFavourable) {
        this.serviceFavourable = serviceFavourable;
    }

    /**
     * 获取服务项目客户等级优惠金额
     *
     * @return service_favourable_backup - 服务项目客户等级优惠金额
     */
    public BigDecimal getServiceFavourableBackup() {
        return serviceFavourableBackup;
    }

    /**
     * 设置服务项目客户等级优惠金额
     *
     * @param serviceFavourableBackup 服务项目客户等级优惠金额
     */
    public void setServiceFavourableBackup(BigDecimal serviceFavourableBackup) {
        this.serviceFavourableBackup = serviceFavourableBackup;
    }

    /**
     * 获取材料项目客户等级优惠金额
     *
     * @return partinfo_favourable - 材料项目客户等级优惠金额
     */
    public BigDecimal getPartinfoFavourable() {
        return partinfoFavourable;
    }

    /**
     * 设置材料项目客户等级优惠金额
     *
     * @param partinfoFavourable 材料项目客户等级优惠金额
     */
    public void setPartinfoFavourable(BigDecimal partinfoFavourable) {
        this.partinfoFavourable = partinfoFavourable;
    }

    /**
     * 获取材料项目客户等级优惠金额
     *
     * @return partinfo_favourable_backup - 材料项目客户等级优惠金额
     */
    public BigDecimal getPartinfoFavourableBackup() {
        return partinfoFavourableBackup;
    }

    /**
     * 设置材料项目客户等级优惠金额
     *
     * @param partinfoFavourableBackup 材料项目客户等级优惠金额
     */
    public void setPartinfoFavourableBackup(BigDecimal partinfoFavourableBackup) {
        this.partinfoFavourableBackup = partinfoFavourableBackup;
    }

    /**
     * 获取积分优惠金额
     *
     * @return point_favourable - 积分优惠金额
     */
    public BigDecimal getPointFavourable() {
        return pointFavourable;
    }

    /**
     * 设置积分优惠金额
     *
     * @param pointFavourable 积分优惠金额
     */
    public void setPointFavourable(BigDecimal pointFavourable) {
        this.pointFavourable = pointFavourable;
    }

    /**
     * 获取使用积分
     *
     * @return use_point - 使用积分
     */
    public BigDecimal getUsePoint() {
        return usePoint;
    }

    /**
     * 设置使用积分
     *
     * @param usePoint 使用积分
     */
    public void setUsePoint(BigDecimal usePoint) {
        this.usePoint = usePoint;
    }

    /**
     * 获取结清优惠
     *
     * @return discount_favourable - 结清优惠
     */
    public BigDecimal getDiscountFavourable() {
        return discountFavourable;
    }

    /**
     * 设置结清优惠
     *
     * @param discountFavourable 结清优惠
     */
    public void setDiscountFavourable(BigDecimal discountFavourable) {
        this.discountFavourable = discountFavourable;
    }

    /**
     * 获取来源单号
     *
     * @return source_bill_no - 来源单号
     */
    public String getSourceBillNo() {
        return sourceBillNo;
    }

    /**
     * 设置来源单号
     *
     * @param sourceBillNo 来源单号
     */
    public void setSourceBillNo(String sourceBillNo) {
        this.sourceBillNo = sourceBillNo;
    }

    /**
     * 获取来源id
     *
     * @return id_source_bill - 来源id
     */
    public BigInteger getIdSourceBill() {
        return idSourceBill;
    }

    /**
     * 设置来源id
     *
     * @param idSourceBill 来源id
     */
    public void setIdSourceBill(BigInteger idSourceBill) {
        this.idSourceBill = idSourceBill;
    }

    /**
     * 获取收银优惠
     *
     * @return gathering_favourable - 收银优惠
     */
    public BigDecimal getGatheringFavourable() {
        return gatheringFavourable;
    }

    /**
     * 设置收银优惠
     *
     * @param gatheringFavourable 收银优惠
     */
    public void setGatheringFavourable(BigDecimal gatheringFavourable) {
        this.gatheringFavourable = gatheringFavourable;
    }

    /**
     * 获取车辆分类
     *
     * @return car_category_id - 车辆分类
     */
    public BigInteger getCarCategoryId() {
        return carCategoryId;
    }

    /**
     * 设置车辆分类
     *
     * @param carCategoryId 车辆分类
     */
    public void setCarCategoryId(BigInteger carCategoryId) {
        this.carCategoryId = carCategoryId;
    }

    /**
     * @return id_channel
     */
    public BigInteger getIdChannel() {
        return idChannel;
    }

    /**
     * @param idChannel
     */
    public void setIdChannel(BigInteger idChannel) {
        this.idChannel = idChannel;
    }

    /**
     * @return insurance_contacts
     */
    public String getInsuranceContacts() {
        return insuranceContacts;
    }

    /**
     * @param insuranceContacts
     */
    public void setInsuranceContacts(String insuranceContacts) {
        this.insuranceContacts = insuranceContacts;
    }

    /**
     * @return insurance_contact_telephone
     */
    public String getInsuranceContactTelephone() {
        return insuranceContactTelephone;
    }

    /**
     * @param insuranceContactTelephone
     */
    public void setInsuranceContactTelephone(String insuranceContactTelephone) {
        this.insuranceContactTelephone = insuranceContactTelephone;
    }
}