/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

/**
 *
 * @author TamChauDAMTC
 */
@Entity
@Table(name = "VW_GIAODICH_HOIBAOMOBILE_NVALL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwGiaodichHoibaomobileNvall.findAll", query = "SELECT v FROM VwGiaodichHoibaomobileNvall v"),
    @NamedQuery(name = "VwGiaodichHoibaomobileNvall.findByIdChinhanh", query = "SELECT v FROM VwGiaodichHoibaomobileNvall v WHERE v.idChinhanh = :idChinhanh"),
    @NamedQuery(name = "VwGiaodichHoibaomobileNvall.findBySophieu", query = "SELECT v FROM VwGiaodichHoibaomobileNvall v WHERE v.sophieu = :sophieu"),
    @NamedQuery(name = "VwGiaodichHoibaomobileNvall.findByStt", query = "SELECT v FROM VwGiaodichHoibaomobileNvall v WHERE v.stt = :stt"),
    @NamedQuery(name = "VwGiaodichHoibaomobileNvall.findByTenchinhanh", query = "SELECT v FROM VwGiaodichHoibaomobileNvall v WHERE v.tenchinhanh = :tenchinhanh"),
    @NamedQuery(name = "VwGiaodichHoibaomobileNvall.findByIdNvChitra", query = "SELECT v FROM VwGiaodichHoibaomobileNvall v WHERE v.idNvChitra = :idNvChitra"),
    @NamedQuery(name = "VwGiaodichHoibaomobileNvall.findByHotenNv", query = "SELECT v FROM VwGiaodichHoibaomobileNvall v WHERE v.hotenNv = :hotenNv"),
    @NamedQuery(name = "VwGiaodichHoibaomobileNvall.findByHoten", query = "SELECT v FROM VwGiaodichHoibaomobileNvall v WHERE v.hoten = :hoten"),
    @NamedQuery(name = "VwGiaodichHoibaomobileNvall.findByNguoigoi", query = "SELECT v FROM VwGiaodichHoibaomobileNvall v WHERE v.nguoigoi = :nguoigoi"),
    @NamedQuery(name = "VwGiaodichHoibaomobileNvall.findByMaNguoinhan", query = "SELECT v FROM VwGiaodichHoibaomobileNvall v WHERE v.maNguoinhan = :maNguoinhan"),
    @NamedQuery(name = "VwGiaodichHoibaomobileNvall.findBySobn", query = "SELECT v FROM VwGiaodichHoibaomobileNvall v WHERE v.sobn = :sobn"),
    @NamedQuery(name = "VwGiaodichHoibaomobileNvall.findBySotiengoi", query = "SELECT v FROM VwGiaodichHoibaomobileNvall v WHERE v.sotiengoi = :sotiengoi"),
    @NamedQuery(name = "VwGiaodichHoibaomobileNvall.findByTygia", query = "SELECT v FROM VwGiaodichHoibaomobileNvall v WHERE v.tygia = :tygia"),
    @NamedQuery(name = "VwGiaodichHoibaomobileNvall.findByThanhtien", query = "SELECT v FROM VwGiaodichHoibaomobileNvall v WHERE v.thanhtien = :thanhtien"),
    @NamedQuery(name = "VwGiaodichHoibaomobileNvall.findBySoCtTuythan", query = "SELECT v FROM VwGiaodichHoibaomobileNvall v WHERE v.soCtTuythan = :soCtTuythan"),
    @NamedQuery(name = "VwGiaodichHoibaomobileNvall.findByDiachi", query = "SELECT v FROM VwGiaodichHoibaomobileNvall v WHERE v.diachi = :diachi"),
    @NamedQuery(name = "VwGiaodichHoibaomobileNvall.findByXacminh", query = "SELECT v FROM VwGiaodichHoibaomobileNvall v WHERE v.xacminh = :xacminh"),
    @NamedQuery(name = "VwGiaodichHoibaomobileNvall.findByNgayXacminh", query = "SELECT v FROM VwGiaodichHoibaomobileNvall v WHERE v.ngayXacminh = :ngayXacminh"),
    @NamedQuery(name = "VwGiaodichHoibaomobileNvall.findByGhichu", query = "SELECT v FROM VwGiaodichHoibaomobileNvall v WHERE v.ghichu = :ghichu"),
    @NamedQuery(name = "VwGiaodichHoibaomobileNvall.findByIdDoitac", query = "SELECT v FROM VwGiaodichHoibaomobileNvall v WHERE v.idDoitac = :idDoitac"),
    @NamedQuery(name = "VwGiaodichHoibaomobileNvall.findByTenDoitac", query = "SELECT v FROM VwGiaodichHoibaomobileNvall v WHERE v.tenDoitac = :tenDoitac"),
    @NamedQuery(name = "VwGiaodichHoibaomobileNvall.findByIdLoaitienchitra", query = "SELECT v FROM VwGiaodichHoibaomobileNvall v WHERE v.idLoaitienchitra = :idLoaitienchitra"),
    @NamedQuery(name = "VwGiaodichHoibaomobileNvall.findByDaxacminh", query = "SELECT v FROM VwGiaodichHoibaomobileNvall v WHERE v.daxacminh = :daxacminh"),
    @NamedQuery(name = "VwGiaodichHoibaomobileNvall.findByDienthoai", query = "SELECT v FROM VwGiaodichHoibaomobileNvall v WHERE v.dienthoai = :dienthoai"),
    @NamedQuery(name = "VwGiaodichHoibaomobileNvall.findByCodemg", query = "SELECT v FROM VwGiaodichHoibaomobileNvall v WHERE v.codemg = :codemg"),
    @NamedQuery(name = "VwGiaodichHoibaomobileNvall.findByDaxmmobile", query = "SELECT v FROM VwGiaodichHoibaomobileNvall v WHERE v.daxmmobile = :daxmmobile"),
    @NamedQuery(name = "VwGiaodichHoibaomobileNvall.findByNoidungxmmobile", query = "SELECT v FROM VwGiaodichHoibaomobileNvall v WHERE v.noidungxmmobile = :noidungxmmobile"),
    @NamedQuery(name = "VwGiaodichHoibaomobileNvall.findByQuydinhxm", query = "SELECT v FROM VwGiaodichHoibaomobileNvall v WHERE v.quydinhxm = :quydinhxm"),
    @NamedQuery(name = "VwGiaodichHoibaomobileNvall.findByHsdot3", query = "SELECT v FROM VwGiaodichHoibaomobileNvall v WHERE v.hsdot3 = :hsdot3"),
    @NamedQuery(name = "VwGiaodichHoibaomobileNvall.findByHsdot1", query = "SELECT v FROM VwGiaodichHoibaomobileNvall v WHERE v.hsdot1 = :hsdot1")})
