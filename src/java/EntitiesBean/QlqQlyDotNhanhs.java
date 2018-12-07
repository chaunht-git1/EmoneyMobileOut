/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntitiesBean;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "QLQ_QLY_DOT_NHANHS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "QlqQlyDotNhanhs.findAll", query = "SELECT q FROM QlqQlyDotNhanhs q"),
    @NamedQuery(name = "QlqQlyDotNhanhs.findByIdCode", query = "SELECT q FROM QlqQlyDotNhanhs q WHERE q.idCode = :idCode"),
    @NamedQuery(name = "QlqQlyDotNhanhs.findByIdQlqDottg", query = "SELECT q FROM QlqQlyDotNhanhs q WHERE q.idQlqDottg = :idQlqDottg"),
    @NamedQuery(name = "QlqQlyDotNhanhs.findByIdNvChitra", query = "SELECT q FROM QlqQlyDotNhanhs q WHERE q.idNvChitra = :idNvChitra"),
    @NamedQuery(name = "QlqQlyDotNhanhs.findByIdQlqDuyet", query = "SELECT q FROM QlqQlyDotNhanhs q WHERE q.idQlqDuyet = :idQlqDuyet"),
    @NamedQuery(name = "QlqQlyDotNhanhs.findByIdQlqMoichitien", query = "SELECT q FROM QlqQlyDotNhanhs q WHERE q.idQlqMoichitien = :idQlqMoichitien"),
    @NamedQuery(name = "QlqQlyDotNhanhs.findByIdQlqNhandutien", query = "SELECT q FROM QlqQlyDotNhanhs q WHERE q.idQlqNhandutien = :idQlqNhandutien"),
    @NamedQuery(name = "QlqQlyDotNhanhs.findByQlqNgaychuyenKsq", query = "SELECT q FROM QlqQlyDotNhanhs q WHERE q.qlqNgaychuyenKsq = :qlqNgaychuyenKsq"),
    @NamedQuery(name = "QlqQlyDotNhanhs.findByQlqNgayKsqDuyet", query = "SELECT q FROM QlqQlyDotNhanhs q WHERE q.qlqNgayKsqDuyet = :qlqNgayKsqDuyet"),
    @NamedQuery(name = "QlqQlyDotNhanhs.findByQlqNgayTquyMoi", query = "SELECT q FROM QlqQlyDotNhanhs q WHERE q.qlqNgayTquyMoi = :qlqNgayTquyMoi"),
    @NamedQuery(name = "QlqQlyDotNhanhs.findByQlqNgayTquyNhandutien", query = "SELECT q FROM QlqQlyDotNhanhs q WHERE q.qlqNgayTquyNhandutien = :qlqNgayTquyNhandutien"),
    @NamedQuery(name = "QlqQlyDotNhanhs.findByIdNvXacnhandutien", query = "SELECT q FROM QlqQlyDotNhanhs q WHERE q.idNvXacnhandutien = :idNvXacnhandutien"),
    @NamedQuery(name = "QlqQlyDotNhanhs.findByQlqNgayNvchinhaNhandu", query = "SELECT q FROM QlqQlyDotNhanhs q WHERE q.qlqNgayNvchinhaNhandu = :qlqNgayNvchinhaNhandu"),
    @NamedQuery(name = "QlqQlyDotNhanhs.findByMakerId", query = "SELECT q FROM QlqQlyDotNhanhs q WHERE q.makerId = :makerId"),
    @NamedQuery(name = "QlqQlyDotNhanhs.findByQlqNgayTao", query = "SELECT q FROM QlqQlyDotNhanhs q WHERE q.qlqNgayTao = :qlqNgayTao"),
    @NamedQuery(name = "QlqQlyDotNhanhs.findByQlqDain", query = "SELECT q FROM QlqQlyDotNhanhs q WHERE q.qlqDain = :qlqDain"),
    @NamedQuery(name = "QlqQlyDotNhanhs.findByQlqSolanin", query = "SELECT q FROM QlqQlyDotNhanhs q WHERE q.qlqSolanin = :qlqSolanin"),
    @NamedQuery(name = "QlqQlyDotNhanhs.findByIdNvDuyet", query = "SELECT q FROM QlqQlyDotNhanhs q WHERE q.idNvDuyet = :idNvDuyet"),
    @NamedQuery(name = "QlqQlyDotNhanhs.findByMaNguoinhan", query = "SELECT q FROM QlqQlyDotNhanhs q WHERE q.maNguoinhan = :maNguoinhan"),
    @NamedQuery(name = "QlqQlyDotNhanhs.findByShs", query = "SELECT q FROM QlqQlyDotNhanhs q WHERE q.shs = :shs"),
    @NamedQuery(name = "QlqQlyDotNhanhs.findByAud", query = "SELECT q FROM QlqQlyDotNhanhs q WHERE q.aud = :aud"),
    @NamedQuery(name = "QlqQlyDotNhanhs.findByCad", query = "SELECT q FROM QlqQlyDotNhanhs q WHERE q.cad = :cad"),
    @NamedQuery(name = "QlqQlyDotNhanhs.findByUsd", query = "SELECT q FROM QlqQlyDotNhanhs q WHERE q.usd = :usd"),
    @NamedQuery(name = "QlqQlyDotNhanhs.findByEur", query = "SELECT q FROM QlqQlyDotNhanhs q WHERE q.eur = :eur"),
    @NamedQuery(name = "QlqQlyDotNhanhs.findByGbp", query = "SELECT q FROM QlqQlyDotNhanhs q WHERE q.gbp = :gbp"),
    @NamedQuery(name = "QlqQlyDotNhanhs.findByVnd", query = "SELECT q FROM QlqQlyDotNhanhs q WHERE q.vnd = :vnd"),
    @NamedQuery(name = "QlqQlyDotNhanhs.findByIdChinhanh", query = "SELECT q FROM QlqQlyDotNhanhs q WHERE q.idChinhanh = :idChinhanh"),
    @NamedQuery(name = "QlqQlyDotNhanhs.findByIdTquy", query = "SELECT q FROM QlqQlyDotNhanhs q WHERE q.idTquy = :idTquy")})
