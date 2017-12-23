 
package Entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

 
public class SmtbUserWeb implements Serializable {
    private static final long serialVersionUID = 1L;
 
    private String userId;
 
    private Date startDate;
 
    private String userName;
 
    private String userPassword;
 
    private String userPasswordEmoney;
 
    private Date statusChangedOn;
 
    private Date lastSignedOn;
 
    private Character userStatus;
    
    private Date endDate;
 
    private Date pwdChangedOn;
 
    private BigDecimal maxTxnAmt;
   
    private BigDecimal maxAuthAmt;
    
    private Short noCumulativeLogins;
     
    private Short noSuccessiveLogins;
     
    private Short forcePasswdChange;
    
    private String userLanguage;
    
    private String startupFunction;
    
    private String homeBranch;
     
    private Character authStat;
 
    private Date checkerDtStamp;
 
    private String checkerId;
    
    private Date makerDtStamp;
 
    private String makerId;
 
    private String chancePass;  
 
    private String email;
   
    private String idValidity;
    
    private String idNhomnvxl;
  
    private String qlnhom;
   
    private String maNhanvienNs;
    
    private String idLoainhanvien;
  
    private String usercn;
     
    private String hbmobile;

    public SmtbUserWeb() {
    }

    public SmtbUserWeb(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserPasswordEmoney() {
        return userPasswordEmoney;
    }

    public void setUserPasswordEmoney(String userPasswordEmoney) {
        this.userPasswordEmoney = userPasswordEmoney;
    }

    public Date getStatusChangedOn() {
        return statusChangedOn;
    }

    public void setStatusChangedOn(Date statusChangedOn) {
        this.statusChangedOn = statusChangedOn;
    }

    public Date getLastSignedOn() {
        return lastSignedOn;
    }

    public void setLastSignedOn(Date lastSignedOn) {
        this.lastSignedOn = lastSignedOn;
    }

    public Character getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Character userStatus) {
        this.userStatus = userStatus;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getPwdChangedOn() {
        return pwdChangedOn;
    }

    public void setPwdChangedOn(Date pwdChangedOn) {
        this.pwdChangedOn = pwdChangedOn;
    }

    public BigDecimal getMaxTxnAmt() {
        return maxTxnAmt;
    }

    public void setMaxTxnAmt(BigDecimal maxTxnAmt) {
        this.maxTxnAmt = maxTxnAmt;
    }

    public BigDecimal getMaxAuthAmt() {
        return maxAuthAmt;
    }

    public void setMaxAuthAmt(BigDecimal maxAuthAmt) {
        this.maxAuthAmt = maxAuthAmt;
    }

    public Short getNoCumulativeLogins() {
        return noCumulativeLogins;
    }

    public void setNoCumulativeLogins(Short noCumulativeLogins) {
        this.noCumulativeLogins = noCumulativeLogins;
    }

    public Short getNoSuccessiveLogins() {
        return noSuccessiveLogins;
    }

    public void setNoSuccessiveLogins(Short noSuccessiveLogins) {
        this.noSuccessiveLogins = noSuccessiveLogins;
    }

    public Short getForcePasswdChange() {
        return forcePasswdChange;
    }

    public void setForcePasswdChange(Short forcePasswdChange) {
        this.forcePasswdChange = forcePasswdChange;
    }

    public String getUserLanguage() {
        return userLanguage;
    }

    public void setUserLanguage(String userLanguage) {
        this.userLanguage = userLanguage;
    }

    public String getStartupFunction() {
        return startupFunction;
    }

    public void setStartupFunction(String startupFunction) {
        this.startupFunction = startupFunction;
    }

    public String getHomeBranch() {
        return homeBranch;
    }

    public void setHomeBranch(String homeBranch) {
        this.homeBranch = homeBranch;
    }

    public Character getAuthStat() {
        return authStat;
    }

    public void setAuthStat(Character authStat) {
        this.authStat = authStat;
    }

    public Date getCheckerDtStamp() {
        return checkerDtStamp;
    }

    public void setCheckerDtStamp(Date checkerDtStamp) {
        this.checkerDtStamp = checkerDtStamp;
    }

    public String getCheckerId() {
        return checkerId;
    }

    public void setCheckerId(String checkerId) {
        this.checkerId = checkerId;
    }

    public Date getMakerDtStamp() {
        return makerDtStamp;
    }

    public void setMakerDtStamp(Date makerDtStamp) {
        this.makerDtStamp = makerDtStamp;
    }

    public String getMakerId() {
        return makerId;
    }

    public void setMakerId(String makerId) {
        this.makerId = makerId;
    }

    public String getChancePass() {
        return chancePass;
    }

    public void setChancePass(String chancePass) {
        this.chancePass = chancePass;
    }

    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdValidity() {
        return idValidity;
    }

    public void setIdValidity(String idValidity) {
        this.idValidity = idValidity;
    }

    public String getIdNhomnvxl() {
        return idNhomnvxl;
    }

    public void setIdNhomnvxl(String idNhomnvxl) {
        this.idNhomnvxl = idNhomnvxl;
    }

    public String getQlnhom() {
        return qlnhom;
    }

    public void setQlnhom(String qlnhom) {
        this.qlnhom = qlnhom;
    }

    public String getMaNhanvienNs() {
        return maNhanvienNs;
    }

    public void setMaNhanvienNs(String maNhanvienNs) {
        this.maNhanvienNs = maNhanvienNs;
    }

    public String getIdLoainhanvien() {
        return idLoainhanvien;
    }

    public void setIdLoainhanvien(String idLoainhanvien) {
        this.idLoainhanvien = idLoainhanvien;
    }

    public String getUsercn() {
        return usercn;
    }

    public void setUsercn(String usercn) {
        this.usercn = usercn;
    }

    public String getHbmobile() {
        return hbmobile;
    }

    public void setHbmobile(String hbmobile) {
        this.hbmobile = hbmobile;
    }
    
   
    
}
