 
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

 
@Entity
@Table(name = "KHACHHANGTT_LIST")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "KhachhangttList.findAll", query = "SELECT k FROM KhachhangttList k")
    , @NamedQuery(name = "KhachhangttList.findByIdKhachhang", query = "SELECT k FROM KhachhangttList k WHERE k.idKhachhang = :idKhachhang")
    , @NamedQuery(name = "KhachhangttList.findByDachuanhoa", query = "SELECT k FROM KhachhangttList k WHERE k.dachuanhoa = :dachuanhoa")
    , @NamedQuery(name = "KhachhangttList.findByDateModified", query = "SELECT k FROM KhachhangttList k WHERE k.dateModified = :dateModified")
    , @NamedQuery(name = "KhachhangttList.findByDidong1", query = "SELECT k FROM KhachhangttList k WHERE k.didong1 = :didong1")
    , @NamedQuery(name = "KhachhangttList.findByDidong2", query = "SELECT k FROM KhachhangttList k WHERE k.didong2 = :didong2")
    , @NamedQuery(name = "KhachhangttList.findByDienthoaiBan", query = "SELECT k FROM KhachhangttList k WHERE k.dienthoaiBan = :dienthoaiBan")
    , @NamedQuery(name = "KhachhangttList.findByDuyet", query = "SELECT k FROM KhachhangttList k WHERE k.duyet = :duyet")
    , @NamedQuery(name = "KhachhangttList.findByDvSms", query = "SELECT k FROM KhachhangttList k WHERE k.dvSms = :dvSms")
    , @NamedQuery(name = "KhachhangttList.findByEmail", query = "SELECT k FROM KhachhangttList k WHERE k.email = :email")
    , @NamedQuery(name = "KhachhangttList.findByGhichu", query = "SELECT k FROM KhachhangttList k WHERE k.ghichu = :ghichu")
    , @NamedQuery(name = "KhachhangttList.findByGiayPlx", query = "SELECT k FROM KhachhangttList k WHERE k.giayPlx = :giayPlx")
    , @NamedQuery(name = "KhachhangttList.findByGioitinh", query = "SELECT k FROM KhachhangttList k WHERE k.gioitinh = :gioitinh")
    , @NamedQuery(name = "KhachhangttList.findByHo", query = "SELECT k FROM KhachhangttList k WHERE k.ho = :ho")
    , @NamedQuery(name = "KhachhangttList.findByHoKhongdau", query = "SELECT k FROM KhachhangttList k WHERE k.hoKhongdau = :hoKhongdau")
    , @NamedQuery(name = "KhachhangttList.findByHoten", query = "SELECT k FROM KhachhangttList k WHERE k.hoten = :hoten")
    , @NamedQuery(name = "KhachhangttList.findByHuychi", query = "SELECT k FROM KhachhangttList k WHERE k.huychi = :huychi")
    , @NamedQuery(name = "KhachhangttList.findByIdBank", query = "SELECT k FROM KhachhangttList k WHERE k.idBank = :idBank")
    , @NamedQuery(name = "KhachhangttList.findByIdChinhanh", query = "SELECT k FROM KhachhangttList k WHERE k.idChinhanh = :idChinhanh")
    , @NamedQuery(name = "KhachhangttList.findByIdLoaictgiaodich", query = "SELECT k FROM KhachhangttList k WHERE k.idLoaictgiaodich = :idLoaictgiaodich")
    , @NamedQuery(name = "KhachhangttList.findByIdNoicapcmnd", query = "SELECT k FROM KhachhangttList k WHERE k.idNoicapcmnd = :idNoicapcmnd")
    , @NamedQuery(name = "KhachhangttList.findByIdNoicapgplx", query = "SELECT k FROM KhachhangttList k WHERE k.idNoicapgplx = :idNoicapgplx")
    , @NamedQuery(name = "KhachhangttList.findByIdNoicappassport", query = "SELECT k FROM KhachhangttList k WHERE k.idNoicappassport = :idNoicappassport")
    , @NamedQuery(name = "KhachhangttList.findByIdNvChuanhoa", query = "SELECT k FROM KhachhangttList k WHERE k.idNvChuanhoa = :idNvChuanhoa")
    , @NamedQuery(name = "KhachhangttList.findByIdNvDuyet", query = "SELECT k FROM KhachhangttList k WHERE k.idNvDuyet = :idNvDuyet")
    , @NamedQuery(name = "KhachhangttList.findByIdNvUpdate", query = "SELECT k FROM KhachhangttList k WHERE k.idNvUpdate = :idNvUpdate")
    , @NamedQuery(name = "KhachhangttList.findByIdRecordtam", query = "SELECT k FROM KhachhangttList k WHERE k.idRecordtam = :idRecordtam")
    , @NamedQuery(name = "KhachhangttList.findByIdThanhtoan", query = "SELECT k FROM KhachhangttList k WHERE k.idThanhtoan = :idThanhtoan")
    , @NamedQuery(name = "KhachhangttList.findByIdValidity", query = "SELECT k FROM KhachhangttList k WHERE k.idValidity = :idValidity")
    , @NamedQuery(name = "KhachhangttList.findByKhonglienlacduoc", query = "SELECT k FROM KhachhangttList k WHERE k.khonglienlacduoc = :khonglienlacduoc")
    , @NamedQuery(name = "KhachhangttList.findByLydoKhonglienlacduoc", query = "SELECT k FROM KhachhangttList k WHERE k.lydoKhonglienlacduoc = :lydoKhonglienlacduoc")
    , @NamedQuery(name = "KhachhangttList.findByMaKhachhangOld", query = "SELECT k FROM KhachhangttList k WHERE k.maKhachhangOld = :maKhachhangOld")
    , @NamedQuery(name = "KhachhangttList.findByMaLydokhonglienlacduoc", query = "SELECT k FROM KhachhangttList k WHERE k.maLydokhonglienlacduoc = :maLydokhonglienlacduoc")
    , @NamedQuery(name = "KhachhangttList.findByMakerId", query = "SELECT k FROM KhachhangttList k WHERE k.makerId = :makerId")
    , @NamedQuery(name = "KhachhangttList.findByMotathemKhachhang", query = "SELECT k FROM KhachhangttList k WHERE k.motathemKhachhang = :motathemKhachhang")
    , @NamedQuery(name = "KhachhangttList.findByNamsinh", query = "SELECT k FROM KhachhangttList k WHERE k.namsinh = :namsinh")
    , @NamedQuery(name = "KhachhangttList.findByNgayChuanhoa", query = "SELECT k FROM KhachhangttList k WHERE k.ngayChuanhoa = :ngayChuanhoa")
    , @NamedQuery(name = "KhachhangttList.findByNgayKhoitao", query = "SELECT k FROM KhachhangttList k WHERE k.ngayKhoitao = :ngayKhoitao")
    , @NamedQuery(name = "KhachhangttList.findByNgaycap", query = "SELECT k FROM KhachhangttList k WHERE k.ngaycap = :ngaycap")
    , @NamedQuery(name = "KhachhangttList.findByNgaycapCmnd", query = "SELECT k FROM KhachhangttList k WHERE k.ngaycapCmnd = :ngaycapCmnd")
    , @NamedQuery(name = "KhachhangttList.findByNgaycapGplx", query = "SELECT k FROM KhachhangttList k WHERE k.ngaycapGplx = :ngaycapGplx")
    , @NamedQuery(name = "KhachhangttList.findByNgaycapPassport", query = "SELECT k FROM KhachhangttList k WHERE k.ngaycapPassport = :ngaycapPassport")
    , @NamedQuery(name = "KhachhangttList.findByNgayduyet", query = "SELECT k FROM KhachhangttList k WHERE k.ngayduyet = :ngayduyet")
    , @NamedQuery(name = "KhachhangttList.findByNgaysinh", query = "SELECT k FROM KhachhangttList k WHERE k.ngaysinh = :ngaysinh")
    , @NamedQuery(name = "KhachhangttList.findByPassport", query = "SELECT k FROM KhachhangttList k WHERE k.passport = :passport")
    , @NamedQuery(name = "KhachhangttList.findByQuanHientai", query = "SELECT k FROM KhachhangttList k WHERE k.quanHientai = :quanHientai")
    , @NamedQuery(name = "KhachhangttList.findByQuanThuongtru", query = "SELECT k FROM KhachhangttList k WHERE k.quanThuongtru = :quanThuongtru")
    , @NamedQuery(name = "KhachhangttList.findByRecordNote", query = "SELECT k FROM KhachhangttList k WHERE k.recordNote = :recordNote")
    , @NamedQuery(name = "KhachhangttList.findBySochungminh", query = "SELECT k FROM KhachhangttList k WHERE k.sochungminh = :sochungminh")
    , @NamedQuery(name = "KhachhangttList.findBySonhaHientai", query = "SELECT k FROM KhachhangttList k WHERE k.sonhaHientai = :sonhaHientai")
    , @NamedQuery(name = "KhachhangttList.findBySonhaThuongtru", query = "SELECT k FROM KhachhangttList k WHERE k.sonhaThuongtru = :sonhaThuongtru")
    , @NamedQuery(name = "KhachhangttList.findBySotaikhoan", query = "SELECT k FROM KhachhangttList k WHERE k.sotaikhoan = :sotaikhoan")
    , @NamedQuery(name = "KhachhangttList.findBySttkh", query = "SELECT k FROM KhachhangttList k WHERE k.sttkh = :sttkh")
    , @NamedQuery(name = "KhachhangttList.findByTen", query = "SELECT k FROM KhachhangttList k WHERE k.ten = :ten")
    , @NamedQuery(name = "KhachhangttList.findByTenKhongdau", query = "SELECT k FROM KhachhangttList k WHERE k.tenKhongdau = :tenKhongdau")
    , @NamedQuery(name = "KhachhangttList.findByThangsinh", query = "SELECT k FROM KhachhangttList k WHERE k.thangsinh = :thangsinh")
    , @NamedQuery(name = "KhachhangttList.findByThanhphoThuongtru", query = "SELECT k FROM KhachhangttList k WHERE k.thanhphoThuongtru = :thanhphoThuongtru")
    , @NamedQuery(name = "KhachhangttList.findByTpHientai", query = "SELECT k FROM KhachhangttList k WHERE k.tpHientai = :tpHientai")
    , @NamedQuery(name = "KhachhangttList.findByViphamaml", query = "SELECT k FROM KhachhangttList k WHERE k.viphamaml = :viphamaml")})