public class VwGiaodichHoibaomobileNvall implements Serializable {

    @Column(name = "SHSKBN")
    private BigInteger shskbn;
    private static final long serialVersionUID = 1L;
    @Id
    @Size(max = 80)
    @Column(name = "IDCODE")
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
    @Size(max = 60)
    @Column(name = "NGUOIGOI")
    private String nguoigoi;
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
    @Column(name = "TYGIA")
    private BigDecimal tygia;
    @Column(name = "THANHTIEN")
    private BigDecimal thanhtien;
    @Size(max = 20)
    @Column(name = "SO_CT_TUYTHAN")
    private String soCtTuythan;
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
    @Size(max = 20)
    @Column(name = "CODEMG")
    private String codemg;
    @Column(name = "DAXMMOBILE")
    private BigInteger daxmmobile;
    @Size(max = 1000)
    @Column(name = "NOIDUNGXMMOBILE")
    private String noidungxmmobile;
    @Size(max = 12)
    @Column(name = "QUYDINHXM")
    private String quydinhxm;
    @Size(max = 1)
    @Column(name = "HSDOT3")
    private String hsdot3;
    @Size(max = 1)
    @Column(name = "HSDOT1")
    private String hsdot1;

    public VwGiaodichHoibaomobileNvall() {
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

    public String getNguoigoi() {
        return nguoigoi;
    }

    public void setNguoigoi(String nguoigoi) {
        this.nguoigoi = nguoigoi;
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

    public String getHsdot1() {
        return hsdot1;
    }

    public void setHsdot1(String hsdot1) {
        this.hsdot1 = hsdot1;
    }

    public BigInteger getShskbn() {
        return shskbn;
    }

    public void setShskbn(BigInteger shskbn) {
        this.shskbn = shskbn;
    }
    
}
