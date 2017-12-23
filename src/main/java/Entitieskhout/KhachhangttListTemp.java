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
@Table(name = "KHACHHANGTT_LIST_TEMP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "KhachhangttListTemp.findAll", query = "SELECT k FROM KhachhangttListTemp k")
    , @NamedQuery(name = "KhachhangttListTemp.findByIdKhachhang", query = "SELECT k FROM KhachhangttListTemp k WHERE k.idKhachhang = :idKhachhang")
    , @NamedQuery(name = "KhachhangttListTemp.findByTen", query = "SELECT k FROM KhachhangttListTemp k WHERE k.ten = :ten")
    , @NamedQuery(name = "KhachhangttListTemp.findByTenKhongdau", query = "SELECT k FROM KhachhangttListTemp k WHERE k.tenKhongdau = :tenKhongdau")
    , @NamedQuery(name = "KhachhangttListTemp.findByHo", query = "SELECT k FROM KhachhangttListTemp k WHERE k.ho = :ho")
    , @NamedQuery(name = "KhachhangttListTemp.findByHoKhongdau", query = "SELECT k FROM KhachhangttListTemp k WHERE k.hoKhongdau = :hoKhongdau")
    , @NamedQuery(name = "KhachhangttListTemp.findByHoten", query = "SELECT k FROM KhachhangttListTemp k WHERE k.hoten = :hoten")
    , @NamedQuery(name = "KhachhangttListTemp.findByGioitinh", query = "SELECT k FROM KhachhangttListTemp k WHERE k.gioitinh = :gioitinh")
    , @NamedQuery(name = "KhachhangttListTemp.findBySonhaHientai", query = "SELECT k FROM KhachhangttListTemp k WHERE k.sonhaHientai = :sonhaHientai")
    , @NamedQuery(name = "KhachhangttListTemp.findByQuanHientai", query = "SELECT k FROM KhachhangttListTemp k WHERE k.quanHientai = :quanHientai")
    , @NamedQuery(name = "KhachhangttListTemp.findByTpHientai", query = "SELECT k FROM KhachhangttListTemp k WHERE k.tpHientai = :tpHientai")
    , @NamedQuery(name = "KhachhangttListTemp.findByDienthoaiBan", query = "SELECT k FROM KhachhangttListTemp k WHERE k.dienthoaiBan = :dienthoaiBan")
    , @NamedQuery(name = "KhachhangttListTemp.findByDidong1", query = "SELECT k FROM KhachhangttListTemp k WHERE k.didong1 = :didong1")
    , @NamedQuery(name = "KhachhangttListTemp.findByDidong2", query = "SELECT k FROM KhachhangttListTemp k WHERE k.didong2 = :didong2")
    , @NamedQuery(name = "KhachhangttListTemp.findByEmail", query = "SELECT k FROM KhachhangttListTemp k WHERE k.email = :email")
    , @NamedQuery(name = "KhachhangttListTemp.findByNgaysinh", query = "SELECT k FROM KhachhangttListTemp k WHERE k.ngaysinh = :ngaysinh")
    , @NamedQuery(name = "KhachhangttListTemp.findByThangsinh", query = "SELECT k FROM KhachhangttListTemp k WHERE k.thangsinh = :thangsinh")
    , @NamedQuery(name = "KhachhangttListTemp.findByNamsinh", query = "SELECT k FROM KhachhangttListTemp k WHERE k.namsinh = :namsinh")
    , @NamedQuery(name = "KhachhangttListTemp.findBySonhaThuongtru", query = "SELECT k FROM KhachhangttListTemp k WHERE k.sonhaThuongtru = :sonhaThuongtru")
    , @NamedQuery(name = "KhachhangttListTemp.findByQuanThuongtru", query = "SELECT k FROM KhachhangttListTemp k WHERE k.quanThuongtru = :quanThuongtru")
    , @NamedQuery(name = "KhachhangttListTemp.findByThanhphoThuongtru", query = "SELECT k FROM KhachhangttListTemp k WHERE k.thanhphoThuongtru = :thanhphoThuongtru")
    , @NamedQuery(name = "KhachhangttListTemp.findByMotathemKhachhang", query = "SELECT k FROM KhachhangttListTemp k WHERE k.motathemKhachhang = :motathemKhachhang")
    , @NamedQuery(name = "KhachhangttListTemp.findBySochungminh", query = "SELECT k FROM KhachhangttListTemp k WHERE k.sochungminh = :sochungminh")
    , @NamedQuery(name = "KhachhangttListTemp.findByNgaycap", query = "SELECT k FROM KhachhangttListTemp k WHERE k.ngaycap = :ngaycap")
    , @NamedQuery(name = "KhachhangttListTemp.findByGiayPlx", query = "SELECT k FROM KhachhangttListTemp k WHERE k.giayPlx = :giayPlx")
    , @NamedQuery(name = "KhachhangttListTemp.findByNgaycapGplx", query = "SELECT k FROM KhachhangttListTemp k WHERE k.ngaycapGplx = :ngaycapGplx")
    , @NamedQuery(name = "KhachhangttListTemp.findBySotaikhoan", query = "SELECT k FROM KhachhangttListTemp k WHERE k.sotaikhoan = :sotaikhoan")
    , @NamedQuery(name = "KhachhangttListTemp.findByIdBank", query = "SELECT k FROM KhachhangttListTemp k WHERE k.idBank = :idBank")
    , @NamedQuery(name = "KhachhangttListTemp.findByDvSms", query = "SELECT k FROM KhachhangttListTemp k WHERE k.dvSms = :dvSms")
    , @NamedQuery(name = "KhachhangttListTemp.findByViphamaml", query = "SELECT k FROM KhachhangttListTemp k WHERE k.viphamaml = :viphamaml")
    , @NamedQuery(name = "KhachhangttListTemp.findByHuychi", query = "SELECT k FROM KhachhangttListTemp k WHERE k.huychi = :huychi")
    , @NamedQuery(name = "KhachhangttListTemp.findByMakerId", query = "SELECT k FROM KhachhangttListTemp k WHERE k.makerId = :makerId")
    , @NamedQuery(name = "KhachhangttListTemp.findByNgayKhoitao", query = "SELECT k FROM KhachhangttListTemp k WHERE k.ngayKhoitao = :ngayKhoitao")
    , @NamedQuery(name = "KhachhangttListTemp.findByDateModified", query = "SELECT k FROM KhachhangttListTemp k WHERE k.dateModified = :dateModified")
    , @NamedQuery(name = "KhachhangttListTemp.findByDuyet", query = "SELECT k FROM KhachhangttListTemp k WHERE k.duyet = :duyet")
    , @NamedQuery(name = "KhachhangttListTemp.findByIdNvDuyet", query = "SELECT k FROM KhachhangttListTemp k WHERE k.idNvDuyet = :idNvDuyet")
    , @NamedQuery(name = "KhachhangttListTemp.findByNgayduyet", query = "SELECT k FROM KhachhangttListTemp k WHERE k.ngayduyet = :ngayduyet")
    , @NamedQuery(name = "KhachhangttListTemp.findByRecordNote", query = "SELECT k FROM KhachhangttListTemp k WHERE k.recordNote = :recordNote")
    , @NamedQuery(name = "KhachhangttListTemp.findByIdValidity", query = "SELECT k FROM KhachhangttListTemp k WHERE k.idValidity = :idValidity")
    , @NamedQuery(name = "KhachhangttListTemp.findByMaKhachhangOld", query = "SELECT k FROM KhachhangttListTemp k WHERE k.maKhachhangOld = :maKhachhangOld")
    , @NamedQuery(name = "KhachhangttListTemp.findByIdChinhanh", query = "SELECT k FROM KhachhangttListTemp k WHERE k.idChinhanh = :idChinhanh")
    , @NamedQuery(name = "KhachhangttListTemp.findByNgaycapCmnd", query = "SELECT k FROM KhachhangttListTemp k WHERE k.ngaycapCmnd = :ngaycapCmnd")
    , @NamedQuery(name = "KhachhangttListTemp.findBySttkh", query = "SELECT k FROM KhachhangttListTemp k WHERE k.sttkh = :sttkh")
    , @NamedQuery(name = "KhachhangttListTemp.findByDachuanhoa", query = "SELECT k FROM KhachhangttListTemp k WHERE k.dachuanhoa = :dachuanhoa")
    , @NamedQuery(name = "KhachhangttListTemp.findByIdThanhtoan", query = "SELECT k FROM KhachhangttListTemp k WHERE k.idThanhtoan = :idThanhtoan")
    , @NamedQuery(name = "KhachhangttListTemp.findByIdNoicapcmnd", query = "SELECT k FROM KhachhangttListTemp k WHERE k.idNoicapcmnd = :idNoicapcmnd")
    , @NamedQuery(name = "KhachhangttListTemp.findByNoicapcmndName", query = "SELECT k FROM KhachhangttListTemp k WHERE k.noicapcmndName = :noicapcmndName")
    , @NamedQuery(name = "KhachhangttListTemp.findByIdNoicapgplx", query = "SELECT k FROM KhachhangttListTemp k WHERE k.idNoicapgplx = :idNoicapgplx")
    , @NamedQuery(name = "KhachhangttListTemp.findByNoicapgplxName", query = "SELECT k FROM KhachhangttListTemp k WHERE k.noicapgplxName = :noicapgplxName")
    , @NamedQuery(name = "KhachhangttListTemp.findByIdNoicappassport", query = "SELECT k FROM KhachhangttListTemp k WHERE k.idNoicappassport = :idNoicappassport")
    , @NamedQuery(name = "KhachhangttListTemp.findByNoicappassName", query = "SELECT k FROM KhachhangttListTemp k WHERE k.noicappassName = :noicappassName")
    , @NamedQuery(name = "KhachhangttListTemp.findByPassport", query = "SELECT k FROM KhachhangttListTemp k WHERE k.passport = :passport")
    , @NamedQuery(name = "KhachhangttListTemp.findByNgaycapPassport", query = "SELECT k FROM KhachhangttListTemp k WHERE k.ngaycapPassport = :ngaycapPassport")
    , @NamedQuery(name = "KhachhangttListTemp.findByThanhphothuongtruName", query = "SELECT k FROM KhachhangttListTemp k WHERE k.thanhphothuongtruName = :thanhphothuongtruName")
    , @NamedQuery(name = "KhachhangttListTemp.findByQuanhuyenthuongtruName", query = "SELECT k FROM KhachhangttListTemp k WHERE k.quanhuyenthuongtruName = :quanhuyenthuongtruName")
    , @NamedQuery(name = "KhachhangttListTemp.findByKhoabn", query = "SELECT k FROM KhachhangttListTemp k WHERE k.khoabn = :khoabn")
    , @NamedQuery(name = "KhachhangttListTemp.findByUserId", query = "SELECT k FROM KhachhangttListTemp k WHERE k.userId = :userId")
    , @NamedQuery(name = "KhachhangttListTemp.findByIdcode", query = "SELECT k FROM KhachhangttListTemp k WHERE k.idcode = :idcode")
    , @NamedQuery(name = "KhachhangttListTemp.findByShshis", query = "SELECT k FROM KhachhangttListTemp k WHERE k.shshis = :shshis")
    , @NamedQuery(name = "KhachhangttListTemp.findBySobn", query = "SELECT k FROM KhachhangttListTemp k WHERE k.sobn = :sobn")
    , @NamedQuery(name = "KhachhangttListTemp.findByNgayChuanhoa", query = "SELECT k FROM KhachhangttListTemp k WHERE k.ngayChuanhoa = :ngayChuanhoa")
    , @NamedQuery(name = "KhachhangttListTemp.findByIdNvChuanhoa", query = "SELECT k FROM KhachhangttListTemp k WHERE k.idNvChuanhoa = :idNvChuanhoa")})
