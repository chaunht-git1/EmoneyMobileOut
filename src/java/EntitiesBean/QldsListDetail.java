/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntitiesBean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author TamChauDAMTC
 */
@Entity
@Table(name = "QLDS_LIST_DETAIL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "QldsListDetail.findAll", query = "SELECT q FROM QldsListDetail q"),
    @NamedQuery(name = "QldsListDetail.findByMaQldsC2", query = "SELECT q FROM QldsListDetail q WHERE q.maQldsC2 = :maQldsC2"),
    @NamedQuery(name = "QldsListDetail.findByIdLoaitien", query = "SELECT q FROM QldsListDetail q WHERE q.idLoaitien = :idLoaitien"),
    @NamedQuery(name = "QldsListDetail.findByNgaytaoDsC2", query = "SELECT q FROM QldsListDetail q WHERE q.ngaytaoDsC2 = :ngaytaoDsC2"),
    @NamedQuery(name = "QldsListDetail.findBySotiengoi", query = "SELECT q FROM QldsListDetail q WHERE q.sotiengoi = :sotiengoi"),
    @NamedQuery(name = "QldsListDetail.findByIdNvKt", query = "SELECT q FROM QldsListDetail q WHERE q.idNvKt = :idNvKt"),
    @NamedQuery(name = "QldsListDetail.findByNgayKiemtra", query = "SELECT q FROM QldsListDetail q WHERE q.ngayKiemtra = :ngayKiemtra"),
    @NamedQuery(name = "QldsListDetail.findByInDanhsach", query = "SELECT q FROM QldsListDetail q WHERE q.inDanhsach = :inDanhsach"),
    @NamedQuery(name = "QldsListDetail.findBySolanin", query = "SELECT q FROM QldsListDetail q WHERE q.solanin = :solanin"),
    @NamedQuery(name = "QldsListDetail.findBySohoso", query = "SELECT q FROM QldsListDetail q WHERE q.sohoso = :sohoso"),
    @NamedQuery(name = "QldsListDetail.findByKhopsolieu", query = "SELECT q FROM QldsListDetail q WHERE q.khopsolieu = :khopsolieu"),
    @NamedQuery(name = "QldsListDetail.findByDuyet", query = "SELECT q FROM QldsListDetail q WHERE q.duyet = :duyet"),
    @NamedQuery(name = "QldsListDetail.findByIdNvDuyet", query = "SELECT q FROM QldsListDetail q WHERE q.idNvDuyet = :idNvDuyet"),
    @NamedQuery(name = "QldsListDetail.findByNgayDuyet1", query = "SELECT q FROM QldsListDetail q WHERE q.ngayDuyet1 = :ngayDuyet1"),
    @NamedQuery(name = "QldsListDetail.findByLydoKhongduyet", query = "SELECT q FROM QldsListDetail q WHERE q.lydoKhongduyet = :lydoKhongduyet"),
    @NamedQuery(name = "QldsListDetail.findByIdDoitac", query = "SELECT q FROM QldsListDetail q WHERE q.idDoitac = :idDoitac"),
    @NamedQuery(name = "QldsListDetail.findByIdChinhanh", query = "SELECT q FROM QldsListDetail q WHERE q.idChinhanh = :idChinhanh"),
    @NamedQuery(name = "QldsListDetail.findByIdLoaitienchitra", query = "SELECT q FROM QldsListDetail q WHERE q.idLoaitienchitra = :idLoaitienchitra"),
    @NamedQuery(name = "QldsListDetail.findBySotien2", query = "SELECT q FROM QldsListDetail q WHERE q.sotien2 = :sotien2"),
    @NamedQuery(name = "QldsListDetail.findByIdNvNhaplieu", query = "SELECT q FROM QldsListDetail q WHERE q.idNvNhaplieu = :idNvNhaplieu"),
    @NamedQuery(name = "QldsListDetail.findByNgayNhaplieu", query = "SELECT q FROM QldsListDetail q WHERE q.ngayNhaplieu = :ngayNhaplieu"),
    @NamedQuery(name = "QldsListDetail.findByDieuchinh", query = "SELECT q FROM QldsListDetail q WHERE q.dieuchinh = :dieuchinh"),
    @NamedQuery(name = "QldsListDetail.findBySotienGoc", query = "SELECT q FROM QldsListDetail q WHERE q.sotienGoc = :sotienGoc"),
    @NamedQuery(name = "QldsListDetail.findBySotienGoc2", query = "SELECT q FROM QldsListDetail q WHERE q.sotienGoc2 = :sotienGoc2"),
    @NamedQuery(name = "QldsListDetail.findByLydoDc", query = "SELECT q FROM QldsListDetail q WHERE q.lydoDc = :lydoDc"),
    @NamedQuery(name = "QldsListDetail.findByIdChitiet", query = "SELECT q FROM QldsListDetail q WHERE q.idChitiet = :idChitiet"),
    @NamedQuery(name = "QldsListDetail.findBySohoiso", query = "SELECT q FROM QldsListDetail q WHERE q.sohoiso = :sohoiso"),
    @NamedQuery(name = "QldsListDetail.findBySochinhanh", query = "SELECT q FROM QldsListDetail q WHERE q.sochinhanh = :sochinhanh"),
    @NamedQuery(name = "QldsListDetail.findByNgayDuyet", query = "SELECT q FROM QldsListDetail q WHERE q.ngayDuyet = :ngayDuyet"),
    @NamedQuery(name = "QldsListDetail.findByNgayChuyendoi", query = "SELECT q FROM QldsListDetail q WHERE q.ngayChuyendoi = :ngayChuyendoi"),
    @NamedQuery(name = "QldsListDetail.findByTreocuoithang", query = "SELECT q FROM QldsListDetail q WHERE q.treocuoithang = :treocuoithang")})
