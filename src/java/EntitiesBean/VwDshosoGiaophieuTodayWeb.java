 
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
@Table(name = "VW_DSHOSO_GIAOPHIEU_TODAY_WEB")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwDshosoGiaophieuTodayWeb.findAll", query = "SELECT v FROM VwDshosoGiaophieuTodayWeb v"),
    @NamedQuery(name = "VwDshosoGiaophieuTodayWeb.findByDanhanphieu", query = "SELECT v FROM VwDshosoGiaophieuTodayWeb v WHERE v.danhanphieu = :danhanphieu"),
    @NamedQuery(name = "VwDshosoGiaophieuTodayWeb.findBySophieu", query = "SELECT v FROM VwDshosoGiaophieuTodayWeb v WHERE v.sophieu = :sophieu"),
    @NamedQuery(name = "VwDshosoGiaophieuTodayWeb.findByStt", query = "SELECT v FROM VwDshosoGiaophieuTodayWeb v WHERE v.stt = :stt"),
    @NamedQuery(name = "VwDshosoGiaophieuTodayWeb.findBySotiengoi", query = "SELECT v FROM VwDshosoGiaophieuTodayWeb v WHERE v.sotiengoi = :sotiengoi"),
    @NamedQuery(name = "VwDshosoGiaophieuTodayWeb.findByIdLoaitiengoi", query = "SELECT v FROM VwDshosoGiaophieuTodayWeb v WHERE v.idLoaitiengoi = :idLoaitiengoi"),
    @NamedQuery(name = "VwDshosoGiaophieuTodayWeb.findByTygia", query = "SELECT v FROM VwDshosoGiaophieuTodayWeb v WHERE v.tygia = :tygia"),
    @NamedQuery(name = "VwDshosoGiaophieuTodayWeb.findByThanhtien", query = "SELECT v FROM VwDshosoGiaophieuTodayWeb v WHERE v.thanhtien = :thanhtien"),
    @NamedQuery(name = "VwDshosoGiaophieuTodayWeb.findByNgaygiaophieu", query = "SELECT v FROM VwDshosoGiaophieuTodayWeb v WHERE v.ngaygiaophieu = :ngaygiaophieu"),
    @NamedQuery(name = "VwDshosoGiaophieuTodayWeb.findByIdNvChitra", query = "SELECT v FROM VwDshosoGiaophieuTodayWeb v WHERE v.idNvChitra = :idNvChitra"),
    @NamedQuery(name = "VwDshosoGiaophieuTodayWeb.findByMaNguoinhan", query = "SELECT v FROM VwDshosoGiaophieuTodayWeb v WHERE v.maNguoinhan = :maNguoinhan"),
    @NamedQuery(name = "VwDshosoGiaophieuTodayWeb.findByIdDoitac", query = "SELECT v FROM VwDshosoGiaophieuTodayWeb v WHERE v.idDoitac = :idDoitac"),
    @NamedQuery(name = "VwDshosoGiaophieuTodayWeb.findByIdChinhanh", query = "SELECT v FROM VwDshosoGiaophieuTodayWeb v WHERE v.idChinhanh = :idChinhanh"),
    @NamedQuery(name = "VwDshosoGiaophieuTodayWeb.findByTendoitac", query = "SELECT v FROM VwDshosoGiaophieuTodayWeb v WHERE v.tendoitac = :tendoitac"),
    @NamedQuery(name = "VwDshosoGiaophieuTodayWeb.findByTennvchitra", query = "SELECT v FROM VwDshosoGiaophieuTodayWeb v WHERE v.tennvchitra = :tennvchitra"),
    @NamedQuery(name = "VwDshosoGiaophieuTodayWeb.findBySolaninGiaophieu", query = "SELECT v FROM VwDshosoGiaophieuTodayWeb v WHERE v.solaninGiaophieu = :solaninGiaophieu"),
    @NamedQuery(name = "VwDshosoGiaophieuTodayWeb.findBySolaninDiduong", query = "SELECT v FROM VwDshosoGiaophieuTodayWeb v WHERE v.solaninDiduong = :solaninDiduong"),
    @NamedQuery(name = "VwDshosoGiaophieuTodayWeb.findByDachitra", query = "SELECT v FROM VwDshosoGiaophieuTodayWeb v WHERE v.dachitra = :dachitra"),
    @NamedQuery(name = "VwDshosoGiaophieuTodayWeb.findByIdLoaitienchitra", query = "SELECT v FROM VwDshosoGiaophieuTodayWeb v WHERE v.idLoaitienchitra = :idLoaitienchitra"),
    @NamedQuery(name = "VwDshosoGiaophieuTodayWeb.findByInlaiTunv", query = "SELECT v FROM VwDshosoGiaophieuTodayWeb v WHERE v.inlaiTunv = :inlaiTunv"),
    @NamedQuery(name = "VwDshosoGiaophieuTodayWeb.findByIdNvInlaitunv", query = "SELECT v FROM VwDshosoGiaophieuTodayWeb v WHERE v.idNvInlaitunv = :idNvInlaitunv"),
    @NamedQuery(name = "VwDshosoGiaophieuTodayWeb.findByInlaiDiduong", query = "SELECT v FROM VwDshosoGiaophieuTodayWeb v WHERE v.inlaiDiduong = :inlaiDiduong"),
    @NamedQuery(name = "VwDshosoGiaophieuTodayWeb.findByIdNvIndiduong", query = "SELECT v FROM VwDshosoGiaophieuTodayWeb v WHERE v.idNvIndiduong = :idNvIndiduong"),
    @NamedQuery(name = "VwDshosoGiaophieuTodayWeb.findByNgayNhaplieu", query = "SELECT v FROM VwDshosoGiaophieuTodayWeb v WHERE v.ngayNhaplieu = :ngayNhaplieu"),
    @NamedQuery(name = "VwDshosoGiaophieuTodayWeb.findByDotgp", query = "SELECT v FROM VwDshosoGiaophieuTodayWeb v WHERE v.dotgp = :dotgp")})
