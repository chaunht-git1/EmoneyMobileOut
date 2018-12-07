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
@Table(name = "VW_QLQHOSO_CHUAGIAO_WEB")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwQlqhosoChuagiaoWeb.findAll", query = "SELECT v FROM VwQlqhosoChuagiaoWeb v"),
    @NamedQuery(name = "VwQlqhosoChuagiaoWeb.findByDanhanphieu", query = "SELECT v FROM VwQlqhosoChuagiaoWeb v WHERE v.danhanphieu = :danhanphieu"),
    @NamedQuery(name = "VwQlqhosoChuagiaoWeb.findBySophieu", query = "SELECT v FROM VwQlqhosoChuagiaoWeb v WHERE v.sophieu = :sophieu"),
    @NamedQuery(name = "VwQlqhosoChuagiaoWeb.findByStt", query = "SELECT v FROM VwQlqhosoChuagiaoWeb v WHERE v.stt = :stt"),
    @NamedQuery(name = "VwQlqhosoChuagiaoWeb.findBySotiengoi", query = "SELECT v FROM VwQlqhosoChuagiaoWeb v WHERE v.sotiengoi = :sotiengoi"),
    @NamedQuery(name = "VwQlqhosoChuagiaoWeb.findByIdLoaitiengoi", query = "SELECT v FROM VwQlqhosoChuagiaoWeb v WHERE v.idLoaitiengoi = :idLoaitiengoi"),
    @NamedQuery(name = "VwQlqhosoChuagiaoWeb.findByTygia", query = "SELECT v FROM VwQlqhosoChuagiaoWeb v WHERE v.tygia = :tygia"),
    @NamedQuery(name = "VwQlqhosoChuagiaoWeb.findByThanhtien", query = "SELECT v FROM VwQlqhosoChuagiaoWeb v WHERE v.thanhtien = :thanhtien"),
    @NamedQuery(name = "VwQlqhosoChuagiaoWeb.findByNgaygiaophieu", query = "SELECT v FROM VwQlqhosoChuagiaoWeb v WHERE v.ngaygiaophieu = :ngaygiaophieu"),
    @NamedQuery(name = "VwQlqhosoChuagiaoWeb.findByIdNvChitra", query = "SELECT v FROM VwQlqhosoChuagiaoWeb v WHERE v.idNvChitra = :idNvChitra"),
    @NamedQuery(name = "VwQlqhosoChuagiaoWeb.findByMaNguoinhan", query = "SELECT v FROM VwQlqhosoChuagiaoWeb v WHERE v.maNguoinhan = :maNguoinhan"),
    @NamedQuery(name = "VwQlqhosoChuagiaoWeb.findByIdDoitac", query = "SELECT v FROM VwQlqhosoChuagiaoWeb v WHERE v.idDoitac = :idDoitac"),
    @NamedQuery(name = "VwQlqhosoChuagiaoWeb.findByIdChinhanh", query = "SELECT v FROM VwQlqhosoChuagiaoWeb v WHERE v.idChinhanh = :idChinhanh"),
    @NamedQuery(name = "VwQlqhosoChuagiaoWeb.findByTendoitac", query = "SELECT v FROM VwQlqhosoChuagiaoWeb v WHERE v.tendoitac = :tendoitac"),
    @NamedQuery(name = "VwQlqhosoChuagiaoWeb.findByTennvchitra", query = "SELECT v FROM VwQlqhosoChuagiaoWeb v WHERE v.tennvchitra = :tennvchitra"),
    @NamedQuery(name = "VwQlqhosoChuagiaoWeb.findBySolaninGiaophieu", query = "SELECT v FROM VwQlqhosoChuagiaoWeb v WHERE v.solaninGiaophieu = :solaninGiaophieu"),
    @NamedQuery(name = "VwQlqhosoChuagiaoWeb.findBySolaninDiduong", query = "SELECT v FROM VwQlqhosoChuagiaoWeb v WHERE v.solaninDiduong = :solaninDiduong"),
    @NamedQuery(name = "VwQlqhosoChuagiaoWeb.findByDachitra", query = "SELECT v FROM VwQlqhosoChuagiaoWeb v WHERE v.dachitra = :dachitra"),
    @NamedQuery(name = "VwQlqhosoChuagiaoWeb.findByIdLoaitienchitra", query = "SELECT v FROM VwQlqhosoChuagiaoWeb v WHERE v.idLoaitienchitra = :idLoaitienchitra"),
    @NamedQuery(name = "VwQlqhosoChuagiaoWeb.findByInlaiTunv", query = "SELECT v FROM VwQlqhosoChuagiaoWeb v WHERE v.inlaiTunv = :inlaiTunv"),
    @NamedQuery(name = "VwQlqhosoChuagiaoWeb.findByIdNvInlaitunv", query = "SELECT v FROM VwQlqhosoChuagiaoWeb v WHERE v.idNvInlaitunv = :idNvInlaitunv"),
    @NamedQuery(name = "VwQlqhosoChuagiaoWeb.findByInlaiDiduong", query = "SELECT v FROM VwQlqhosoChuagiaoWeb v WHERE v.inlaiDiduong = :inlaiDiduong"),
    @NamedQuery(name = "VwQlqhosoChuagiaoWeb.findByIdNvIndiduong", query = "SELECT v FROM VwQlqhosoChuagiaoWeb v WHERE v.idNvIndiduong = :idNvIndiduong"),
    @NamedQuery(name = "VwQlqhosoChuagiaoWeb.findByNgayNhaplieu", query = "SELECT v FROM VwQlqhosoChuagiaoWeb v WHERE v.ngayNhaplieu = :ngayNhaplieu"),
    @NamedQuery(name = "VwQlqhosoChuagiaoWeb.findByIdQlqDottg", query = "SELECT v FROM VwQlqhosoChuagiaoWeb v WHERE v.idQlqDottg = :idQlqDottg"),
    @NamedQuery(name = "VwQlqhosoChuagiaoWeb.findByDainphone", query = "SELECT v FROM VwQlqhosoChuagiaoWeb v WHERE v.dainphone = :dainphone"),
    @NamedQuery(name = "VwQlqhosoChuagiaoWeb.findByChuainphone", query = "SELECT v FROM VwQlqhosoChuagiaoWeb v WHERE v.chuainphone = :chuainphone"),
    @NamedQuery(name = "VwQlqhosoChuagiaoWeb.findByLoaihs", query = "SELECT v FROM VwQlqhosoChuagiaoWeb v WHERE v.loaihs = :loaihs")})
