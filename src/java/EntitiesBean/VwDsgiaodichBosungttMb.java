 
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
@Table(name = "VW_DSGIAODICH_BOSUNGTT_MB")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwDsgiaodichBosungttMb.findAll", query = "SELECT v FROM VwDsgiaodichBosungttMb v"),
    @NamedQuery(name = "VwDsgiaodichBosungttMb.findByIdCode", query = "SELECT v FROM VwDsgiaodichBosungttMb v WHERE v.idCode = :idCode"),
    @NamedQuery(name = "VwDsgiaodichBosungttMb.findByNgayNhaplieu", query = "SELECT v FROM VwDsgiaodichBosungttMb v WHERE v.ngayNhaplieu = :ngayNhaplieu"),
    @NamedQuery(name = "VwDsgiaodichBosungttMb.findByIdChinhanh", query = "SELECT v FROM VwDsgiaodichBosungttMb v WHERE v.idChinhanh = :idChinhanh"),
    @NamedQuery(name = "VwDsgiaodichBosungttMb.findByTencn", query = "SELECT v FROM VwDsgiaodichBosungttMb v WHERE v.tencn = :tencn"),
    @NamedQuery(name = "VwDsgiaodichBosungttMb.findBySophieu", query = "SELECT v FROM VwDsgiaodichBosungttMb v WHERE v.sophieu = :sophieu"),
    @NamedQuery(name = "VwDsgiaodichBosungttMb.findByStt", query = "SELECT v FROM VwDsgiaodichBosungttMb v WHERE v.stt = :stt"),
    @NamedQuery(name = "VwDsgiaodichBosungttMb.findBySobn", query = "SELECT v FROM VwDsgiaodichBosungttMb v WHERE v.sobn = :sobn"),
    @NamedQuery(name = "VwDsgiaodichBosungttMb.findByMaNguoinhan", query = "SELECT v FROM VwDsgiaodichBosungttMb v WHERE v.maNguoinhan = :maNguoinhan"),
    @NamedQuery(name = "VwDsgiaodichBosungttMb.findByIdDoitac", query = "SELECT v FROM VwDsgiaodichBosungttMb v WHERE v.idDoitac = :idDoitac"),
    @NamedQuery(name = "VwDsgiaodichBosungttMb.findByDoitacName", query = "SELECT v FROM VwDsgiaodichBosungttMb v WHERE v.doitacName = :doitacName"),
    @NamedQuery(name = "VwDsgiaodichBosungttMb.findByHoten", query = "SELECT v FROM VwDsgiaodichBosungttMb v WHERE v.hoten = :hoten"),
    @NamedQuery(name = "VwDsgiaodichBosungttMb.findByNguoigoi", query = "SELECT v FROM VwDsgiaodichBosungttMb v WHERE v.nguoigoi = :nguoigoi"),
    @NamedQuery(name = "VwDsgiaodichBosungttMb.findByDienthoai", query = "SELECT v FROM VwDsgiaodichBosungttMb v WHERE v.dienthoai = :dienthoai"),
    @NamedQuery(name = "VwDsgiaodichBosungttMb.findByIdCtTuythan", query = "SELECT v FROM VwDsgiaodichBosungttMb v WHERE v.idCtTuythan = :idCtTuythan"),
    @NamedQuery(name = "VwDsgiaodichBosungttMb.findByTenGiayto", query = "SELECT v FROM VwDsgiaodichBosungttMb v WHERE v.tenGiayto = :tenGiayto"),
    @NamedQuery(name = "VwDsgiaodichBosungttMb.findBySoCtTuythan", query = "SELECT v FROM VwDsgiaodichBosungttMb v WHERE v.soCtTuythan = :soCtTuythan"),
    @NamedQuery(name = "VwDsgiaodichBosungttMb.findByDiachi", query = "SELECT v FROM VwDsgiaodichBosungttMb v WHERE v.diachi = :diachi"),
    @NamedQuery(name = "VwDsgiaodichBosungttMb.findByIdDistrict", query = "SELECT v FROM VwDsgiaodichBosungttMb v WHERE v.idDistrict = :idDistrict"),
    @NamedQuery(name = "VwDsgiaodichBosungttMb.findByTenQuan", query = "SELECT v FROM VwDsgiaodichBosungttMb v WHERE v.tenQuan = :tenQuan"),
    @NamedQuery(name = "VwDsgiaodichBosungttMb.findByIdCity", query = "SELECT v FROM VwDsgiaodichBosungttMb v WHERE v.idCity = :idCity"),
    @NamedQuery(name = "VwDsgiaodichBosungttMb.findByTenThanhpho", query = "SELECT v FROM VwDsgiaodichBosungttMb v WHERE v.tenThanhpho = :tenThanhpho"),
    @NamedQuery(name = "VwDsgiaodichBosungttMb.findByIdNvChitra", query = "SELECT v FROM VwDsgiaodichBosungttMb v WHERE v.idNvChitra = :idNvChitra"),
    @NamedQuery(name = "VwDsgiaodichBosungttMb.findByTennv", query = "SELECT v FROM VwDsgiaodichBosungttMb v WHERE v.tennv = :tennv"),
    @NamedQuery(name = "VwDsgiaodichBosungttMb.findBySotiengoi", query = "SELECT v FROM VwDsgiaodichBosungttMb v WHERE v.sotiengoi = :sotiengoi"),
    @NamedQuery(name = "VwDsgiaodichBosungttMb.findByTygia", query = "SELECT v FROM VwDsgiaodichBosungttMb v WHERE v.tygia = :tygia"),
    @NamedQuery(name = "VwDsgiaodichBosungttMb.findByThanhtien", query = "SELECT v FROM VwDsgiaodichBosungttMb v WHERE v.thanhtien = :thanhtien"),
    @NamedQuery(name = "VwDsgiaodichBosungttMb.findByIdLoaitienchitra", query = "SELECT v FROM VwDsgiaodichBosungttMb v WHERE v.idLoaitienchitra = :idLoaitienchitra"),
    @NamedQuery(name = "VwDsgiaodichBosungttMb.findByIdLoaitiengoi", query = "SELECT v FROM VwDsgiaodichBosungttMb v WHERE v.idLoaitiengoi = :idLoaitiengoi"),
    @NamedQuery(name = "VwDsgiaodichBosungttMb.findByIdLoaicongno", query = "SELECT v FROM VwDsgiaodichBosungttMb v WHERE v.idLoaicongno = :idLoaicongno"),
    @NamedQuery(name = "VwDsgiaodichBosungttMb.findByIdDiadiemchitra", query = "SELECT v FROM VwDsgiaodichBosungttMb v WHERE v.idDiadiemchitra = :idDiadiemchitra"),
    @NamedQuery(name = "VwDsgiaodichBosungttMb.findByIdThanhtoan", query = "SELECT v FROM VwDsgiaodichBosungttMb v WHERE v.idThanhtoan = :idThanhtoan")})
