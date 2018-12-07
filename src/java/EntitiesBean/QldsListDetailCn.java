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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "QLDS_LIST_DETAIL_CN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "QldsListDetailCn.findAll", query = "SELECT q FROM QldsListDetailCn q"),
    @NamedQuery(name = "QldsListDetailCn.findByMaQldsC3", query = "SELECT q FROM QldsListDetailCn q WHERE q.maQldsC3 = :maQldsC3"),
    @NamedQuery(name = "QldsListDetailCn.findByIdLoaitien", query = "SELECT q FROM QldsListDetailCn q WHERE q.idLoaitien = :idLoaitien"),
    @NamedQuery(name = "QldsListDetailCn.findByNgaytaoDsC3", query = "SELECT q FROM QldsListDetailCn q WHERE q.ngaytaoDsC3 = :ngaytaoDsC3"),
    @NamedQuery(name = "QldsListDetailCn.findByIdChinhanh", query = "SELECT q FROM QldsListDetailCn q WHERE q.idChinhanh = :idChinhanh"),
    @NamedQuery(name = "QldsListDetailCn.findBySotiengoi", query = "SELECT q FROM QldsListDetailCn q WHERE q.sotiengoi = :sotiengoi"),
    @NamedQuery(name = "QldsListDetailCn.findByIdNvKt", query = "SELECT q FROM QldsListDetailCn q WHERE q.idNvKt = :idNvKt"),
    @NamedQuery(name = "QldsListDetailCn.findByNgayKiemtra", query = "SELECT q FROM QldsListDetailCn q WHERE q.ngayKiemtra = :ngayKiemtra"),
    @NamedQuery(name = "QldsListDetailCn.findByInDanhsach", query = "SELECT q FROM QldsListDetailCn q WHERE q.inDanhsach = :inDanhsach"),
    @NamedQuery(name = "QldsListDetailCn.findBySolanin", query = "SELECT q FROM QldsListDetailCn q WHERE q.solanin = :solanin"),
    @NamedQuery(name = "QldsListDetailCn.findBySohoso", query = "SELECT q FROM QldsListDetailCn q WHERE q.sohoso = :sohoso"),
    @NamedQuery(name = "QldsListDetailCn.findByKhopsolieu", query = "SELECT q FROM QldsListDetailCn q WHERE q.khopsolieu = :khopsolieu"),
    @NamedQuery(name = "QldsListDetailCn.findByDuyet", query = "SELECT q FROM QldsListDetailCn q WHERE q.duyet = :duyet"),
    @NamedQuery(name = "QldsListDetailCn.findByIdNvDuyet", query = "SELECT q FROM QldsListDetailCn q WHERE q.idNvDuyet = :idNvDuyet"),
    @NamedQuery(name = "QldsListDetailCn.findByNgayDuyet", query = "SELECT q FROM QldsListDetailCn q WHERE q.ngayDuyet = :ngayDuyet"),
    @NamedQuery(name = "QldsListDetailCn.findByLydoKhongduyet", query = "SELECT q FROM QldsListDetailCn q WHERE q.lydoKhongduyet = :lydoKhongduyet"),
    @NamedQuery(name = "QldsListDetailCn.findByIdDoitac", query = "SELECT q FROM QldsListDetailCn q WHERE q.idDoitac = :idDoitac"),
    @NamedQuery(name = "QldsListDetailCn.findByIdLoaitienchitra", query = "SELECT q FROM QldsListDetailCn q WHERE q.idLoaitienchitra = :idLoaitienchitra"),
    @NamedQuery(name = "QldsListDetailCn.findBySotien2", query = "SELECT q FROM QldsListDetailCn q WHERE q.sotien2 = :sotien2"),
    @NamedQuery(name = "QldsListDetailCn.findByIdNvNhaplieu", query = "SELECT q FROM QldsListDetailCn q WHERE q.idNvNhaplieu = :idNvNhaplieu"),
    @NamedQuery(name = "QldsListDetailCn.findByNgayNhaplieu", query = "SELECT q FROM QldsListDetailCn q WHERE q.ngayNhaplieu = :ngayNhaplieu"),
    @NamedQuery(name = "QldsListDetailCn.findByDieuchinh", query = "SELECT q FROM QldsListDetailCn q WHERE q.dieuchinh = :dieuchinh"),
    @NamedQuery(name = "QldsListDetailCn.findBySotienGoc", query = "SELECT q FROM QldsListDetailCn q WHERE q.sotienGoc = :sotienGoc"),
    @NamedQuery(name = "QldsListDetailCn.findBySotienGoc2", query = "SELECT q FROM QldsListDetailCn q WHERE q.sotienGoc2 = :sotienGoc2"),
    @NamedQuery(name = "QldsListDetailCn.findByLydoDc", query = "SELECT q FROM QldsListDetailCn q WHERE q.lydoDc = :lydoDc"),
    @NamedQuery(name = "QldsListDetailCn.findByMaQlds", query = "SELECT q FROM QldsListDetailCn q WHERE q.maQlds = :maQlds")})
