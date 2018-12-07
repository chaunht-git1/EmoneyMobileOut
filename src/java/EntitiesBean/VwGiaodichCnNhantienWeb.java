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
@Table(name = "VW_GIAODICH_CN_NHANTIEN_WEB")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwGiaodichCnNhantienWeb.findAll", query = "SELECT v FROM VwGiaodichCnNhantienWeb v"),
    @NamedQuery(name = "VwGiaodichCnNhantienWeb.findByIdQlqDottg", query = "SELECT v FROM VwGiaodichCnNhantienWeb v WHERE v.idQlqDottg = :idQlqDottg"),
    @NamedQuery(name = "VwGiaodichCnNhantienWeb.findByIdNvChitra", query = "SELECT v FROM VwGiaodichCnNhantienWeb v WHERE v.idNvChitra = :idNvChitra"),
    @NamedQuery(name = "VwGiaodichCnNhantienWeb.findByMaNguoinhan", query = "SELECT v FROM VwGiaodichCnNhantienWeb v WHERE v.maNguoinhan = :maNguoinhan"),
    @NamedQuery(name = "VwGiaodichCnNhantienWeb.findBySobn", query = "SELECT v FROM VwGiaodichCnNhantienWeb v WHERE v.sobn = :sobn"),
    @NamedQuery(name = "VwGiaodichCnNhantienWeb.findByHoten", query = "SELECT v FROM VwGiaodichCnNhantienWeb v WHERE v.hoten = :hoten"),
    @NamedQuery(name = "VwGiaodichCnNhantienWeb.findBySotiengoi", query = "SELECT v FROM VwGiaodichCnNhantienWeb v WHERE v.sotiengoi = :sotiengoi"),
    @NamedQuery(name = "VwGiaodichCnNhantienWeb.findByTygia", query = "SELECT v FROM VwGiaodichCnNhantienWeb v WHERE v.tygia = :tygia"),
    @NamedQuery(name = "VwGiaodichCnNhantienWeb.findByThanhtien", query = "SELECT v FROM VwGiaodichCnNhantienWeb v WHERE v.thanhtien = :thanhtien"),
    @NamedQuery(name = "VwGiaodichCnNhantienWeb.findByIdLoaitienchitra", query = "SELECT v FROM VwGiaodichCnNhantienWeb v WHERE v.idLoaitienchitra = :idLoaitienchitra"),
    @NamedQuery(name = "VwGiaodichCnNhantienWeb.findByIdLoaitiengoi", query = "SELECT v FROM VwGiaodichCnNhantienWeb v WHERE v.idLoaitiengoi = :idLoaitiengoi"),
    @NamedQuery(name = "VwGiaodichCnNhantienWeb.findByIdLoaicongno", query = "SELECT v FROM VwGiaodichCnNhantienWeb v WHERE v.idLoaicongno = :idLoaicongno"),
    @NamedQuery(name = "VwGiaodichCnNhantienWeb.findByIdQlqDuyet", query = "SELECT v FROM VwGiaodichCnNhantienWeb v WHERE v.idQlqDuyet = :idQlqDuyet"),
    @NamedQuery(name = "VwGiaodichCnNhantienWeb.findByIdQlqMoichitien", query = "SELECT v FROM VwGiaodichCnNhantienWeb v WHERE v.idQlqMoichitien = :idQlqMoichitien"),
    @NamedQuery(name = "VwGiaodichCnNhantienWeb.findByIdQlqNhandutien", query = "SELECT v FROM VwGiaodichCnNhantienWeb v WHERE v.idQlqNhandutien = :idQlqNhandutien"),
    @NamedQuery(name = "VwGiaodichCnNhantienWeb.findByIdTquy", query = "SELECT v FROM VwGiaodichCnNhantienWeb v WHERE v.idTquy = :idTquy"),
    @NamedQuery(name = "VwGiaodichCnNhantienWeb.findByIdChinhanh", query = "SELECT v FROM VwGiaodichCnNhantienWeb v WHERE v.idChinhanh = :idChinhanh"),
    @NamedQuery(name = "VwGiaodichCnNhantienWeb.findBySophieu", query = "SELECT v FROM VwGiaodichCnNhantienWeb v WHERE v.sophieu = :sophieu"),
    @NamedQuery(name = "VwGiaodichCnNhantienWeb.findByStt", query = "SELECT v FROM VwGiaodichCnNhantienWeb v WHERE v.stt = :stt"),
    @NamedQuery(name = "VwGiaodichCnNhantienWeb.findByDiachi", query = "SELECT v FROM VwGiaodichCnNhantienWeb v WHERE v.diachi = :diachi"),
    @NamedQuery(name = "VwGiaodichCnNhantienWeb.findByMaKhachhang", query = "SELECT v FROM VwGiaodichCnNhantienWeb v WHERE v.maKhachhang = :maKhachhang"),
    @NamedQuery(name = "VwGiaodichCnNhantienWeb.findByDachitra", query = "SELECT v FROM VwGiaodichCnNhantienWeb v WHERE v.dachitra = :dachitra"),
    @NamedQuery(name = "VwGiaodichCnNhantienWeb.findByNguoigoi", query = "SELECT v FROM VwGiaodichCnNhantienWeb v WHERE v.nguoigoi = :nguoigoi"),
    @NamedQuery(name = "VwGiaodichCnNhantienWeb.findByIdMobiHb", query = "SELECT v FROM VwGiaodichCnNhantienWeb v WHERE v.idMobiHb = :idMobiHb"),
    @NamedQuery(name = "VwGiaodichCnNhantienWeb.findByNgayMobiHb", query = "SELECT v FROM VwGiaodichCnNhantienWeb v WHERE v.ngayMobiHb = :ngayMobiHb"),
    @NamedQuery(name = "VwGiaodichCnNhantienWeb.findByDienthoai", query = "SELECT v FROM VwGiaodichCnNhantienWeb v WHERE v.dienthoai = :dienthoai"),
    @NamedQuery(name = "VwGiaodichCnNhantienWeb.findByGhichuGoi", query = "SELECT v FROM VwGiaodichCnNhantienWeb v WHERE v.ghichuGoi = :ghichuGoi")})