public class QlqQlyDotNhanhs implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "ID_CODE")
    private String idCode;
    @Size(max = 40)
    @Column(name = "ID_QLQ_DOTTG")
    private String idQlqDottg;
    @Size(max = 20)
    @Column(name = "ID_NV_CHITRA")
    private String idNvChitra;
    @Size(max = 1)
    @Column(name = "ID_QLQ_DUYET")
    private String idQlqDuyet;
    @Size(max = 1)
    @Column(name = "ID_QLQ_MOICHITIEN")
    private String idQlqMoichitien;
    @Size(max = 1)
    @Column(name = "ID_QLQ_NHANDUTIEN")
    private String idQlqNhandutien;
    @Column(name = "QLQ_NGAYCHUYEN_KSQ")
    @Temporal(TemporalType.DATE)
    private Date qlqNgaychuyenKsq;
    @Column(name = "QLQ_NGAY_KSQ_DUYET")
    @Temporal(TemporalType.DATE)
    private Date qlqNgayKsqDuyet;
    @Column(name = "QLQ_NGAY_TQUY_MOI")
    @Temporal(TemporalType.DATE)
    private Date qlqNgayTquyMoi;
    @Column(name = "QLQ_NGAY_TQUY_NHANDUTIEN")
    @Temporal(TemporalType.DATE)
    private Date qlqNgayTquyNhandutien;
    @Size(max = 1)
    @Column(name = "ID_NV_XACNHANDUTIEN")
    private String idNvXacnhandutien;
    @Column(name = "QLQ_NGAY_NVCHINHA_NHANDU")
    @Temporal(TemporalType.DATE)
    private Date qlqNgayNvchinhaNhandu;
    @Size(max = 20)
    @Column(name = "MAKER_ID")
    private String makerId;
    @Column(name = "QLQ_NGAY_TAO")
    @Temporal(TemporalType.DATE)
    private Date qlqNgayTao;
    @Size(max = 1)
    @Column(name = "QLQ_DAIN")
    private String qlqDain;
    @Column(name = "QLQ_SOLANIN")
    private BigInteger qlqSolanin;
    @Size(max = 20)
    @Column(name = "ID_NV_DUYET")
    private String idNvDuyet;
    @Size(max = 1000)
    @Column(name = "MA_NGUOINHAN")
    private String maNguoinhan;
    @Column(name = "SHS")
    private BigInteger shs;
    @Column(name = "AUD")
    private BigInteger aud;
    @Column(name = "CAD")
    private BigInteger cad;
    @Column(name = "USD")
    private BigInteger usd;
    @Column(name = "EUR")
    private BigInteger eur;
    @Column(name = "GBP")
    private BigInteger gbp;
    @Column(name = "VND")
    private BigInteger vnd;
    @Size(max = 20)
    @Column(name = "ID_CHINHANH")
    private String idChinhanh;
    @Size(max = 20)
    @Column(name = "ID_TQUY")
    private String idTquy;

    public QlqQlyDotNhanhs() {
    }

    public QlqQlyDotNhanhs(String idCode) {
        this.idCode = idCode;
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    public String getIdQlqDottg() {
        return idQlqDottg;
    }

    public void setIdQlqDottg(String idQlqDottg) {
        this.idQlqDottg = idQlqDottg;
    }

    public String getIdNvChitra() {
        return idNvChitra;
    }

    public void setIdNvChitra(String idNvChitra) {
        this.idNvChitra = idNvChitra;
    }

    public String getIdQlqDuyet() {
        return idQlqDuyet;
    }

    public void setIdQlqDuyet(String idQlqDuyet) {
        this.idQlqDuyet = idQlqDuyet;
    }

    public String getIdQlqMoichitien() {
        return idQlqMoichitien;
    }

    public void setIdQlqMoichitien(String idQlqMoichitien) {
        this.idQlqMoichitien = idQlqMoichitien;
    }

    public String getIdQlqNhandutien() {
        return idQlqNhandutien;
    }

    public void setIdQlqNhandutien(String idQlqNhandutien) {
        this.idQlqNhandutien = idQlqNhandutien;
    }

    public Date getQlqNgaychuyenKsq() {
        return qlqNgaychuyenKsq;
    }

    public void setQlqNgaychuyenKsq(Date qlqNgaychuyenKsq) {
        this.qlqNgaychuyenKsq = qlqNgaychuyenKsq;
    }

    public Date getQlqNgayKsqDuyet() {
        return qlqNgayKsqDuyet;
    }

    public void setQlqNgayKsqDuyet(Date qlqNgayKsqDuyet) {
        this.qlqNgayKsqDuyet = qlqNgayKsqDuyet;
    }

    public Date getQlqNgayTquyMoi() {
        return qlqNgayTquyMoi;
    }

    public void setQlqNgayTquyMoi(Date qlqNgayTquyMoi) {
        this.qlqNgayTquyMoi = qlqNgayTquyMoi;
    }

    public Date getQlqNgayTquyNhandutien() {
        return qlqNgayTquyNhandutien;
    }

    public void setQlqNgayTquyNhandutien(Date qlqNgayTquyNhandutien) {
        this.qlqNgayTquyNhandutien = qlqNgayTquyNhandutien;
    }

    public String getIdNvXacnhandutien() {
        return idNvXacnhandutien;
    }

    public void setIdNvXacnhandutien(String idNvXacnhandutien) {
        this.idNvXacnhandutien = idNvXacnhandutien;
    }

    public Date getQlqNgayNvchinhaNhandu() {
        return qlqNgayNvchinhaNhandu;
    }

    public void setQlqNgayNvchinhaNhandu(Date qlqNgayNvchinhaNhandu) {
        this.qlqNgayNvchinhaNhandu = qlqNgayNvchinhaNhandu;
    }

    public String getMakerId() {
        return makerId;
    }

    public void setMakerId(String makerId) {
        this.makerId = makerId;
    }

    public Date getQlqNgayTao() {
        return qlqNgayTao;
    }

    public void setQlqNgayTao(Date qlqNgayTao) {
        this.qlqNgayTao = qlqNgayTao;
    }

    public String getQlqDain() {
        return qlqDain;
    }

    public void setQlqDain(String qlqDain) {
        this.qlqDain = qlqDain;
    }

    public BigInteger getQlqSolanin() {
        return qlqSolanin;
    }

    public void setQlqSolanin(BigInteger qlqSolanin) {
        this.qlqSolanin = qlqSolanin;
    }

    public String getIdNvDuyet() {
        return idNvDuyet;
    }

    public void setIdNvDuyet(String idNvDuyet) {
        this.idNvDuyet = idNvDuyet;
    }

    public String getMaNguoinhan() {
        return maNguoinhan;
    }

    public void setMaNguoinhan(String maNguoinhan) {
        this.maNguoinhan = maNguoinhan;
    }

    public BigInteger getShs() {
        return shs;
    }

    public void setShs(BigInteger shs) {
        this.shs = shs;
    }

    public BigInteger getAud() {
        return aud;
    }

    public void setAud(BigInteger aud) {
        this.aud = aud;
    }

    public BigInteger getCad() {
        return cad;
    }

    public void setCad(BigInteger cad) {
        this.cad = cad;
    }

    public BigInteger getUsd() {
        return usd;
    }

    public void setUsd(BigInteger usd) {
        this.usd = usd;
    }

    public BigInteger getEur() {
        return eur;
    }

    public void setEur(BigInteger eur) {
        this.eur = eur;
    }

    public BigInteger getGbp() {
        return gbp;
    }

    public void setGbp(BigInteger gbp) {
        this.gbp = gbp;
    }

    public BigInteger getVnd() {
        return vnd;
    }

    public void setVnd(BigInteger vnd) {
        this.vnd = vnd;
    }

    public String getIdChinhanh() {
        return idChinhanh;
    }

    public void setIdChinhanh(String idChinhanh) {
        this.idChinhanh = idChinhanh;
    }

    public String getIdTquy() {
        return idTquy;
    }

    public void setIdTquy(String idTquy) {
        this.idTquy = idTquy;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCode != null ? idCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof QlqQlyDotNhanhs)) {
            return false;
        }
        QlqQlyDotNhanhs other = (QlqQlyDotNhanhs) object;
        if ((this.idCode == null && other.idCode != null) || (this.idCode != null && !this.idCode.equals(other.idCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EntitiesBean.QlqQlyDotNhanhs[ idCode=" + idCode + " ]";
    }
    
}
