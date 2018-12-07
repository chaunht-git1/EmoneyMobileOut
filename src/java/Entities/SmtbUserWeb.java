 
package Entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

 
@Entity
@Table(name = "SMTB_USER_WEB")
@XmlRootElement
@Cacheable 
@NamedQueries({
    @NamedQuery(name = "SmtbUserWeb.findAll", query = "SELECT s FROM SmtbUserWeb s"),
    @NamedQuery(name = "SmtbUserWeb.findByUserId", query = "SELECT s FROM SmtbUserWeb s WHERE s.userId = :userId"),
    @NamedQuery(name = "SmtbUserWeb.findByStartDate", query = "SELECT s FROM SmtbUserWeb s WHERE s.startDate = :startDate"),
    @NamedQuery(name = "SmtbUserWeb.findByUserName", query = "SELECT s FROM SmtbUserWeb s WHERE s.userName = :userName"),
    @NamedQuery(name = "SmtbUserWeb.findByUserPassword", query = "SELECT s FROM SmtbUserWeb s WHERE s.userPassword = :userPassword"),
    @NamedQuery(name = "SmtbUserWeb.findByUserPasswordEmoney", query = "SELECT s FROM SmtbUserWeb s WHERE s.userPasswordEmoney = :userPasswordEmoney"),
    @NamedQuery(name = "SmtbUserWeb.findByStatusChangedOn", query = "SELECT s FROM SmtbUserWeb s WHERE s.statusChangedOn = :statusChangedOn"),
    @NamedQuery(name = "SmtbUserWeb.findByLastSignedOn", query = "SELECT s FROM SmtbUserWeb s WHERE s.lastSignedOn = :lastSignedOn"),
    @NamedQuery(name = "SmtbUserWeb.findByUserStatus", query = "SELECT s FROM SmtbUserWeb s WHERE s.userStatus = :userStatus"),
    @NamedQuery(name = "SmtbUserWeb.findByEndDate", query = "SELECT s FROM SmtbUserWeb s WHERE s.endDate = :endDate"),
    @NamedQuery(name = "SmtbUserWeb.findByPwdChangedOn", query = "SELECT s FROM SmtbUserWeb s WHERE s.pwdChangedOn = :pwdChangedOn"),
    @NamedQuery(name = "SmtbUserWeb.findByMaxTxnAmt", query = "SELECT s FROM SmtbUserWeb s WHERE s.maxTxnAmt = :maxTxnAmt"),
    @NamedQuery(name = "SmtbUserWeb.findByMaxAuthAmt", query = "SELECT s FROM SmtbUserWeb s WHERE s.maxAuthAmt = :maxAuthAmt"),
    @NamedQuery(name = "SmtbUserWeb.findByNoCumulativeLogins", query = "SELECT s FROM SmtbUserWeb s WHERE s.noCumulativeLogins = :noCumulativeLogins"),
    @NamedQuery(name = "SmtbUserWeb.findByNoSuccessiveLogins", query = "SELECT s FROM SmtbUserWeb s WHERE s.noSuccessiveLogins = :noSuccessiveLogins"),
    @NamedQuery(name = "SmtbUserWeb.findByForcePasswdChange", query = "SELECT s FROM SmtbUserWeb s WHERE s.forcePasswdChange = :forcePasswdChange"),
    @NamedQuery(name = "SmtbUserWeb.findByUserLanguage", query = "SELECT s FROM SmtbUserWeb s WHERE s.userLanguage = :userLanguage"),
    @NamedQuery(name = "SmtbUserWeb.findByStartupFunction", query = "SELECT s FROM SmtbUserWeb s WHERE s.startupFunction = :startupFunction"),
    @NamedQuery(name = "SmtbUserWeb.findByHomeBranch", query = "SELECT s FROM SmtbUserWeb s WHERE s.homeBranch = :homeBranch"),
    @NamedQuery(name = "SmtbUserWeb.findByAuthStat", query = "SELECT s FROM SmtbUserWeb s WHERE s.authStat = :authStat"),
    @NamedQuery(name = "SmtbUserWeb.findByCheckerDtStamp", query = "SELECT s FROM SmtbUserWeb s WHERE s.checkerDtStamp = :checkerDtStamp"),
    @NamedQuery(name = "SmtbUserWeb.findByCheckerId", query = "SELECT s FROM SmtbUserWeb s WHERE s.checkerId = :checkerId"),
    @NamedQuery(name = "SmtbUserWeb.findByMakerDtStamp", query = "SELECT s FROM SmtbUserWeb s WHERE s.makerDtStamp = :makerDtStamp"),
    @NamedQuery(name = "SmtbUserWeb.findByMakerId", query = "SELECT s FROM SmtbUserWeb s WHERE s.makerId = :makerId"),
    @NamedQuery(name = "SmtbUserWeb.findByChancePass", query = "SELECT s FROM SmtbUserWeb s WHERE s.chancePass = :chancePass"),
    @NamedQuery(name = "SmtbUserWeb.findByEmail", query = "SELECT s FROM SmtbUserWeb s WHERE s.email = :email"),
    @NamedQuery(name = "SmtbUserWeb.findByIdValidity", query = "SELECT s FROM SmtbUserWeb s WHERE s.idValidity = :idValidity"),
    @NamedQuery(name = "SmtbUserWeb.findByIdNhomnvxl", query = "SELECT s FROM SmtbUserWeb s WHERE s.idNhomnvxl = :idNhomnvxl"),
    @NamedQuery(name = "SmtbUserWeb.findByQlnhom", query = "SELECT s FROM SmtbUserWeb s WHERE s.qlnhom = :qlnhom"),
    @NamedQuery(name = "SmtbUserWeb.findByMaNhanvienNs", query = "SELECT s FROM SmtbUserWeb s WHERE s.maNhanvienNs = :maNhanvienNs"),
    @NamedQuery(name = "SmtbUserWeb.findByIdLoainhanvien", query = "SELECT s FROM SmtbUserWeb s WHERE s.idLoainhanvien = :idLoainhanvien"),
    @NamedQuery(name = "SmtbUserWeb.findByUsercn", query = "SELECT s FROM SmtbUserWeb s WHERE s.usercn = :usercn")})