public class KhachhangttList implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "ID_KHACHHANG")
    private String idKhachhang;
    @Size(max = 255)
    @Column(name = "DACHUANHOA")
    private String dachuanhoa;
    @Column(name = "DATE_MODIFIED")
    @Temporal(TemporalType.DATE)
    private Date dateModified;
    @Size(max = 255)
    @Column(name = "DIDONG1")
    private String didong1;
    @Size(max = 255)
    @Column(name = "DIDONG2")
    private String didong2;
    @Size(max = 255)
    @Column(name = "DIENTHOAI_BAN")
    private String dienthoaiBan;
    @Size(max = 255)
    @Column(name = "DUYET")
    private String duyet;
    @Size(max = 255)
    @Column(name = "DV_SMS")
    private String dvSms;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 255)
    @Column(name = "EMAIL")
    private String email;
    @Size(max = 255)
    @Column(name = "GHICHU")
    private String ghichu;
    @Size(max = 255)
    @Column(name = "GIAY_PLX")
    private String giayPlx;
    @Size(max = 255)
    @Column(name = "GIOITINH")
    private String gioitinh;
    @Size(max = 255)
    @Column(name = "HO")
    private String ho;
    @Size(max = 255)
    @Column(name = "HO_KHONGDAU")
    private String hoKhongdau;
    @Size(max = 255)
    @Column(name = "HOTEN")
    private String hoten;
    @Size(max = 255)
    @Column(name = "HUYCHI")
    private String huychi;
    @Size(max = 255)
    @Column(name = "ID_BANK")
    private String idBank;
    @Size(max = 255)
    @Column(name = "ID_CHINHANH")
    private String idChinhanh;
    @Size(max = 255)
    @Column(name = "ID_LOAICTGIAODICH")
    private String idLoaictgiaodich;
    @Size(max = 255)
    @Column(name = "ID_NOICAPCMND")
    private String idNoicapcmnd;
    @Size(max = 255)
    @Column(name = "ID_NOICAPGPLX")
    private String idNoicapgplx;
    @Size(max = 255)
    @Column(name = "ID_NOICAPPASSPORT")
    private String idNoicappassport;
    @Size(max = 255)
    @Column(name = "ID_NV_CHUANHOA")
    private String idNvChuanhoa;
    @Size(max = 255)
    @Column(name = "ID_NV_DUYET")
    private String idNvDuyet;
    @Size(max = 255)
    @Column(name = "ID_NV_UPDATE")
    private String idNvUpdate;
    @Size(max = 255)
    @Column(name = "ID_RECORDTAM")
    private String idRecordtam;
    @Size(max = 255)
    @Column(name = "ID_THANHTOAN")
    private String idThanhtoan;
    @Size(max = 255)
    @Column(name = "ID_VALIDITY")
    private String idValidity;
    @Size(max = 255)
    @Column(name = "KHONGLIENLACDUOC")
    private String khonglienlacduoc;
    @Size(max = 255)
    @Column(name = "LYDO_KHONGLIENLACDUOC")
    private String lydoKhonglienlacduoc;
    @Size(max = 255)
    @Column(name = "MA_KHACHHANG_OLD")
    private String maKhachhangOld;
    @Size(max = 255)
    @Column(name = "MA_LYDOKHONGLIENLACDUOC")
    private String maLydokhonglienlacduoc;
    @Size(max = 255)
    @Column(name = "MAKER_ID")
    private String makerId;
    @Size(max = 255)
    @Column(name = "MOTATHEM_KHACHHANG")
    private String motathemKhachhang;
    @Size(max = 255)
    @Column(name = "NAMSINH")
    private String namsinh;
    @Column(name = "NGAY_CHUANHOA")
    @Temporal(TemporalType.DATE)
    private Date ngayChuanhoa;
    @Column(name = "NGAY_KHOITAO")
    @Temporal(TemporalType.DATE)
    private Date ngayKhoitao;
    @Column(name = "NGAYCAP")
    @Temporal(TemporalType.DATE)
    private Date ngaycap;
    @Column(name = "NGAYCAP_CMND")
    @Temporal(TemporalType.DATE)
    private Date ngaycapCmnd;
    @Column(name = "NGAYCAP_GPLX")
    @Temporal(TemporalType.DATE)
    private Date ngaycapGplx;
    @Column(name = "NGAYCAP_PASSPORT")
    @Temporal(TemporalType.DATE)
    private Date ngaycapPassport;
    @Column(name = "NGAYDUYET")
    @Temporal(TemporalType.DATE)
    private Date ngayduyet;
    @Column(name = "NGAYSINH")
    @Temporal(TemporalType.DATE)
    private Date ngaysinh;
    @Size(max = 255)
    @Column(name = "PASSPORT")
    private String passport;
    @Size(max = 255)
    @Column(name = "QUAN_HIENTAI")
    private String quanHientai;
    @Size(max = 255)
    @Column(name = "QUAN_THUONGTRU")
    private String quanThuongtru;
    @Size(max = 255)
    @Column(name = "RECORD_NOTE")
    private String recordNote;
    @Size(max = 255)
    @Column(name = "SOCHUNGMINH")
    private String sochungminh;
    @Size(max = 255)
    @Column(name = "SONHA_HIENTAI")
    private String sonhaHientai;
    @Size(max = 255)
    @Column(name = "SONHA_THUONGTRU")
    private String sonhaThuongtru;
    @Size(max = 255)
    @Column(name = "SOTAIKHOAN")
    private String sotaikhoan;
    @Column(name = "STTKH")
    private BigInteger sttkh;
    @Size(max = 255)
    @Column(name = "TEN")
    private String ten;
    @Size(max = 255)
    @Column(name = "TEN_KHONGDAU")
    private String tenKhongdau;
    @Size(max = 255)
    @Column(name = "THANGSINH")
    private String thangsinh;
    @Size(max = 255)
    @Column(name = "THANHPHO_THUONGTRU")
    private String thanhphoThuongtru;
    @Size(max = 255)
    @Column(name = "TP_HIENTAI")
    private String tpHientai;
    @Size(max = 255)
    @Column(name = "VIPHAMAML")
    private String viphamaml;

    public KhachhangttList() {
    }

    public KhachhangttList(String idKhachhang) {
        this.idKhachhang = idKhachhang;
    }

    public String getIdKhachhang() {
        return idKhachhang;
    }

    public void setIdKhachhang(String idKhachhang) {
        this.idKhachhang = idKhachhang;
    }

    public String getDachuanhoa() {
        return dachuanhoa;
    }

    public void setDachuanhoa(String dachuanhoa) {
        this.dachuanhoa = dachuanhoa;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
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

    public String getDienthoaiBan() {
        return dienthoaiBan;
    }

    public void setDienthoaiBan(String dienthoaiBan) {
        this.dienthoaiBan = dienthoaiBan;
    }

    public String getDuyet() {
        return duyet;
    }

    public void setDuyet(String duyet) {
        this.duyet = duyet;
    }

    public String getDvSms() {
        return dvSms;
    }

    public void setDvSms(String dvSms) {
        this.dvSms = dvSms;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    public String getGiayPlx() {
        return giayPlx;
    }

    public void setGiayPlx(String giayPlx) {
        this.giayPlx = giayPlx;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
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

    public String getHuychi() {
        return huychi;
    }

    public void setHuychi(String huychi) {
        this.huychi = huychi;
    }

    public String getIdBank() {
        return idBank;
    }

    public void setIdBank(String idBank) {
        this.idBank = idBank;
    }

    public String getIdChinhanh() {
        return idChinhanh;
    }

    public void setIdChinhanh(String idChinhanh) {
        this.idChinhanh = idChinhanh;
    }

    public String getIdLoaictgiaodich() {
        return idLoaictgiaodich;
    }

    public void setIdLoaictgiaodich(String idLoaictgiaodich) {
        this.idLoaictgiaodich = idLoaictgiaodich;
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

    public String getIdNvChuanhoa() {
        return idNvChuanhoa;
    }

    public void setIdNvChuanhoa(String idNvChuanhoa) {
        this.idNvChuanhoa = idNvChuanhoa;
    }

    public String getIdNvDuyet() {
        return idNvDuyet;
    }

    public void setIdNvDuyet(String idNvDuyet) {
        this.idNvDuyet = idNvDuyet;
    }

    public String getIdNvUpdate() {
        return idNvUpdate;
    }

    public void setIdNvUpdate(String idNvUpdate) {
        this.idNvUpdate = idNvUpdate;
    }

    public String getIdRecordtam() {
        return idRecordtam;
    }

    public void setIdRecordtam(String idRecordtam) {
        this.idRecordtam = idRecordtam;
    }

    public String getIdThanhtoan() {
        return idThanhtoan;
    }

    public void setIdThanhtoan(String idThanhtoan) {
        this.idThanhtoan = idThanhtoan;
    }

    public String getIdValidity() {
        return idValidity;
    }

    public void setIdValidity(String idValidity) {
        this.idValidity = idValidity;
    }

    public String getKhonglienlacduoc() {
        return khonglienlacduoc;
    }

    public void setKhonglienlacduoc(String khonglienlacduoc) {
        this.khonglienlacduoc = khonglienlacduoc;
    }

    public String getLydoKhonglienlacduoc() {
        return lydoKhonglienlacduoc;
    }

    public void setLydoKhonglienlacduoc(String lydoKhonglienlacduoc) {
        this.lydoKhonglienlacduoc = lydoKhonglienlacduoc;
    }

    public String getMaKhachhangOld() {
        return maKhachhangOld;
    }

    public void setMaKhachhangOld(String maKhachhangOld) {
        this.maKhachhangOld = maKhachhangOld;
    }

    public String getMaLydokhonglienlacduoc() {
        return maLydokhonglienlacduoc;
    }

    public void setMaLydokhonglienlacduoc(String maLydokhonglienlacduoc) {
        this.maLydokhonglienlacduoc = maLydokhonglienlacduoc;
    }

    public String getMakerId() {
        return makerId;
    }

    public void setMakerId(String makerId) {
        this.makerId = makerId;
    }

    public String getMotathemKhachhang() {
        return motathemKhachhang;
    }

    public void setMotathemKhachhang(String motathemKhachhang) {
        this.motathemKhachhang = motathemKhachhang;
    }

    public String getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(String namsinh) {
        this.namsinh = namsinh;
    }

    public Date getNgayChuanhoa() {
        return ngayChuanhoa;
    }

    public void setNgayChuanhoa(Date ngayChuanhoa) {
        this.ngayChuanhoa = ngayChuanhoa;
    }

    public Date getNgayKhoitao() {
        return ngayKhoitao;
    }

    public void setNgayKhoitao(Date ngayKhoitao) {
        this.ngayKhoitao = ngayKhoitao;
    }

    public Date getNgaycap() {
        return ngaycap;
    }

    public void setNgaycap(Date ngaycap) {
        this.ngaycap = ngaycap;
    }

    public Date getNgaycapCmnd() {
        return ngaycapCmnd;
    }

    public void setNgaycapCmnd(Date ngaycapCmnd) {
        this.ngaycapCmnd = ngaycapCmnd;
    }

    public Date getNgaycapGplx() {
        return ngaycapGplx;
    }

    public void setNgaycapGplx(Date ngaycapGplx) {
        this.ngaycapGplx = ngaycapGplx;
    }

    public Date getNgaycapPassport() {
        return ngaycapPassport;
    }

    public void setNgaycapPassport(Date ngaycapPassport) {
        this.ngaycapPassport = ngaycapPassport;
    }

    public Date getNgayduyet() {
        return ngayduyet;
    }

    public void setNgayduyet(Date ngayduyet) {
        this.ngayduyet = ngayduyet;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getQuanHientai() {
        return quanHientai;
    }

    public void setQuanHientai(String quanHientai) {
        this.quanHientai = quanHientai;
    }

    public String getQuanThuongtru() {
        return quanThuongtru;
    }

    public void setQuanThuongtru(String quanThuongtru) {
        this.quanThuongtru = quanThuongtru;
    }

    public String getRecordNote() {
        return recordNote;
    }

    public void setRecordNote(String recordNote) {
        this.recordNote = recordNote;
    }

    public String getSochungminh() {
        return sochungminh;
    }

    public void setSochungminh(String sochungminh) {
        this.sochungminh = sochungminh;
    }

    public String getSonhaHientai() {
        return sonhaHientai;
    }

    public void setSonhaHientai(String sonhaHientai) {
        this.sonhaHientai = sonhaHientai;
    }

    public String getSonhaThuongtru() {
        return sonhaThuongtru;
    }

    public void setSonhaThuongtru(String sonhaThuongtru) {
        this.sonhaThuongtru = sonhaThuongtru;
    }

    public String getSotaikhoan() {
        return sotaikhoan;
    }

    public void setSotaikhoan(String sotaikhoan) {
        this.sotaikhoan = sotaikhoan;
    }

    public BigInteger getSttkh() {
        return sttkh;
    }

    public void setSttkh(BigInteger sttkh) {
        this.sttkh = sttkh;
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

    public String getThangsinh() {
        return thangsinh;
    }

    public void setThangsinh(String thangsinh) {
        this.thangsinh = thangsinh;
    }

    public String getThanhphoThuongtru() {
        return thanhphoThuongtru;
    }

    public void setThanhphoThuongtru(String thanhphoThuongtru) {
        this.thanhphoThuongtru = thanhphoThuongtru;
    }

    public String getTpHientai() {
        return tpHientai;
    }

    public void setTpHientai(String tpHientai) {
        this.tpHientai = tpHientai;
    }

    public String getViphamaml() {
        return viphamaml;
    }

    public void setViphamaml(String viphamaml) {
        this.viphamaml = viphamaml;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idKhachhang != null ? idKhachhang.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KhachhangttList)) {
            return false;
        }
        KhachhangttList other = (KhachhangttList) object;
        if ((this.idKhachhang == null && other.idKhachhang != null) || (this.idKhachhang != null && !this.idKhachhang.equals(other.idKhachhang))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entitieskhout.KhachhangttList[ idKhachhang=" + idKhachhang + " ]";
    }
    
}
