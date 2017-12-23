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
@Table(name = "VW_KHACHHANGTT_LIST_TEMP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwKhachhangttListTemp.findAll", query = "SELECT v FROM VwKhachhangttListTemp v")
    , @NamedQuery(name = "VwKhachhangttListTemp.findByIdCode", query = "SELECT v FROM VwKhachhangttListTemp v WHERE v.idCode = :idCode")
    , @NamedQuery(name = "VwKhachhangttListTemp.findByUserId", query = "SELECT v FROM VwKhachhangttListTemp v WHERE v.userId = :userId")
    , @NamedQuery(name = "VwKhachhangttListTemp.findByShshis", query = "SELECT v FROM VwKhachhangttListTemp v WHERE v.shshis = :shshis")
    , @NamedQuery(name = "VwKhachhangttListTemp.findBySobn", query = "SELECT v FROM VwKhachhangttListTemp v WHERE v.sobn = :sobn")
    , @NamedQuery(name = "VwKhachhangttListTemp.findByIdKhachhang", query = "SELECT v FROM VwKhachhangttListTemp v WHERE v.idKhachhang = :idKhachhang")
    , @NamedQuery(name = "VwKhachhangttListTemp.findByTen", query = "SELECT v FROM VwKhachhangttListTemp v WHERE v.ten = :ten")
    , @NamedQuery(name = "VwKhachhangttListTemp.findByTenKhongdau", query = "SELECT v FROM VwKhachhangttListTemp v WHERE v.tenKhongdau = :tenKhongdau")
    , @NamedQuery(name = "VwKhachhangttListTemp.findByHo", query = "SELECT v FROM VwKhachhangttListTemp v WHERE v.ho = :ho")
    , @NamedQuery(name = "VwKhachhangttListTemp.findByHoKhongdau", query = "SELECT v FROM VwKhachhangttListTemp v WHERE v.hoKhongdau = :hoKhongdau")
    , @NamedQuery(name = "VwKhachhangttListTemp.findByHoten", query = "SELECT v FROM VwKhachhangttListTemp v WHERE v.hoten = :hoten")
    , @NamedQuery(name = "VwKhachhangttListTemp.findByGioitinh", query = "SELECT v FROM VwKhachhangttListTemp v WHERE v.gioitinh = :gioitinh")
    , @NamedQuery(name = "VwKhachhangttListTemp.findBySonhaHientai", query = "SELECT v FROM VwKhachhangttListTemp v WHERE v.sonhaHientai = :sonhaHientai")
    , @NamedQuery(name = "VwKhachhangttListTemp.findByQuanHientai", query = "SELECT v FROM VwKhachhangttListTemp v WHERE v.quanHientai = :quanHientai")
    , @NamedQuery(name = "VwKhachhangttListTemp.findByTpHientai", query = "SELECT v FROM VwKhachhangttListTemp v WHERE v.tpHientai = :tpHientai")
    , @NamedQuery(name = "VwKhachhangttListTemp.findByDienthoaiBan", query = "SELECT v FROM VwKhachhangttListTemp v WHERE v.dienthoaiBan = :dienthoaiBan")
    , @NamedQuery(name = "VwKhachhangttListTemp.findByDidong1", query = "SELECT v FROM VwKhachhangttListTemp v WHERE v.didong1 = :didong1")
    , @NamedQuery(name = "VwKhachhangttListTemp.findByDidong2", query = "SELECT v FROM VwKhachhangttListTemp v WHERE v.didong2 = :didong2")
    , @NamedQuery(name = "VwKhachhangttListTemp.findByEmail", query = "SELECT v FROM VwKhachhangttListTemp v WHERE v.email = :email")
    , @NamedQuery(name = "VwKhachhangttListTemp.findByNgaysinh", query = "SELECT v FROM VwKhachhangttListTemp v WHERE v.ngaysinh = :ngaysinh")
    , @NamedQuery(name = "VwKhachhangttListTemp.findByThangsinh", query = "SELECT v FROM VwKhachhangttListTemp v WHERE v.thangsinh = :thangsinh")
    , @NamedQuery(name = "VwKhachhangttListTemp.findByNamsinh", query = "SELECT v FROM VwKhachhangttListTemp v WHERE v.namsinh = :namsinh")
    , @NamedQuery(name = "VwKhachhangttListTemp.findBySonhaThuongtru", query = "SELECT v FROM VwKhachhangttListTemp v WHERE v.sonhaThuongtru = :sonhaThuongtru")
    , @NamedQuery(name = "VwKhachhangttListTemp.findByQuanThuongtru", query = "SELECT v FROM VwKhachhangttListTemp v WHERE v.quanThuongtru = :quanThuongtru")
    , @NamedQuery(name = "VwKhachhangttListTemp.findByThanhphoThuongtru", query = "SELECT v FROM VwKhachhangttListTemp v WHERE v.thanhphoThuongtru = :thanhphoThuongtru")
    , @NamedQuery(name = "VwKhachhangttListTemp.findByMotathemKhachhang", query = "SELECT v FROM VwKhachhangttListTemp v WHERE v.motathemKhachhang = :motathemKhachhang")
    , @NamedQuery(name = "VwKhachhangttListTemp.findBySochungminh", query = "SELECT v FROM VwKhachhangttListTemp v WHERE v.sochungminh = :sochungminh")
    , @NamedQuery(name = "VwKhachhangttListTemp.findByNgaycap", query = "SELECT v FROM VwKhachhangttListTemp v WHERE v.ngaycap = :ngaycap")
    , @NamedQuery(name = "VwKhachhangttListTemp.findByGiayPlx", query = "SELECT v FROM VwKhachhangttListTemp v WHERE v.giayPlx = :giayPlx")
    , @NamedQuery(name = "VwKhachhangttListTemp.findByNgaycapGplx", query = "SELECT v FROM VwKhachhangttListTemp v WHERE v.ngaycapGplx = :ngaycapGplx")
    , @NamedQuery(name = "VwKhachhangttListTemp.findBySotaikhoan", query = "SELECT v FROM VwKhachhangttListTemp v WHERE v.sotaikhoan = :sotaikhoan")
    , @NamedQuery(name = "VwKhachhangttListTemp.findByIdBank", query = "SELECT v FROM VwKhachhangttListTemp v WHERE v.idBank = :idBank")
    , @NamedQuery(name = "VwKhachhangttListTemp.findByDvSms", query = "SELECT v FROM VwKhachhangttListTemp v WHERE v.dvSms = :dvSms")
    , @NamedQuery(name = "VwKhachhangttListTemp.findByViphamaml", query = "SELECT v FROM VwKhachhangttListTemp v WHERE v.viphamaml = :viphamaml")
    , @NamedQuery(name = "VwKhachhangttListTemp.findByHuychi", query = "SELECT v FROM VwKhachhangttListTemp v WHERE v.huychi = :huychi")
    , @NamedQuery(name = "VwKhachhangttListTemp.findByMakerId", query = "SELECT v FROM VwKhachhangttListTemp v WHERE v.makerId = :makerId")
    , @NamedQuery(name = "VwKhachhangttListTemp.findByNgayKhoitao", query = "SELECT v FROM VwKhachhangttListTemp v WHERE v.ngayKhoitao = :ngayKhoitao")
    , @NamedQuery(name = "VwKhachhangttListTemp.findByDateModified", query = "SELECT v FROM VwKhachhangttListTemp v WHERE v.dateModified = :dateModified")
    , @NamedQuery(name = "VwKhachhangttListTemp.findByDuyet", query = "SELECT v FROM VwKhachhangttListTemp v WHERE v.duyet = :duyet")
    , @NamedQuery(name = "VwKhachhangttListTemp.findByIdNvDuyet", query = "SELECT v FROM VwKhachhangttListTemp v WHERE v.idNvDuyet = :idNvDuyet")
    , @NamedQuery(name = "VwKhachhangttListTemp.findByNgayduyet", query = "SELECT v FROM VwKhachhangttListTemp v WHERE v.ngayduyet = :ngayduyet")
    , @NamedQuery(name = "VwKhachhangttListTemp.findByRecordNote", query = "SELECT v FROM VwKhachhangttListTemp v WHERE v.recordNote = :recordNote")
    , @NamedQuery(name = "VwKhachhangttListTemp.findByIdValidity", query = "SELECT v FROM VwKhachhangttListTemp v WHERE v.idValidity = :idValidity")
    , @NamedQuery(name = "VwKhachhangttListTemp.findByMaKhachhangOld", query = "SELECT v FROM VwKhachhangttListTemp v WHERE v.maKhachhangOld = :maKhachhangOld")
    , @NamedQuery(name = "VwKhachhangttListTemp.findByIdChinhanh", query = "SELECT v FROM VwKhachhangttListTemp v WHERE v.idChinhanh = :idChinhanh")
    , @NamedQuery(name = "VwKhachhangttListTemp.findByNgaycapCmnd", query = "SELECT v FROM VwKhachhangttListTemp v WHERE v.ngaycapCmnd = :ngaycapCmnd")
    , @NamedQuery(name = "VwKhachhangttListTemp.findBySttkh", query = "SELECT v FROM VwKhachhangttListTemp v WHERE v.sttkh = :sttkh")
    , @NamedQuery(name = "VwKhachhangttListTemp.findByDachuanhoa", query = "SELECT v FROM VwKhachhangttListTemp v WHERE v.dachuanhoa = :dachuanhoa")
    , @NamedQuery(name = "VwKhachhangttListTemp.findByIdThanhtoan", query = "SELECT v FROM VwKhachhangttListTemp v WHERE v.idThanhtoan = :idThanhtoan")
    , @NamedQuery(name = "VwKhachhangttListTemp.findByIdNoicapcmnd", query = "SELECT v FROM VwKhachhangttListTemp v WHERE v.idNoicapcmnd = :idNoicapcmnd")
    , @NamedQuery(name = "VwKhachhangttListTemp.findByIdNoicapgplx", query = "SELECT v FROM VwKhachhangttListTemp v WHERE v.idNoicapgplx = :idNoicapgplx")
    , @NamedQuery(name = "VwKhachhangttListTemp.findByIdNoicappassport", query = "SELECT v FROM VwKhachhangttListTemp v WHERE v.idNoicappassport = :idNoicappassport")
    , @NamedQuery(name = "VwKhachhangttListTemp.findByPassport", query = "SELECT v FROM VwKhachhangttListTemp v WHERE v.passport = :passport")
    , @NamedQuery(name = "VwKhachhangttListTemp.findByNgaycapPassport", query = "SELECT v FROM VwKhachhangttListTemp v WHERE v.ngaycapPassport = :ngaycapPassport")
    , @NamedQuery(name = "VwKhachhangttListTemp.findByIdNvChuanhoa", query = "SELECT v FROM VwKhachhangttListTemp v WHERE v.idNvChuanhoa = :idNvChuanhoa")
    , @NamedQuery(name = "VwKhachhangttListTemp.findByNgayChuanhoa", query = "SELECT v FROM VwKhachhangttListTemp v WHERE v.ngayChuanhoa = :ngayChuanhoa")
    , @NamedQuery(name = "VwKhachhangttListTemp.findBySobnHis", query = "SELECT v FROM VwKhachhangttListTemp v WHERE v.sobnHis = :sobnHis")
    , @NamedQuery(name = "VwKhachhangttListTemp.findByStt", query = "SELECT v FROM VwKhachhangttListTemp v WHERE v.stt = :stt")
    , @NamedQuery(name = "VwKhachhangttListTemp.findBySophieu", query = "SELECT v FROM VwKhachhangttListTemp v WHERE v.sophieu = :sophieu")
    , @NamedQuery(name = "VwKhachhangttListTemp.findByIdActive", query = "SELECT v FROM VwKhachhangttListTemp v WHERE v.idActive = :idActive")})
