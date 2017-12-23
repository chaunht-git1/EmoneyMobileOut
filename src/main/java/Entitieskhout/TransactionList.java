/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entitieskhout;

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
 * @author chaunht
 */
@Entity
@Table(name = "TRANSACTION_LIST")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TransactionList.findAll", query = "SELECT t FROM TransactionList t")
    , @NamedQuery(name = "TransactionList.findByIdCode", query = "SELECT t FROM TransactionList t WHERE t.idCode = :idCode")
    , @NamedQuery(name = "TransactionList.findBySobn", query = "SELECT t FROM TransactionList t WHERE t.sobn = :sobn")
    , @NamedQuery(name = "TransactionList.findByIdDotData", query = "SELECT t FROM TransactionList t WHERE t.idDotData = :idDotData")
    , @NamedQuery(name = "TransactionList.findByHoten", query = "SELECT t FROM TransactionList t WHERE t.hoten = :hoten")
    , @NamedQuery(name = "TransactionList.findByMaNguoinhan", query = "SELECT t FROM TransactionList t WHERE t.maNguoinhan = :maNguoinhan")
    , @NamedQuery(name = "TransactionList.findByNguoigoi", query = "SELECT t FROM TransactionList t WHERE t.nguoigoi = :nguoigoi")
    , @NamedQuery(name = "TransactionList.findByMaKhachhang", query = "SELECT t FROM TransactionList t WHERE t.maKhachhang = :maKhachhang")
    , @NamedQuery(name = "TransactionList.findByIdLoaitienchitra", query = "SELECT t FROM TransactionList t WHERE t.idLoaitienchitra = :idLoaitienchitra")
    , @NamedQuery(name = "TransactionList.findByIdLoaitiengoi", query = "SELECT t FROM TransactionList t WHERE t.idLoaitiengoi = :idLoaitiengoi")
    , @NamedQuery(name = "TransactionList.findBySotiengoi", query = "SELECT t FROM TransactionList t WHERE t.sotiengoi = :sotiengoi")
    , @NamedQuery(name = "TransactionList.findByTygia", query = "SELECT t FROM TransactionList t WHERE t.tygia = :tygia")
    , @NamedQuery(name = "TransactionList.findByThanhtien", query = "SELECT t FROM TransactionList t WHERE t.thanhtien = :thanhtien")
    , @NamedQuery(name = "TransactionList.findByDiachi", query = "SELECT t FROM TransactionList t WHERE t.diachi = :diachi")
    , @NamedQuery(name = "TransactionList.findByDachitra", query = "SELECT t FROM TransactionList t WHERE t.dachitra = :dachitra")
    , @NamedQuery(name = "TransactionList.findByDahoibao", query = "SELECT t FROM TransactionList t WHERE t.dahoibao = :dahoibao")
    , @NamedQuery(name = "TransactionList.findByIdNvHoibao", query = "SELECT t FROM TransactionList t WHERE t.idNvHoibao = :idNvHoibao")
    , @NamedQuery(name = "TransactionList.findByNgayHoibao", query = "SELECT t FROM TransactionList t WHERE t.ngayHoibao = :ngayHoibao")
    , @NamedQuery(name = "TransactionList.findByXacminh", query = "SELECT t FROM TransactionList t WHERE t.xacminh = :xacminh")
    , @NamedQuery(name = "TransactionList.findByLydoxacminh", query = "SELECT t FROM TransactionList t WHERE t.lydoxacminh = :lydoxacminh")
    , @NamedQuery(name = "TransactionList.findByIdNvChitra", query = "SELECT t FROM TransactionList t WHERE t.idNvChitra = :idNvChitra")
    , @NamedQuery(name = "TransactionList.findByIdChinhanh", query = "SELECT t FROM TransactionList t WHERE t.idChinhanh = :idChinhanh")
    , @NamedQuery(name = "TransactionList.findBySoCtTuythan", query = "SELECT t FROM TransactionList t WHERE t.soCtTuythan = :soCtTuythan")
    , @NamedQuery(name = "TransactionList.findByLoaiCtTuythan", query = "SELECT t FROM TransactionList t WHERE t.loaiCtTuythan = :loaiCtTuythan")
    , @NamedQuery(name = "TransactionList.findByNgayChitraTrue", query = "SELECT t FROM TransactionList t WHERE t.ngayChitraTrue = :ngayChitraTrue")
    , @NamedQuery(name = "TransactionList.findByUploadimage", query = "SELECT t FROM TransactionList t WHERE t.uploadimage = :uploadimage")
    , @NamedQuery(name = "TransactionList.findByLink", query = "SELECT t FROM TransactionList t WHERE t.link = :link")
    , @NamedQuery(name = "TransactionList.findByIdDataHoiso", query = "SELECT t FROM TransactionList t WHERE t.idDataHoiso = :idDataHoiso")
    , @NamedQuery(name = "TransactionList.findByDateDataHoiso", query = "SELECT t FROM TransactionList t WHERE t.dateDataHoiso = :dateDataHoiso")
    , @NamedQuery(name = "TransactionList.findByDateSaveCmnd", query = "SELECT t FROM TransactionList t WHERE t.dateSaveCmnd = :dateSaveCmnd")
    , @NamedQuery(name = "TransactionList.findByDienthoai", query = "SELECT t FROM TransactionList t WHERE t.dienthoai = :dienthoai")
    , @NamedQuery(name = "TransactionList.findByGhichuGoi", query = "SELECT t FROM TransactionList t WHERE t.ghichuGoi = :ghichuGoi")
    , @NamedQuery(name = "TransactionList.findBySophieu", query = "SELECT t FROM TransactionList t WHERE t.sophieu = :sophieu")
    , @NamedQuery(name = "TransactionList.findByStt", query = "SELECT t FROM TransactionList t WHERE t.stt = :stt")})
