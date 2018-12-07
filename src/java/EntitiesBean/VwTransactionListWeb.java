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
@Table(name = "VW_TRANSACTION_LIST_WEB")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwTransactionListWeb.findAll", query = "SELECT v FROM VwTransactionListWeb v"),
    @NamedQuery(name = "VwTransactionListWeb.findByIdCode", query = "SELECT v FROM VwTransactionListWeb v WHERE v.idCode = :idCode"),
    @NamedQuery(name = "VwTransactionListWeb.findByIdChinhanh", query = "SELECT v FROM VwTransactionListWeb v WHERE v.idChinhanh = :idChinhanh"),
    @NamedQuery(name = "VwTransactionListWeb.findBySophieu", query = "SELECT v FROM VwTransactionListWeb v WHERE v.sophieu = :sophieu"),
    @NamedQuery(name = "VwTransactionListWeb.findByStt", query = "SELECT v FROM VwTransactionListWeb v WHERE v.stt = :stt"),
    @NamedQuery(name = "VwTransactionListWeb.findByIdDotData", query = "SELECT v FROM VwTransactionListWeb v WHERE v.idDotData = :idDotData"),
    @NamedQuery(name = "VwTransactionListWeb.findByHoten", query = "SELECT v FROM VwTransactionListWeb v WHERE v.hoten = :hoten"),
    @NamedQuery(name = "VwTransactionListWeb.findByMaNguoinhan", query = "SELECT v FROM VwTransactionListWeb v WHERE v.maNguoinhan = :maNguoinhan"),
    @NamedQuery(name = "VwTransactionListWeb.findByNguoigoi", query = "SELECT v FROM VwTransactionListWeb v WHERE v.nguoigoi = :nguoigoi"),
    @NamedQuery(name = "VwTransactionListWeb.findByMaKhachhang", query = "SELECT v FROM VwTransactionListWeb v WHERE v.maKhachhang = :maKhachhang"),
    @NamedQuery(name = "VwTransactionListWeb.findByIdLoaitienchitra", query = "SELECT v FROM VwTransactionListWeb v WHERE v.idLoaitienchitra = :idLoaitienchitra"),
    @NamedQuery(name = "VwTransactionListWeb.findByIdLoaitiengoi", query = "SELECT v FROM VwTransactionListWeb v WHERE v.idLoaitiengoi = :idLoaitiengoi"),
    @NamedQuery(name = "VwTransactionListWeb.findByIdLoaicongno", query = "SELECT v FROM VwTransactionListWeb v WHERE v.idLoaicongno = :idLoaicongno"),
    @NamedQuery(name = "VwTransactionListWeb.findBySotiengoi", query = "SELECT v FROM VwTransactionListWeb v WHERE v.sotiengoi = :sotiengoi"),
    @NamedQuery(name = "VwTransactionListWeb.findByTygia", query = "SELECT v FROM VwTransactionListWeb v WHERE v.tygia = :tygia"),
    @NamedQuery(name = "VwTransactionListWeb.findByThanhtien", query = "SELECT v FROM VwTransactionListWeb v WHERE v.thanhtien = :thanhtien"),
    @NamedQuery(name = "VwTransactionListWeb.findByDiachi", query = "SELECT v FROM VwTransactionListWeb v WHERE v.diachi = :diachi"),
    @NamedQuery(name = "VwTransactionListWeb.findByIdDistrict", query = "SELECT v FROM VwTransactionListWeb v WHERE v.idDistrict = :idDistrict"),
    @NamedQuery(name = "VwTransactionListWeb.findByIdCity", query = "SELECT v FROM VwTransactionListWeb v WHERE v.idCity = :idCity"),
    @NamedQuery(name = "VwTransactionListWeb.findByTrangthaiout", query = "SELECT v FROM VwTransactionListWeb v WHERE v.trangthaiout = :trangthaiout"),
    @NamedQuery(name = "VwTransactionListWeb.findByDahoibaoout", query = "SELECT v FROM VwTransactionListWeb v WHERE v.dahoibaoout = :dahoibaoout"),
    @NamedQuery(name = "VwTransactionListWeb.findByXacminhout", query = "SELECT v FROM VwTransactionListWeb v WHERE v.xacminhout = :xacminhout"),
    @NamedQuery(name = "VwTransactionListWeb.findByIdCtTuythan", query = "SELECT v FROM VwTransactionListWeb v WHERE v.idCtTuythan = :idCtTuythan"),
    @NamedQuery(name = "VwTransactionListWeb.findBySoCtTuythan", query = "SELECT v FROM VwTransactionListWeb v WHERE v.soCtTuythan = :soCtTuythan"),
    @NamedQuery(name = "VwTransactionListWeb.findByNgaycap", query = "SELECT v FROM VwTransactionListWeb v WHERE v.ngaycap = :ngaycap"),
    @NamedQuery(name = "VwTransactionListWeb.findByIdNoicap", query = "SELECT v FROM VwTransactionListWeb v WHERE v.idNoicap = :idNoicap"),
    @NamedQuery(name = "VwTransactionListWeb.findByGhichuGoi", query = "SELECT v FROM VwTransactionListWeb v WHERE v.ghichuGoi = :ghichuGoi"),
    @NamedQuery(name = "VwTransactionListWeb.findByXacminh", query = "SELECT v FROM VwTransactionListWeb v WHERE v.xacminh = :xacminh"),
    @NamedQuery(name = "VwTransactionListWeb.findByLydoXmnk", query = "SELECT v FROM VwTransactionListWeb v WHERE v.lydoXmnk = :lydoXmnk"),
    @NamedQuery(name = "VwTransactionListWeb.findByGhichu", query = "SELECT v FROM VwTransactionListWeb v WHERE v.ghichu = :ghichu"),
    @NamedQuery(name = "VwTransactionListWeb.findByIdKhachhangtt", query = "SELECT v FROM VwTransactionListWeb v WHERE v.idKhachhangtt = :idKhachhangtt"),
    @NamedQuery(name = "VwTransactionListWeb.findByIdNvChitra", query = "SELECT v FROM VwTransactionListWeb v WHERE v.idNvChitra = :idNvChitra"),
    @NamedQuery(name = "VwTransactionListWeb.findByNhanvinvaTrangthai", query = "SELECT v FROM VwTransactionListWeb v WHERE v.idNvChitra = :idNvChitra ORDER BY v.sobn DESC")})
