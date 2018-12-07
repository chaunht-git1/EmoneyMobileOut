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

 
@Entity
@Table(name = "VW_DSGIAODICHNONAME_TNGAY_WEB")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwDsgiaodichnonameTngayWeb.findAll", query = "SELECT v FROM VwDsgiaodichnonameTngayWeb v"),
    @NamedQuery(name = "VwDsgiaodichnonameTngayWeb.findByIdChinhanh", query = "SELECT v FROM VwDsgiaodichnonameTngayWeb v WHERE v.idChinhanh = :idChinhanh"),
    @NamedQuery(name = "VwDsgiaodichnonameTngayWeb.findBySophieu", query = "SELECT v FROM VwDsgiaodichnonameTngayWeb v WHERE v.sophieu = :sophieu"),
    @NamedQuery(name = "VwDsgiaodichnonameTngayWeb.findByStt", query = "SELECT v FROM VwDsgiaodichnonameTngayWeb v WHERE v.stt = :stt"),
    @NamedQuery(name = "VwDsgiaodichnonameTngayWeb.findByIdDoitac", query = "SELECT v FROM VwDsgiaodichnonameTngayWeb v WHERE v.idDoitac = :idDoitac"),
    @NamedQuery(name = "VwDsgiaodichnonameTngayWeb.findByTenDoitac", query = "SELECT v FROM VwDsgiaodichnonameTngayWeb v WHERE v.tenDoitac = :tenDoitac"),
    @NamedQuery(name = "VwDsgiaodichnonameTngayWeb.findBySobn", query = "SELECT v FROM VwDsgiaodichnonameTngayWeb v WHERE v.sobn = :sobn"),
    @NamedQuery(name = "VwDsgiaodichnonameTngayWeb.findByMaNguoinhan", query = "SELECT v FROM VwDsgiaodichnonameTngayWeb v WHERE v.maNguoinhan = :maNguoinhan"),
    @NamedQuery(name = "VwDsgiaodichnonameTngayWeb.findByHoten", query = "SELECT v FROM VwDsgiaodichnonameTngayWeb v WHERE v.hoten = :hoten"),
    @NamedQuery(name = "VwDsgiaodichnonameTngayWeb.findByNguoigoi", query = "SELECT v FROM VwDsgiaodichnonameTngayWeb v WHERE v.nguoigoi = :nguoigoi"),
    @NamedQuery(name = "VwDsgiaodichnonameTngayWeb.findBySotiengoi", query = "SELECT v FROM VwDsgiaodichnonameTngayWeb v WHERE v.sotiengoi = :sotiengoi"),
    @NamedQuery(name = "VwDsgiaodichnonameTngayWeb.findByTygia", query = "SELECT v FROM VwDsgiaodichnonameTngayWeb v WHERE v.tygia = :tygia"),
    @NamedQuery(name = "VwDsgiaodichnonameTngayWeb.findByThanhtien", query = "SELECT v FROM VwDsgiaodichnonameTngayWeb v WHERE v.thanhtien = :thanhtien"),
    @NamedQuery(name = "VwDsgiaodichnonameTngayWeb.findByIdCtTuythan", query = "SELECT v FROM VwDsgiaodichnonameTngayWeb v WHERE v.idCtTuythan = :idCtTuythan"),
    @NamedQuery(name = "VwDsgiaodichnonameTngayWeb.findByTengiayto", query = "SELECT v FROM VwDsgiaodichnonameTngayWeb v WHERE v.tengiayto = :tengiayto"),
    @NamedQuery(name = "VwDsgiaodichnonameTngayWeb.findBySoCtTuythan", query = "SELECT v FROM VwDsgiaodichnonameTngayWeb v WHERE v.soCtTuythan = :soCtTuythan"),
    @NamedQuery(name = "VwDsgiaodichnonameTngayWeb.findByIdKhachhangtt", query = "SELECT v FROM VwDsgiaodichnonameTngayWeb v WHERE v.idKhachhangtt = :idKhachhangtt"),
    @NamedQuery(name = "VwDsgiaodichnonameTngayWeb.findByDiachi", query = "SELECT v FROM VwDsgiaodichnonameTngayWeb v WHERE v.diachi = :diachi"),
    @NamedQuery(name = "VwDsgiaodichnonameTngayWeb.findByIdNvChitra", query = "SELECT v FROM VwDsgiaodichnonameTngayWeb v WHERE v.idNvChitra = :idNvChitra"),
    @NamedQuery(name = "VwDsgiaodichnonameTngayWeb.findByNgayNhaplieu", query = "SELECT v FROM VwDsgiaodichnonameTngayWeb v WHERE v.ngayNhaplieu = :ngayNhaplieu"),
    @NamedQuery(name = "VwDsgiaodichnonameTngayWeb.findByDachitra", query = "SELECT v FROM VwDsgiaodichnonameTngayWeb v WHERE v.dachitra = :dachitra"),
    @NamedQuery(name = "VwDsgiaodichnonameTngayWeb.findByDanhanphieu", query = "SELECT v FROM VwDsgiaodichnonameTngayWeb v WHERE v.danhanphieu = :danhanphieu")})
