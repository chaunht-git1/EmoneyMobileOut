/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntitiesBean;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "QLDS_NHATKY_PHATSINH")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "QldsNhatkyPhatsinh.findAll", query = "SELECT q FROM QldsNhatkyPhatsinh q"),
    @NamedQuery(name = "QldsNhatkyPhatsinh.findByMaQlds", query = "SELECT q FROM QldsNhatkyPhatsinh q WHERE q.maQlds = :maQlds"),
    @NamedQuery(name = "QldsNhatkyPhatsinh.findByIdLoaitien", query = "SELECT q FROM QldsNhatkyPhatsinh q WHERE q.idLoaitien = :idLoaitien"),
    @NamedQuery(name = "QldsNhatkyPhatsinh.findByIdDoitac", query = "SELECT q FROM QldsNhatkyPhatsinh q WHERE q.idDoitac = :idDoitac"),
    @NamedQuery(name = "QldsNhatkyPhatsinh.findByTenDoitac", query = "SELECT q FROM QldsNhatkyPhatsinh q WHERE q.tenDoitac = :tenDoitac"),
    @NamedQuery(name = "QldsNhatkyPhatsinh.findBySoduyetds", query = "SELECT q FROM QldsNhatkyPhatsinh q WHERE q.soduyetds = :soduyetds"),
    @NamedQuery(name = "QldsNhatkyPhatsinh.findBySodudauky", query = "SELECT q FROM QldsNhatkyPhatsinh q WHERE q.sodudauky = :sodudauky"),
    @NamedQuery(name = "QldsNhatkyPhatsinh.findBySotienDs", query = "SELECT q FROM QldsNhatkyPhatsinh q WHERE q.sotienDs = :sotienDs"),
    @NamedQuery(name = "QldsNhatkyPhatsinh.findByChuyenkhoan", query = "SELECT q FROM QldsNhatkyPhatsinh q WHERE q.chuyenkhoan = :chuyenkhoan"),
    @NamedQuery(name = "QldsNhatkyPhatsinh.findBySotonThuc", query = "SELECT q FROM QldsNhatkyPhatsinh q WHERE q.sotonThuc = :sotonThuc"),
    @NamedQuery(name = "QldsNhatkyPhatsinh.findByChitraTam", query = "SELECT q FROM QldsNhatkyPhatsinh q WHERE q.chitraTam = :chitraTam"),
    @NamedQuery(name = "QldsNhatkyPhatsinh.findBySodutam", query = "SELECT q FROM QldsNhatkyPhatsinh q WHERE q.sodutam = :sodutam"),
    @NamedQuery(name = "QldsNhatkyPhatsinh.findByDuyet", query = "SELECT q FROM QldsNhatkyPhatsinh q WHERE q.duyet = :duyet"),
    @NamedQuery(name = "QldsNhatkyPhatsinh.findBySotienDsDuyet", query = "SELECT q FROM QldsNhatkyPhatsinh q WHERE q.sotienDsDuyet = :sotienDsDuyet"),
    @NamedQuery(name = "QldsNhatkyPhatsinh.findByMaQldsC2", query = "SELECT q FROM QldsNhatkyPhatsinh q WHERE q.maQldsC2 = :maQldsC2"),
    @NamedQuery(name = "QldsNhatkyPhatsinh.findByHanmuc", query = "SELECT q FROM QldsNhatkyPhatsinh q WHERE q.hanmuc = :hanmuc"),
    @NamedQuery(name = "QldsNhatkyPhatsinh.findBySoduyetDs2", query = "SELECT q FROM QldsNhatkyPhatsinh q WHERE q.soduyetDs2 = :soduyetDs2"),
    @NamedQuery(name = "QldsNhatkyPhatsinh.findByHhQuay", query = "SELECT q FROM QldsNhatkyPhatsinh q WHERE q.hhQuay = :hhQuay"),
    @NamedQuery(name = "QldsNhatkyPhatsinh.findByHhNha", query = "SELECT q FROM QldsNhatkyPhatsinh q WHERE q.hhNha = :hhNha"),
    @NamedQuery(name = "QldsNhatkyPhatsinh.findBySotienTt", query = "SELECT q FROM QldsNhatkyPhatsinh q WHERE q.sotienTt = :sotienTt"),
    @NamedQuery(name = "QldsNhatkyPhatsinh.findByLayvay", query = "SELECT q FROM QldsNhatkyPhatsinh q WHERE q.layvay = :layvay"),
    @NamedQuery(name = "QldsNhatkyPhatsinh.findBySoduyetDs3", query = "SELECT q FROM QldsNhatkyPhatsinh q WHERE q.soduyetDs3 = :soduyetDs3"),
    @NamedQuery(name = "QldsNhatkyPhatsinh.findByKeyphatsinh", query = "SELECT q FROM QldsNhatkyPhatsinh q WHERE q.keyphatsinh = :keyphatsinh"),
    @NamedQuery(name = "QldsNhatkyPhatsinh.findByNgaynk", query = "SELECT q FROM QldsNhatkyPhatsinh q WHERE q.ngaynk = :ngaynk")})
