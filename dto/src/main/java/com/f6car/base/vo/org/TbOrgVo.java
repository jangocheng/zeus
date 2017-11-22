package com.f6car.base.vo.org;

import com.f6car.base.common.Vo;
import java.util.Date;
import java.math.BigDecimal;
import java.math.BigInteger;



/**
 * Created by qixiaobo on 2017-11-22.
 */
public class TbOrgVo extends Vo {

    private static final long serialVersionUID = -6920934492324729614L;

    private BigInteger   pkId;

    private String   code;

    private String   name;

    private String   contacts;

    private String   contactNumber;

    private String   contactMobile;

    private String   fax;

    private String   province;

    private String   city;

    private String   area;

    private String   street;

    private String   address;

    private String   detailAddress;

    private String   email;

    private BigInteger   idParent;

    private Byte   isDel;

    private String   entityCode;

    private String   bussiness;

    private String   logo;

    private String   storeLogo;

    private String   applicationLogo;

    private String   responsible;

    private String   zipCode;

    private Date   endDate;

    private String   qq;

    private String   bankAccount;

    private String   accountNumber;

    private String   idCustomerCarzone;

    private String   idDepartmentCarzone;

    private Byte   isTaskModeEnable;

    private BigDecimal   positionX;

    private BigDecimal   positionY;

    private Date   openTime;

    private Date   closeTime;

    private String   abbreviation;

    private Integer   fromFlag;

    private Byte   enableSupplierExport;

    private Byte   isCloudItemSearchable;

    private Byte   isCloudPartSearchable;

    private Byte   needScanLogin;

    private Byte   needCheckUuid;

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


    public void setContaCts(String contacts) {
            this.contacts = contacts;
       }

    public String getContaCts() {
          return contacts;
      }


    public void setContaCtNumber(String contactNumber) {
            this.contactNumber = contactNumber;
       }

    public String getContaCtNumber() {
          return contactNumber;
      }


    public void setContaCtMobile(String contactMobile) {
            this.contactMobile = contactMobile;
       }

    public String getContaCtMobile() {
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


    public void setAreA(String area) {
            this.area = area;
       }

    public String getAreA() {
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


    public void setDetailADDress(String detailAddress) {
            this.detailAddress = detailAddress;
       }

    public String getDetailADDress() {
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


    public void setEntityCodE(String entityCode) {
            this.entityCode = entityCode;
       }

    public String getEntityCodE() {
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


    public void setApplicAtionLogo(String applicationLogo) {
            this.applicationLogo = applicationLogo;
       }

    public String getApplicAtionLogo() {
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


    public void setEndDatE(Date endDate) {
            this.endDate = endDate;
       }

    public Date getEndDatE() {
          return endDate;
      }


    public void setQQ(String qq) {
            this.qq = qq;
       }

    public String getQQ() {
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


    public void setAbbreviAtion(String abbreviation) {
            this.abbreviation = abbreviation;
       }

    public String getAbbreviAtion() {
          return abbreviation;
      }


    public void setFromFlag(Integer fromFlag) {
            this.fromFlag = fromFlag;
       }

    public Integer getFromFlag() {
          return fromFlag;
      }


    public void setEnablESuppliErExport(Byte enableSupplierExport) {
            this.enableSupplierExport = enableSupplierExport;
       }

    public Byte getEnablESuppliErExport() {
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


    public void setNeedScaNLogiN(Byte needScanLogin) {
            this.needScanLogin = needScanLogin;
       }

    public Byte getNeedScaNLogiN() {
          return needScanLogin;
      }


    public void setNeedCheckUuid(Byte needCheckUuid) {
            this.needCheckUuid = needCheckUuid;
       }

    public Byte getNeedCheckUuid() {
          return needCheckUuid;
      }


    public void setUUidCoUntLimit(Integer uuidCountLimit) {
            this.uuidCountLimit = uuidCountLimit;
       }

    public Integer getUUidCoUntLimit() {
          return uuidCountLimit;
      }






}
