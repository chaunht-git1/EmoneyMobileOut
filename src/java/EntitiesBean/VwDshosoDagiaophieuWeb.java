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
@Table(name = "VW_DSHOSO_DAGIAOPHIEU_WEB")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwDshosoDagiaophieuWeb.findAll", query = "SELECT v FROM VwDshosoDagiaophieuWeb v"),
    @NamedQuery(name = "VwDshosoDagiaophieuWeb.findByIdCode", query = "SELECT v FROM VwDshosoDagiaophieuWeb v WHERE v.idCode = :idCode"),
    @NamedQuery(name = "VwDshosoDagiaophieuWeb.findByIdChinhanh", query = "SELECT v FROM VwDshosoDagiaophieuWeb v WHERE v.idChinhanh = :idChinhanh"),
    @NamedQuery(name = "VwDshosoDagiaophieuWeb.findByDanhanphieu", query = "SELECT v FROM VwDshosoDagiaophieuWeb v WHERE v.danhanphieu = :danhanphieu"),
    @NamedQuery(name = "VwDshosoDagiaophieuWeb.findBySophieu", query = "SELECT v FROM VwDshosoDagiaophieuWeb v WHERE v.sophieu = :sophieu"),
    @NamedQuery(name = "VwDshosoDagiaophieuWeb.findByStt", query = "SELECT v FROM VwDshosoDagiaophieuWeb v WHERE v.stt = :stt"),
    @NamedQuery(name = "VwDshosoDagiaophieuWeb.findByIdCity", query = "SELECT v FROM VwDshosoDagiaophieuWeb v WHERE v.idCity = :idCity"),
    @NamedQuery(name = "VwDshosoDagiaophieuWeb.findByCityName", query = "SELECT v FROM VwDshosoDagiaophieuWeb v WHERE v.cityName = :cityName"),
    @NamedQuery(name = "VwDshosoDagiaophieuWeb.findByIdDistrict", query = "SELECT v FROM VwDshosoDagiaophieuWeb v WHERE v.idDistrict = :idDistrict"),
    @NamedQuery(name = "VwDshosoDagiaophieuWeb.findByDistrictName", query = "SELECT v FROM VwDshosoDagiaophieuWeb v WHERE v.districtName = :districtName"),
    @NamedQuery(name = "VwDshosoDagiaophieuWeb.findByMaNguoinhan", query = "SELECT v FROM VwDshosoDagiaophieuWeb v WHERE v.maNguoinhan = :maNguoinhan"),
    @NamedQuery(name = "VwDshosoDagiaophieuWeb.findByIdDoitac", query = "SELECT v FROM VwDshosoDagiaophieuWeb v WHERE v.idDoitac = :idDoitac"),
    @NamedQuery(name = "VwDshosoDagiaophieuWeb.findByTendoitac", query = "SELECT v FROM VwDshosoDagiaophieuWeb v WHERE v.tendoitac = :tendoitac"),
    @NamedQuery(name = "VwDshosoDagiaophieuWeb.findBySotiengoi", query = "SELECT v FROM VwDshosoDagiaophieuWeb v WHERE v.sotiengoi = :sotiengoi"),
    @NamedQuery(name = "VwDshosoDagiaophieuWeb.findByIdLoaitiengoi", query = "SELECT v FROM VwDshosoDagiaophieuWeb v WHERE v.idLoaitiengoi = :idLoaitiengoi"),
    @NamedQuery(name = "VwDshosoDagiaophieuWeb.findByIdLoaitienchitra", query = "SELECT v FROM VwDshosoDagiaophieuWeb v WHERE v.idLoaitienchitra = :idLoaitienchitra"),
    @NamedQuery(name = "VwDshosoDagiaophieuWeb.findByTygia", query = "SELECT v FROM VwDshosoDagiaophieuWeb v WHERE v.tygia = :tygia"),
    @NamedQuery(name = "VwDshosoDagiaophieuWeb.findByThanhtien", query = "SELECT v FROM VwDshosoDagiaophieuWeb v WHERE v.thanhtien = :thanhtien"),
    @NamedQuery(name = "VwDshosoDagiaophieuWeb.findByIdNvChitra", query = "SELECT v FROM VwDshosoDagiaophieuWeb v WHERE v.idNvChitra = :idNvChitra"),
    @NamedQuery(name = "VwDshosoDagiaophieuWeb.findByMaQlds", query = "SELECT v FROM VwDshosoDagiaophieuWeb v WHERE v.maQlds = :maQlds"),
    @NamedQuery(name = "VwDshosoDagiaophieuWeb.findByNgaygiaophieu", query = "SELECT v FROM VwDshosoDagiaophieuWeb v WHERE v.ngaygiaophieu = :ngaygiaophieu"),
    @NamedQuery(name = "VwDshosoDagiaophieuWeb.findByDiachi", query = "SELECT v FROM VwDshosoDagiaophieuWeb v WHERE v.diachi = :diachi"),
    @NamedQuery(name = "VwDshosoDagiaophieuWeb.findByNgaytaoDs", query = "SELECT v FROM VwDshosoDagiaophieuWeb v WHERE v.ngaytaoDs = :ngaytaoDs"),
    @NamedQuery(name = "VwDshosoDagiaophieuWeb.findBySolanin", query = "SELECT v FROM VwDshosoDagiaophieuWeb v WHERE v.solanin = :solanin"),
    @NamedQuery(name = "VwDshosoDagiaophieuWeb.findByDienthoai", query = "SELECT v FROM VwDshosoDagiaophieuWeb v WHERE v.dienthoai = :dienthoai"),
    @NamedQuery(name = "VwDshosoDagiaophieuWeb.findByHoten", query = "SELECT v FROM VwDshosoDagiaophieuWeb v WHERE v.hoten = :hoten"),
    @NamedQuery(name = "VwDshosoDagiaophieuWeb.findByNoname", query = "SELECT v FROM VwDshosoDagiaophieuWeb v WHERE v.noname = :noname"),
    @NamedQuery(name = "VwDshosoDagiaophieuWeb.findBySobn", query = "SELECT v FROM VwDshosoDagiaophieuWeb v WHERE v.sobn = :sobn"),
    @NamedQuery(name = "VwDshosoDagiaophieuWeb.findByIdGpAuto", query = "SELECT v FROM VwDshosoDagiaophieuWeb v WHERE v.idGpAuto = :idGpAuto")})