public class QldsNhatkyPhatsinh implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "MA_QLDS")
    private String maQlds;
    @Size(max = 20)
    @Column(name = "ID_LOAITIEN")
    private String idLoaitien;
    @Size(max = 20)
    @Column(name = "ID_DOITAC")
    private String idDoitac;
    @Size(max = 200)
    @Column(name = "TEN_DOITAC")
    private String tenDoitac;
    @Column(name = "SODUYETDS")
    private BigInteger soduyetds;
    @Column(name = "SODUDAUKY")
    private BigInteger sodudauky;
    @Column(name = "SOTIEN_DS")
    private BigInteger sotienDs;
    @Column(name = "CHUYENKHOAN")
    private BigInteger chuyenkhoan;
    @Column(name = "SOTON_THUC")
    private BigInteger sotonThuc;
    @Column(name = "CHITRA_TAM")
    private BigInteger chitraTam;
    @Column(name = "SODUTAM")
    private BigInteger sodutam;
    @Size(max = 1)
    @Column(name = "DUYET")
    private String duyet;
    @Column(name = "SOTIEN_DS_DUYET")
    private BigInteger sotienDsDuyet;
    @Size(max = 20)
    @Column(name = "MA_QLDS_C2")
    private String maQldsC2;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "HANMUC")
    private BigDecimal hanmuc;
    @Column(name = "SODUYET_DS_2")
    private BigDecimal soduyetDs2;
    @Column(name = "HH_QUAY")
    private BigDecimal hhQuay;
    @Column(name = "HH_NHA")
    private BigDecimal hhNha;
    @Column(name = "SOTIEN_TT")
    private BigDecimal sotienTt;
    @Column(name = "LAYVAY")
    private BigDecimal layvay;
    @Column(name = "SODUYET_DS_3")
    private BigDecimal soduyetDs3;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "KEYPHATSINH")
    private String keyphatsinh;
    @Column(name = "NGAYNK")
    @Temporal(TemporalType.DATE)
    private Date ngaynk;

    public QldsNhatkyPhatsinh() {
    }

    public QldsNhatkyPhatsinh(String keyphatsinh) {
        this.keyphatsinh = keyphatsinh;
    }

    public QldsNhatkyPhatsinh(String keyphatsinh, String maQlds) {
        this.keyphatsinh = keyphatsinh;
        this.maQlds = maQlds;
    }

    public String getMaQlds() {
        return maQlds;
    }

    public void setMaQlds(String maQlds) {
        this.maQlds = maQlds;
    }

    public String getIdLoaitien() {
        return idLoaitien;
    }

    public void setIdLoaitien(String idLoaitien) {
        this.idLoaitien = idLoaitien;
    }

    public String getIdDoitac() {
        return idDoitac;
    }

    public void setIdDoitac(String idDoitac) {
        this.idDoitac = idDoitac;
    }

    public String getTenDoitac() {
        return tenDoitac;
    }

    public void setTenDoitac(String tenDoitac) {
        this.tenDoitac = tenDoitac;
    }

    public BigInteger getSoduyetds() {
        return soduyetds;
    }

    public void setSoduyetds(BigInteger soduyetds) {
        this.soduyetds = soduyetds;
    }

    public BigInteger getSodudauky() {
        return sodudauky;
    }

    public void setSodudauky(BigInteger sodudauky) {
        this.sodudauky = sodudauky;
    }

    public BigInteger getSotienDs() {
        return sotienDs;
    }

    public void setSotienDs(BigInteger sotienDs) {
        this.sotienDs = sotienDs;
    }

    public BigInteger getChuyenkhoan() {
        return chuyenkhoan;
    }

    public void setChuyenkhoan(BigInteger chuyenkhoan) {
        this.chuyenkhoan = chuyenkhoan;
    }

    public BigInteger getSotonThuc() {
        return sotonThuc;
    }

    public void setSotonThuc(BigInteger sotonThuc) {
        this.sotonThuc = sotonThuc;
    }

    public BigInteger getChitraTam() {
        return chitraTam;
    }

    public void setChitraTam(BigInteger chitraTam) {
        this.chitraTam = chitraTam;
    }

    public BigInteger getSodutam() {
        return sodutam;
    }

    public void setSodutam(BigInteger sodutam) {
        this.sodutam = sodutam;
    }

    public String getDuyet() {
        return duyet;
    }

    public void setDuyet(String duyet) {
        this.duyet = duyet;
    }

    public BigInteger getSotienDsDuyet() {
        return sotienDsDuyet;
    }

    public void setSotienDsDuyet(BigInteger sotienDsDuyet) {
        this.sotienDsDuyet = sotienDsDuyet;
    }

    public String getMaQldsC2() {
        return maQldsC2;
    }

    public void setMaQldsC2(String maQldsC2) {
        this.maQldsC2 = maQldsC2;
    }

    public BigDecimal getHanmuc() {
        return hanmuc;
    }

    public void setHanmuc(BigDecimal hanmuc) {
        this.hanmuc = hanmuc;
    }

    public BigDecimal getSoduyetDs2() {
        return soduyetDs2;
    }

    public void setSoduyetDs2(BigDecimal soduyetDs2) {
        this.soduyetDs2 = soduyetDs2;
    }

    public BigDecimal getHhQuay() {
        return hhQuay;
    }

    public void setHhQuay(BigDecimal hhQuay) {
        this.hhQuay = hhQuay;
    }

    public BigDecimal getHhNha() {
        return hhNha;
    }

    public void setHhNha(BigDecimal hhNha) {
        this.hhNha = hhNha;
    }

    public BigDecimal getSotienTt() {
        return sotienTt;
    }

    public void setSotienTt(BigDecimal sotienTt) {
        this.sotienTt = sotienTt;
    }

    public BigDecimal getLayvay() {
        return layvay;
    }

    public void setLayvay(BigDecimal layvay) {
        this.layvay = layvay;
    }

    public BigDecimal getSoduyetDs3() {
        return soduyetDs3;
    }

    public void setSoduyetDs3(BigDecimal soduyetDs3) {
        this.soduyetDs3 = soduyetDs3;
    }

    public String getKeyphatsinh() {
        return keyphatsinh;
    }

    public void setKeyphatsinh(String keyphatsinh) {
        this.keyphatsinh = keyphatsinh;
    }

    public Date getNgaynk() {
        return ngaynk;
    }

    public void setNgaynk(Date ngaynk) {
        this.ngaynk = ngaynk;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (keyphatsinh != null ? keyphatsinh.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof QldsNhatkyPhatsinh)) {
            return false;
        }
        QldsNhatkyPhatsinh other = (QldsNhatkyPhatsinh) object;
        if ((this.keyphatsinh == null && other.keyphatsinh != null) || (this.keyphatsinh != null && !this.keyphatsinh.equals(other.keyphatsinh))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EntitiesBean.QldsNhatkyPhatsinh[ keyphatsinh=" + keyphatsinh + " ]";
    }
    
}