public class VwDshosoGiaophieuTodayWeb implements Serializable {
 
    @Id
    @Size(max = 80)
    @Column(name = "ID_CODE")
    private String idcode;
    @Size(max = 20)
    @Column(name = "ID_CITY")
    private String idCity;
    @Size(max = 20)
    @Column(name = "ID_DISTRICT")
    private String idDistrict;
    @Size(max = 150)
    @Column(name = "DIACHI")
    private String diachi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "HOTEN")
    private String hoten;
    @Size(max = 60)
    @Column(name = "NGUOIGOI")
    private String nguoigoi;
    @Size(max = 40)
    @Column(name = "DIENTHOAI")
    private String dienthoai;
    @Column(name = "SOBN")
    private Long sobn;
    @Size(max = 1)
    @Column(name = "CALLKH")
    private String callkh;
    @Column(name = "NGAYCALLNONAME")
    @Temporal(TemporalType.DATE)
    private Date ngaycallnoname;
    @Size(max = 20)
    @Column(name = "NHANVIENCALLNONAME")
    private String nhanviencallnoname;
    private static final long serialVersionUID = 1L;
    @Column(name = "DANHANPHIEU")
    private Character danhanphieu;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "SOPHIEU")
    private String sophieu;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "STT")
    private BigInteger stt;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SOTIENGOI")
    private BigDecimal sotiengoi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID_LOAITIENGOI")
    private String idLoaitiengoi;
    @Column(name = "TYGIA")
    private BigDecimal tygia;
    @Column(name = "THANHTIEN")
    private BigDecimal thanhtien;
    @Column(name = "NGAYGIAOPHIEU")
    @Temporal(TemporalType.DATE)
    private Date ngaygiaophieu;
    @Size(max = 20)
    @Column(name = "ID_NV_CHITRA")
    private String idNvChitra;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "MA_NGUOINHAN")
    private String maNguoinhan;
    @Size(max = 20)
    @Column(name = "ID_DOITAC")
    private String idDoitac;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID_CHINHANH")
    private String idChinhanh;
    @Size(max = 4000)
    @Column(name = "TENDOITAC")
    private String tendoitac;
    @Size(max = 4000)
    @Column(name = "TENNVCHITRA")
    private String tennvchitra;
    @Column(name = "SOLANIN_GIAOPHIEU")
    private BigInteger solaninGiaophieu;
    @Column(name = "SOLANIN_DIDUONG")
    private Long solaninDiduong;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DACHITRA")
    private Character dachitra;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID_LOAITIENCHITRA")
    private String idLoaitienchitra;
    @Size(max = 1)
    @Column(name = "INLAI_TUNV")
    private String inlaiTunv;
    @Size(max = 20)
    @Column(name = "ID_NV_INLAITUNV")
    private String idNvInlaitunv;
    @Size(max = 1)
    @Column(name = "INLAI_DIDUONG")
    private String inlaiDiduong;
    @Size(max = 20)
    @Column(name = "ID_NV_INDIDUONG")
    private String idNvIndiduong;
    @Column(name = "NGAY_NHAPLIEU")
    @Temporal(TemporalType.DATE)
    private Date ngayNhaplieu;
    @Size(max = 0)
    @Column(name = "DOTGP")
    private String dotgp;

    public VwDshosoGiaophieuTodayWeb() {
    }

    public String getIdcode() {
        return idcode;
    }

    public void setIdcode(String idcode) {
        this.idcode = idcode;
    }
    
    

    public Character getDanhanphieu() {
        return danhanphieu;
    }

    public void setDanhanphieu(Character danhanphieu) {
        this.danhanphieu = danhanphieu;
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

    public BigDecimal getSotiengoi() {
        return sotiengoi;
    }

    public void setSotiengoi(BigDecimal sotiengoi) {
        this.sotiengoi = sotiengoi;
    }

    public String getIdLoaitiengoi() {
        return idLoaitiengoi;
    }

    public void setIdLoaitiengoi(String idLoaitiengoi) {
        this.idLoaitiengoi = idLoaitiengoi;
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

    public Date getNgaygiaophieu() {
        return ngaygiaophieu;
    }

    public void setNgaygiaophieu(Date ngaygiaophieu) {
        this.ngaygiaophieu = ngaygiaophieu;
    }

    public String getIdNvChitra() {
        return idNvChitra;
    }

    public void setIdNvChitra(String idNvChitra) {
        this.idNvChitra = idNvChitra;
    }

    public String getMaNguoinhan() {
        return maNguoinhan;
    }

    public void setMaNguoinhan(String maNguoinhan) {
        this.maNguoinhan = maNguoinhan;
    }

    public String getIdDoitac() {
        return idDoitac;
    }

    public void setIdDoitac(String idDoitac) {
        this.idDoitac = idDoitac;
    }

    public String getIdChinhanh() {
        return idChinhanh;
    }

    public void setIdChinhanh(String idChinhanh) {
        this.idChinhanh = idChinhanh;
    }

    public String getTendoitac() {
        return tendoitac;
    }

    public void setTendoitac(String tendoitac) {
        this.tendoitac = tendoitac;
    }

    public String getTennvchitra() {
        return tennvchitra;
    }

    public void setTennvchitra(String tennvchitra) {
        this.tennvchitra = tennvchitra;
    }

    public BigInteger getSolaninGiaophieu() {
        return solaninGiaophieu;
    }

    public void setSolaninGiaophieu(BigInteger solaninGiaophieu) {
        this.solaninGiaophieu = solaninGiaophieu;
    }

    public Long getSolaninDiduong() {
        return solaninDiduong;
    }

    public void setSolaninDiduong(Long solaninDiduong) {
        this.solaninDiduong = solaninDiduong;
    }

    public Character getDachitra() {
        return dachitra;
    }

    public void setDachitra(Character dachitra) {
        this.dachitra = dachitra;
    }

    public String getIdLoaitienchitra() {
        return idLoaitienchitra;
    }

    public void setIdLoaitienchitra(String idLoaitienchitra) {
        this.idLoaitienchitra = idLoaitienchitra;
    }

    public String getInlaiTunv() {
        return inlaiTunv;
    }

    public void setInlaiTunv(String inlaiTunv) {
        this.inlaiTunv = inlaiTunv;
    }

    public String getIdNvInlaitunv() {
        return idNvInlaitunv;
    }

    public void setIdNvInlaitunv(String idNvInlaitunv) {
        this.idNvInlaitunv = idNvInlaitunv;
    }

    public String getInlaiDiduong() {
        return inlaiDiduong;
    }

    public void setInlaiDiduong(String inlaiDiduong) {
        this.inlaiDiduong = inlaiDiduong;
    }

    public String getIdNvIndiduong() {
        return idNvIndiduong;
    }

    public void setIdNvIndiduong(String idNvIndiduong) {
        this.idNvIndiduong = idNvIndiduong;
    }

    public Date getNgayNhaplieu() {
        return ngayNhaplieu;
    }

    public void setNgayNhaplieu(Date ngayNhaplieu) {
        this.ngayNhaplieu = ngayNhaplieu;
    }

    public String getDotgp() {
        return dotgp;
    }

    public void setDotgp(String dotgp) {
        this.dotgp = dotgp;
    }

    public String getCallkh() {
        return callkh;
    }

    public void setCallkh(String callkh) {
        this.callkh = callkh;
    }

    public Date getNgaycallnoname() {
        return ngaycallnoname;
    }

    public void setNgaycallnoname(Date ngaycallnoname) {
        this.ngaycallnoname = ngaycallnoname;
    }

    public String getNhanviencallnoname() {
        return nhanviencallnoname;
    }

    public void setNhanviencallnoname(String nhanviencallnoname) {
        this.nhanviencallnoname = nhanviencallnoname;
    }

    public Long getSobn() {
        return sobn;
    }

    public void setSobn(Long sobn) {
        this.sobn = sobn;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNguoigoi() {
        return nguoigoi;
    }

    public void setNguoigoi(String nguoigoi) {
        this.nguoigoi = nguoigoi;
    }

    public String getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }

    public String getIdCity() {
        return idCity;
    }

    public void setIdCity(String idCity) {
        this.idCity = idCity;
    }

    public String getIdDistrict() {
        return idDistrict;
    }

    public void setIdDistrict(String idDistrict) {
        this.idDistrict = idDistrict;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

 
}