public class VwKhachhangttListTemp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "ID_CODE")
    private String idCode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "USER_ID")
    private String userId;
    @Column(name = "SHSHIS")
    private BigInteger shshis;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "SOBN")
    private String sobn;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "ID_KHACHHANG")
    private String idKhachhang;
    @Size(max = 255)
    @Column(name = "TEN")
    private String ten;
    @Size(max = 255)
    @Column(name = "TEN_KHONGDAU")
    private String tenKhongdau;
    @Size(max = 255)
    @Column(name = "HO")
    private String ho;
    @Size(max = 255)
    @Column(name = "HO_KHONGDAU")
    private String hoKhongdau;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "HOTEN")
    private String hoten;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "GIOITINH")
    private String gioitinh;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "SONHA_HIENTAI")
    private String sonhaHientai;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "QUAN_HIENTAI")
    private String quanHientai;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "TP_HIENTAI")
    private String tpHientai;
    @Size(max = 255)
    @Column(name = "DIENTHOAI_BAN")
    private String dienthoaiBan;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "DIDONG1")
    private String didong1;
    @Size(max = 255)
    @Column(name = "DIDONG2")
    private String didong2;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 255)
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "NGAYSINH")
    @Temporal(TemporalType.DATE)
    private Date ngaysinh;
    @Size(max = 255)
    @Column(name = "THANGSINH")
    private String thangsinh;
    @Size(max = 255)
    @Column(name = "NAMSINH")
    private String namsinh;
    @Size(max = 255)
    @Column(name = "SONHA_THUONGTRU")
    private String sonhaThuongtru;
    @Size(max = 255)
    @Column(name = "QUAN_THUONGTRU")
    private String quanThuongtru;
    @Size(max = 255)
    @Column(name = "THANHPHO_THUONGTRU")
    private String thanhphoThuongtru;
    @Size(max = 255)
    @Column(name = "MOTATHEM_KHACHHANG")
    private String motathemKhachhang;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "SOCHUNGMINH")
    private String sochungminh;
    @Column(name = "NGAYCAP")
    @Temporal(TemporalType.DATE)
    private Date ngaycap;
    @Size(max = 255)
    @Column(name = "GIAY_PLX")
    private String giayPlx;
    @Column(name = "NGAYCAP_GPLX")
    @Temporal(TemporalType.DATE)
    private Date ngaycapGplx;
    @Size(max = 255)
    @Column(name = "SOTAIKHOAN")
    private String sotaikhoan;
    @Size(max = 255)
    @Column(name = "ID_BANK")
    private String idBank;
    @Size(max = 255)
    @Column(name = "DV_SMS")
    private String dvSms;
    @Size(max = 255)
    @Column(name = "VIPHAMAML")
    private String viphamaml;
    @Size(max = 255)
    @Column(name = "HUYCHI")
    private String huychi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "MAKER_ID")
    private String makerId;
    @Column(name = "NGAY_KHOITAO")
    @Temporal(TemporalType.DATE)
    private Date ngayKhoitao;
    @Column(name = "DATE_MODIFIED")
    @Temporal(TemporalType.DATE)
    private Date dateModified;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "DUYET")
    private String duyet;
    @Size(max = 255)
    @Column(name = "ID_NV_DUYET")
    private String idNvDuyet;
    @Column(name = "NGAYDUYET")
    @Temporal(TemporalType.DATE)
    private Date ngayduyet;
    @Size(max = 255)
    @Column(name = "RECORD_NOTE")
    private String recordNote;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "ID_VALIDITY")
    private String idValidity;
    @Size(max = 255)
    @Column(name = "MA_KHACHHANG_OLD")
    private String maKhachhangOld;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "ID_CHINHANH")
    private String idChinhanh;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NGAYCAP_CMND")
    @Temporal(TemporalType.DATE)
    private Date ngaycapCmnd;
    @Column(name = "STTKH")
    private BigInteger sttkh;
    @Size(max = 1)
    @Column(name = "DACHUANHOA")
    private String dachuanhoa;
    @Size(max = 255)
    @Column(name = "ID_THANHTOAN")
    private String idThanhtoan;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "ID_NOICAPCMND")
    private String idNoicapcmnd;
    @Size(max = 255)
    @Column(name = "ID_NOICAPGPLX")
    private String idNoicapgplx;
    @Size(max = 255)
    @Column(name = "ID_NOICAPPASSPORT")
    private String idNoicappassport;
    @Size(max = 255)
    @Column(name = "PASSPORT")
    private String passport;
    @Column(name = "NGAYCAP_PASSPORT")
    @Temporal(TemporalType.DATE)
    private Date ngaycapPassport;
    @Size(max = 255)
    @Column(name = "ID_NV_CHUANHOA")
    private String idNvChuanhoa;
    @Column(name = "NGAY_CHUANHOA")
    @Temporal(TemporalType.DATE)
    private Date ngayChuanhoa;
    @Size(max = 500)
    @Column(name = "SOBN_HIS")
    private String sobnHis;
    @Basic(optional = false)
    @NotNull
    @Column(name = "STT")
    private BigInteger stt;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "SOPHIEU")
    private String sophieu;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "ID_ACTIVE")
    private String idActive;

    public VwKhachhangttListTemp() {
    }

    public VwKhachhangttListTemp(String idCode) {
        this.idCode = idCode;
    }

    public VwKhachhangttListTemp(String idCode, String userId, String sobn, String idKhachhang, String hoten, String gioitinh, String sonhaHientai, String quanHientai, String tpHientai, String didong1, String sochungminh, String makerId, String duyet, String idValidity, String idChinhanh, Date ngaycapCmnd, String idNoicapcmnd, BigInteger stt, String sophieu, String idActive) {
        this.idCode = idCode;
        this.userId = userId;
        this.sobn = sobn;
        this.idKhachhang = idKhachhang;
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.sonhaHientai = sonhaHientai;
        this.quanHientai = quanHientai;
        this.tpHientai = tpHientai;
        this.didong1 = didong1;
        this.sochungminh = sochungminh;
        this.makerId = makerId;
        this.duyet = duyet;
        this.idValidity = idValidity;
        this.idChinhanh = idChinhanh;
        this.ngaycapCmnd = ngaycapCmnd;
        this.idNoicapcmnd = idNoicapcmnd;
        this.stt = stt;
        this.sophieu = sophieu;
        this.idActive = idActive;
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public BigInteger getShshis() {
        return shshis;
    }

    public void setShshis(BigInteger shshis) {
        this.shshis = shshis;
    }

    public String getSobn() {
        return sobn;
    }

    public void setSobn(String sobn) {
        this.sobn = sobn;
    }

    public String getIdKhachhang() {
        return idKhachhang;
    }

    public void setIdKhachhang(String idKhachhang) {
        this.idKhachhang = idKhachhang;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTenKhongdau() {
        return tenKhongdau;
    }

    public void setTenKhongdau(String tenKhongdau) {
        this.tenKhongdau = tenKhongdau;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getHoKhongdau() {
        return hoKhongdau;
    }

    public void setHoKhongdau(String hoKhongdau) {
        this.hoKhongdau = hoKhongdau;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getSonhaHientai() {
        return sonhaHientai;
    }

    public void setSonhaHientai(String sonhaHientai) {
        this.sonhaHientai = sonhaHientai;
    }

    public String getQuanHientai() {
        return quanHientai;
    }

    public void setQuanHientai(String quanHientai) {
        this.quanHientai = quanHientai;
    }

    public String getTpHientai() {
        return tpHientai;
    }

    public void setTpHientai(String tpHientai) {
        this.tpHientai = tpHientai;
    }

    public String getDienthoaiBan() {
        return dienthoaiBan;
    }

    public void setDienthoaiBan(String dienthoaiBan) {
        this.dienthoaiBan = dienthoaiBan;
    }

    public String getDidong1() {
        return didong1;
    }

    public void setDidong1(String didong1) {
        this.didong1 = didong1;
    }

    public String getDidong2() {
        return didong2;
    }

    public void setDidong2(String didong2) {
        this.didong2 = didong2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getThangsinh() {
        return thangsinh;
    }

    public void setThangsinh(String thangsinh) {
        this.thangsinh = thangsinh;
    }

    public String getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(String namsinh) {
        this.namsinh = namsinh;
    }

    public String getSonhaThuongtru() {
        return sonhaThuongtru;
    }

    public void setSonhaThuongtru(String sonhaThuongtru) {
        this.sonhaThuongtru = sonhaThuongtru;
    }

    public String getQuanThuongtru() {
        return quanThuongtru;
    }

    public void setQuanThuongtru(String quanThuongtru) {
        this.quanThuongtru = quanThuongtru;
    }

    public String getThanhphoThuongtru() {
        return thanhphoThuongtru;
    }

    public void setThanhphoThuongtru(String thanhphoThuongtru) {
        this.thanhphoThuongtru = thanhphoThuongtru;
    }

    public String getMotathemKhachhang() {
        return motathemKhachhang;
    }

    public void setMotathemKhachhang(String motathemKhachhang) {
        this.motathemKhachhang = motathemKhachhang;
    }

    public String getSochungminh() {
        return sochungminh;
    }

    public void setSochungminh(String sochungminh) {
        this.sochungminh = sochungminh;
    }

    public Date getNgaycap() {
        return ngaycap;
    }

    public void setNgaycap(Date ngaycap) {
        this.ngaycap = ngaycap;
    }

    public String getGiayPlx() {
        return giayPlx;
    }

    public void setGiayPlx(String giayPlx) {
        this.giayPlx = giayPlx;
    }

    public Date getNgaycapGplx() {
        return ngaycapGplx;
    }

    public void setNgaycapGplx(Date ngaycapGplx) {
        this.ngaycapGplx = ngaycapGplx;
    }

    public String getSotaikhoan() {
        return sotaikhoan;
    }

    public void setSotaikhoan(String sotaikhoan) {
        this.sotaikhoan = sotaikhoan;
    }

    public String getIdBank() {
        return idBank;
    }

    public void setIdBank(String idBank) {
        this.idBank = idBank;
    }

    public String getDvSms() {
        return dvSms;
    }

    public void setDvSms(String dvSms) {
        this.dvSms = dvSms;
    }

    public String getViphamaml() {
        return viphamaml;
    }

    public void setViphamaml(String viphamaml) {
        this.viphamaml = viphamaml;
    }

    public String getHuychi() {
        return huychi;
    }

    public void setHuychi(String huychi) {
        this.huychi = huychi;
    }

    public String getMakerId() {
        return makerId;
    }

    public void setMakerId(String makerId) {
        this.makerId = makerId;
    }

    public Date getNgayKhoitao() {
        return ngayKhoitao;
    }

    public void setNgayKhoitao(Date ngayKhoitao) {
        this.ngayKhoitao = ngayKhoitao;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    public String getDuyet() {
        return duyet;
    }

    public void setDuyet(String duyet) {
        this.duyet = duyet;
    }

    public String getIdNvDuyet() {
        return idNvDuyet;
    }

    public void setIdNvDuyet(String idNvDuyet) {
        this.idNvDuyet = idNvDuyet;
    }

    public Date getNgayduyet() {
        return ngayduyet;
    }

    public void setNgayduyet(Date ngayduyet) {
        this.ngayduyet = ngayduyet;
    }

    public String getRecordNote() {
        return recordNote;
    }

    public void setRecordNote(String recordNote) {
        this.recordNote = recordNote;
    }

    public String getIdValidity() {
        return idValidity;
    }

    public void setIdValidity(String idValidity) {
        this.idValidity = idValidity;
    }

    public String getMaKhachhangOld() {
        return maKhachhangOld;
    }

    public void setMaKhachhangOld(String maKhachhangOld) {
        this.maKhachhangOld = maKhachhangOld;
    }

    public String getIdChinhanh() {
        return idChinhanh;
    }

    public void setIdChinhanh(String idChinhanh) {
        this.idChinhanh = idChinhanh;
    }

    public Date getNgaycapCmnd() {
        return ngaycapCmnd;
    }

    public void setNgaycapCmnd(Date ngaycapCmnd) {
        this.ngaycapCmnd = ngaycapCmnd;
    }

    public BigInteger getSttkh() {
        return sttkh;
    }

    public void setSttkh(BigInteger sttkh) {
        this.sttkh = sttkh;
    }

    public String getDachuanhoa() {
        return dachuanhoa;
    }

    public void setDachuanhoa(String dachuanhoa) {
        this.dachuanhoa = dachuanhoa;
    }

    public String getIdThanhtoan() {
        return idThanhtoan;
    }

    public void setIdThanhtoan(String idThanhtoan) {
        this.idThanhtoan = idThanhtoan;
    }

    public String getIdNoicapcmnd() {
        return idNoicapcmnd;
    }

    public void setIdNoicapcmnd(String idNoicapcmnd) {
        this.idNoicapcmnd = idNoicapcmnd;
    }

    public String getIdNoicapgplx() {
        return idNoicapgplx;
    }

    public void setIdNoicapgplx(String idNoicapgplx) {
        this.idNoicapgplx = idNoicapgplx;
    }

    public String getIdNoicappassport() {
        return idNoicappassport;
    }

    public void setIdNoicappassport(String idNoicappassport) {
        this.idNoicappassport = idNoicappassport;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public Date getNgaycapPassport() {
        return ngaycapPassport;
    }

    public void setNgaycapPassport(Date ngaycapPassport) {
        this.ngaycapPassport = ngaycapPassport;
    }

    public String getIdNvChuanhoa() {
        return idNvChuanhoa;
    }

    public void setIdNvChuanhoa(String idNvChuanhoa) {
        this.idNvChuanhoa = idNvChuanhoa;
    }

    public Date getNgayChuanhoa() {
        return ngayChuanhoa;
    }

    public void setNgayChuanhoa(Date ngayChuanhoa) {
        this.ngayChuanhoa = ngayChuanhoa;
    }

    public String getSobnHis() {
        return sobnHis;
    }

    public void setSobnHis(String sobnHis) {
        this.sobnHis = sobnHis;
    }

    public BigInteger getStt() {
        return stt;
    }

    public void setStt(BigInteger stt) {
        this.stt = stt;
    }

    public String getSophieu() {
        return sophieu;
    }

    public void setSophieu(String sophieu) {
        this.sophieu = sophieu;
    }

    public String getIdActive() {
        return idActive;
    }

    public void setIdActive(String idActive) {
        this.idActive = idActive;
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
        if (!(object instanceof VwKhachhangttListTemp)) {
            return false;
        }
        VwKhachhangttListTemp other = (VwKhachhangttListTemp) object;
        if ((this.idCode == null && other.idCode != null) || (this.idCode != null && !this.idCode.equals(other.idCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitieskhout.VwKhachhangttListTemp[ idCode=" + idCode + " ]";
    }
    
}