public class TransactionList implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "ID_CODE")
    private String idCode;
    @Size(max = 100)
    @Column(name = "SOBN")
    private String sobn;
    @Column(name = "ID_DOT_DATA")
    private BigInteger idDotData;
    @Size(max = 500)
    @Column(name = "HOTEN")
    private String hoten;
    @Size(max = 100)
    @Column(name = "MA_NGUOINHAN")
    private String maNguoinhan;
    @Size(max = 100)
    @Column(name = "NGUOIGOI")
    private String nguoigoi;
    @Size(max = 100)
    @Column(name = "MA_KHACHHANG")
    private String maKhachhang;
    @Size(max = 20)
    @Column(name = "ID_LOAITIENCHITRA")
    private String idLoaitienchitra;
    @Size(max = 20)
    @Column(name = "ID_LOAITIENGOI")
    private String idLoaitiengoi;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SOTIENGOI")
    private BigDecimal sotiengoi;
    @Column(name = "TYGIA")
    private Long tygia;
    @Column(name = "THANHTIEN")
    private Long thanhtien;
    @Size(max = 1000)
    @Column(name = "DIACHI")
    private String diachi;
    @Size(max = 20)
    @Column(name = "DACHITRA")
    private String dachitra;
    @Size(max = 20)
    @Column(name = "DAHOIBAO")
    private String dahoibao;
    @Size(max = 20)
    @Column(name = "ID_NV_HOIBAO")
    private String idNvHoibao;
    @Column(name = "NGAY_HOIBAO")
    @Temporal(TemporalType.DATE)
    private Date ngayHoibao;
    @Size(max = 1)
    @Column(name = "XACMINH")
    private String xacminh;
    @Size(max = 1000)
    @Column(name = "LYDOXACMINH")
    private String lydoxacminh;
    @Size(max = 20)
    @Column(name = "ID_NV_CHITRA")
    private String idNvChitra;
    @Size(max = 20)
    @Column(name = "ID_CHINHANH")
    private String idChinhanh;
    @Size(max = 100)
    @Column(name = "SO_CT_TUYTHAN")
    private String soCtTuythan;
    @Size(max = 100)
    @Column(name = "LOAI_CT_TUYTHAN")
    private String loaiCtTuythan;
    @Column(name = "NGAY_CHITRA_TRUE")
    @Temporal(TemporalType.DATE)
    private Date ngayChitraTrue;
    @Size(max = 1)
    @Column(name = "UPLOADIMAGE")
    private String uploadimage;
    @Size(max = 500)
    @Column(name = "LINK")
    private String link;
    @Size(max = 1)
    @Column(name = "ID_DATA_HOISO")
    private String idDataHoiso;
    @Column(name = "DATE_DATA_HOISO")
    @Temporal(TemporalType.DATE)
    private Date dateDataHoiso;
    @Column(name = "DATE_SAVE_CMND")
    @Temporal(TemporalType.DATE)
    private Date dateSaveCmnd;
    @Size(max = 40)
    @Column(name = "DIENTHOAI")
    private String dienthoai;
    @Size(max = 500)
    @Column(name = "GHICHU_GOI")
    private String ghichuGoi;
    @Size(max = 60)
    @Column(name = "SOPHIEU")
    private String sophieu;
    @Column(name = "STT")
    private BigInteger stt;

    public TransactionList() {
    }

    public TransactionList(String idCode) {
        this.idCode = idCode;
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    public String getSobn() {
        return sobn;
    }

    public void setSobn(String sobn) {
        this.sobn = sobn;
    }

    public BigInteger getIdDotData() {
        return idDotData;
    }

    public void setIdDotData(BigInteger idDotData) {
        this.idDotData = idDotData;
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

    public String getNguoigoi() {
        return nguoigoi;
    }

    public void setNguoigoi(String nguoigoi) {
        this.nguoigoi = nguoigoi;
    }

    public String getMaKhachhang() {
        return maKhachhang;
    }

    public void setMaKhachhang(String maKhachhang) {
        this.maKhachhang = maKhachhang;
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

    public BigDecimal getSotiengoi() {
        return sotiengoi;
    }

    public void setSotiengoi(BigDecimal sotiengoi) {
        this.sotiengoi = sotiengoi;
    }

    public Long getTygia() {
        return tygia;
    }

    public void setTygia(Long tygia) {
        this.tygia = tygia;
    }

    public Long getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(Long thanhtien) {
        this.thanhtien = thanhtien;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getDachitra() {
        return dachitra;
    }

    public void setDachitra(String dachitra) {
        this.dachitra = dachitra;
    }

    public String getDahoibao() {
        return dahoibao;
    }

    public void setDahoibao(String dahoibao) {
        this.dahoibao = dahoibao;
    }

    public String getIdNvHoibao() {
        return idNvHoibao;
    }

    public void setIdNvHoibao(String idNvHoibao) {
        this.idNvHoibao = idNvHoibao;
    }

    public Date getNgayHoibao() {
        return ngayHoibao;
    }

    public void setNgayHoibao(Date ngayHoibao) {
        this.ngayHoibao = ngayHoibao;
    }

    public String getXacminh() {
        return xacminh;
    }

    public void setXacminh(String xacminh) {
        this.xacminh = xacminh;
    }

    public String getLydoxacminh() {
        return lydoxacminh;
    }

    public void setLydoxacminh(String lydoxacminh) {
        this.lydoxacminh = lydoxacminh;
    }

    public String getIdNvChitra() {
        return idNvChitra;
    }

    public void setIdNvChitra(String idNvChitra) {
        this.idNvChitra = idNvChitra;
    }

    public String getIdChinhanh() {
        return idChinhanh;
    }

    public void setIdChinhanh(String idChinhanh) {
        this.idChinhanh = idChinhanh;
    }

    public String getSoCtTuythan() {
        return soCtTuythan;
    }

    public void setSoCtTuythan(String soCtTuythan) {
        this.soCtTuythan = soCtTuythan;
    }

    public String getLoaiCtTuythan() {
        return loaiCtTuythan;
    }

    public void setLoaiCtTuythan(String loaiCtTuythan) {
        this.loaiCtTuythan = loaiCtTuythan;
    }

    public Date getNgayChitraTrue() {
        return ngayChitraTrue;
    }

    public void setNgayChitraTrue(Date ngayChitraTrue) {
        this.ngayChitraTrue = ngayChitraTrue;
    }

    public String getUploadimage() {
        return uploadimage;
    }

    public void setUploadimage(String uploadimage) {
        this.uploadimage = uploadimage;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getIdDataHoiso() {
        return idDataHoiso;
    }

    public void setIdDataHoiso(String idDataHoiso) {
        this.idDataHoiso = idDataHoiso;
    }

    public Date getDateDataHoiso() {
        return dateDataHoiso;
    }

    public void setDateDataHoiso(Date dateDataHoiso) {
        this.dateDataHoiso = dateDataHoiso;
    }

    public Date getDateSaveCmnd() {
        return dateSaveCmnd;
    }

    public void setDateSaveCmnd(Date dateSaveCmnd) {
        this.dateSaveCmnd = dateSaveCmnd;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCode != null ? idCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TransactionList)) {
            return false;
        }
        TransactionList other = (TransactionList) object;
        if ((this.idCode == null && other.idCode != null) || (this.idCode != null && !this.idCode.equals(other.idCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entitieskhout.TransactionList[ idCode=" + idCode + " ]";
    }
    
}
