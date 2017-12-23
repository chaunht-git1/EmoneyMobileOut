/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entitieskhout;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
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
 * @author chaunht
 */
@Entity
@Table(name = "DM_XACMINH_TODAY")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmXacminhToday.findAll", query = "SELECT d FROM DmXacminhToday d")
    , @NamedQuery(name = "DmXacminhToday.findByKhoa", query = "SELECT d FROM DmXacminhToday d WHERE d.khoa = :khoa")
    , @NamedQuery(name = "DmXacminhToday.findByNoidungxm", query = "SELECT d FROM DmXacminhToday d WHERE d.noidungxm = :noidungxm")
    , @NamedQuery(name = "DmXacminhToday.findByFileno", query = "SELECT d FROM DmXacminhToday d WHERE d.fileno = :fileno")
    , @NamedQuery(name = "DmXacminhToday.findByKiemtra", query = "SELECT d FROM DmXacminhToday d WHERE d.kiemtra = :kiemtra")
    , @NamedQuery(name = "DmXacminhToday.findByIdNvKt", query = "SELECT d FROM DmXacminhToday d WHERE d.idNvKt = :idNvKt")
    , @NamedQuery(name = "DmXacminhToday.findByNgayKt", query = "SELECT d FROM DmXacminhToday d WHERE d.ngayKt = :ngayKt")
    , @NamedQuery(name = "DmXacminhToday.findByDotbn", query = "SELECT d FROM DmXacminhToday d WHERE d.dotbn = :dotbn")
    , @NamedQuery(name = "DmXacminhToday.findByDateModified", query = "SELECT d FROM DmXacminhToday d WHERE d.dateModified = :dateModified")
    , @NamedQuery(name = "DmXacminhToday.findByIdDoitac", query = "SELECT d FROM DmXacminhToday d WHERE d.idDoitac = :idDoitac")
    , @NamedQuery(name = "DmXacminhToday.findByMaNguoinhan", query = "SELECT d FROM DmXacminhToday d WHERE d.maNguoinhan = :maNguoinhan")
    , @NamedQuery(name = "DmXacminhToday.findByMarkerId", query = "SELECT d FROM DmXacminhToday d WHERE d.markerId = :markerId")
    , @NamedQuery(name = "DmXacminhToday.findByNgayBiennhan", query = "SELECT d FROM DmXacminhToday d WHERE d.ngayBiennhan = :ngayBiennhan")
    , @NamedQuery(name = "DmXacminhToday.findByIdChinhanh", query = "SELECT d FROM DmXacminhToday d WHERE d.idChinhanh = :idChinhanh")
    , @NamedQuery(name = "DmXacminhToday.findBySophieu", query = "SELECT d FROM DmXacminhToday d WHERE d.sophieu = :sophieu")
    , @NamedQuery(name = "DmXacminhToday.findByStt", query = "SELECT d FROM DmXacminhToday d WHERE d.stt = :stt")
    , @NamedQuery(name = "DmXacminhToday.findByIdCtTuythan", query = "SELECT d FROM DmXacminhToday d WHERE d.idCtTuythan = :idCtTuythan")
    , @NamedQuery(name = "DmXacminhToday.findBySoCtTuythan", query = "SELECT d FROM DmXacminhToday d WHERE d.soCtTuythan = :soCtTuythan")
    , @NamedQuery(name = "DmXacminhToday.findByIdNvChitra", query = "SELECT d FROM DmXacminhToday d WHERE d.idNvChitra = :idNvChitra")
    , @NamedQuery(name = "DmXacminhToday.findBySobn", query = "SELECT d FROM DmXacminhToday d WHERE d.sobn = :sobn")
    , @NamedQuery(name = "DmXacminhToday.findByIderror", query = "SELECT d FROM DmXacminhToday d WHERE d.iderror = :iderror")
    , @NamedQuery(name = "DmXacminhToday.findByIdLoaixm", query = "SELECT d FROM DmXacminhToday d WHERE d.idLoaixm = :idLoaixm")
    , @NamedQuery(name = "DmXacminhToday.findByTrangthai", query = "SELECT d FROM DmXacminhToday d WHERE d.trangthai = :trangthai")})