public class QldsListDetail implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "MA_QLDS_C2")
    private String maQldsC2;
    @Size(max = 20)
    @Column(name = "ID_LOAITIEN")
    private String idLoaitien;
    @Column(name = "NGAYTAO_DS_C2")
    @Temporal(TemporalType.DATE)
    private Date ngaytaoDsC2;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SOTIENGOI")
    private BigDecimal sotiengoi;
    @Size(max = 20)
    @Column(name = "ID_NV_KT")
    private String idNvKt;
    @Column(name = "NGAY_KIEMTRA")
    @Temporal(TemporalType.DATE)
    private Date ngayKiemtra;
    @Size(max = 1)
    @Column(name = "IN_DANHSACH")
    private String inDanhsach;
    @Column(name = "SOLANIN")
    private BigInteger solanin;
    @Column(name = "SOHOSO")
    private BigDecimal sohoso;
    @Size(max = 1)
    @Column(name = "KHOPSOLIEU")
    private String khopsolieu;
    @Size(max = 1)
    @Column(name = "DUYET")
    private String duyet;
    @Size(max = 20)
    @Column(name = "ID_NV_DUYET")
    private String idNvDuyet;
    @Size(max = 20)
    @Column(name = "NGAY_DUYET1")
    private String ngayDuyet1;
    @Size(max = 1000)
    @Column(name = "LYDO_KHONGDUYET")
    private String lydoKhongduyet;
    @Size(max = 20)
    @Column(name = "ID_DOITAC")
    private String idDoitac;
    @Size(max = 20)
    @Column(name = "ID_CHINHANH")
    private String idChinhanh;
    @Size(max = 20)
    @Column(name = "ID_LOAITIENCHITRA")
    private String idLoaitienchitra;
    @Column(name = "SOTIEN_2")
    private BigDecimal sotien2;
    @Size(max = 20)
    @Column(name = "ID_NV_NHAPLIEU")
    private String idNvNhaplieu;
    @Column(name = "NGAY_NHAPLIEU")
    @Temporal(TemporalType.DATE)
    private Date ngayNhaplieu;
    @Size(max = 1)
    @Column(name = "DIEUCHINH")
    private String dieuchinh;
    @Column(name = "SOTIEN_GOC")
    private BigDecimal sotienGoc;
    @Column(name = "SOTIEN_GOC_2")
    private BigDecimal sotienGoc2;
    @Size(max = 1000)
    @Column(name = "LYDO_DC")
    private String lydoDc;
    @Size(max = 1)
    @Column(name = "ID_CHITIET")
    private String idChitiet;
    @Column(name = "SOHOISO")
    private BigDecimal sohoiso;
    @Column(name = "SOCHINHANH")
    private BigDecimal sochinhanh;
    @Column(name = "NGAY_DUYET")
    @Temporal(TemporalType.DATE)
    private Date ngayDuyet;
    @Column(name = "NGAY_CHUYENDOI")
    @Temporal(TemporalType.DATE)
    private Date ngayChuyendoi;
    @Size(max = 1)
    @Column(name = "TREOCUOITHANG")
    private String treocuoithang;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maQldsC2")
    private Collection<QldsListDetailCn> qldsListDetailCnCollection;
    @JoinColumn(name = "MA_QLDS", referencedColumnName = "MA_QLDS")
    @ManyToOne(optional = false)
    private QldsListMaster maQlds;

    public QldsListDetail() {
    }

    public QldsListDetail(String maQldsC2) {
        this.maQldsC2 = maQldsC2;
    }

    public String getMaQldsC2() {
        return maQldsC2;
    }

    public void setMaQldsC2(String maQldsC2) {
        this.maQldsC2 = maQldsC2;
    }

    public String getIdLoaitien() {
        return idLoaitien;
    }

    public void setIdLoaitien(String idLoaitien) {
        this.idLoaitien = idLoaitien;
    }

    public Date getNgaytaoDsC2() {
        return ngaytaoDsC2;
    }

    public void setNgaytaoDsC2(Date ngaytaoDsC2) {
        this.ngaytaoDsC2 = ngaytaoDsC2;
    }

    public BigDecimal getSotiengoi() {
        return sotiengoi;
    }

    public void setSotiengoi(BigDecimal sotiengoi) {
        this.sotiengoi = sotiengoi;
    }

    public String getIdNvKt() {
        return idNvKt;
    }

    public void setIdNvKt(String idNvKt) {
        this.idNvKt = idNvKt;
    }

    public Date getNgayKiemtra() {
        return ngayKiemtra;
    }

    public void setNgayKiemtra(Date ngayKiemtra) {
        this.ngayKiemtra = ngayKiemtra;
    }

    public String getInDanhsach() {
        return inDanhsach;
    }

    public void setInDanhsach(String inDanhsach) {
        this.inDanhsach = inDanhsach;
    }

    public BigInteger getSolanin() {
        return solanin;
    }

    public void setSolanin(BigInteger solanin) {
        this.solanin = solanin;
    }

    public BigDecimal getSohoso() {
        return sohoso;
    }

    public void setSohoso(BigDecimal sohoso) {
        this.sohoso = sohoso;
    }

    public String getKhopsolieu() {
        return khopsolieu;
    }

    public void setKhopsolieu(String khopsolieu) {
        this.khopsolieu = khopsolieu;
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

    public String getNgayDuyet1() {
        return ngayDuyet1;
    }

    public void setNgayDuyet1(String ngayDuyet1) {
        this.ngayDuyet1 = ngayDuyet1;
    }

    public String getLydoKhongduyet() {
        return lydoKhongduyet;
    }

    public void setLydoKhongduyet(String lydoKhongduyet) {
        this.lydoKhongduyet = lydoKhongduyet;
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

    public String getIdLoaitienchitra() {
        return idLoaitienchitra;
    }

    public void setIdLoaitienchitra(String idLoaitienchitra) {
        this.idLoaitienchitra = idLoaitienchitra;
    }

    public BigDecimal getSotien2() {
        return sotien2;
    }

    public void setSotien2(BigDecimal sotien2) {
        this.sotien2 = sotien2;
    }

    public String getIdNvNhaplieu() {
        return idNvNhaplieu;
    }

    public void setIdNvNhaplieu(String idNvNhaplieu) {
        this.idNvNhaplieu = idNvNhaplieu;
    }

    public Date getNgayNhaplieu() {
        return ngayNhaplieu;
    }

    public void setNgayNhaplieu(Date ngayNhaplieu) {
        this.ngayNhaplieu = ngayNhaplieu;
    }

    public String getDieuchinh() {
        return dieuchinh;
    }

    public void setDieuchinh(String dieuchinh) {
        this.dieuchinh = dieuchinh;
    }

    public BigDecimal getSotienGoc() {
        return sotienGoc;
    }

    public void setSotienGoc(BigDecimal sotienGoc) {
        this.sotienGoc = sotienGoc;
    }

    public BigDecimal getSotienGoc2() {
        return sotienGoc2;
    }

    public void setSotienGoc2(BigDecimal sotienGoc2) {
        this.sotienGoc2 = sotienGoc2;
    }

    public String getLydoDc() {
        return lydoDc;
    }

    public void setLydoDc(String lydoDc) {
        this.lydoDc = lydoDc;
    }

    public String getIdChitiet() {
        return idChitiet;
    }

    public void setIdChitiet(String idChitiet) {
        this.idChitiet = idChitiet;
    }

    public BigDecimal getSohoiso() {
        return sohoiso;
    }

    public void setSohoiso(BigDecimal sohoiso) {
        this.sohoiso = sohoiso;
    }

    public BigDecimal getSochinhanh() {
        return sochinhanh;
    }

    public void setSochinhanh(BigDecimal sochinhanh) {
        this.sochinhanh = sochinhanh;
    }

    public Date getNgayDuyet() {
        return ngayDuyet;
    }

    public void setNgayDuyet(Date ngayDuyet) {
        this.ngayDuyet = ngayDuyet;
    }

    public Date getNgayChuyendoi() {
        return ngayChuyendoi;
    }

    public void setNgayChuyendoi(Date ngayChuyendoi) {
        this.ngayChuyendoi = ngayChuyendoi;
    }

    public String getTreocuoithang() {
        return treocuoithang;
    }

    public void setTreocuoithang(String treocuoithang) {
        this.treocuoithang = treocuoithang;
    }

    @XmlTransient
    public Collection<QldsListDetailCn> getQldsListDetailCnCollection() {
        return qldsListDetailCnCollection;
    }

    public void setQldsListDetailCnCollection(Collection<QldsListDetailCn> qldsListDetailCnCollection) {
        this.qldsListDetailCnCollection = qldsListDetailCnCollection;
    }

    public QldsListMaster getMaQlds() {
        return maQlds;
    }

    public void setMaQlds(QldsListMaster maQlds) {
        this.maQlds = maQlds;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maQldsC2 != null ? maQldsC2.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof QldsListDetail)) {
            return false;
        }
        QldsListDetail other = (QldsListDetail) object;
        if ((this.maQldsC2 == null && other.maQldsC2 != null) || (this.maQldsC2 != null && !this.maQldsC2.equals(other.maQldsC2))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EntitiesBean.QldsListDetail[ maQldsC2=" + maQldsC2 + " ]";
    }
    
}