public class VwDsgiaodichnonameTngayWeb implements Serializable {


    private static final long serialVersionUID = 1L;

    @Id
    @Size(max = 80)
    @Column(name = "ID_CODE")
    private String idcode;   
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
    @Column(name = "ID_DOITAC")
    private String idDoitac;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID_LOAITIENCHITRA")
    private String idLoaitienchitra;
    @Size(max = 4000)
    @Column(name = "TEN_DOITAC")
    private String tenDoitac;
    @Column(name = "SOBN")
    private Long sobn;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "MA_NGUOINHAN")
    private String maNguoinhan;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "HOTEN")
    private String hoten;
    @Size(max = 60)
    @Column(name = "NGUOIGOI")
    private String nguoigoi;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SOTIENGOI")
    private BigDecimal sotiengoi;
    @Column(name = "TYGIA")
    private BigDecimal tygia;
    @Column(name = "THANHTIEN")
    private BigDecimal thanhtien;
    @Size(max = 20)
    @Column(name = "ID_CT_TUYTHAN")
    private String idCtTuythan;
    @Size(max = 4000)
    @Column(name = "TENGIAYTO")
    private String tengiayto;
    @Size(max = 20)
    @Column(name = "SO_CT_TUYTHAN")
    private String soCtTuythan;
    @Size(max = 40)
    @Column(name = "ID_KHACHHANGTT")
    private String idKhachhangtt;
    @Size(max = 150)
    @Column(name = "DIACHI")
    private String diachi;
    @Size(max = 20)
    @Column(name = "ID_NV_CHITRA")
    private String idNvChitra;
    @Column(name = "NGAY_NHAPLIEU")
    @Temporal(TemporalType.DATE)
    private Date ngayNhaplieu;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DACHITRA")
    private Character dachitra;
    @Column(name = "DANHANPHIEU")
    private Character danhanphieu;
    @Size(max = 40)
    @Column(name = "NHANVIENCALLNONAME")
    private String nhanviencallnoname;
    
    public VwDsgiaodichnonameTngayWeb() {
    }

    public String getIdcode() {
        return idcode;
    }

    public void setIdcode(String idcode) {
        this.idcode = idcode;
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

    public Long getSobn() {
        return sobn;
    }

    public void setSobn(Long sobn) {
        this.sobn = sobn;
    }

    public String getMaNguoinhan() {
        return maNguoinhan;
    }

    public void setMaNguoinhan(String maNguoinhan) {
        this.maNguoinhan = maNguoinhan;
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

    public String getIdCtTuythan() {
        return idCtTuythan;
    }

    public void setIdCtTuythan(String idCtTuythan) {
        this.idCtTuythan = idCtTuythan;
    }

    public String getTengiayto() {
        return tengiayto;
    }

    public void setTengiayto(String tengiayto) {
        this.tengiayto = tengiayto;
    }

    public String getSoCtTuythan() {
        return soCtTuythan;
    }

    public void setSoCtTuythan(String soCtTuythan) {
        this.soCtTuythan = soCtTuythan;
    }

    public String getIdKhachhangtt() {
        return idKhachhangtt;
    }

    public void setIdKhachhangtt(String idKhachhangtt) {
        this.idKhachhangtt = idKhachhangtt;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getIdNvChitra() {
        return idNvChitra;
    }

    public void setIdNvChitra(String idNvChitra) {
        this.idNvChitra = idNvChitra;
    }

    public Date getNgayNhaplieu() {
        return ngayNhaplieu;
    }

    public void setNgayNhaplieu(Date ngayNhaplieu) {
        this.ngayNhaplieu = ngayNhaplieu;
    }

    public Character getDachitra() {
        return dachitra;
    }

    public void setDachitra(Character dachitra) {
        this.dachitra = dachitra;
    }

    public Character getDanhanphieu() {
        return danhanphieu;
    }

    public void setDanhanphieu(Character danhanphieu) {
        this.danhanphieu = danhanphieu;
    }

    public String getNhanviencallnoname() {
        return nhanviencallnoname;
    }

    public void setNhanviencallnoname(String nhanviencallnoname) {
        this.nhanviencallnoname = nhanviencallnoname;
    }

    public String getIdLoaitienchitra() {
        return idLoaitienchitra;
    }

    public void setIdLoaitienchitra(String idLoaitienchitra) {
        this.idLoaitienchitra = idLoaitienchitra;
    }
    
}
