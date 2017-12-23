/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

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
@Table(name = "VW_DM_QUANLYDOTIMAGECTIET_WEB")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwDmQuanlydotimagectietWeb.findAll", query = "SELECT v FROM VwDmQuanlydotimagectietWeb v"),
    @NamedQuery(name = "VwDmQuanlydotimagectietWeb.findByKhoa", query = "SELECT v FROM VwDmQuanlydotimagectietWeb v WHERE v.khoa = :khoa"),
    @NamedQuery(name = "VwDmQuanlydotimagectietWeb.findByMarkerId", query = "SELECT v FROM VwDmQuanlydotimagectietWeb v WHERE v.markerId = :markerId"),
    @NamedQuery(name = "VwDmQuanlydotimagectietWeb.findByIderror", query = "SELECT v FROM VwDmQuanlydotimagectietWeb v WHERE v.iderror = :iderror"),
    @NamedQuery(name = "VwDmQuanlydotimagectietWeb.findByDotbn", query = "SELECT v FROM VwDmQuanlydotimagectietWeb v WHERE v.dotbn = :dotbn"),
    @NamedQuery(name = "VwDmQuanlydotimagectietWeb.findByDateModified", query = "SELECT v FROM VwDmQuanlydotimagectietWeb v WHERE v.dateModified = :dateModified"),
    @NamedQuery(name = "VwDmQuanlydotimagectietWeb.findByNguoigoi", query = "SELECT v FROM VwDmQuanlydotimagectietWeb v WHERE v.nguoigoi = :nguoigoi"),
    @NamedQuery(name = "VwDmQuanlydotimagectietWeb.findByHoten", query = "SELECT v FROM VwDmQuanlydotimagectietWeb v WHERE v.hoten = :hoten"),
    @NamedQuery(name = "VwDmQuanlydotimagectietWeb.findBySoCtTuythan", query = "SELECT v FROM VwDmQuanlydotimagectietWeb v WHERE v.soCtTuythan = :soCtTuythan"),
    @NamedQuery(name = "VwDmQuanlydotimagectietWeb.findByMaNguoinhan", query = "SELECT v FROM VwDmQuanlydotimagectietWeb v WHERE v.maNguoinhan = :maNguoinhan"),
    @NamedQuery(name = "VwDmQuanlydotimagectietWeb.findBySobn", query = "SELECT v FROM VwDmQuanlydotimagectietWeb v WHERE v.sobn = :sobn"),
    @NamedQuery(name = "VwDmQuanlydotimagectietWeb.findByIdChinhanh", query = "SELECT v FROM VwDmQuanlydotimagectietWeb v WHERE v.idChinhanh = :idChinhanh"),
    @NamedQuery(name = "VwDmQuanlydotimagectietWeb.findBySophieu", query = "SELECT v FROM VwDmQuanlydotimagectietWeb v WHERE v.sophieu = :sophieu"),
    @NamedQuery(name = "VwDmQuanlydotimagectietWeb.findByStt", query = "SELECT v FROM VwDmQuanlydotimagectietWeb v WHERE v.stt = :stt"),
    @NamedQuery(name = "VwDmQuanlydotimagectietWeb.findByIdNvChitra", query = "SELECT v FROM VwDmQuanlydotimagectietWeb v WHERE v.idNvChitra = :idNvChitra"),
    @NamedQuery(name = "VwDmQuanlydotimagectietWeb.findByDachitra", query = "SELECT v FROM VwDmQuanlydotimagectietWeb v WHERE v.dachitra = :dachitra"),
    @NamedQuery(name = "VwDmQuanlydotimagectietWeb.findByKiemtra", query = "SELECT v FROM VwDmQuanlydotimagectietWeb v WHERE v.kiemtra = :kiemtra"),
    @NamedQuery(name = "VwDmQuanlydotimagectietWeb.findByBiennhan", query = "SELECT v FROM VwDmQuanlydotimagectietWeb v WHERE v.biennhan = :biennhan"),
    @NamedQuery(name = "VwDmQuanlydotimagectietWeb.findByNgayBiennhan", query = "SELECT v FROM VwDmQuanlydotimagectietWeb v WHERE v.ngayBiennhan = :ngayBiennhan")})
