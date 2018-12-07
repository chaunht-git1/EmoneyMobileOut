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
@Table(name = "QLDS_LIST_MASTER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "QldsListMaster.findAll", query = "SELECT q FROM QldsListMaster q"),
    @NamedQuery(name = "QldsListMaster.findByMaQlds", query = "SELECT q FROM QldsListMaster q WHERE q.maQlds = :maQlds"),
    @NamedQuery(name = "QldsListMaster.findByIdChinhanh", query = "SELECT q FROM QldsListMaster q WHERE q.idChinhanh = :idChinhanh"),
    @NamedQuery(name = "QldsListMaster.findByNgaytaoDs", query = "SELECT q FROM QldsListMaster q WHERE q.ngaytaoDs = :ngaytaoDs"),
    @NamedQuery(name = "QldsListMaster.findBySotienusd", query = "SELECT q FROM QldsListMaster q WHERE q.sotienusd = :sotienusd"),
    @NamedQuery(name = "QldsListMaster.findBySotiencad", query = "SELECT q FROM QldsListMaster q WHERE q.sotiencad = :sotiencad"),
    @NamedQuery(name = "QldsListMaster.findByIdNvKt", query = "SELECT q FROM QldsListMaster q WHERE q.idNvKt = :idNvKt"),
    @NamedQuery(name = "QldsListMaster.findByNgayKiemtra", query = "SELECT q FROM QldsListMaster q WHERE q.ngayKiemtra = :ngayKiemtra"),
    @NamedQuery(name = "QldsListMaster.findByInDanhsach", query = "SELECT q FROM QldsListMaster q WHERE q.inDanhsach = :inDanhsach"),
    @NamedQuery(name = "QldsListMaster.findBySolanin", query = "SELECT q FROM QldsListMaster q WHERE q.solanin = :solanin"),
    @NamedQuery(name = "QldsListMaster.findBySotienaud", query = "SELECT q FROM QldsListMaster q WHERE q.sotienaud = :sotienaud"),
    @NamedQuery(name = "QldsListMaster.findBySotieneur", query = "SELECT q FROM QldsListMaster q WHERE q.sotieneur = :sotieneur"),
    @NamedQuery(name = "QldsListMaster.findBySotiengbp", query = "SELECT q FROM QldsListMaster q WHERE q.sotiengbp = :sotiengbp"),
    @NamedQuery(name = "QldsListMaster.findBySotienvnd", query = "SELECT q FROM QldsListMaster q WHERE q.sotienvnd = :sotienvnd"),
    @NamedQuery(name = "QldsListMaster.findBySotieuaux", query = "SELECT q FROM QldsListMaster q WHERE q.sotieuaux = :sotieuaux"),
    @NamedQuery(name = "QldsListMaster.findBySohoso", query = "SELECT q FROM QldsListMaster q WHERE q.sohoso = :sohoso"),
    @NamedQuery(name = "QldsListMaster.findByKhopsolieu", query = "SELECT q FROM QldsListMaster q WHERE q.khopsolieu = :khopsolieu"),
    @NamedQuery(name = "QldsListMaster.findByIdLoaiQlds", query = "SELECT q FROM QldsListMaster q WHERE q.idLoaiQlds = :idLoaiQlds"),
    @NamedQuery(name = "QldsListMaster.findByIdDoitac", query = "SELECT q FROM QldsListMaster q WHERE q.idDoitac = :idDoitac"),
    @NamedQuery(name = "QldsListMaster.findBySttNgay", query = "SELECT q FROM QldsListMaster q WHERE q.sttNgay = :sttNgay"),
    @NamedQuery(name = "QldsListMaster.findBySttThang", query = "SELECT q FROM QldsListMaster q WHERE q.sttThang = :sttThang"),
    @NamedQuery(name = "QldsListMaster.findByDuyet", query = "SELECT q FROM QldsListMaster q WHERE q.duyet = :duyet"),
    @NamedQuery(name = "QldsListMaster.findByIdNvDuyet", query = "SELECT q FROM QldsListMaster q WHERE q.idNvDuyet = :idNvDuyet"),
    @NamedQuery(name = "QldsListMaster.findByNgayDuyet", query = "SELECT q FROM QldsListMaster q WHERE q.ngayDuyet = :ngayDuyet"),
    @NamedQuery(name = "QldsListMaster.findByIdNvNhaplieu", query = "SELECT q FROM QldsListMaster q WHERE q.idNvNhaplieu = :idNvNhaplieu"),
    @NamedQuery(name = "QldsListMaster.findByNgayNhaplieu", query = "SELECT q FROM QldsListMaster q WHERE q.ngayNhaplieu = :ngayNhaplieu"),
    @NamedQuery(name = "QldsListMaster.findByIdNvXoaDs", query = "SELECT q FROM QldsListMaster q WHERE q.idNvXoaDs = :idNvXoaDs"),
    @NamedQuery(name = "QldsListMaster.findByLydoXoa", query = "SELECT q FROM QldsListMaster q WHERE q.lydoXoa = :lydoXoa"),
    @NamedQuery(name = "QldsListMaster.findByNgayxoa", query = "SELECT q FROM QldsListMaster q WHERE q.ngayxoa = :ngayxoa"),
    @NamedQuery(name = "QldsListMaster.findByDieuchinh", query = "SELECT q FROM QldsListMaster q WHERE q.dieuchinh = :dieuchinh"),
    @NamedQuery(name = "QldsListMaster.findByIdNvDc", query = "SELECT q FROM QldsListMaster q WHERE q.idNvDc = :idNvDc"),
    @NamedQuery(name = "QldsListMaster.findByLydoDc", query = "SELECT q FROM QldsListMaster q WHERE q.lydoDc = :lydoDc"),
    @NamedQuery(name = "QldsListMaster.findByNgayDc", query = "SELECT q FROM QldsListMaster q WHERE q.ngayDc = :ngayDc"),
    @NamedQuery(name = "QldsListMaster.findByDsTreo", query = "SELECT q FROM QldsListMaster q WHERE q.dsTreo = :dsTreo"),
    @NamedQuery(name = "QldsListMaster.findByIdChitiet", query = "SELECT q FROM QldsListMaster q WHERE q.idChitiet = :idChitiet"),
    @NamedQuery(name = "QldsListMaster.findByIdKhan", query = "SELECT q FROM QldsListMaster q WHERE q.idKhan = :idKhan"),
    @NamedQuery(name = "QldsListMaster.findByIdNvDuyetTrue", query = "SELECT q FROM QldsListMaster q WHERE q.idNvDuyetTrue = :idNvDuyetTrue"),
    @NamedQuery(name = "QldsListMaster.findByIdHsobuoichieu", query = "SELECT q FROM QldsListMaster q WHERE q.idHsobuoichieu = :idHsobuoichieu"),
    @NamedQuery(name = "QldsListMaster.findByIdSendsms", query = "SELECT q FROM QldsListMaster q WHERE q.idSendsms = :idSendsms")})
