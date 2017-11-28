package com.f6car.base.vo.org;

import com.f6car.base.common.Vo;
import java.util.Date;
import java.math.BigDecimal;
import java.math.BigInteger;
import cn.afterturn.easypoi.excel.annotation.Excel;




/**
 * Created by qixiaobo on 2017-11-28.
 */
public class TbOrgVo extends Vo {

    private static final long serialVersionUID = -6920934492324729614L;

    @Excel(name = "pkId",orderNum="10")
    private BigInteger   pkId;

    @Excel(name = "code",orderNum="20")
    private String   code;

    @Excel(name = "name",orderNum="30")
    private String   name;

    @Excel(name = "contacts",orderNum="40")
    private String   contacts;

    @Excel(name = "contactNumber",orderNum="50")
    private String   contactNumber;

    @Excel(name = "contactMobile",orderNum="60")
    private String   contactMobile;

    @Excel(name = "fax",orderNum="70")
    private String   fax;

    @Excel(name = "province",orderNum="80")
    private String   province;

    @Excel(name = "city",orderNum="90")
    private String   city;

    @Excel(name = "area",orderNum="100")
    private String   area;

    @Excel(name = "street",orderNum="110")
    private String   street;

    @Excel(name = "address",orderNum="120")
    private String   address;

    @Excel(name = "detailAddress",orderNum="130")
    private String   detailAddress;

    @Excel(name = "email",orderNum="140")
    private String   email;

    @Excel(name = "idParent",orderNum="150")
    private BigInteger   idParent;

    @Excel(name = "isDel",orderNum="160")
    private Byte   isDel;

    @Excel(name = "entityCode",orderNum="170")
    private String   entityCode;

    @Excel(name = "bussiness",orderNum="180")
    private String   bussiness;

    @Excel(name = "logo",orderNum="190")
    private String   logo;

    @Excel(name = "storeLogo",orderNum="200")
    private String   storeLogo;

    @Excel(name = "applicationLogo",orderNum="210")
    private String   applicationLogo;

    @Excel(name = "responsible",orderNum="220")
    private String   responsible;

    @Excel(name = "zipCode",orderNum="230")
    private String   zipCode;

    @Excel(name = "endDate",orderNum="240")
    private Date   endDate;

    @Excel(name = "qq",orderNum="250")
    private String   qq;

    @Excel(name = "bankAccount",orderNum="260")
    private String   bankAccount;

    @Excel(name = "accountNumber",orderNum="270")
    private String   accountNumber;

    @Excel(name = "idCustomerCarzone",orderNum="280")
    private String   idCustomerCarzone;

    @Excel(name = "idDepartmentCarzone",orderNum="290")
    private String   idDepartmentCarzone;

    @Excel(name = "isTaskModeEnable",orderNum="300")
    private Byte   isTaskModeEnable;

    @Excel(name = "positionX",orderNum="310")
    private BigDecimal   positionX;

    @Excel(name = "positionY",orderNum="320")
    private BigDecimal   positionY;

    @Excel(name = "openTime",orderNum="330")
    private Date   openTime;

    @Excel(name = "closeTime",orderNum="340")
    private Date   closeTime;

    @Excel(name = "abbreviation",orderNum="350")
    private String   abbreviation;

    @Excel(name = "fromFlag",orderNum="360")
    private Integer   fromFlag;

    @Excel(name = "enableSupplierExport",orderNum="370")
    private Byte   enableSupplierExport;

    @Excel(name = "isCloudItemSearchable",orderNum="380")
    private Byte   isCloudItemSearchable;

    @Excel(name = "isCloudPartSearchable",orderNum="390")
    private Byte   isCloudPartSearchable;

    @Excel(name = "needScanLogin",orderNum="400")
    private Byte   needScanLogin;

    @Excel(name = "needCheckUuid",orderNum="410")
    private Byte   needCheckUuid;

    @Excel(name = "uuidCountLimit",orderNum="420")
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