public class VwQlqhosoChuagiaoWeb implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Size(max = 20)
    @Column(name = "ID_NV_CHITRA")
    private String idNvChitra;
    @Column(name = "DANHANPHIEU")
    private Character danhanphieu;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "SOPHIEU")
    private String sophieu;
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
    @Size(max = 40)
    @Column(name = "ID_QLQ_DOTTG")
    private String idQlqDottg;
    @Column(name = "DAINPHONE")
    private BigInteger dainphone;
    @Column(name = "CHUAINPHONE")
    private BigInteger chuainphone;
    @Size(max = 4)
    @Column(name = "LOAIHS")
    private String loaihs;

    public VwQlqhosoChuagiaoWeb() {
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

    public String getIdQlqDottg() {
        return idQlqDottg;
    }

    public void setIdQlqDottg(String idQlqDottg) {
        this.idQlqDottg = idQlqDottg;
    }

    public BigInteger getDainphone() {
        return dainphone;
    }

    public void setDainphone(BigInteger dainphone) {
        this.dainphone = dainphone;
    }

    public BigInteger getChuainphone() {
        return chuainphone;
    }

    public void setChuainphone(BigInteger chuainphone) {
        this.chuainphone = chuainphone;
    }

    public String getLoaihs() {
        return loaihs;
    }

    public void setLoaihs(String loaihs) {
        this.loaihs = loaihs;
    }
    
}