public class QldsListMaster implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "MA_QLDS")
    private String maQlds;
    @Size(max = 20)
    @Column(name = "ID_CHINHANH")
    private String idChinhanh;
    @Column(name = "NGAYTAO_DS")
    @Temporal(TemporalType.DATE)
    private Date ngaytaoDs;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SOTIENUSD")
    private BigDecimal sotienusd;
    @Column(name = "SOTIENCAD")
    private BigDecimal sotiencad;
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
    @Column(name = "SOTIENAUD")
    private BigDecimal sotienaud;
    @Column(name = "SOTIENEUR")
    private BigDecimal sotieneur;
    @Column(name = "SOTIENGBP")
    private BigDecimal sotiengbp;
    @Column(name = "SOTIENVND")
    private BigDecimal sotienvnd;
    @Column(name = "SOTIEUAUX")
    private BigDecimal sotieuaux;
    @Column(name = "SOHOSO")
    private BigDecimal sohoso;
    @Size(max = 1)
    @Column(name = "KHOPSOLIEU")
    private String khopsolieu;
    @Size(max = 3)
    @Column(name = "ID_LOAI_QLDS")
    private String idLoaiQlds;
    @Size(max = 20)
    @Column(name = "ID_DOITAC")
    private String idDoitac;
    @Column(name = "STT_NGAY")
    private Long sttNgay;
    @Column(name = "STT_THANG")
    private Long sttThang;
    @Size(max = 1)
    @Column(name = "DUYET")
    private String duyet;
    @Size(max = 20)
    @Column(name = "ID_NV_DUYET")
    private String idNvDuyet;
    @Column(name = "NGAY_DUYET")
    @Temporal(TemporalType.DATE)
    private Date ngayDuyet;
    @Size(max = 20)
    @Column(name = "ID_NV_NHAPLIEU")
    private String idNvNhaplieu;
    @Column(name = "NGAY_NHAPLIEU")
    @Temporal(TemporalType.DATE)
    private Date ngayNhaplieu;
    @Size(max = 20)
    @Column(name = "ID_NV_XOA_DS")
    private String idNvXoaDs;
    @Size(max = 1000)
    @Column(name = "LYDO_XOA")
    private String lydoXoa;
    @Column(name = "NGAYXOA")
    @Temporal(TemporalType.DATE)
    private Date ngayxoa;
    @Size(max = 1)
    @Column(name = "DIEUCHINH")
    private String dieuchinh;
    @Size(max = 20)
    @Column(name = "ID_NV_DC")
    private String idNvDc;
    @Size(max = 500)
    @Column(name = "LYDO_DC")
    private String lydoDc;
    @Column(name = "NGAY_DC")
    @Temporal(TemporalType.DATE)
    private Date ngayDc;
    @Size(max = 1)
    @Column(name = "DS_TREO")
    private String dsTreo;
    @Size(max = 1)
    @Column(name = "ID_CHITIET")
    private String idChitiet;
    @Size(max = 1)
    @Column(name = "ID_KHAN")
    private String idKhan;
    @Size(max = 20)
    @Column(name = "ID_NV_DUYET_TRUE")
    private String idNvDuyetTrue;
    @Size(max = 1)
    @Column(name = "ID_HSOBUOICHIEU")
    private String idHsobuoichieu;
    @Size(max = 1)
    @Column(name = "ID_SENDSMS")
    private String idSendsms;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maQlds")
    private Collection<QldsListDetail> qldsListDetailCollection;

    public QldsListMaster() {
    }

    public QldsListMaster(String maQlds) {
        this.maQlds = maQlds;
    }

    public String getMaQlds() {
        return maQlds;
    }

    public void setMaQlds(String maQlds) {
        this.maQlds = maQlds;
    }

    public String getIdChinhanh() {
        return idChinhanh;
    }

    public void setIdChinhanh(String idChinhanh) {
        this.idChinhanh = idChinhanh;
    }

    public Date getNgaytaoDs() {
        return ngaytaoDs;
    }

    public void setNgaytaoDs(Date ngaytaoDs) {
        this.ngaytaoDs = ngaytaoDs;
    }

    public BigDecimal getSotienusd() {
        return sotienusd;
    }

    public void setSotienusd(BigDecimal sotienusd) {
        this.sotienusd = sotienusd;
    }

    public BigDecimal getSotiencad() {
        return sotiencad;
    }

    public void setSotiencad(BigDecimal sotiencad) {
        this.sotiencad = sotiencad;
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

    public BigDecimal getSotienaud() {
        return sotienaud;
    }

    public void setSotienaud(BigDecimal sotienaud) {
        this.sotienaud = sotienaud;
    }

    public BigDecimal getSotieneur() {
        return sotieneur;
    }

    public void setSotieneur(BigDecimal sotieneur) {
        this.sotieneur = sotieneur;
    }

    public BigDecimal getSotiengbp() {
        return sotiengbp;
    }

    public void setSotiengbp(BigDecimal sotiengbp) {
        this.sotiengbp = sotiengbp;
    }

    public BigDecimal getSotienvnd() {
        return sotienvnd;
    }

    public void setSotienvnd(BigDecimal sotienvnd) {
        this.sotienvnd = sotienvnd;
    }

    public BigDecimal getSotieuaux() {
        return sotieuaux;
    }

    public void setSotieuaux(BigDecimal sotieuaux) {
        this.sotieuaux = sotieuaux;
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

    public String getIdLoaiQlds() {
        return idLoaiQlds;
    }

    public void setIdLoaiQlds(String idLoaiQlds) {
        this.idLoaiQlds = idLoaiQlds;
    }

    public String getIdDoitac() {
        return idDoitac;
    }

    public void setIdDoitac(String idDoitac) {
        this.idDoitac = idDoitac;
    }

    public Long getSttNgay() {
        return sttNgay;
    }

    public void setSttNgay(Long sttNgay) {
        this.sttNgay = sttNgay;
    }

    public Long getSttThang() {
        return sttThang;
    }

    public void setSttThang(Long sttThang) {
        this.sttThang = sttThang;
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

    public String getIdNvXoaDs() {
        return idNvXoaDs;
    }

    public void setIdNvXoaDs(String idNvXoaDs) {
        this.idNvXoaDs = idNvXoaDs;
    }

    public String getLydoXoa() {
        return lydoXoa;
    }

    public void setLydoXoa(String lydoXoa) {
        this.lydoXoa = lydoXoa;
    }

    public Date getNgayxoa() {
        return ngayxoa;
    }

    public void setNgayxoa(Date ngayxoa) {
        this.ngayxoa = ngayxoa;
    }

    public String getDieuchinh() {
        return dieuchinh;
    }

    public void setDieuchinh(String dieuchinh) {
        this.dieuchinh = dieuchinh;
    }

    public String getIdNvDc() {
        return idNvDc;
    }

    public void setIdNvDc(String idNvDc) {
        this.idNvDc = idNvDc;
    }

    public String getLydoDc() {
        return lydoDc;
    }

    public void setLydoDc(String lydoDc) {
        this.lydoDc = lydoDc;
    }

    public Date getNgayDc() {
        return ngayDc;
    }

    public void setNgayDc(Date ngayDc) {
        this.ngayDc = ngayDc;
    }

    public String getDsTreo() {
        return dsTreo;
    }

    public void setDsTreo(String dsTreo) {
        this.dsTreo = dsTreo;
    }

    public String getIdChitiet() {
        return idChitiet;
    }

    public void setIdChitiet(String idChitiet) {
        this.idChitiet = idChitiet;
    }

    public String getIdKhan() {
        return idKhan;
    }

    public void setIdKhan(String idKhan) {
        this.idKhan = idKhan;
    }

    public String getIdNvDuyetTrue() {
        return idNvDuyetTrue;
    }

    public void setIdNvDuyetTrue(String idNvDuyetTrue) {
        this.idNvDuyetTrue = idNvDuyetTrue;
    }

    public String getIdHsobuoichieu() {
        return idHsobuoichieu;
    }

    public void setIdHsobuoichieu(String idHsobuoichieu) {
        this.idHsobuoichieu = idHsobuoichieu;
    }

    public String getIdSendsms() {
        return idSendsms;
    }

    public void setIdSendsms(String idSendsms) {
        this.idSendsms = idSendsms;
    }

    @XmlTransient
    public Collection<QldsListDetail> getQldsListDetailCollection() {
        return qldsListDetailCollection;
    }

    public void setQldsListDetailCollection(Collection<QldsListDetail> qldsListDetailCollection) {
        this.qldsListDetailCollection = qldsListDetailCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maQlds != null ? maQlds.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof QldsListMaster)) {
            return false;
        }
        QldsListMaster other = (QldsListMaster) object;
        if ((this.maQlds == null && other.maQlds != null) || (this.maQlds != null && !this.maQlds.equals(other.maQlds))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EntitiesBean.QldsListMaster[ maQlds=" + maQlds + " ]";
    }
    
}