public class VwDmQuanlydotimagectietWeb implements Serializable {
    @Size(max = 1)
    @Column(name = "DACHITRA")
    private String dachitra;
    @Size(max = 1000)
    @Column(name = "NOIDUNGXM")
    private String noidungxm;
    @Size(max = 206)
    @Column(name = "KHOATONG")
    private String khoatong;
    @Size(max = 20)
    @Column(name = "ID_DOITAC")
    private String idDoitac;
    @Size(max = 60)
    @Column(name = "ID_CT_TUYTHAN")
    private String idCtTuythan;
    @Column(name = "SOBN")
    private BigInteger sobn;
    @Size(max = 6)
    @Column(name = "DESERROR")
    private String deserror;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "KHOA")
    private String khoa;
    @Size(max = 20)
    @Column(name = "MARKER_ID")
    private String markerId;
    @Size(max = 1)
    @Column(name = "IDERROR")
    private String iderror;
    @Size(max = 200)
    @Column(name = "DOTBN")
    private String dotbn;
    @Column(name = "DATE_MODIFIED")
    @Temporal(TemporalType.DATE)
    private Date dateModified;
    @Size(max = 60)
    @Column(name = "NGUOIGOI")
    private String nguoigoi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "HOTEN")
    private String hoten;
    @Size(max = 20)
    @Column(name = "SO_CT_TUYTHAN")
    private String soCtTuythan;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "MA_NGUOINHAN")
    private String maNguoinhan;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID_CHINHANH")
    private String idChinhanh;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "SOPHIEU")
    private String sophieu;
    @Basic(optional = false)
    @NotNull
    @Column(name = "STT")
    private BigInteger stt;
    @Size(max = 20)
    @Column(name = "ID_NV_CHITRA")
    private String idNvChitra;
    @Size(max = 1)
    @Column(name = "KIEMTRA")
    private String kiemtra;
    @Size(max = 1)
    @Column(name = "BIENNHAN")
    private String biennhan;
    @Column(name = "NGAY_BIENNHAN")
    @Temporal(TemporalType.DATE)
    private Date ngayBiennhan;

    public VwDmQuanlydotimagectietWeb() {
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public String getMarkerId() {
        return markerId;
    }

    public void setMarkerId(String markerId) {
        this.markerId = markerId;
    }

    public String getIderror() {
        return iderror;
    }

    public void setIderror(String iderror) {
        this.iderror = iderror;
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

    public String getNguoigoi() {
        return nguoigoi;
    }

    public void setNguoigoi(String nguoigoi) {
        this.nguoigoi = nguoigoi;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getSoCtTuythan() {
        return soCtTuythan;
    }

    public void setSoCtTuythan(String soCtTuythan) {
        this.soCtTuythan = soCtTuythan;
    }

    public String getMaNguoinhan() {
        return maNguoinhan;
    }

    public void setMaNguoinhan(String maNguoinhan) {
        this.maNguoinhan = maNguoinhan;
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

    public String getIdNvChitra() {
        return idNvChitra;
    }

    public void setIdNvChitra(String idNvChitra) {
        this.idNvChitra = idNvChitra;
    }


    public String getKiemtra() {
        return kiemtra;
    }

    public void setKiemtra(String kiemtra) {
        this.kiemtra = kiemtra;
    }

    public String getBiennhan() {
        return biennhan;
    }

    public void setBiennhan(String biennhan) {
        this.biennhan = biennhan;
    }

    public Date getNgayBiennhan() {
        return ngayBiennhan;
    }

    public void setNgayBiennhan(Date ngayBiennhan) {
        this.ngayBiennhan = ngayBiennhan;
    }

    public BigInteger getSobn() {
        return sobn;
    }

    public void setSobn(BigInteger sobn) {
        this.sobn = sobn;
    }

    public String getDeserror() {
        return deserror;
    }

    public void setDeserror(String deserror) {
        this.deserror = deserror;
    }

    public String getKhoatong() {
        return khoatong;
    }

    public void setKhoatong(String khoatong) {
        this.khoatong = khoatong;
    }

    public String getIdDoitac() {
        return idDoitac;
    }

    public void setIdDoitac(String idDoitac) {
        this.idDoitac = idDoitac;
    }

    public String getIdCtTuythan() {
        return idCtTuythan;
    }

    public void setIdCtTuythan(String idCtTuythan) {
        this.idCtTuythan = idCtTuythan;
    }

    public String getDachitra() {
        return dachitra;
    }

    public void setDachitra(String dachitra) {
        this.dachitra = dachitra;
    }

    public String getNoidungxm() {
        return noidungxm;
    }

    public void setNoidungxm(String noidungxm) {
        this.noidungxm = noidungxm;
    }
    
}
