 
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

 
@Entity
@Table(name = "VW_KHACHHANGTT_LIST_WEB")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwKhachhangttListWeb.findAll", query = "SELECT v FROM VwKhachhangttListWeb v"),
    @NamedQuery(name = "VwKhachhangttListWeb.findByIdKhachhang", query = "SELECT v FROM VwKhachhangttListWeb v WHERE v.idKhachhang = :idKhachhang"),
    @NamedQuery(name = "VwKhachhangttListWeb.findByTen", query = "SELECT v FROM VwKhachhangttListWeb v WHERE v.ten = :ten"),
    @NamedQuery(name = "VwKhachhangttListWeb.findByTenKhongdau", query = "SELECT v FROM VwKhachhangttListWeb v WHERE v.tenKhongdau = :tenKhongdau"),
    @NamedQuery(name = "VwKhachhangttListWeb.findByHo", query = "SELECT v FROM VwKhachhangttListWeb v WHERE v.ho = :ho"),
    @NamedQuery(name = "VwKhachhangttListWeb.findByHoKhongdau", query = "SELECT v FROM VwKhachhangttListWeb v WHERE v.hoKhongdau = :hoKhongdau"),
    @NamedQuery(name = "VwKhachhangttListWeb.findByHoten", query = "SELECT v FROM VwKhachhangttListWeb v WHERE v.hoten = :hoten"),
    @NamedQuery(name = "VwKhachhangttListWeb.findByGioitinh", query = "SELECT v FROM VwKhachhangttListWeb v WHERE v.gioitinh = :gioitinh"),
    @NamedQuery(name = "VwKhachhangttListWeb.findBySonhaHientai", query = "SELECT v FROM VwKhachhangttListWeb v WHERE v.sonhaHientai = :sonhaHientai"),
    @NamedQuery(name = "VwKhachhangttListWeb.findByQuanHientai", query = "SELECT v FROM VwKhachhangttListWeb v WHERE v.quanHientai = :quanHientai"),
    @NamedQuery(name = "VwKhachhangttListWeb.findByTpHientai", query = "SELECT v FROM VwKhachhangttListWeb v WHERE v.tpHientai = :tpHientai"),
    @NamedQuery(name = "VwKhachhangttListWeb.findByDienthoaiBan", query = "SELECT v FROM VwKhachhangttListWeb v WHERE v.dienthoaiBan = :dienthoaiBan"),
    @NamedQuery(name = "VwKhachhangttListWeb.findByDidong1", query = "SELECT v FROM VwKhachhangttListWeb v WHERE v.didong1 = :didong1"),
    @NamedQuery(name = "VwKhachhangttListWeb.findByDidong2", query = "SELECT v FROM VwKhachhangttListWeb v WHERE v.didong2 = :didong2"),
    @NamedQuery(name = "VwKhachhangttListWeb.findByEmail", query = "SELECT v FROM VwKhachhangttListWeb v WHERE v.email = :email"),
    @NamedQuery(name = "VwKhachhangttListWeb.findByNgaysinh", query = "SELECT v FROM VwKhachhangttListWeb v WHERE v.ngaysinh = :ngaysinh"),
    @NamedQuery(name = "VwKhachhangttListWeb.findByThangsinh", query = "SELECT v FROM VwKhachhangttListWeb v WHERE v.thangsinh = :thangsinh"),
    @NamedQuery(name = "VwKhachhangttListWeb.findByNamsinh", query = "SELECT v FROM VwKhachhangttListWeb v WHERE v.namsinh = :namsinh"),
    @NamedQuery(name = "VwKhachhangttListWeb.findBySonhaThuongtru", query = "SELECT v FROM VwKhachhangttListWeb v WHERE v.sonhaThuongtru = :sonhaThuongtru"),
    @NamedQuery(name = "VwKhachhangttListWeb.findByQuanThuongtru", query = "SELECT v FROM VwKhachhangttListWeb v WHERE v.quanThuongtru = :quanThuongtru"),
    @NamedQuery(name = "VwKhachhangttListWeb.findByThanhphoThuongtru", query = "SELECT v FROM VwKhachhangttListWeb v WHERE v.thanhphoThuongtru = :thanhphoThuongtru"),
    @NamedQuery(name = "VwKhachhangttListWeb.findByMotathemKhachhang", query = "SELECT v FROM VwKhachhangttListWeb v WHERE v.motathemKhachhang = :motathemKhachhang"),
    @NamedQuery(name = "VwKhachhangttListWeb.findBySochungminh", query = "SELECT v FROM VwKhachhangttListWeb v WHERE v.sochungminh = :sochungminh"),
    @NamedQuery(name = "VwKhachhangttListWeb.findByNgaycap", query = "SELECT v FROM VwKhachhangttListWeb v WHERE v.ngaycap = :ngaycap"),
    @NamedQuery(name = "VwKhachhangttListWeb.findByGiayPlx", query = "SELECT v FROM VwKhachhangttListWeb v WHERE v.giayPlx = :giayPlx"),
    @NamedQuery(name = "VwKhachhangttListWeb.findByNgaycapGplx", query = "SELECT v FROM VwKhachhangttListWeb v WHERE v.ngaycapGplx = :ngaycapGplx"),
    @NamedQuery(name = "VwKhachhangttListWeb.findBySotaikhoan", query = "SELECT v FROM VwKhachhangttListWeb v WHERE v.sotaikhoan = :sotaikhoan"),
    @NamedQuery(name = "VwKhachhangttListWeb.findByIdBank", query = "SELECT v FROM VwKhachhangttListWeb v WHERE v.idBank = :idBank"),
    @NamedQuery(name = "VwKhachhangttListWeb.findByDvSms", query = "SELECT v FROM VwKhachhangttListWeb v WHERE v.dvSms = :dvSms"),
    @NamedQuery(name = "VwKhachhangttListWeb.findByViphamaml", query = "SELECT v FROM VwKhachhangttListWeb v WHERE v.viphamaml = :viphamaml"),
    @NamedQuery(name = "VwKhachhangttListWeb.findByHuychi", query = "SELECT v FROM VwKhachhangttListWeb v WHERE v.huychi = :huychi"),
    @NamedQuery(name = "VwKhachhangttListWeb.findByMakerId", query = "SELECT v FROM VwKhachhangttListWeb v WHERE v.makerId = :makerId"),
    @NamedQuery(name = "VwKhachhangttListWeb.findByNgayKhoitao", query = "SELECT v FROM VwKhachhangttListWeb v WHERE v.ngayKhoitao = :ngayKhoitao"),
    @NamedQuery(name = "VwKhachhangttListWeb.findByDateModified", query = "SELECT v FROM VwKhachhangttListWeb v WHERE v.dateModified = :dateModified"),
    @NamedQuery(name = "VwKhachhangttListWeb.findByDuyet", query = "SELECT v FROM VwKhachhangttListWeb v WHERE v.duyet = :duyet"),
    @NamedQuery(name = "VwKhachhangttListWeb.findByIdNvDuyet", query = "SELECT v FROM VwKhachhangttListWeb v WHERE v.idNvDuyet = :idNvDuyet"),
    @NamedQuery(name = "VwKhachhangttListWeb.findByNgayduyet", query = "SELECT v FROM VwKhachhangttListWeb v WHERE v.ngayduyet = :ngayduyet"),
    @NamedQuery(name = "VwKhachhangttListWeb.findByRecordNote", query = "SELECT v FROM VwKhachhangttListWeb v WHERE v.recordNote = :recordNote"),
    @NamedQuery(name = "VwKhachhangttListWeb.findByIdValidity", query = "SELECT v FROM VwKhachhangttListWeb v WHERE v.idValidity = :idValidity"),
    @NamedQuery(name = "VwKhachhangttListWeb.findByMaKhachhangOld", query = "SELECT v FROM VwKhachhangttListWeb v WHERE v.maKhachhangOld = :maKhachhangOld"),
    @NamedQuery(name = "VwKhachhangttListWeb.findByIdChinhanh", query = "SELECT v FROM VwKhachhangttListWeb v WHERE v.idChinhanh = :idChinhanh"),
    @NamedQuery(name = "VwKhachhangttListWeb.findByNgaycapCmnd", query = "SELECT v FROM VwKhachhangttListWeb v WHERE v.ngaycapCmnd = :ngaycapCmnd"),
    @NamedQuery(name = "VwKhachhangttListWeb.findBySttkh", query = "SELECT v FROM VwKhachhangttListWeb v WHERE v.sttkh = :sttkh"),
    @NamedQuery(name = "VwKhachhangttListWeb.findByDachuanhoa", query = "SELECT v FROM VwKhachhangttListWeb v WHERE v.dachuanhoa = :dachuanhoa"),
    @NamedQuery(name = "VwKhachhangttListWeb.findByIdThanhtoan", query = "SELECT v FROM VwKhachhangttListWeb v WHERE v.idThanhtoan = :idThanhtoan"),
    @NamedQuery(name = "VwKhachhangttListWeb.findByIdNoicapcmnd", query = "SELECT v FROM VwKhachhangttListWeb v WHERE v.idNoicapcmnd = :idNoicapcmnd"),
    @NamedQuery(name = "VwKhachhangttListWeb.findByIdNoicapgplx", query = "SELECT v FROM VwKhachhangttListWeb v WHERE v.idNoicapgplx = :idNoicapgplx"),
    @NamedQuery(name = "VwKhachhangttListWeb.findByIdNoicappassport", query = "SELECT v FROM VwKhachhangttListWeb v WHERE v.idNoicappassport = :idNoicappassport"),
    @NamedQuery(name = "VwKhachhangttListWeb.findByPassport", query = "SELECT v FROM VwKhachhangttListWeb v WHERE v.passport = :passport"),
    @NamedQuery(name = "VwKhachhangttListWeb.findByNgaycapPassport", query = "SELECT v FROM VwKhachhangttListWeb v WHERE v.ngaycapPassport = :ngaycapPassport"),
    @NamedQuery(name = "VwKhachhangttListWeb.findByThanhphothuongtruName", query = "SELECT v FROM VwKhachhangttListWeb v WHERE v.thanhphothuongtruName = :thanhphothuongtruName"),
    @NamedQuery(name = "VwKhachhangttListWeb.findByQuanhuyenthuongtruName", query = "SELECT v FROM VwKhachhangttListWeb v WHERE v.quanhuyenthuongtruName = :quanhuyenthuongtruName")})
