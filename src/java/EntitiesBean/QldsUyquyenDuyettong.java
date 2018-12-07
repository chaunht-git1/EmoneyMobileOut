/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntitiesBean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author TamChauDAMTC
 */
@Entity
@Table(name = "QLDS_UYQUYEN_DUYETTONG")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "QldsUyquyenDuyettong.findAll", query = "SELECT q FROM QldsUyquyenDuyettong q"),
    @NamedQuery(name = "QldsUyquyenDuyettong.findByDoitacName", query = "SELECT q FROM QldsUyquyenDuyettong q WHERE q.doitacName = :doitacName"),
    @NamedQuery(name = "QldsUyquyenDuyettong.findByGhichu", query = "SELECT q FROM QldsUyquyenDuyettong q WHERE q.ghichu = :ghichu"),
    @NamedQuery(name = "QldsUyquyenDuyettong.findBySoam", query = "SELECT q FROM QldsUyquyenDuyettong q WHERE q.soam = :soam"),
    @NamedQuery(name = "QldsUyquyenDuyettong.findByIdDoitac", query = "SELECT q FROM QldsUyquyenDuyettong q WHERE q.idDoitac = :idDoitac"),
    @NamedQuery(name = "QldsUyquyenDuyettong.findBySotien", query = "SELECT q FROM QldsUyquyenDuyettong q WHERE q.sotien = :sotien"),
    @NamedQuery(name = "QldsUyquyenDuyettong.findByIdLoaitien", query = "SELECT q FROM QldsUyquyenDuyettong q WHERE q.idLoaitien = :idLoaitien"),
    @NamedQuery(name = "QldsUyquyenDuyettong.findByIdNvUyquyen", query = "SELECT q FROM QldsUyquyenDuyettong q WHERE q.idNvUyquyen = :idNvUyquyen"),
    @NamedQuery(name = "QldsUyquyenDuyettong.findByKhoa", query = "SELECT q FROM QldsUyquyenDuyettong q WHERE q.khoa = :khoa"),
    @NamedQuery(name = "QldsUyquyenDuyettong.findByTodate", query = "SELECT q FROM QldsUyquyenDuyettong q WHERE q.todate = :todate"),
    @NamedQuery(name = "QldsUyquyenDuyettong.findByIdValidity", query = "SELECT q FROM QldsUyquyenDuyettong q WHERE q.idValidity = :idValidity"),
    @NamedQuery(name = "QldsUyquyenDuyettong.findByDateModified", query = "SELECT q FROM QldsUyquyenDuyettong q WHERE q.dateModified = :dateModified"),
    @NamedQuery(name = "QldsUyquyenDuyettong.findByMakerId", query = "SELECT q FROM QldsUyquyenDuyettong q WHERE q.makerId = :makerId"),
    @NamedQuery(name = "QldsUyquyenDuyettong.findByFromdate", query = "SELECT q FROM QldsUyquyenDuyettong q WHERE q.fromdate = :fromdate")})
public class QldsUyquyenDuyettong implements Serializable {
    private static final long serialVersionUID = 1L;
    @Size(max = 500)
    @Column(name = "DOITAC_NAME")
    private String doitacName;
    @Size(max = 1000)
    @Column(name = "GHICHU")
    private String ghichu;
    @Size(max = 1)
    @Column(name = "SOAM")
    private String soam;
    @Size(max = 20)
    @Column(name = "ID_DOITAC")
    private String idDoitac;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SOTIEN")
    private BigDecimal sotien;
    @Size(max = 20)
    @Column(name = "ID_LOAITIEN")
    private String idLoaitien;
    @Size(max = 20)
    @Column(name = "ID_NV_UYQUYEN")
    private String idNvUyquyen;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "KHOA")
    private String khoa;
    @Column(name = "TODATE")
    @Temporal(TemporalType.DATE)
    private Date todate;
    @Size(max = 1)
    @Column(name = "ID_VALIDITY")
    private String idValidity;
    @Column(name = "DATE_MODIFIED")
    @Temporal(TemporalType.DATE)
    private Date dateModified;
    @Size(max = 20)
    @Column(name = "MAKER_ID")
    private String makerId;
    @Column(name = "FROMDATE")
    @Temporal(TemporalType.DATE)
    private Date fromdate;

    public QldsUyquyenDuyettong() {
    }

    public QldsUyquyenDuyettong(String khoa) {
        this.khoa = khoa;
    }

    public String getDoitacName() {
        return doitacName;
    }

    public void setDoitacName(String doitacName) {
        this.doitacName = doitacName;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    public String getSoam() {
        return soam;
    }

    public void setSoam(String soam) {
        this.soam = soam;
    }

    public String getIdDoitac() {
        return idDoitac;
    }

    public void setIdDoitac(String idDoitac) {
        this.idDoitac = idDoitac;
    }

    public BigDecimal getSotien() {
        return sotien;
    }

    public void setSotien(BigDecimal sotien) {
        this.sotien = sotien;
    }

    public String getIdLoaitien() {
        return idLoaitien;
    }

    public void setIdLoaitien(String idLoaitien) {
        this.idLoaitien = idLoaitien;
    }

    public String getIdNvUyquyen() {
        return idNvUyquyen;
    }

    public void setIdNvUyquyen(String idNvUyquyen) {
        this.idNvUyquyen = idNvUyquyen;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public Date getTodate() {
        return todate;
    }

    public void setTodate(Date todate) {
        this.todate = todate;
    }

    public String getIdValidity() {
        return idValidity;
    }

    public void setIdValidity(String idValidity) {
        this.idValidity = idValidity;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    public String getMakerId() {
        return makerId;
    }

    public void setMakerId(String makerId) {
        this.makerId = makerId;
    }

    public Date getFromdate() {
        return fromdate;
    }

    public void setFromdate(Date fromdate) {
        this.fromdate = fromdate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (khoa != null ? khoa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof QldsUyquyenDuyettong)) {
            return false;
        }
        QldsUyquyenDuyettong other = (QldsUyquyenDuyettong) object;
        if ((this.khoa == null && other.khoa != null) || (this.khoa != null && !this.khoa.equals(other.khoa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EntitiesBean.QldsUyquyenDuyettong[ khoa=" + khoa + " ]";
    }
    
}