public class VwDshosoDagiaophieuWeb implements Serializable {
    @Size(max = 400)
    @Column(name = "GHICHU_GOI")
    private String ghichuGoi;
    @Size(max = 60)
    @Column(name = "XACMINH")
    private String xacminh;
    @Size(max = 400)
    @Column(name = "GHICHU")
    private String ghichu;
    private static final long serialVersionUID = 1L;
    @Id
    @Size(max = 80)
    @Column(name = "ID_CODE")
    private String idCode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID_CHINHANH")
    private String idChinhanh;
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
    @Size(max = 20)
    @Column(name = "ID_CITY")
    private String idCity;
    @Size(max = 4000)
    @Column(name = "CITY_NAME")
    private String cityName;
    @Size(max = 20)
    @Column(name = "ID_DISTRICT")
    private String idDistrict;
    @Size(max = 4000)
    @Column(name = "DISTRICT_NAME")
    private String districtName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "MA_NGUOINHAN")
    private String maNguoinhan;
    @Size(max = 20)
    @Column(name = "ID_DOITAC")
    private String idDoitac;
    @Size(max = 4000)
    @Column(name = "TENDOITAC")
    private String tendoitac;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SOTIENGOI")
    private BigDecimal sotiengoi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID_LOAITIENGOI")
    private String idLoaitiengoi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID_LOAITIENCHITRA")
    private String idLoaitienchitra;
    @Column(name = "TYGIA")
    private BigDecimal tygia;
    @Column(name = "THANHTIEN")
    private BigDecimal thanhtien;
    @Size(max = 20)
    @Column(name = "ID_NV_CHITRA")
    private String idNvChitra;
    @Size(max = 40)
    @Column(name = "MA_QLDS")
    private String maQlds;
    @Column(name = "NGAYGIAOPHIEU")
    @Temporal(TemporalType.DATE)
    private Date ngaygiaophieu;
    @Size(max = 150)
    @Column(name = "DIACHI")
    private String diachi;
    @Size(max = 0)
    @Column(name = "NGAYTAO_DS")
    private String ngaytaoDs;
    @Column(name = "SOLANIN")
    private BigInteger solanin;
    @Size(max = 40)
    @Column(name = "DIENTHOAI")
    private String dienthoai;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "HOTEN")
    private String hoten;
    @Size(max = 1)
    @Column(name = "NONAME")
    private String noname;
    @Column(name = "SOBN")
    private Long sobn;
    @Size(max = 1)
    @Column(name = "ID_GP_AUTO")
    private String idGpAuto;

    public VwDshosoDagiaophieuWeb() {
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    public String getIdChinhanh() {
        return idChinhanh;
    }

    public void setIdChinhanh(String idChinhanh) {
        this.idChinhanh = idChinhanh;
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

    public String getIdCity() {
        return idCity;
    }

    public void setIdCity(String idCity) {
        this.idCity = idCity;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getIdDistrict() {
        return idDistrict;
    }

    public void setIdDistrict(String idDistrict) {
        this.idDistrict = idDistrict;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
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

    public String getTendoitac() {
        return tendoitac;
    }

    public void setTendoitac(String tendoitac) {
        this.tendoitac = tendoitac;
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

    public String getIdLoaitienchitra() {
        return idLoaitienchitra;
    }

    public void setIdLoaitienchitra(String idLoaitienchitra) {
        this.idLoaitienchitra = idLoaitienchitra;
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

    public String getIdNvChitra() {
        return idNvChitra;
    }

    public void setIdNvChitra(String idNvChitra) {
        this.idNvChitra = idNvChitra;
    }

    public String getMaQlds() {
        return maQlds;
    }

    public void setMaQlds(String maQlds) {
        this.maQlds = maQlds;
    }

    public Date getNgaygiaophieu() {
        return ngaygiaophieu;
    }

    public void setNgaygiaophieu(Date ngaygiaophieu) {
        this.ngaygiaophieu = ngaygiaophieu;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getNgaytaoDs() {
        return ngaytaoDs;
    }

    public void setNgaytaoDs(String ngaytaoDs) {
        this.ngaytaoDs = ngaytaoDs;
    }

    public BigInteger getSolanin() {
        return solanin;
    }

    public void setSolanin(BigInteger solanin) {
        this.solanin = solanin;
    }

    public String getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNoname() {
        return noname;
    }

    public void setNoname(String noname) {
        this.noname = noname;
    }

    public Long getSobn() {
        return sobn;
    }

    public void setSobn(Long sobn) {
        this.sobn = sobn;
    }

    public String getIdGpAuto() {
        return idGpAuto;
    }

    public void setIdGpAuto(String idGpAuto) {
        this.idGpAuto = idGpAuto;
    }

    public String getGhichuGoi() {
        return ghichuGoi;
    }

    public void setGhichuGoi(String ghichuGoi) {
        this.ghichuGoi = ghichuGoi;
    }

    public String getXacminh() {
        return xacminh;
    }

    public void setXacminh(String xacminh) {
        this.xacminh = xacminh;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }
    
}