public class QldsListDetailCn implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "MA_QLDS_C3")
    private String maQldsC3;
    @Size(max = 20)
    @Column(name = "ID_LOAITIEN")
    private String idLoaitien;
    @Column(name = "NGAYTAO_DS_C3")
    @Temporal(TemporalType.DATE)
    private Date ngaytaoDsC3;
    @Size(max = 20)
    @Column(name = "ID_CHINHANH")
    private String idChinhanh;
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
    @Column(name = "NGAY_DUYET")
    @Temporal(TemporalType.DATE)
    private Date ngayDuyet;
    @Size(max = 1000)
    @Column(name = "LYDO_KHONGDUYET")
    private String lydoKhongduyet;
    @Size(max = 20)
    @Column(name = "ID_DOITAC")
    private String idDoitac;
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
    @Size(max = 40)
    @Column(name = "MA_QLDS")
    private String maQlds;
    @JoinColumn(name = "MA_QLDS_C2", referencedColumnName = "MA_QLDS_C2")
    @ManyToOne(optional = false)
    private QldsListDetail maQldsC2;

    public QldsListDetailCn() {
    }

    public QldsListDetailCn(String maQldsC3) {
        this.maQldsC3 = maQldsC3;
    }

    public String getMaQldsC3() {
        return maQldsC3;
    }

    public void setMaQldsC3(String maQldsC3) {
        this.maQldsC3 = maQldsC3;
    }

    public String getIdLoaitien() {
        return idLoaitien;
    }

    public void setIdLoaitien(String idLoaitien) {
        this.idLoaitien = idLoaitien;
    }

    public Date getNgaytaoDsC3() {
        return ngaytaoDsC3;
    }

    public void setNgaytaoDsC3(Date ngaytaoDsC3) {
        this.ngaytaoDsC3 = ngaytaoDsC3;
    }

    public String getIdChinhanh() {
        return idChinhanh;
    }

    public void setIdChinhanh(String idChinhanh) {
        this.idChinhanh = idChinhanh;
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

    public Date getNgayDuyet() {
        return ngayDuyet;
    }

    public void setNgayDuyet(Date ngayDuyet) {
        this.ngayDuyet = ngayDuyet;
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

    public String getMaQlds() {
        return maQlds;
    }

    public void setMaQlds(String maQlds) {
        this.maQlds = maQlds;
    }

    public QldsListDetail getMaQldsC2() {
        return maQldsC2;
    }

    public void setMaQldsC2(QldsListDetail maQldsC2) {
        this.maQldsC2 = maQldsC2;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maQldsC3 != null ? maQldsC3.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof QldsListDetailCn)) {
            return false;
        }
        QldsListDetailCn other = (QldsListDetailCn) object;
        if ((this.maQldsC3 == null && other.maQldsC3 != null) || (this.maQldsC3 != null && !this.maQldsC3.equals(other.maQldsC3))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EntitiesBean.QldsListDetailCn[ maQldsC3=" + maQldsC3 + " ]";
    }
    
}