public class SmtbUserWeb implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "USER_ID")
    private String userId;
    @Column(name = "START_DATE")
    @Temporal(TemporalType.DATE)
    private Date startDate;
    @Size(max = 35)
    @Column(name = "USER_NAME")
    private String userName;
    @Size(max = 40)
    @Column(name = "USER_PASSWORD")
    private String userPassword;
    @Size(max = 40)
    @Column(name = "USER_PASSWORD_EMONEY")
    private String userPasswordEmoney;
    @Column(name = "STATUS_CHANGED_ON")
    @Temporal(TemporalType.DATE)
    private Date statusChangedOn;
    @Column(name = "LAST_SIGNED_ON")
    @Temporal(TemporalType.DATE)
    private Date lastSignedOn;
    @Column(name = "USER_STATUS")
    private Character userStatus;
    @Column(name = "END_DATE")
    @Temporal(TemporalType.DATE)
    private Date endDate;
    @Column(name = "PWD_CHANGED_ON")
    @Temporal(TemporalType.DATE)
    private Date pwdChangedOn;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MAX_TXN_AMT")
    private BigDecimal maxTxnAmt;
    @Column(name = "MAX_AUTH_AMT")
    private BigDecimal maxAuthAmt;
    @Column(name = "NO_CUMULATIVE_LOGINS")
    private Short noCumulativeLogins;
    @Column(name = "NO_SUCCESSIVE_LOGINS")
    private Short noSuccessiveLogins;
    @Column(name = "FORCE_PASSWD_CHANGE")
    private Short forcePasswdChange;
    @Size(max = 3)
    @Column(name = "USER_LANGUAGE")
    private String userLanguage;
    @Size(max = 8)
    @Column(name = "STARTUP_FUNCTION")
    private String startupFunction;
    @Size(max = 3)
    @Column(name = "HOME_BRANCH")
    private String homeBranch;
    @Column(name = "AUTH_STAT")
    private Character authStat;
    @Column(name = "CHECKER_DT_STAMP")
    @Temporal(TemporalType.DATE)
    private Date checkerDtStamp;
    @Size(max = 30)
    @Column(name = "CHECKER_ID")
    private String checkerId;
    @Column(name = "MAKER_DT_STAMP")
    @Temporal(TemporalType.DATE)
    private Date makerDtStamp;
    @Size(max = 30)
    @Column(name = "MAKER_ID")
    private String makerId;
    @Size(max = 1)
    @Column(name = "CHANCE_PASS")
    private String chancePass;  
    @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 60)
    @Column(name = "EMAIL")
    private String email;
    @Size(max = 1)
    @Column(name = "ID_VALIDITY")
    private String idValidity;
    @Size(max = 40)
    @Column(name = "ID_NHOMNVXL")
    private String idNhomnvxl;
    @Size(max = 40)
    @Column(name = "QLNHOM")
    private String qlnhom;
    @Size(max = 40)
    @Column(name = "MA_NHANVIEN_NS")
    private String maNhanvienNs;
    @Size(max = 40)
    @Column(name = "ID_LOAINHANVIEN")
    private String idLoainhanvien;
    @Size(max = 1)
    @Column(name = "USERCN")
    private String usercn;
    @Size(max = 1)
    @Column(name = "HBMOBILE")
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
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userId != null ? userId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SmtbUserWeb)) {
            return false;
        }
        SmtbUserWeb other = (SmtbUserWeb) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.SmtbUserWeb[ userId=" + userId + " ]";
    }
    
}
