 
package Entities;

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

 
@Entity
@Table(name = "VW_TONDONG_NV_ALL_WEB")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwTondongNvAllWeb.findAll", query = "SELECT v FROM VwTondongNvAllWeb v"),
    @NamedQuery(name = "VwTondongNvAllWeb.findByIdChinhanh", query = "SELECT v FROM VwTondongNvAllWeb v WHERE v.idChinhanh = :idChinhanh"),
    @NamedQuery(name = "VwTondongNvAllWeb.findBySophieu", query = "SELECT v FROM VwTondongNvAllWeb v WHERE v.sophieu = :sophieu"),
    @NamedQuery(name = "VwTondongNvAllWeb.findByStt", query = "SELECT v FROM VwTondongNvAllWeb v WHERE v.stt = :stt"),
    @NamedQuery(name = "VwTondongNvAllWeb.findByTenchinhanh", query = "SELECT v FROM VwTondongNvAllWeb v WHERE v.tenchinhanh = :tenchinhanh"),
    @NamedQuery(name = "VwTondongNvAllWeb.findByIdNvChitra", query = "SELECT v FROM VwTondongNvAllWeb v WHERE v.idNvChitra = :idNvChitra"),
    @NamedQuery(name = "VwTondongNvAllWeb.findByHotenNv", query = "SELECT v FROM VwTondongNvAllWeb v WHERE v.hotenNv = :hotenNv"),
    @NamedQuery(name = "VwTondongNvAllWeb.findByHoten", query = "SELECT v FROM VwTondongNvAllWeb v WHERE v.hoten = :hoten"),
    @NamedQuery(name = "VwTondongNvAllWeb.findByMaNguoinhan", query = "SELECT v FROM VwTondongNvAllWeb v WHERE v.maNguoinhan = :maNguoinhan"),
    @NamedQuery(name = "VwTondongNvAllWeb.findBySobn", query = "SELECT v FROM VwTondongNvAllWeb v WHERE v.sobn = :sobn"),
    @NamedQuery(name = "VwTondongNvAllWeb.findBySotiengoi", query = "SELECT v FROM VwTondongNvAllWeb v WHERE v.sotiengoi = :sotiengoi"),
    @NamedQuery(name = "VwTondongNvAllWeb.findByDiachi", query = "SELECT v FROM VwTondongNvAllWeb v WHERE v.diachi = :diachi"),
    @NamedQuery(name = "VwTondongNvAllWeb.findByXacminh", query = "SELECT v FROM VwTondongNvAllWeb v WHERE v.xacminh = :xacminh"),
    @NamedQuery(name = "VwTondongNvAllWeb.findByNgayXacminh", query = "SELECT v FROM VwTondongNvAllWeb v WHERE v.ngayXacminh = :ngayXacminh"),
    @NamedQuery(name = "VwTondongNvAllWeb.findByGhichu", query = "SELECT v FROM VwTondongNvAllWeb v WHERE v.ghichu = :ghichu"),
    @NamedQuery(name = "VwTondongNvAllWeb.findByIdDoitac", query = "SELECT v FROM VwTondongNvAllWeb v WHERE v.idDoitac = :idDoitac"),
    @NamedQuery(name = "VwTondongNvAllWeb.findByTenDoitac", query = "SELECT v FROM VwTondongNvAllWeb v WHERE v.tenDoitac = :tenDoitac"),
    @NamedQuery(name = "VwTondongNvAllWeb.findByIdLoaitienchitra", query = "SELECT v FROM VwTondongNvAllWeb v WHERE v.idLoaitienchitra = :idLoaitienchitra"),
    @NamedQuery(name = "VwTondongNvAllWeb.findByDaxacminh", query = "SELECT v FROM VwTondongNvAllWeb v WHERE v.daxacminh = :daxacminh"),
    @NamedQuery(name = "VwTondongNvAllWeb.findByDienthoai", query = "SELECT v FROM VwTondongNvAllWeb v WHERE v.dienthoai = :dienthoai")})