public class VwTransactionListWeb implements Serializable {
    @Size(max = 0)
    @Column(name = "ID_DOT_DATA")
    private String idDotData;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TRANGTHAIOUT")
    private Character trangthaiout;
    @Size(max = 4000)
    @Column(name = "TENGIAYTO")
    private String tengiayto;
    @Size(max = 20)
    @Column(name = "ID_DOITAC")
    private String idDoitac;
    @Size(max = 4000)
    @Column(name = "TENDOITAC")
    private String tendoitac;
    @Size(max = 4000)
    @Column(name = "TENQUANHUYEN")
    private String tenquanhuyen;
    @Size(max = 4000)
    @Column(name = "TENCITY")
    private String tencity;
    @Column(name = "SOBN")
    private Long sobn;
    @Size(max = 20)
    @Column(name = "ID_NV_CHITRAOUT")
    private String idNvChitraout;
    @Size(max = 20)
    @Column(name = "ID_NV_CHITRA")
    private String idNvChitra;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "ID_CODE")
    private String idCode;
    @Size(max = 20)
    @Column(name = "ID_CHINHANH")
    private String idChinhanh;
    @Size(max = 50)
    @Column(name = "SOPHIEU")
    private String sophieu;
    @Column(name = "STT")
    private BigInteger stt;
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
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID_LOAICONGNO")
    private String idLoaicongno;
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
    @Size(max = 20)
    @Column(name = "ID_DISTRICT")
    private String idDistrict;
    @Size(max = 20)
    @Column(name = "ID_CITY")
    private String idCity;
    @Size(max = 20)
    @Column(name = "DAHOIBAOOUT")
    private String dahoibaoout;
    @Size(max = 1)
    @Column(name = "XACMINHOUT")
    private String xacminhout;
    @Size(max = 20)
    @Column(name = "ID_CT_TUYTHAN")
    private String idCtTuythan;
    @Size(max = 20)
    @Column(name = "SO_CT_TUYTHAN")
    private String soCtTuythan;
    @Column(name = "NGAYCAP")
    @Temporal(TemporalType.DATE)
    private Date ngaycap;
    @Size(max = 20)
    @Column(name = "ID_NOICAP")
    private String idNoicap;
    @Size(max = 400)
    @Column(name = "GHICHU_GOI")
    private String ghichuGoi;
    @Size(max = 60)
    @Column(name = "XACMINH")
    private String xacminh;
    @Size(max = 1000)
    @Column(name = "LYDO_XMNK")
    private String lydoXmnk;
    @Size(max = 400)
    @Column(name = "GHICHU")
    private String ghichu;
    @Size(max = 40)
    @Column(name = "ID_KHACHHANGTT")
    private String idKhachhangtt;

    public VwTransactionListWeb() {
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
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

    public String getIdLoaicongno() {
        return idLoaicongno;
    }

    public void setIdLoaicongno(String idLoaicongno) {
        this.idLoaicongno = idLoaicongno;
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

    public String getIdDistrict() {
        return idDistrict;
    }

    public void setIdDistrict(String idDistrict) {
        this.idDistrict = idDistrict;
    }

    public String getIdCity() {
        return idCity;
    }

    public void setIdCity(String idCity) {
        this.idCity = idCity;
    }


    public String getDahoibaoout() {
        return dahoibaoout;
    }

    public void setDahoibaoout(String dahoibaoout) {
        this.dahoibaoout = dahoibaoout;
    }

    public String getXacminhout() {
        return xacminhout;
    }

    public void setXacminhout(String xacminhout) {
        this.xacminhout = xacminhout;
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

    public Date getNgaycap() {
        return ngaycap;
    }

    public void setNgaycap(Date ngaycap) {
        this.ngaycap = ngaycap;
    }

    public String getIdNoicap() {
        return idNoicap;
    }

    public void setIdNoicap(String idNoicap) {
        this.idNoicap = idNoicap;
    }

    public String getGhichuGoi() {
        return ghichuGoi;
    }

    public void setGhichuGoi(String ghichuGoi) {
        this.ghichuGoi = ghichuGoi;
    }

    public String getXacminh() {
        return xacminh;
    }

    public void setXacminh(String xacminh) {
        this.xacminh = xacminh;
    }

    public String getLydoXmnk() {
        return lydoXmnk;
    }

    public void setLydoXmnk(String lydoXmnk) {
        this.lydoXmnk = lydoXmnk;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    public String getIdKhachhangtt() {
        return idKhachhangtt;
    }

    public void setIdKhachhangtt(String idKhachhangtt) {
        this.idKhachhangtt = idKhachhangtt;
    }

    public String getIdNvChitraout() {
        return idNvChitraout;
    }

    public void setIdNvChitraout(String idNvChitraout) {
        this.idNvChitraout = idNvChitraout;
    }

    public String getIdNvChitra() {
        return idNvChitra;
    }

    public void setIdNvChitra(String idNvChitra) {
        this.idNvChitra = idNvChitra;
    }

    public Long getSobn() {
        return sobn;
    }

    public void setSobn(Long sobn) {
        this.sobn = sobn;
    }

    public String getIdDoitac() {
        return idDoitac;
    }

    public void setIdDoitac(String idDoitac) {
        this.idDoitac = idDoitac;
    }

    public String getTendoitac() {
        return tendoitac;
    }

    public void setTendoitac(String tendoitac) {
        this.tendoitac = tendoitac;
    }

    public String getTenquanhuyen() {
        return tenquanhuyen;
    }

    public void setTenquanhuyen(String tenquanhuyen) {
        this.tenquanhuyen = tenquanhuyen;
    }

    public String getTencity() {
        return tencity;
    }

    public void setTencity(String tencity) {
        this.tencity = tencity;
    }

    public String getTengiayto() {
        return tengiayto;
    }

    public void setTengiayto(String tengiayto) {
        this.tengiayto = tengiayto;
    }

  
    public void setIdDotData(String idDotData) {
        this.idDotData = idDotData;
    }

    public Character getTrangthaiout() {
        return trangthaiout;
    }

    public void setTrangthaiout(Character trangthaiout) {
        this.trangthaiout = trangthaiout;
    }
    
}