public class KhachhangttListTemp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 100)
    @Column(name = "ID_KHACHHANG")
    private String idKhachhang;
    @Size(max = 100)
    @Column(name = "TEN")
    private String ten;
    @Size(max = 100)
    @Column(name = "TEN_KHONGDAU")
    private String tenKhongdau;
    @Size(max = 100)
    @Column(name = "HO")
    private String ho;
    @Size(max = 100)
    @Column(name = "HO_KHONGDAU")
    private String hoKhongdau;
    @Size(max = 500)
    @Column(name = "HOTEN")
    private String hoten;
    @Size(max = 40)
    @Column(name = "GIOITINH")
    private String gioitinh;
    @Size(max = 1500)
    @Column(name = "SONHA_HIENTAI")
    private String sonhaHientai;
    @Size(max = 500)
    @Column(name = "QUAN_HIENTAI")
    private String quanHientai;
    @Size(max = 100)
    @Column(name = "TP_HIENTAI")
    private String tpHientai;
    @Size(max = 100)
    @Column(name = "DIENTHOAI_BAN")
    private String dienthoaiBan;
    @Size(max = 100)
    @Column(name = "DIDONG1")
    private String didong1;
    @Size(max = 100)
    @Column(name = "DIDONG2")
    private String didong2;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 200)
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "NGAYSINH")
    private BigInteger ngaysinh;
    @Column(name = "THANGSINH")
    private BigInteger thangsinh;
    @Column(name = "NAMSINH")
    private BigInteger namsinh;
    @Size(max = 500)
    @Column(name = "SONHA_THUONGTRU")
    private String sonhaThuongtru;
    @Size(max = 100)
    @Column(name = "QUAN_THUONGTRU")
    private String quanThuongtru;
    @Size(max = 100)
    @Column(name = "THANHPHO_THUONGTRU")
    private String thanhphoThuongtru;
    @Size(max = 1000)
    @Column(name = "MOTATHEM_KHACHHANG")
    private String motathemKhachhang;
    @Size(max = 100)
    @Column(name = "SOCHUNGMINH")
    private String sochungminh;
    @Column(name = "NGAYCAP")
    @Temporal(TemporalType.DATE)
    private Date ngaycap;
    @Size(max = 100)
    @Column(name = "GIAY_PLX")
    private String giayPlx;
    @Column(name = "NGAYCAP_GPLX")
    @Temporal(TemporalType.DATE)
    private Date ngaycapGplx;
    @Size(max = 100)
    @Column(name = "SOTAIKHOAN")
    private String sotaikhoan;
    @Size(max = 40)
    @Column(name = "ID_BANK")
    private String idBank;
    @Size(max = 1)
    @Column(name = "DV_SMS")
    private String dvSms;
    @Size(max = 1)
    @Column(name = "VIPHAMAML")
    private String viphamaml;
    @Size(max = 1)
    @Column(name = "HUYCHI")
    private String huychi;
    @Size(max = 40)
    @Column(name = "MAKER_ID")
    private String makerId;
    @Column(name = "NGAY_KHOITAO")
    @Temporal(TemporalType.DATE)
    private Date ngayKhoitao;
    @Column(name = "DATE_MODIFIED")
    @Temporal(TemporalType.DATE)
    private Date dateModified;
    @Size(max = 1)
    @Column(name = "DUYET")
    private String duyet;
    @Size(max = 100)
    @Column(name = "ID_NV_DUYET")
    private String idNvDuyet;
    @Column(name = "NGAYDUYET")
    @Temporal(TemporalType.DATE)
    private Date ngayduyet;
    @Size(max = 1000)
    @Column(name = "RECORD_NOTE")
    private String recordNote;
    @Size(max = 1)
    @Column(name = "ID_VALIDITY")
    private String idValidity;
    @Size(max = 40)
    @Column(name = "MA_KHACHHANG_OLD")
    private String maKhachhangOld;
    @Size(max = 40)
    @Column(name = "ID_CHINHANH")
    private String idChinhanh;
    @Column(name = "NGAYCAP_CMND")
    @Temporal(TemporalType.DATE)
    private Date ngaycapCmnd;
    @Column(name = "STTKH")
    private BigInteger sttkh;
    @Size(max = 1)
    @Column(name = "DACHUANHOA")
    private String dachuanhoa;
    @Size(max = 40)
    @Column(name = "ID_THANHTOAN")
    private String idThanhtoan;
    @Size(max = 40)
    @Column(name = "ID_NOICAPCMND")
    private String idNoicapcmnd;
    @Size(max = 400)
    @Column(name = "NOICAPCMND_NAME")
    private String noicapcmndName;
    @Size(max = 40)
    @Column(name = "ID_NOICAPGPLX")
    private String idNoicapgplx;
    @Size(max = 440)
    @Column(name = "NOICAPGPLX_NAME")
    private String noicapgplxName;
    @Size(max = 40)
    @Column(name = "ID_NOICAPPASSPORT")
    private String idNoicappassport;
    @Size(max = 440)
    @Column(name = "NOICAPPASS_NAME")
    private String noicappassName;
    @Size(max = 40)
    @Column(name = "PASSPORT")
    private String passport;
    @Column(name = "NGAYCAP_PASSPORT")
    @Temporal(TemporalType.DATE)
    private Date ngaycapPassport;
    @Size(max = 540)
    @Column(name = "THANHPHOTHUONGTRU_NAME")
    private String thanhphothuongtruName;
    @Size(max = 540)
    @Column(name = "QUANHUYENTHUONGTRU_NAME")
    private String quanhuyenthuongtruName;
    @Size(max = 440)
    @Column(name = "KHOABN")
    private String khoabn;
    @Size(max = 40)
    @Column(name = "USER_ID")
    private String userId;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "IDCODE")
    private String idcode;
    @Column(name = "SHSHIS")
    private BigInteger shshis;
    @Size(max = 40)
    @Column(name = "SOBN")
    private String sobn;
    @Column(name = "NGAY_CHUANHOA")
    @Temporal(TemporalType.DATE)
    private Date ngayChuanhoa;
    @Size(max = 40)
    @Column(name = "ID_NV_CHUANHOA")
    private String idNvChuanhoa;

    public KhachhangttListTemp() {
    }

    public KhachhangttListTemp(String idcode) {
        this.idcode = idcode;
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

    public BigInteger getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(BigInteger ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public BigInteger getThangsinh() {
        return thangsinh;
    }

    public void setThangsinh(BigInteger thangsinh) {
        this.thangsinh = thangsinh;
    }

    public BigInteger getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(BigInteger namsinh) {
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

    public String getNoicapcmndName() {
        return noicapcmndName;
    }

    public void setNoicapcmndName(String noicapcmndName) {
        this.noicapcmndName = noicapcmndName;
    }

    public String getIdNoicapgplx() {
        return idNoicapgplx;
    }

    public void setIdNoicapgplx(String idNoicapgplx) {
        this.idNoicapgplx = idNoicapgplx;
    }

    public String getNoicapgplxName() {
        return noicapgplxName;
    }

    public void setNoicapgplxName(String noicapgplxName) {
        this.noicapgplxName = noicapgplxName;
    }

    public String getIdNoicappassport() {
        return idNoicappassport;
    }

    public void setIdNoicappassport(String idNoicappassport) {
        this.idNoicappassport = idNoicappassport;
    }

    public String getNoicappassName() {
        return noicappassName;
    }

    public void setNoicappassName(String noicappassName) {
        this.noicappassName = noicappassName;
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

    public String getThanhphothuongtruName() {
        return thanhphothuongtruName;
    }

    public void setThanhphothuongtruName(String thanhphothuongtruName) {
        this.thanhphothuongtruName = thanhphothuongtruName;
    }

    public String getQuanhuyenthuongtruName() {
        return quanhuyenthuongtruName;
    }

    public void setQuanhuyenthuongtruName(String quanhuyenthuongtruName) {
        this.quanhuyenthuongtruName = quanhuyenthuongtruName;
    }

    public String getKhoabn() {
        return khoabn;
    }

    public void setKhoabn(String khoabn) {
        this.khoabn = khoabn;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getIdcode() {
        return idcode;
    }

    public void setIdcode(String idcode) {
        this.idcode = idcode;
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

    public Date getNgayChuanhoa() {
        return ngayChuanhoa;
    }

    public void setNgayChuanhoa(Date ngayChuanhoa) {
        this.ngayChuanhoa = ngayChuanhoa;
    }

    public String getIdNvChuanhoa() {
        return idNvChuanhoa;
    }

    public void setIdNvChuanhoa(String idNvChuanhoa) {
        this.idNvChuanhoa = idNvChuanhoa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcode != null ? idcode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KhachhangttListTemp)) {
            return false;
        }
        KhachhangttListTemp other = (KhachhangttListTemp) object;
        if ((this.idcode == null && other.idcode != null) || (this.idcode != null && !this.idcode.equals(other.idcode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entitieskhout.KhachhangttListTemp[ idcode=" + idcode + " ]";
    }
    
}