public class VwTondongNvAllWeb implements Serializable {
   @Id
    @Size(max = 80)
    @Column(name = "IDCODE")
    private String idcode;
    @Size(max = 40)
    @Column(name = "ID_QLQ_DOTTG")
    private String idQlqDottg;
    @Size(max = 40)
    @Column(name = "ID_KHACHHANGTT")
    private String idKhachhangtt;
    @Size(max = 1)
    @Column(name = "HSDOT1")
    private String hsdot1;
    @Size(max = 60)
    @Column(name = "NGUOIGOI")
    private String nguoigoi;
    @Column(name = "TYGIA")
    private BigDecimal tygia;
    @Column(name = "THANHTIEN")
    private BigDecimal thanhtien;
    @Size(max = 20)
    @Column(name = "SO_CT_TUYTHAN")
    private String soCtTuythan;
    @Size(max = 1)
    @Column(name = "HSDOT3")
    private String hsdot3;
    @Column(name = "DAXMMOBILE")
    private BigInteger daxmmobile;
    @Size(max = 1000)
    @Column(name = "NOIDUNGXMMOBILE")
    private String noidungxmmobile;
    @Size(max = 12)
    @Column(name = "QUYDINHXM")
    private String quydinhxm;
    @Size(max = 20)
    @Column(name = "CODEMG")
    private String codemg;
    private static final long serialVersionUID = 1L;
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
    @Size(max = 4000)
    @Column(name = "TENCHINHANH")
    private String tenchinhanh;
    @Size(max = 20)
    @Column(name = "ID_NV_CHITRA")
    private String idNvChitra;
    @Size(max = 80)
    @Column(name = "HOTEN_NV")
    private String hotenNv;
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
    @Column(name = "SOBN")
    private Long sobn;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SOTIENGOI")
    private BigDecimal sotiengoi;
    @Size(max = 150)
    @Column(name = "DIACHI")
    private String diachi;
    @Size(max = 60)
    @Column(name = "XACMINH")
    private String xacminh;
    @Column(name = "NGAY_XACMINH")
    @Temporal(TemporalType.DATE)
    private Date ngayXacminh;
    @Size(max = 400)
    @Column(name = "GHICHU")
    private String ghichu;
    @Size(max = 20)
    @Column(name = "ID_DOITAC")
    private String idDoitac;
    @Size(max = 4000)
    @Column(name = "TEN_DOITAC")
    private String tenDoitac;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID_LOAITIENCHITRA")
    private String idLoaitienchitra;
    @Size(max = 1)
    @Column(name = "DAXACMINH")
    private String daxacminh;
    @Size(max = 40)
    @Column(name = "DIENTHOAI")
    private String dienthoai;

    public String getIdcode() {
        return idcode;
    }

    public void setIdcode(String idcode) {
        this.idcode = idcode;
    }
    
    

    public VwTondongNvAllWeb() {
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

    public String getTenchinhanh() {
        return tenchinhanh;
    }

    public void setTenchinhanh(String tenchinhanh) {
        this.tenchinhanh = tenchinhanh;
    }

    public String getIdNvChitra() {
        return idNvChitra;
    }

    public void setIdNvChitra(String idNvChitra) {
        this.idNvChitra = idNvChitra;
    }

    public String getHotenNv() {
        return hotenNv;
    }

    public void setHotenNv(String hotenNv) {
        this.hotenNv = hotenNv;
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

    public Long getSobn() {
        return sobn;
    }

    public void setSobn(Long sobn) {
        this.sobn = sobn;
    }

    public BigDecimal getSotiengoi() {
        return sotiengoi;
    }

    public void setSotiengoi(BigDecimal sotiengoi) {
        this.sotiengoi = sotiengoi;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getXacminh() {
        return xacminh;
    }

    public void setXacminh(String xacminh) {
        this.xacminh = xacminh;
    }

    public Date getNgayXacminh() {
        return ngayXacminh;
    }

    public void setNgayXacminh(Date ngayXacminh) {
        this.ngayXacminh = ngayXacminh;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
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

    public String getIdLoaitienchitra() {
        return idLoaitienchitra;
    }

    public void setIdLoaitienchitra(String idLoaitienchitra) {
        this.idLoaitienchitra = idLoaitienchitra;
    }

    public String getDaxacminh() {
        return daxacminh;
    }

    public void setDaxacminh(String daxacminh) {
        this.daxacminh = daxacminh;
    }

    public String getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }

    public String getCodemg() {
        return codemg;
    }

    public void setCodemg(String codemg) {
        this.codemg = codemg;
    }

    public BigInteger getDaxmmobile() {
        return daxmmobile;
    }

    public void setDaxmmobile(BigInteger daxmmobile) {
        this.daxmmobile = daxmmobile;
    }

    public String getNoidungxmmobile() {
        return noidungxmmobile;
    }

    public void setNoidungxmmobile(String noidungxmmobile) {
        this.noidungxmmobile = noidungxmmobile;
    }

    public String getQuydinhxm() {
        return quydinhxm;
    }

    public void setQuydinhxm(String quydinhxm) {
        this.quydinhxm = quydinhxm;
    }

    public String getHsdot3() {
        return hsdot3;
    }

    public void setHsdot3(String hsdot3) {
        this.hsdot3 = hsdot3;
    }

    public String getNguoigoi() {
        return nguoigoi;
    }

    public void setNguoigoi(String nguoigoi) {
        this.nguoigoi = nguoigoi;
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

    public String getSoCtTuythan() {
        return soCtTuythan;
    }

    public void setSoCtTuythan(String soCtTuythan) {
        this.soCtTuythan = soCtTuythan;
    }

    public String getHsdot1() {
        return hsdot1;
    }

    public void setHsdot1(String hsdot1) {
        this.hsdot1 = hsdot1;
    }

    public String getIdQlqDottg() {
        return idQlqDottg;
    }

    public void setIdQlqDottg(String idQlqDottg) {
        this.idQlqDottg = idQlqDottg;
    }

    public String getIdKhachhangtt() {
        return idKhachhangtt;
    }

    public void setIdKhachhangtt(String idKhachhangtt) {
        this.idKhachhangtt = idKhachhangtt;
    }
    
}