public class VwKhachhangttListWeb implements Serializable {
    @Size(max = 4000)
    @Column(name = "KHOABN")
    private String khoabn;
    @Size(max = 4000)
    @Column(name = "NOICAPCMND_NAME")
    private String noicapcmndName;
    @Size(max = 4000)
    @Column(name = "NOICAPGPLX_NAME")
    private String noicapgplxName;
    @Size(max = 4000)
    @Column(name = "NOICAPPASS_NAME")
    private String noicappassName;
    @Column(name = "STTKH")
    private Long sttkh;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "ID_KHACHHANG")
    private String idKhachhang;
    @Size(max = 500)
    @Column(name = "TEN")
    private String ten;
    @Size(max = 500)
    @Column(name = "TEN_KHONGDAU")
    private String tenKhongdau;
    @Size(max = 500)
    @Column(name = "HO")
    private String ho;
    @Size(max = 500)
    @Column(name = "HO_KHONGDAU")
    private String hoKhongdau;
    @Size(max = 500)
    @Column(name = "HOTEN")
    private String hoten;
    @Size(max = 20)
    @Column(name = "GIOITINH")
    private String gioitinh;
    @Size(max = 200)
    @Column(name = "SONHA_HIENTAI")
    private String sonhaHientai;
    @Size(max = 40)
    @Column(name = "QUAN_HIENTAI")
    private String quanHientai;
    @Size(max = 60)
    @Column(name = "TP_HIENTAI")
    private String tpHientai;
    @Size(max = 99)
    @Column(name = "DIENTHOAI_BAN")
    private String dienthoaiBan;
    @Size(max = 60)
    @Column(name = "DIDONG1")
    private String didong1;
    @Size(max = 60)
    @Column(name = "DIDONG2")
    private String didong2;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 200)
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "NGAYSINH")
    @Temporal(TemporalType.DATE)
    private Date ngaysinh;
    @Size(max = 20)
    @Column(name = "THANGSINH")
    private String thangsinh;
    @Size(max = 20)
    @Column(name = "NAMSINH")
    private String namsinh;
    @Size(max = 1000)
    @Column(name = "SONHA_THUONGTRU")
    private String sonhaThuongtru;
    @Size(max = 60)
    @Column(name = "QUAN_THUONGTRU")
    private String quanThuongtru;
    @Size(max = 60)
    @Column(name = "THANHPHO_THUONGTRU")
    private String thanhphoThuongtru;
    @Size(max = 1000)
    @Column(name = "MOTATHEM_KHACHHANG")
    private String motathemKhachhang;
    @Size(max = 12)
    @Column(name = "SOCHUNGMINH")
    private String sochungminh;
    @Column(name = "NGAYCAP")
    @Temporal(TemporalType.DATE)
    private Date ngaycap;
    @Size(max = 40)
    @Column(name = "GIAY_PLX")
    private String giayPlx;
    @Column(name = "NGAYCAP_GPLX")
    @Temporal(TemporalType.DATE)
    private Date ngaycapGplx;
    @Size(max = 40)
    @Column(name = "SOTAIKHOAN")
    private String sotaikhoan;
    @Size(max = 20)
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
    @Size(max = 20)
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
    @Size(max = 20)
    @Column(name = "ID_NV_DUYET")
    private String idNvDuyet;
    @Column(name = "NGAYDUYET")
    @Temporal(TemporalType.DATE)
    private Date ngayduyet;
    @Size(max = 2000)
    @Column(name = "RECORD_NOTE")
    private String recordNote;
    @Size(max = 1)
    @Column(name = "ID_VALIDITY")
    private String idValidity;
    @Size(max = 40)
    @Column(name = "MA_KHACHHANG_OLD")
    private String maKhachhangOld;
    @Size(max = 20)
    @Column(name = "ID_CHINHANH")
    private String idChinhanh;
    @Column(name = "NGAYCAP_CMND")
    @Temporal(TemporalType.DATE)
    private Date ngaycapCmnd;
    @Size(max = 1)
    @Column(name = "DACHUANHOA")
    private String dachuanhoa;
    @Size(max = 20)
    @Column(name = "ID_THANHTOAN")
    private String idThanhtoan;
    @Size(max = 40)
    @Column(name = "ID_NOICAPCMND")
    private String idNoicapcmnd;
    @Size(max = 40)
    @Column(name = "ID_NOICAPGPLX")
    private String idNoicapgplx;
    @Size(max = 40)
    @Column(name = "ID_NOICAPPASSPORT")
    private String idNoicappassport;
    @Size(max = 40)
    @Column(name = "PASSPORT")
    private String passport;
    @Column(name = "NGAYCAP_PASSPORT")
    @Temporal(TemporalType.DATE)
    private Date ngaycapPassport;
    @Size(max = 4000)
    @Column(name = "THANHPHOTHUONGTRU_NAME")
    private String thanhphothuongtruName;
    @Size(max = 4000)
    @Column(name = "QUANHUYENTHUONGTRU_NAME")
    private String quanhuyenthuongtruName;
    
    

    public VwKhachhangttListWeb() {
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

    public Long getSttkh() {
        return sttkh;
    }

    public void setSttkh(Long sttkh) {
        this.sttkh = sttkh;
    }

    public String getNoicapcmndName() {
        return noicapcmndName;
    }

    public void setNoicapcmndName(String noicapcmndName) {
        this.noicapcmndName = noicapcmndName;
    }

    public String getNoicapgplxName() {
        return noicapgplxName;
    }

    public void setNoicapgplxName(String noicapgplxName) {
        this.noicapgplxName = noicapgplxName;
    }

    public String getNoicappassName() {
        return noicappassName;
    }

    public void setNoicappassName(String noicappassName) {
        this.noicappassName = noicappassName;
    }

    public String getKhoabn() {
        return khoabn;
    }

    public void setKhoabn(String khoabn) {
        this.khoabn = khoabn;
    }
    
}