public class VwGiaodichCnNhantienWeb implements Serializable {
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(max = 80)
    @Column(name = "IDCODE")
    private String idcode;
    private static final long serialVersionUID = 1L;
    @Size(max = 40)
    @Column(name = "ID_QLQ_DOTTG")
    private String idQlqDottg;
    @Size(max = 20)
    @Column(name = "ID_NV_CHITRA")
    private String idNvChitra;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "MA_NGUOINHAN")
    private String maNguoinhan;
    @Column(name = "SOBN")
    private Long sobn;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "HOTEN")
    private String hoten;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SOTIENGOI")
    private BigDecimal sotiengoi;
    @Column(name = "TYGIA")
    private BigDecimal tygia;
    @Column(name = "THANHTIEN")
    private BigDecimal thanhtien;
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
    @Size(max = 1)
    @Column(name = "ID_QLQ_DUYET")
    private String idQlqDuyet;
    @Size(max = 1)
    @Column(name = "ID_QLQ_MOICHITIEN")
    private String idQlqMoichitien;
    @Size(max = 1)
    @Column(name = "ID_QLQ_NHANDUTIEN")
    private String idQlqNhandutien;
    @Size(max = 20)
    @Column(name = "ID_TQUY")
    private String idTquy;
    @Size(max = 20)
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
    @Size(max = 150)
    @Column(name = "DIACHI")
    private String diachi;
    @Size(max = 60)
    @Column(name = "MA_KHACHHANG")
    private String maKhachhang;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DACHITRA")
    private Character dachitra;
    @Size(max = 60)
    @Column(name = "NGUOIGOI")
    private String nguoigoi;
    @Size(max = 1)
    @Column(name = "ID_MOBI_HB")
    private String idMobiHb;
    @Column(name = "NGAY_MOBI_HB")
    @Temporal(TemporalType.DATE)
    private Date ngayMobiHb;
    @Size(max = 40)
    @Column(name = "DIENTHOAI")
    private String dienthoai;
    @Size(max = 400)
    @Column(name = "GHICHU_GOI")
    private String ghichuGoi;

    public VwGiaodichCnNhantienWeb() {
    }

    public String getIdQlqDottg() {
        return idQlqDottg;
    }

    public void setIdQlqDottg(String idQlqDottg) {
        this.idQlqDottg = idQlqDottg;
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

    public String getIdQlqDuyet() {
        return idQlqDuyet;
    }

    public void setIdQlqDuyet(String idQlqDuyet) {
        this.idQlqDuyet = idQlqDuyet;
    }

    public String getIdQlqMoichitien() {
        return idQlqMoichitien;
    }

    public void setIdQlqMoichitien(String idQlqMoichitien) {
        this.idQlqMoichitien = idQlqMoichitien;
    }

    public String getIdQlqNhandutien() {
        return idQlqNhandutien;
    }

    public void setIdQlqNhandutien(String idQlqNhandutien) {
        this.idQlqNhandutien = idQlqNhandutien;
    }

    public String getIdTquy() {
        return idTquy;
    }

    public void setIdTquy(String idTquy) {
        this.idTquy = idTquy;
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

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getMaKhachhang() {
        return maKhachhang;
    }

    public void setMaKhachhang(String maKhachhang) {
        this.maKhachhang = maKhachhang;
    }

    public Character getDachitra() {
        return dachitra;
    }

    public void setDachitra(Character dachitra) {
        this.dachitra = dachitra;
    }

    public String getNguoigoi() {
        return nguoigoi;
    }

    public void setNguoigoi(String nguoigoi) {
        this.nguoigoi = nguoigoi;
    }

    public String getIdMobiHb() {
        return idMobiHb;
    }

    public void setIdMobiHb(String idMobiHb) {
        this.idMobiHb = idMobiHb;
    }

    public Date getNgayMobiHb() {
        return ngayMobiHb;
    }

    public void setNgayMobiHb(Date ngayMobiHb) {
        this.ngayMobiHb = ngayMobiHb;
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

    public String getIdcode() {
        return idcode;
    }

    public void setIdcode(String idcode) {
        this.idcode = idcode;
    }
    
}