public class DmXacminhToday implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "KHOA")
    private String khoa;
    @Size(max = 1000)
    @Column(name = "NOIDUNGXM")
    private String noidungxm;
    @Lob
    @Column(name = "HINH_BN")
    private Serializable hinhBn;
    @Column(name = "FILENO")
    private BigInteger fileno;
    @Size(max = 1)
    @Column(name = "KIEMTRA")
    private String kiemtra;
    @Size(max = 20)
    @Column(name = "ID_NV_KT")
    private String idNvKt;
    @Column(name = "NGAY_KT")
    @Temporal(TemporalType.DATE)
    private Date ngayKt;
    @Size(max = 200)
    @Column(name = "DOTBN")
    private String dotbn;
    @Column(name = "DATE_MODIFIED")
    @Temporal(TemporalType.DATE)
    private Date dateModified;
    @Size(max = 20)
    @Column(name = "ID_DOITAC")
    private String idDoitac;
    @Size(max = 20)
    @Column(name = "MA_NGUOINHAN")
    private String maNguoinhan;
    @Size(max = 20)
    @Column(name = "MARKER_ID")
    private String markerId;
    @Column(name = "NGAY_BIENNHAN")
    @Temporal(TemporalType.DATE)
    private Date ngayBiennhan;
    @Size(max = 40)
    @Column(name = "ID_CHINHANH")
    private String idChinhanh;
    @Size(max = 60)
    @Column(name = "SOPHIEU")
    private String sophieu;
    @Column(name = "STT")
    private BigInteger stt;
    @Size(max = 60)
    @Column(name = "ID_CT_TUYTHAN")
    private String idCtTuythan;
    @Size(max = 60)
    @Column(name = "SO_CT_TUYTHAN")
    private String soCtTuythan;
    @Size(max = 60)
    @Column(name = "ID_NV_CHITRA")
    private String idNvChitra;
    @Size(max = 40)
    @Column(name = "SOBN")
    private String sobn;
    @Size(max = 1)
    @Column(name = "IDERROR")
    private String iderror;
    @Size(max = 40)
    @Column(name = "ID_LOAIXM")
    private String idLoaixm;
    @Size(max = 1)
    @Column(name = "TRANGTHAI")
    private String trangthai;

    public DmXacminhToday() {
    }

    public DmXacminhToday(String khoa) {
        this.khoa = khoa;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public String getNoidungxm() {
        return noidungxm;
    }

    public void setNoidungxm(String noidungxm) {
        this.noidungxm = noidungxm;
    }

    public Serializable getHinhBn() {
        return hinhBn;
    }

    public void setHinhBn(Serializable hinhBn) {
        this.hinhBn = hinhBn;
    }

    public BigInteger getFileno() {
        return fileno;
    }

    public void setFileno(BigInteger fileno) {
        this.fileno = fileno;
    }

    public String getKiemtra() {
        return kiemtra;
    }

    public void setKiemtra(String kiemtra) {
        this.kiemtra = kiemtra;
    }

    public String getIdNvKt() {
        return idNvKt;
    }

    public void setIdNvKt(String idNvKt) {
        this.idNvKt = idNvKt;
    }

    public Date getNgayKt() {
        return ngayKt;
    }

    public void setNgayKt(Date ngayKt) {
        this.ngayKt = ngayKt;
    }

    public String getDotbn() {
        return dotbn;
    }

    public void setDotbn(String dotbn) {
        this.dotbn = dotbn;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    public String getIdDoitac() {
        return idDoitac;
    }

    public void setIdDoitac(String idDoitac) {
        this.idDoitac = idDoitac;
    }

    public String getMaNguoinhan() {
        return maNguoinhan;
    }

    public void setMaNguoinhan(String maNguoinhan) {
        this.maNguoinhan = maNguoinhan;
    }

    public String getMarkerId() {
        return markerId;
    }

    public void setMarkerId(String markerId) {
        this.markerId = markerId;
    }

    public Date getNgayBiennhan() {
        return ngayBiennhan;
    }

    public void setNgayBiennhan(Date ngayBiennhan) {
        this.ngayBiennhan = ngayBiennhan;
    }

    public String getIdChinhanh() {
        return idChinhanh;
    }

    public void setIdChinhanh(String idChinhanh) {
        this.idChinhanh = idChinhanh;
    }

    public String getSophieu() {
        return sophieu;
    }

    public void setSophieu(String sophieu) {
        this.sophieu = sophieu;
    }

    public BigInteger getStt() {
        return stt;
    }

    public void setStt(BigInteger stt) {
        this.stt = stt;
    }

    public String getIdCtTuythan() {
        return idCtTuythan;
    }

    public void setIdCtTuythan(String idCtTuythan) {
        this.idCtTuythan = idCtTuythan;
    }

    public String getSoCtTuythan() {
        return soCtTuythan;
    }

    public void setSoCtTuythan(String soCtTuythan) {
        this.soCtTuythan = soCtTuythan;
    }

    public String getIdNvChitra() {
        return idNvChitra;
    }

    public void setIdNvChitra(String idNvChitra) {
        this.idNvChitra = idNvChitra;
    }

    public String getSobn() {
        return sobn;
    }

    public void setSobn(String sobn) {
        this.sobn = sobn;
    }

    public String getIderror() {
        return iderror;
    }

    public void setIderror(String iderror) {
        this.iderror = iderror;
    }

    public String getIdLoaixm() {
        return idLoaixm;
    }

    public void setIdLoaixm(String idLoaixm) {
        this.idLoaixm = idLoaixm;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
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
        if (!(object instanceof DmXacminhToday)) {
            return false;
        }
        DmXacminhToday other = (DmXacminhToday) object;
        if ((this.khoa == null && other.khoa != null) || (this.khoa != null && !this.khoa.equals(other.khoa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entitieskhout.DmXacminhToday[ khoa=" + khoa + " ]";
    }
    
}
