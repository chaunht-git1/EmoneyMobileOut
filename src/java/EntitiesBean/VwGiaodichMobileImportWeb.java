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
@Table(name = "VW_GIAODICH_MOBILE_IMPORT_WEB")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwGiaodichMobileImportWeb.findAll", query = "SELECT v FROM VwGiaodichMobileImportWeb v"),
    @NamedQuery(name = "VwGiaodichMobileImportWeb.findByIdCode", query = "SELECT v FROM VwGiaodichMobileImportWeb v WHERE v.idCode = :idCode"),
    @NamedQuery(name = "VwGiaodichMobileImportWeb.findBySobn", query = "SELECT v FROM VwGiaodichMobileImportWeb v WHERE v.sobn = :sobn"),
    @NamedQuery(name = "VwGiaodichMobileImportWeb.findByIdDotData", query = "SELECT v FROM VwGiaodichMobileImportWeb v WHERE v.idDotData = :idDotData"),
    @NamedQuery(name = "VwGiaodichMobileImportWeb.findByHoten", query = "SELECT v FROM VwGiaodichMobileImportWeb v WHERE v.hoten = :hoten"),
    @NamedQuery(name = "VwGiaodichMobileImportWeb.findByMaNguoinhan", query = "SELECT v FROM VwGiaodichMobileImportWeb v WHERE v.maNguoinhan = :maNguoinhan"),
    @NamedQuery(name = "VwGiaodichMobileImportWeb.findByNguoigoi", query = "SELECT v FROM VwGiaodichMobileImportWeb v WHERE v.nguoigoi = :nguoigoi"),
    @NamedQuery(name = "VwGiaodichMobileImportWeb.findByMaKhachhang", query = "SELECT v FROM VwGiaodichMobileImportWeb v WHERE v.maKhachhang = :maKhachhang"),
    @NamedQuery(name = "VwGiaodichMobileImportWeb.findByIdLoaitienchitra", query = "SELECT v FROM VwGiaodichMobileImportWeb v WHERE v.idLoaitienchitra = :idLoaitienchitra"),
    @NamedQuery(name = "VwGiaodichMobileImportWeb.findByIdLoaitiengoi", query = "SELECT v FROM VwGiaodichMobileImportWeb v WHERE v.idLoaitiengoi = :idLoaitiengoi"),
    @NamedQuery(name = "VwGiaodichMobileImportWeb.findBySotiengoi", query = "SELECT v FROM VwGiaodichMobileImportWeb v WHERE v.sotiengoi = :sotiengoi"),
    @NamedQuery(name = "VwGiaodichMobileImportWeb.findByTygia", query = "SELECT v FROM VwGiaodichMobileImportWeb v WHERE v.tygia = :tygia"),
    @NamedQuery(name = "VwGiaodichMobileImportWeb.findByThanhtien", query = "SELECT v FROM VwGiaodichMobileImportWeb v WHERE v.thanhtien = :thanhtien"),
    @NamedQuery(name = "VwGiaodichMobileImportWeb.findByDiachi", query = "SELECT v FROM VwGiaodichMobileImportWeb v WHERE v.diachi = :diachi"),
    @NamedQuery(name = "VwGiaodichMobileImportWeb.findByDachitra", query = "SELECT v FROM VwGiaodichMobileImportWeb v WHERE v.dachitra = :dachitra"),
    @NamedQuery(name = "VwGiaodichMobileImportWeb.findByDahoibao", query = "SELECT v FROM VwGiaodichMobileImportWeb v WHERE v.dahoibao = :dahoibao"),
    @NamedQuery(name = "VwGiaodichMobileImportWeb.findByIdNvHoibao", query = "SELECT v FROM VwGiaodichMobileImportWeb v WHERE v.idNvHoibao = :idNvHoibao"),
    @NamedQuery(name = "VwGiaodichMobileImportWeb.findByNgayHoibao", query = "SELECT v FROM VwGiaodichMobileImportWeb v WHERE v.ngayHoibao = :ngayHoibao"),
    @NamedQuery(name = "VwGiaodichMobileImportWeb.findByXacminh", query = "SELECT v FROM VwGiaodichMobileImportWeb v WHERE v.xacminh = :xacminh"),
    @NamedQuery(name = "VwGiaodichMobileImportWeb.findByLydoxacminh", query = "SELECT v FROM VwGiaodichMobileImportWeb v WHERE v.lydoxacminh = :lydoxacminh"),
    @NamedQuery(name = "VwGiaodichMobileImportWeb.findByIdNvChitra", query = "SELECT v FROM VwGiaodichMobileImportWeb v WHERE v.idNvChitra = :idNvChitra"),
    @NamedQuery(name = "VwGiaodichMobileImportWeb.findByIdChinhanh", query = "SELECT v FROM VwGiaodichMobileImportWeb v WHERE v.idChinhanh = :idChinhanh"),
    @NamedQuery(name = "VwGiaodichMobileImportWeb.findBySophieu", query = "SELECT v FROM VwGiaodichMobileImportWeb v WHERE v.sophieu = :sophieu"),
    @NamedQuery(name = "VwGiaodichMobileImportWeb.findByDienthoai", query = "SELECT v FROM VwGiaodichMobileImportWeb v WHERE v.dienthoai = :dienthoai"),
    @NamedQuery(name = "VwGiaodichMobileImportWeb.findByGhichuGoi", query = "SELECT v FROM VwGiaodichMobileImportWeb v WHERE v.ghichuGoi = :ghichuGoi")})
