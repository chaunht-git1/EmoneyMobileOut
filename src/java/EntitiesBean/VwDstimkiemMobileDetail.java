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
@Table(name = "VW_DSTIMKIEM_MOBILE_DETAIL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwDstimkiemMobileDetail.findAll", query = "SELECT v FROM VwDstimkiemMobileDetail v"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByIdChinhanh", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.idChinhanh = :idChinhanh"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByChinhanhName", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.chinhanhName = :chinhanhName"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findBySobn", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.sobn = :sobn"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByDachitra", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.dachitra = :dachitra"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByBiennhan", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.biennhan = :biennhan"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findBySolandichitra", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.solandichitra = :solandichitra"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByDanhanphieu", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.danhanphieu = :danhanphieu"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByIdCtTuythan", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.idCtTuythan = :idCtTuythan"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByLoaigiayto", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.loaigiayto = :loaigiayto"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByIdDoitac", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.idDoitac = :idDoitac"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByDoitacName", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.doitacName = :doitacName"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByNguoigoi", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.nguoigoi = :nguoigoi"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findBySotiengoi", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.sotiengoi = :sotiengoi"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByTygia", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.tygia = :tygia"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByThanhtien", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.thanhtien = :thanhtien"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByIdLoaitienchitra", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.idLoaitienchitra = :idLoaitienchitra"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByIdLoaitiengoi", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.idLoaitiengoi = :idLoaitiengoi"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByIdLoaicongno", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.idLoaicongno = :idLoaicongno"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByMaNguoinhan", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.maNguoinhan = :maNguoinhan"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByIdCity", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.idCity = :idCity"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByCityName", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.cityName = :cityName"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByDiachi", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.diachi = :diachi"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByIdNvBaocao", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.idNvBaocao = :idNvBaocao"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByIdNvChitra", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.idNvChitra = :idNvChitra"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByIdNvXacnhan", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.idNvXacnhan = :idNvXacnhan"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByIdNvBiennhan", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.idNvBiennhan = :idNvBiennhan"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByKhachhangNhan", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.khachhangNhan = :khachhangNhan"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByHoten", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.hoten = :hoten"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByXacminh", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.xacminh = :xacminh"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByGhichu", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.ghichu = :ghichu"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByLydoXmnk", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.lydoXmnk = :lydoXmnk"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByIdNvNhaplieu", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.idNvNhaplieu = :idNvNhaplieu"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByIdNvTruyenfile", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.idNvTruyenfile = :idNvTruyenfile"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByDateTruyenfile", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.dateTruyenfile = :dateTruyenfile"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByIdNvUpdate", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.idNvUpdate = :idNvUpdate"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByIdNvXoaphieu", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.idNvXoaphieu = :idNvXoaphieu"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByLydoxoaphieu", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.lydoxoaphieu = :lydoxoaphieu"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByIdNvKt", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.idNvKt = :idNvKt"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByIdDiadiemchitra", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.idDiadiemchitra = :idDiadiemchitra"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByIdThanhtoan", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.idThanhtoan = :idThanhtoan"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByCongtacvien", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.congtacvien = :congtacvien"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByDienthoai", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.dienthoai = :dienthoai"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByPinNo", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.pinNo = :pinNo"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByAgent", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.agent = :agent"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByIdAgent", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.idAgent = :idAgent"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByPayagentseq", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.payagentseq = :payagentseq"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByExtOrder", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.extOrder = :extOrder"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findBySoCtTuythan", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.soCtTuythan = :soCtTuythan"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByIdDistrict", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.idDistrict = :idDistrict"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByDistrictName", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.districtName = :districtName"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByNgayChitraTrue", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.ngayChitraTrue = :ngayChitraTrue"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByNgayChitra", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.ngayChitra = :ngayChitra"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByNgayBiennhan", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.ngayBiennhan = :ngayBiennhan"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByNgayXacminh", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.ngayXacminh = :ngayXacminh"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByNgaygiaophieu", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.ngaygiaophieu = :ngaygiaophieu"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByBiennhanC", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.biennhanC = :biennhanC"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByDakiemtra", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.dakiemtra = :dakiemtra"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByIdNvXacminh", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.idNvXacminh = :idNvXacminh"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByNgayNhaplieu", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.ngayNhaplieu = :ngayNhaplieu"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByNgayUpdate", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.ngayUpdate = :ngayUpdate"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByNgayXoaphieu", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.ngayXoaphieu = :ngayXoaphieu"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByNgayKiemtra", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.ngayKiemtra = :ngayKiemtra"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findBySophieu", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.sophieu = :sophieu"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByStt", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.stt = :stt"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findBySolanin", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.solanin = :solanin"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByNhapho", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.nhapho = :nhapho"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByMaKhachhang", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.maKhachhang = :maKhachhang"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByHoten1", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.hoten1 = :hoten1"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByGiaytoHoten", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.giaytoHoten = :giaytoHoten"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByHoten2", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.hoten2 = :hoten2"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByGiaytoHoten2", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.giaytoHoten2 = :giaytoHoten2"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByGhichuGoi", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.ghichuGoi = :ghichuGoi"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByIdNvDuyetChuyencn", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.idNvDuyetChuyencn = :idNvDuyetChuyencn"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByIdNvYcChuyencn", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.idNvYcChuyencn = :idNvYcChuyencn"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByNgayChuyencn", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.ngayChuyencn = :ngayChuyencn"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByNgayYeucauChuyencn", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.ngayYeucauChuyencn = :ngayYeucauChuyencn"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByLydoUpdate", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.lydoUpdate = :lydoUpdate"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByLydoYcChuyencn", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.lydoYcChuyencn = :lydoYcChuyencn"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByDienthoaiGoc", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.dienthoaiGoc = :dienthoaiGoc"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByDiachiGoc", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.diachiGoc = :diachiGoc"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByNgaycap", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.ngaycap = :ngaycap"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByIdNoicap", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.idNoicap = :idNoicap"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByNoicapName", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.noicapName = :noicapName"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByIdBank", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.idBank = :idBank"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByBankName", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.bankName = :bankName"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByDotck", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.dotck = :dotck"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByDack", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.dack = :dack"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByIdNvCk", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.idNvCk = :idNvCk"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByNgayCk", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.ngayCk = :ngayCk"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByCkTienmat", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.ckTienmat = :ckTienmat"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByIdNvDuyetCtck", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.idNvDuyetCtck = :idNvDuyetCtck"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByNgayXnck", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.ngayXnck = :ngayXnck"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByNgayxacnhan", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.ngayxacnhan = :ngayxacnhan"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByXacnhanCk", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.xacnhanCk = :xacnhanCk"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByGhichuCk", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.ghichuCk = :ghichuCk"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findBySotaikhoankh", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.sotaikhoankh = :sotaikhoankh"),
    @NamedQuery(name = "VwDstimkiemMobileDetail.findByNoinhantien", query = "SELECT v FROM VwDstimkiemMobileDetail v WHERE v.noinhantien = :noinhantien")})