public class VwDsgiaodichBosungttMb implements Serializable {
    @Column(name = "NGAYCAP")
    @Temporal(TemporalType.DATE)
    private Date ngaycap;
    @Size(max = 20)
    @Column(name = "ID_NOICAP")
    private String idNoicap;
    @Size(max = 4000)
    @Column(name = "TEN_NOICAP")
    private String tenNoicap;
    @Column(name = "SOBN")
    private Long sobn;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SOTIENGOI")
    private BigDecimal sotiengoi;
    @Column(name = "TYGIA")
    private BigDecimal tygia;
    @Column(name = "THANHTIEN")
    private BigDecimal thanhtien;
    private static final long serialVersionUID = 1L;
    @Id
    @Size(max = 80)
    @Column(name = "ID_CODE")
    private String idCode;
    @Column(name = "NGAY_NHAPLIEU")
    @Temporal(TemporalType.DATE)
    private Date ngayNhaplieu;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID_CHINHANH")
    private String idChinhanh;
    @Size(max = 4000)
    @Column(name = "TENCN")
    private String tencn;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "SOPHIEU")
    private String sophieu;
    @Basic(optional = false)
    @NotNull
    @Column(name = "STT")
    private BigInteger stt;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "MA_NGUOINHAN")
    private String maNguoinhan;
    @Size(max = 20)
    @Column(name = "ID_DOITAC")
    private String idDoitac;
    @Size(max = 4000)
    @Column(name = "DOITAC_NAME")
    private String doitacName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "HOTEN")
    private String hoten;
    @Size(max = 60)
    @Column(name = "NGUOIGOI")
    private String nguoigoi;
    @Size(max = 40)
    @Column(name = "DIENTHOAI")
    private String dienthoai;
    @Size(max = 20)
    @Column(name = "ID_CT_TUYTHAN")
    private String idCtTuythan;
    @Size(max = 4000)
    @Column(name = "TEN_GIAYTO")
    private String tenGiayto;
    @Size(max = 20)
    @Column(name = "SO_CT_TUYTHAN")
    private String soCtTuythan;
    @Size(max = 150)
    @Column(name = "DIACHI")
    private String diachi;
    @Size(max = 20)
    @Column(name = "ID_DISTRICT")
    private String idDistrict;
    @Size(max = 4000)
    @Column(name = "TEN_QUAN")
    private String tenQuan;
    @Size(max = 20)
    @Column(name = "ID_CITY")
    private String idCity;
    @Size(max = 4000)
    @Column(name = "TEN_THANHPHO")
    private String tenThanhpho;
    @Size(max = 20)
    @Column(name = "ID_NV_CHITRA")
    private String idNvChitra;
    @Size(max = 4000)
    @Column(name = "TENNV")
    private String tennv;
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
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID_DIADIEMCHITRA")
    private String idDiadiemchitra;
    @Size(max = 20)
    @Column(name = "ID_THANHTOAN")
    private String idThanhtoan;

    public VwDsgiaodichBosungttMb() {
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    public Date getNgayNhaplieu() {
        return ngayNhaplieu;
    }

    public void setNgayNhaplieu(Date ngayNhaplieu) {
        this.ngayNhaplieu = ngayNhaplieu;
    }

    public String getIdChinhanh() {
        return idChinhanh;
    }

    public void setIdChinhanh(String idChinhanh) {
        this.idChinhanh = idChinhanh;
    }

    public String getTencn() {
        return tencn;
    }

    public void setTencn(String tencn) {
        this.tencn = tencn;
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

    public String getDoitacName() {
        return doitacName;
    }

    public void setDoitacName(String doitacName) {
        this.doitacName = doitacName;
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

    public String getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }

    public String getIdCtTuythan() {
        return idCtTuythan;
    }

    public void setIdCtTuythan(String idCtTuythan) {
        this.idCtTuythan = idCtTuythan;
    }

    public String getTenGiayto() {
        return tenGiayto;
    }

    public void setTenGiayto(String tenGiayto) {
        this.tenGiayto = tenGiayto;
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

    public String getIdDistrict() {
        return idDistrict;
    }

    public void setIdDistrict(String idDistrict) {
        this.idDistrict = idDistrict;
    }

    public String getTenQuan() {
        return tenQuan;
    }

    public void setTenQuan(String tenQuan) {
        this.tenQuan = tenQuan;
    }

    public String getIdCity() {
        return idCity;
    }

    public void setIdCity(String idCity) {
        this.idCity = idCity;
    }

    public String getTenThanhpho() {
        return tenThanhpho;
    }

    public void setTenThanhpho(String tenThanhpho) {
        this.tenThanhpho = tenThanhpho;
    }

    public String getIdNvChitra() {
        return idNvChitra;
    }

    public void setIdNvChitra(String idNvChitra) {
        this.idNvChitra = idNvChitra;
    }

    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
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

    public String getIdDiadiemchitra() {
        return idDiadiemchitra;
    }

    public void setIdDiadiemchitra(String idDiadiemchitra) {
        this.idDiadiemchitra = idDiadiemchitra;
    }

    public String getIdThanhtoan() {
        return idThanhtoan;
    }

    public void setIdThanhtoan(String idThanhtoan) {
        this.idThanhtoan = idThanhtoan;
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

    public Date getNgaycap() {
        return ngaycap;
    }

    public void setNgaycap(Date ngaycap) {
        this.ngaycap = ngaycap;
    }

    public String getIdNoicap() {
        return idNoicap;
    }

    public void setIdNoicap(String idNoicap) {
        this.idNoicap = idNoicap;
    }

    public String getTenNoicap() {
        return tenNoicap;
    }

    public void setTenNoicap(String tenNoicap) {
        this.tenNoicap = tenNoicap;
    }
    
}