public class VwGiaodichMobileImportWeb implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "STT")
    private BigInteger stt;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(max = 80)
    @Column(name = "ID_CODE")
    private String idCode;
    @Column(name = "SOBN")
    private Long sobn;
    @Column(name = "ID_DOT_DATA")
    private BigInteger idDotData;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "HOTEN")
    private String hoten;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "MA_NGUOINHAN")
    private String maNguoinhan;
    @Size(max = 60)
    @Column(name = "NGUOIGOI")
    private String nguoigoi;
    @Size(max = 60)
    @Column(name = "MA_KHACHHANG")
    private String maKhachhang;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID_LOAITIENCHITRA")
    private String idLoaitienchitra;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID_LOAITIENGOI")
    private String idLoaitiengoi;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SOTIENGOI")
    private BigDecimal sotiengoi;
    @Column(name = "TYGIA")
    private BigDecimal tygia;
    @Column(name = "THANHTIEN")
    private BigDecimal thanhtien;
    @Size(max = 150)
    @Column(name = "DIACHI")
    private String diachi;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DACHITRA")
    private Character dachitra;
    @Size(max = 0)
    @Column(name = "DAHOIBAO")
    private String dahoibao;
    @Size(max = 0)
    @Column(name = "ID_NV_HOIBAO")
    private String idNvHoibao;
    @Column(name = "NGAY_HOIBAO")
    @Temporal(TemporalType.DATE)
    private Date ngayHoibao;
    @Column(name = "XACMINH")
    private Character xacminh;
    @Size(max = 0)
    @Column(name = "LYDOXACMINH")
    private String lydoxacminh;
    @Size(max = 20)
    @Column(name = "ID_NV_CHITRA")
    private String idNvChitra;
    @Size(max = 20)
    @Column(name = "ID_CHINHANH")
    private String idChinhanh;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "SOPHIEU")
    private String sophieu;
    @Size(max = 40)
    @Column(name = "DIENTHOAI")
    private String dienthoai;
    @Size(max = 400)
    @Column(name = "GHICHU_GOI")
    private String ghichuGoi;

    public VwGiaodichMobileImportWeb() {
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    public Long getSobn() {
        return sobn;
    }

    public void setSobn(Long sobn) {
        this.sobn = sobn;
    }

    public BigInteger getIdDotData() {
        return idDotData;
    }

    public void setIdDotData(BigInteger idDotData) {
        this.idDotData = idDotData;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getMaNguoinhan() {
        return maNguoinhan;
    }

    public void setMaNguoinhan(String maNguoinhan) {
        this.maNguoinhan = maNguoinhan;
    }

    public String getNguoigoi() {
        return nguoigoi;
    }

    public void setNguoigoi(String nguoigoi) {
        this.nguoigoi = nguoigoi;
    }

    public String getMaKhachhang() {
        return maKhachhang;
    }

    public void setMaKhachhang(String maKhachhang) {
        this.maKhachhang = maKhachhang;
    }

    public String getIdLoaitienchitra() {
        return idLoaitienchitra;
    }

    public void setIdLoaitienchitra(String idLoaitienchitra) {
        this.idLoaitienchitra = idLoaitienchitra;
    }

    public String getIdLoaitiengoi() {
        return idLoaitiengoi;
    }

    public void setIdLoaitiengoi(String idLoaitiengoi) {
        this.idLoaitiengoi = idLoaitiengoi;
    }

    public BigDecimal getSotiengoi() {
        return sotiengoi;
    }

    public void setSotiengoi(BigDecimal sotiengoi) {
        this.sotiengoi = sotiengoi;
    }

    public BigDecimal getTygia() {
        return tygia;
    }

    public void setTygia(BigDecimal tygia) {
        this.tygia = tygia;
    }

    public BigDecimal getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(BigDecimal thanhtien) {
        this.thanhtien = thanhtien;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public Character getDachitra() {
        return dachitra;
    }

    public void setDachitra(Character dachitra) {
        this.dachitra = dachitra;
    }

    public String getDahoibao() {
        return dahoibao;
    }

    public void setDahoibao(String dahoibao) {
        this.dahoibao = dahoibao;
    }

    public String getIdNvHoibao() {
        return idNvHoibao;
    }

    public void setIdNvHoibao(String idNvHoibao) {
        this.idNvHoibao = idNvHoibao;
    }

    public Date getNgayHoibao() {
        return ngayHoibao;
    }

    public void setNgayHoibao(Date ngayHoibao) {
        this.ngayHoibao = ngayHoibao;
    }

    public Character getXacminh() {
        return xacminh;
    }

    public void setXacminh(Character xacminh) {
        this.xacminh = xacminh;
    }

    public String getLydoxacminh() {
        return lydoxacminh;
    }

    public void setLydoxacminh(String lydoxacminh) {
        this.lydoxacminh = lydoxacminh;
    }

    public String getIdNvChitra() {
        return idNvChitra;
    }

    public void setIdNvChitra(String idNvChitra) {
        this.idNvChitra = idNvChitra;
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

    public String getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }

    public String getGhichuGoi() {
        return ghichuGoi;
    }

    public void setGhichuGoi(String ghichuGoi) {
        this.ghichuGoi = ghichuGoi;
    }

    public BigInteger getStt() {
        return stt;
    }

    public void setStt(BigInteger stt) {
        this.stt = stt;
    }
    
}