public class VwDstimkiemMobileDetail implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "IDCODE")
    private String idCode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID_CHINHANH")
    private String idChinhanh;
    @Size(max = 4000)
    @Column(name = "CHINHANH_NAME")
    private String chinhanhName;
    @Column(name = "SOBN")
    private Long sobn;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DACHITRA")
    private Character dachitra;
    @Size(max = 1)
    @Column(name = "BIENNHAN")
    private String biennhan;
    @Column(name = "SOLANDICHITRA")
    private BigInteger solandichitra;
    @Column(name = "DANHANPHIEU")
    private Character danhanphieu;
    @Size(max = 20)
    @Column(name = "ID_CT_TUYTHAN")
    private String idCtTuythan;
    @Size(max = 4000)
    @Column(name = "LOAIGIAYTO")
    private String loaigiayto;
    @Size(max = 20)
    @Column(name = "ID_DOITAC")
    private String idDoitac;
    @Size(max = 4000)
    @Column(name = "DOITAC_NAME")
    private String doitacName;
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
    @Size(min = 1, max = 60)
    @Column(name = "MA_NGUOINHAN")
    private String maNguoinhan;
    @Size(max = 20)
    @Column(name = "ID_CITY")
    private String idCity;
    @Size(max = 4000)
    @Column(name = "CITY_NAME")
    private String cityName;
    @Size(max = 150)
    @Column(name = "DIACHI")
    private String diachi;
    @Size(max = 20)
    @Column(name = "ID_NV_BAOCAO")
    private String idNvBaocao;
    @Size(max = 20)
    @Column(name = "ID_NV_CHITRA")
    private String idNvChitra;
    @Size(max = 20)
    @Column(name = "ID_NV_XACNHAN")
    private String idNvXacnhan;
    @Size(max = 20)
    @Column(name = "ID_NV_BIENNHAN")
    private String idNvBiennhan;
    @Size(max = 100)
    @Column(name = "KHACHHANG_NHAN")
    private String khachhangNhan;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "HOTEN")
    private String hoten;
    @Size(max = 60)
    @Column(name = "XACMINH")
    private String xacminh;
    @Size(max = 400)
    @Column(name = "GHICHU")
    private String ghichu;
    @Size(max = 1000)
    @Column(name = "LYDO_XMNK")
    private String lydoXmnk;
    @Size(max = 20)
    @Column(name = "ID_NV_NHAPLIEU")
    private String idNvNhaplieu;
    @Size(max = 20)
    @Column(name = "ID_NV_TRUYENFILE")
    private String idNvTruyenfile;
    @Column(name = "DATE_TRUYENFILE")
    @Temporal(TemporalType.DATE)
    private Date dateTruyenfile;
    @Size(max = 20)
    @Column(name = "ID_NV_UPDATE")
    private String idNvUpdate;
    @Size(max = 20)
    @Column(name = "ID_NV_XOAPHIEU")
    private String idNvXoaphieu;
    @Size(max = 100)
    @Column(name = "LYDOXOAPHIEU")
    private String lydoxoaphieu;
    @Size(max = 20)
    @Column(name = "ID_NV_KT")
    private String idNvKt;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID_DIADIEMCHITRA")
    private String idDiadiemchitra;
    @Size(max = 20)
    @Column(name = "ID_THANHTOAN")
    private String idThanhtoan;
    @Size(max = 1)
    @Column(name = "CONGTACVIEN")
    private String congtacvien;
    @Size(max = 40)
    @Column(name = "DIENTHOAI")
    private String dienthoai;
    @Size(max = 40)
    @Column(name = "PIN_NO")
    private String pinNo;
    @Size(max = 40)
    @Column(name = "AGENT")
    private String agent;
    @Size(max = 40)
    @Column(name = "ID_AGENT")
    private String idAgent;
    @Size(max = 40)
    @Column(name = "PAYAGENTSEQ")
    private String payagentseq;
    @Size(max = 40)
    @Column(name = "EXT_ORDER")
    private String extOrder;
    @Size(max = 20)
    @Column(name = "SO_CT_TUYTHAN")
    private String soCtTuythan;
    @Size(max = 20)
    @Column(name = "ID_DISTRICT")
    private String idDistrict;
    @Size(max = 4000)
    @Column(name = "DISTRICT_NAME")
    private String districtName;
    @Column(name = "NGAY_CHITRA_TRUE")
    @Temporal(TemporalType.DATE)
    private Date ngayChitraTrue;
    @Column(name = "NGAY_CHITRA")
    @Temporal(TemporalType.DATE)
    private Date ngayChitra;
    @Column(name = "NGAY_BIENNHAN")
    @Temporal(TemporalType.DATE)
    private Date ngayBiennhan;
    @Column(name = "NGAY_XACMINH")
    @Temporal(TemporalType.DATE)
    private Date ngayXacminh;
    @Column(name = "NGAYGIAOPHIEU")
    @Temporal(TemporalType.DATE)
    private Date ngaygiaophieu;
    @Size(max = 1)
    @Column(name = "BIENNHAN_C")
    private String biennhanC;
    @Size(max = 1)
    @Column(name = "DAKIEMTRA")
    private String dakiemtra;
    @Size(max = 20)
    @Column(name = "ID_NV_XACMINH")
    private String idNvXacminh;
    @Column(name = "NGAY_NHAPLIEU")
    @Temporal(TemporalType.DATE)
    private Date ngayNhaplieu;
    @Size(max = 20)
    @Column(name = "NGAY_UPDATE")
    private String ngayUpdate;
    @Column(name = "NGAY_XOAPHIEU")
    @Temporal(TemporalType.DATE)
    private Date ngayXoaphieu;
    @Column(name = "NGAY_KIEMTRA")
    @Temporal(TemporalType.DATE)
    private Date ngayKiemtra;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "SOPHIEU")
    private String sophieu;
    @Basic(optional = false)
    @NotNull
    @Column(name = "STT")
    private BigInteger stt;
    @Column(name = "SOLANIN")
    private BigInteger solanin;
    @Size(max = 1)
    @Column(name = "NHAPHO")
    private String nhapho;
    @Size(max = 20)
    @Column(name = "MA_KHACHHANG")
    private String maKhachhang;
    @Size(max = 100)
    @Column(name = "HOTEN_1")
    private String hoten1;
    @Size(max = 40)
    @Column(name = "GIAYTO_HOTEN")
    private String giaytoHoten;
    @Size(max = 100)
    @Column(name = "HOTEN_2")
    private String hoten2;
    @Size(max = 40)
    @Column(name = "GIAYTO_HOTEN_2")
    private String giaytoHoten2;
    @Size(max = 400)
    @Column(name = "GHICHU_GOI")
    private String ghichuGoi;
    @Size(max = 20)
    @Column(name = "ID_NV_DUYET_CHUYENCN")
    private String idNvDuyetChuyencn;
    @Size(max = 20)
    @Column(name = "ID_NV_YC_CHUYENCN")
    private String idNvYcChuyencn;
    @Column(name = "NGAY_CHUYENCN")
    @Temporal(TemporalType.DATE)
    private Date ngayChuyencn;
    @Column(name = "NGAY_YEUCAU_CHUYENCN")
    @Temporal(TemporalType.DATE)
    private Date ngayYeucauChuyencn;
    @Size(max = 1000)
    @Column(name = "LYDO_UPDATE")
    private String lydoUpdate;
    @Size(max = 500)
    @Column(name = "LYDO_YC_CHUYENCN")
    private String lydoYcChuyencn;
    @Size(max = 50)
    @Column(name = "DIENTHOAI_GOC")
    private String dienthoaiGoc;
    @Size(max = 500)
    @Column(name = "DIACHI_GOC")
    private String diachiGoc;
    @Column(name = "NGAYCAP")
    @Temporal(TemporalType.DATE)
    private Date ngaycap;
    @Size(max = 20)
    @Column(name = "ID_NOICAP")
    private String idNoicap;
    @Size(max = 4000)
    @Column(name = "NOICAP_NAME")
    private String noicapName;
    @Size(max = 20)
    @Column(name = "ID_BANK")
    private String idBank;
    @Size(max = 4000)
    @Column(name = "BANK_NAME")
    private String bankName;
    @Column(name = "DOTCK")
    private BigInteger dotck;
    @Size(max = 1)
    @Column(name = "DACK")
    private String dack;
    @Size(max = 20)
    @Column(name = "ID_NV_CK")
    private String idNvCk;
    @Column(name = "NGAY_CK")
    @Temporal(TemporalType.DATE)
    private Date ngayCk;
    @Size(max = 1)
    @Column(name = "CK_TIENMAT")
    private String ckTienmat;
    @Size(max = 20)
    @Column(name = "ID_NV_DUYET_CTCK")
    private String idNvDuyetCtck;
    @Column(name = "NGAY_XNCK")
    @Temporal(TemporalType.DATE)
    private Date ngayXnck;
    @Column(name = "NGAYXACNHAN")
    @Temporal(TemporalType.DATE)
    private Date ngayxacnhan;
    @Size(max = 1)
    @Column(name = "XACNHAN_CK")
    private String xacnhanCk;
    @Size(max = 1000)
    @Column(name = "GHICHU_CK")
    private String ghichuCk;
    @Size(max = 50)
    @Column(name = "SOTAIKHOANKH")
    private String sotaikhoankh;
    @Size(max = 5)
    @Column(name = "NOINHANTIEN")
    private String noinhantien;
    

    public VwDstimkiemMobileDetail() {
    }

    public String getIdChinhanh() {
        return idChinhanh;
    }

    public void setIdChinhanh(String idChinhanh) {
        this.idChinhanh = idChinhanh;
    }

    public String getChinhanhName() {
        return chinhanhName;
    }

    public void setChinhanhName(String chinhanhName) {
        this.chinhanhName = chinhanhName;
    }

    public Long getSobn() {
        return sobn;
    }

    public void setSobn(Long sobn) {
        this.sobn = sobn;
    }

    public Character getDachitra() {
        return dachitra;
    }

    public void setDachitra(Character dachitra) {
        this.dachitra = dachitra;
    }

    public String getBiennhan() {
        return biennhan;
    }

    public void setBiennhan(String biennhan) {
        this.biennhan = biennhan;
    }

    public BigInteger getSolandichitra() {
        return solandichitra;
    }

    public void setSolandichitra(BigInteger solandichitra) {
        this.solandichitra = solandichitra;
    }

    public Character getDanhanphieu() {
        return danhanphieu;
    }

    public void setDanhanphieu(Character danhanphieu) {
        this.danhanphieu = danhanphieu;
    }

    public String getIdCtTuythan() {
        return idCtTuythan;
    }

    public void setIdCtTuythan(String idCtTuythan) {
        this.idCtTuythan = idCtTuythan;
    }

    public String getLoaigiayto() {
        return loaigiayto;
    }

    public void setLoaigiayto(String loaigiayto) {
        this.loaigiayto = loaigiayto;
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

    public String getMaNguoinhan() {
        return maNguoinhan;
    }

    public void setMaNguoinhan(String maNguoinhan) {
        this.maNguoinhan = maNguoinhan;
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

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getIdNvBaocao() {
        return idNvBaocao;
    }

    public void setIdNvBaocao(String idNvBaocao) {
        this.idNvBaocao = idNvBaocao;
    }

    public String getIdNvChitra() {
        return idNvChitra;
    }

    public void setIdNvChitra(String idNvChitra) {
        this.idNvChitra = idNvChitra;
    }

    public String getIdNvXacnhan() {
        return idNvXacnhan;
    }

    public void setIdNvXacnhan(String idNvXacnhan) {
        this.idNvXacnhan = idNvXacnhan;
    }

    public String getIdNvBiennhan() {
        return idNvBiennhan;
    }

    public void setIdNvBiennhan(String idNvBiennhan) {
        this.idNvBiennhan = idNvBiennhan;
    }

    public String getKhachhangNhan() {
        return khachhangNhan;
    }

    public void setKhachhangNhan(String khachhangNhan) {
        this.khachhangNhan = khachhangNhan;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
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

    public String getLydoXmnk() {
        return lydoXmnk;
    }

    public void setLydoXmnk(String lydoXmnk) {
        this.lydoXmnk = lydoXmnk;
    }

    public String getIdNvNhaplieu() {
        return idNvNhaplieu;
    }

    public void setIdNvNhaplieu(String idNvNhaplieu) {
        this.idNvNhaplieu = idNvNhaplieu;
    }

    public String getIdNvTruyenfile() {
        return idNvTruyenfile;
    }

    public void setIdNvTruyenfile(String idNvTruyenfile) {
        this.idNvTruyenfile = idNvTruyenfile;
    }

    public Date getDateTruyenfile() {
        return dateTruyenfile;
    }

    public void setDateTruyenfile(Date dateTruyenfile) {
        this.dateTruyenfile = dateTruyenfile;
    }

    public String getIdNvUpdate() {
        return idNvUpdate;
    }

    public void setIdNvUpdate(String idNvUpdate) {
        this.idNvUpdate = idNvUpdate;
    }

    public String getIdNvXoaphieu() {
        return idNvXoaphieu;
    }

    public void setIdNvXoaphieu(String idNvXoaphieu) {
        this.idNvXoaphieu = idNvXoaphieu;
    }

    public String getLydoxoaphieu() {
        return lydoxoaphieu;
    }

    public void setLydoxoaphieu(String lydoxoaphieu) {
        this.lydoxoaphieu = lydoxoaphieu;
    }

    public String getIdNvKt() {
        return idNvKt;
    }

    public void setIdNvKt(String idNvKt) {
        this.idNvKt = idNvKt;
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

    public String getCongtacvien() {
        return congtacvien;
    }

    public void setCongtacvien(String congtacvien) {
        this.congtacvien = congtacvien;
    }

    public String getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }

    public String getPinNo() {
        return pinNo;
    }

    public void setPinNo(String pinNo) {
        this.pinNo = pinNo;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getIdAgent() {
        return idAgent;
    }

    public void setIdAgent(String idAgent) {
        this.idAgent = idAgent;
    }

    public String getPayagentseq() {
        return payagentseq;
    }

    public void setPayagentseq(String payagentseq) {
        this.payagentseq = payagentseq;
    }

    public String getExtOrder() {
        return extOrder;
    }

    public void setExtOrder(String extOrder) {
        this.extOrder = extOrder;
    }

    public String getSoCtTuythan() {
        return soCtTuythan;
    }

    public void setSoCtTuythan(String soCtTuythan) {
        this.soCtTuythan = soCtTuythan;
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

    public Date getNgayChitraTrue() {
        return ngayChitraTrue;
    }

    public void setNgayChitraTrue(Date ngayChitraTrue) {
        this.ngayChitraTrue = ngayChitraTrue;
    }

    public Date getNgayChitra() {
        return ngayChitra;
    }

    public void setNgayChitra(Date ngayChitra) {
        this.ngayChitra = ngayChitra;
    }

    public Date getNgayBiennhan() {
        return ngayBiennhan;
    }

    public void setNgayBiennhan(Date ngayBiennhan) {
        this.ngayBiennhan = ngayBiennhan;
    }

    public Date getNgayXacminh() {
        return ngayXacminh;
    }

    public void setNgayXacminh(Date ngayXacminh) {
        this.ngayXacminh = ngayXacminh;
    }

    public Date getNgaygiaophieu() {
        return ngaygiaophieu;
    }

    public void setNgaygiaophieu(Date ngaygiaophieu) {
        this.ngaygiaophieu = ngaygiaophieu;
    }

    public String getBiennhanC() {
        return biennhanC;
    }

    public void setBiennhanC(String biennhanC) {
        this.biennhanC = biennhanC;
    }

    public String getDakiemtra() {
        return dakiemtra;
    }

    public void setDakiemtra(String dakiemtra) {
        this.dakiemtra = dakiemtra;
    }

    public String getIdNvXacminh() {
        return idNvXacminh;
    }

    public void setIdNvXacminh(String idNvXacminh) {
        this.idNvXacminh = idNvXacminh;
    }

    public Date getNgayNhaplieu() {
        return ngayNhaplieu;
    }

    public void setNgayNhaplieu(Date ngayNhaplieu) {
        this.ngayNhaplieu = ngayNhaplieu;
    }

    public String getNgayUpdate() {
        return ngayUpdate;
    }

    public void setNgayUpdate(String ngayUpdate) {
        this.ngayUpdate = ngayUpdate;
    }

    public Date getNgayXoaphieu() {
        return ngayXoaphieu;
    }

    public void setNgayXoaphieu(Date ngayXoaphieu) {
        this.ngayXoaphieu = ngayXoaphieu;
    }

    public Date getNgayKiemtra() {
        return ngayKiemtra;
    }

    public void setNgayKiemtra(Date ngayKiemtra) {
        this.ngayKiemtra = ngayKiemtra;
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

    public BigInteger getSolanin() {
        return solanin;
    }

    public void setSolanin(BigInteger solanin) {
        this.solanin = solanin;
    }

    public String getNhapho() {
        return nhapho;
    }

    public void setNhapho(String nhapho) {
        this.nhapho = nhapho;
    }

    public String getMaKhachhang() {
        return maKhachhang;
    }

    public void setMaKhachhang(String maKhachhang) {
        this.maKhachhang = maKhachhang;
    }

    public String getHoten1() {
        return hoten1;
    }

    public void setHoten1(String hoten1) {
        this.hoten1 = hoten1;
    }

    public String getGiaytoHoten() {
        return giaytoHoten;
    }

    public void setGiaytoHoten(String giaytoHoten) {
        this.giaytoHoten = giaytoHoten;
    }

    public String getHoten2() {
        return hoten2;
    }

    public void setHoten2(String hoten2) {
        this.hoten2 = hoten2;
    }

    public String getGiaytoHoten2() {
        return giaytoHoten2;
    }

    public void setGiaytoHoten2(String giaytoHoten2) {
        this.giaytoHoten2 = giaytoHoten2;
    }

    public String getGhichuGoi() {
        return ghichuGoi;
    }

    public void setGhichuGoi(String ghichuGoi) {
        this.ghichuGoi = ghichuGoi;
    }

    public String getIdNvDuyetChuyencn() {
        return idNvDuyetChuyencn;
    }

    public void setIdNvDuyetChuyencn(String idNvDuyetChuyencn) {
        this.idNvDuyetChuyencn = idNvDuyetChuyencn;
    }

    public String getIdNvYcChuyencn() {
        return idNvYcChuyencn;
    }

    public void setIdNvYcChuyencn(String idNvYcChuyencn) {
        this.idNvYcChuyencn = idNvYcChuyencn;
    }

    public Date getNgayChuyencn() {
        return ngayChuyencn;
    }

    public void setNgayChuyencn(Date ngayChuyencn) {
        this.ngayChuyencn = ngayChuyencn;
    }

    public Date getNgayYeucauChuyencn() {
        return ngayYeucauChuyencn;
    }

    public void setNgayYeucauChuyencn(Date ngayYeucauChuyencn) {
        this.ngayYeucauChuyencn = ngayYeucauChuyencn;
    }

    public String getLydoUpdate() {
        return lydoUpdate;
    }

    public void setLydoUpdate(String lydoUpdate) {
        this.lydoUpdate = lydoUpdate;
    }

    public String getLydoYcChuyencn() {
        return lydoYcChuyencn;
    }

    public void setLydoYcChuyencn(String lydoYcChuyencn) {
        this.lydoYcChuyencn = lydoYcChuyencn;
    }

    public String getDienthoaiGoc() {
        return dienthoaiGoc;
    }

    public void setDienthoaiGoc(String dienthoaiGoc) {
        this.dienthoaiGoc = dienthoaiGoc;
    }

    public String getDiachiGoc() {
        return diachiGoc;
    }

    public void setDiachiGoc(String diachiGoc) {
        this.diachiGoc = diachiGoc;
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

    public String getNoicapName() {
        return noicapName;
    }

    public void setNoicapName(String noicapName) {
        this.noicapName = noicapName;
    }

    public String getIdBank() {
        return idBank;
    }

    public void setIdBank(String idBank) {
        this.idBank = idBank;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public BigInteger getDotck() {
        return dotck;
    }

    public void setDotck(BigInteger dotck) {
        this.dotck = dotck;
    }

    public String getDack() {
        return dack;
    }

    public void setDack(String dack) {
        this.dack = dack;
    }

    public String getIdNvCk() {
        return idNvCk;
    }

    public void setIdNvCk(String idNvCk) {
        this.idNvCk = idNvCk;
    }

    public Date getNgayCk() {
        return ngayCk;
    }

    public void setNgayCk(Date ngayCk) {
        this.ngayCk = ngayCk;
    }

    public String getCkTienmat() {
        return ckTienmat;
    }

    public void setCkTienmat(String ckTienmat) {
        this.ckTienmat = ckTienmat;
    }

    public String getIdNvDuyetCtck() {
        return idNvDuyetCtck;
    }

    public void setIdNvDuyetCtck(String idNvDuyetCtck) {
        this.idNvDuyetCtck = idNvDuyetCtck;
    }

    public Date getNgayXnck() {
        return ngayXnck;
    }

    public void setNgayXnck(Date ngayXnck) {
        this.ngayXnck = ngayXnck;
    }

    public Date getNgayxacnhan() {
        return ngayxacnhan;
    }

    public void setNgayxacnhan(Date ngayxacnhan) {
        this.ngayxacnhan = ngayxacnhan;
    }

    public String getXacnhanCk() {
        return xacnhanCk;
    }

    public void setXacnhanCk(String xacnhanCk) {
        this.xacnhanCk = xacnhanCk;
    }

    public String getGhichuCk() {
        return ghichuCk;
    }

    public void setGhichuCk(String ghichuCk) {
        this.ghichuCk = ghichuCk;
    }

    public String getSotaikhoankh() {
        return sotaikhoankh;
    }

    public void setSotaikhoankh(String sotaikhoankh) {
        this.sotaikhoankh = sotaikhoankh;
    }

    public String getNoinhantien() {
        return noinhantien;
    }

    public void setNoinhantien(String noinhantien) {
        this.noinhantien = noinhantien;
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }
    
}
