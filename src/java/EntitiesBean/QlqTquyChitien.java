/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntitiesBean;

import java.io.Serializable;
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
@Table(name = "QLQ_TQUY_CHITIEN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "QlqTquyChitien.findAll", query = "SELECT q FROM QlqTquyChitien q"),
    @NamedQuery(name = "QlqTquyChitien.findByIdCode", query = "SELECT q FROM QlqTquyChitien q WHERE q.idCode = :idCode"),
    @NamedQuery(name = "QlqTquyChitien.findBySttChitien", query = "SELECT q FROM QlqTquyChitien q WHERE q.sttChitien = :sttChitien"),
    @NamedQuery(name = "QlqTquyChitien.findByIdQlqDottg", query = "SELECT q FROM QlqTquyChitien q WHERE q.idQlqDottg = :idQlqDottg"),
    @NamedQuery(name = "QlqTquyChitien.findByIdNvChitra", query = "SELECT q FROM QlqTquyChitien q WHERE q.idNvChitra = :idNvChitra"),
    @NamedQuery(name = "QlqTquyChitien.findByIdNvNhom", query = "SELECT q FROM QlqTquyChitien q WHERE q.idNvNhom = :idNvNhom"),
    @NamedQuery(name = "QlqTquyChitien.findByShs", query = "SELECT q FROM QlqTquyChitien q WHERE q.shs = :shs"),
    @NamedQuery(name = "QlqTquyChitien.findByAud", query = "SELECT q FROM QlqTquyChitien q WHERE q.aud = :aud"),
    @NamedQuery(name = "QlqTquyChitien.findByCad", query = "SELECT q FROM QlqTquyChitien q WHERE q.cad = :cad"),
    @NamedQuery(name = "QlqTquyChitien.findByUsd", query = "SELECT q FROM QlqTquyChitien q WHERE q.usd = :usd"),
    @NamedQuery(name = "QlqTquyChitien.findByEur", query = "SELECT q FROM QlqTquyChitien q WHERE q.eur = :eur"),
    @NamedQuery(name = "QlqTquyChitien.findByGbp", query = "SELECT q FROM QlqTquyChitien q WHERE q.gbp = :gbp"),
    @NamedQuery(name = "QlqTquyChitien.findByVnd", query = "SELECT q FROM QlqTquyChitien q WHERE q.vnd = :vnd"),
    @NamedQuery(name = "QlqTquyChitien.findByIdChinhanh", query = "SELECT q FROM QlqTquyChitien q WHERE q.idChinhanh = :idChinhanh"),
    @NamedQuery(name = "QlqTquyChitien.findByIdThanhtoan", query = "SELECT q FROM QlqTquyChitien q WHERE q.idThanhtoan = :idThanhtoan"),
    @NamedQuery(name = "QlqTquyChitien.findByIdDiemchitra", query = "SELECT q FROM QlqTquyChitien q WHERE q.idDiemchitra = :idDiemchitra"),
    @NamedQuery(name = "QlqTquyChitien.findByIdNvTao", query = "SELECT q FROM QlqTquyChitien q WHERE q.idNvTao = :idNvTao"),
    @NamedQuery(name = "QlqTquyChitien.findByNgaytao", query = "SELECT q FROM QlqTquyChitien q WHERE q.ngaytao = :ngaytao"),
    @NamedQuery(name = "QlqTquyChitien.findByIdValidity", query = "SELECT q FROM QlqTquyChitien q WHERE q.idValidity = :idValidity"),
    @NamedQuery(name = "QlqTquyChitien.findByDain", query = "SELECT q FROM QlqTquyChitien q WHERE q.dain = :dain"),
    @NamedQuery(name = "QlqTquyChitien.findBySolanin", query = "SELECT q FROM QlqTquyChitien q WHERE q.solanin = :solanin"),
    @NamedQuery(name = "QlqTquyChitien.findByIdNvDuyet", query = "SELECT q FROM QlqTquyChitien q WHERE q.idNvDuyet = :idNvDuyet"),
    @NamedQuery(name = "QlqTquyChitien.findByIdDuyet", query = "SELECT q FROM QlqTquyChitien q WHERE q.idDuyet = :idDuyet"),
    @NamedQuery(name = "QlqTquyChitien.findByNgayduyet", query = "SELECT q FROM QlqTquyChitien q WHERE q.ngayduyet = :ngayduyet"),
    @NamedQuery(name = "QlqTquyChitien.findByRecordNote", query = "SELECT q FROM QlqTquyChitien q WHERE q.recordNote = :recordNote"),
    @NamedQuery(name = "QlqTquyChitien.findByIdNvMoikhach", query = "SELECT q FROM QlqTquyChitien q WHERE q.idNvMoikhach = :idNvMoikhach"),
    @NamedQuery(name = "QlqTquyChitien.findByIdMoikhach", query = "SELECT q FROM QlqTquyChitien q WHERE q.idMoikhach = :idMoikhach"),
    @NamedQuery(name = "QlqTquyChitien.findByNgaymoikhach", query = "SELECT q FROM QlqTquyChitien q WHERE q.ngaymoikhach = :ngaymoikhach"),
    @NamedQuery(name = "QlqTquyChitien.findByIdNvChitien", query = "SELECT q FROM QlqTquyChitien q WHERE q.idNvChitien = :idNvChitien"),
    @NamedQuery(name = "QlqTquyChitien.findByIdChitien", query = "SELECT q FROM QlqTquyChitien q WHERE q.idChitien = :idChitien"),
    @NamedQuery(name = "QlqTquyChitien.findByNgaychitien", query = "SELECT q FROM QlqTquyChitien q WHERE q.ngaychitien = :ngaychitien"),
    @NamedQuery(name = "QlqTquyChitien.findByIdNvHuychi", query = "SELECT q FROM QlqTquyChitien q WHERE q.idNvHuychi = :idNvHuychi"),
    @NamedQuery(name = "QlqTquyChitien.findByIdHuychi", query = "SELECT q FROM QlqTquyChitien q WHERE q.idHuychi = :idHuychi"),
    @NamedQuery(name = "QlqTquyChitien.findByNgayhuychi", query = "SELECT q FROM QlqTquyChitien q WHERE q.ngayhuychi = :ngayhuychi")})
public class QlqTquyChitien implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "ID_CODE")
    private String idCode;
    @Column(name = "STT_CHITIEN")
    private BigInteger sttChitien;
    @Size(max = 40)
    @Column(name = "ID_QLQ_DOTTG")
    private String idQlqDottg;
    @Size(max = 40)
    @Column(name = "ID_NV_CHITRA")
    private String idNvChitra;
    @Size(max = 40)
    @Column(name = "ID_NV_NHOM")
    private String idNvNhom;
    @Column(name = "SHS")
    private BigInteger shs;
    @Column(name = "AUD")
    private BigInteger aud;
    @Column(name = "CAD")
    private BigInteger cad;
    @Column(name = "USD")
    private BigInteger usd;
    @Column(name = "EUR")
    private BigInteger eur;
    @Column(name = "GBP")
    private BigInteger gbp;
    @Column(name = "VND")
    private BigInteger vnd;
    @Size(max = 20)
    @Column(name = "ID_CHINHANH")
    private String idChinhanh;
    @Size(max = 20)
    @Column(name = "ID_THANHTOAN")
    private String idThanhtoan;
    @Size(max = 20)
    @Column(name = "ID_DIEMCHITRA")
    private String idDiemchitra;
    @Size(max = 20)
    @Column(name = "ID_NV_TAO")
    private String idNvTao;
    @Column(name = "NGAYTAO")
    @Temporal(TemporalType.DATE)
    private Date ngaytao;
    @Size(max = 1)
    @Column(name = "ID_VALIDITY")
    private String idValidity;
    @Size(max = 1)
    @Column(name = "DAIN")
    private String dain;
    @Column(name = "SOLANIN")
    private BigInteger solanin;
    @Size(max = 20)
    @Column(name = "ID_NV_DUYET")
    private String idNvDuyet;
    @Size(max = 1)
    @Column(name = "ID_DUYET")
    private String idDuyet;
    @Column(name = "NGAYDUYET")
    @Temporal(TemporalType.DATE)
    private Date ngayduyet;
    @Size(max = 1000)
    @Column(name = "RECORD_NOTE")
    private String recordNote;
    @Size(max = 20)
    @Column(name = "ID_NV_MOIKHACH")
    private String idNvMoikhach;
    @Size(max = 1)
    @Column(name = "ID_MOIKHACH")
    private String idMoikhach;
    @Column(name = "NGAYMOIKHACH")
    @Temporal(TemporalType.DATE)
    private Date ngaymoikhach;
    @Size(max = 20)
    @Column(name = "ID_NV_CHITIEN")
    private String idNvChitien;
    @Size(max = 1)
    @Column(name = "ID_CHITIEN")
    private String idChitien;
    @Column(name = "NGAYCHITIEN")
    @Temporal(TemporalType.DATE)
    private Date ngaychitien;
    @Size(max = 20)
    @Column(name = "ID_NV_HUYCHI")
    private String idNvHuychi;
    @Size(max = 1)
    @Column(name = "ID_HUYCHI")
    private String idHuychi;
    @Column(name = "NGAYHUYCHI")
    @Temporal(TemporalType.DATE)
    private Date ngayhuychi;

    public QlqTquyChitien() {
    }

    public QlqTquyChitien(String idCode) {
        this.idCode = idCode;
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    public BigInteger getSttChitien() {
        return sttChitien;
    }

    public void setSttChitien(BigInteger sttChitien) {
        this.sttChitien = sttChitien;
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

    public String getIdNvNhom() {
        return idNvNhom;
    }

    public void setIdNvNhom(String idNvNhom) {
        this.idNvNhom = idNvNhom;
    }

    public BigInteger getShs() {
        return shs;
    }

    public void setShs(BigInteger shs) {
        this.shs = shs;
    }

    public BigInteger getAud() {
        return aud;
    }

    public void setAud(BigInteger aud) {
        this.aud = aud;
    }

    public BigInteger getCad() {
        return cad;
    }

    public void setCad(BigInteger cad) {
        this.cad = cad;
    }

    public BigInteger getUsd() {
        return usd;
    }

    public void setUsd(BigInteger usd) {
        this.usd = usd;
    }

    public BigInteger getEur() {
        return eur;
    }

    public void setEur(BigInteger eur) {
        this.eur = eur;
    }

    public BigInteger getGbp() {
        return gbp;
    }

    public void setGbp(BigInteger gbp) {
        this.gbp = gbp;
    }

    public BigInteger getVnd() {
        return vnd;
    }

    public void setVnd(BigInteger vnd) {
        this.vnd = vnd;
    }

    public String getIdChinhanh() {
        return idChinhanh;
    }

    public void setIdChinhanh(String idChinhanh) {
        this.idChinhanh = idChinhanh;
    }

    public String getIdThanhtoan() {
        return idThanhtoan;
    }

    public void setIdThanhtoan(String idThanhtoan) {
        this.idThanhtoan = idThanhtoan;
    }

    public String getIdDiemchitra() {
        return idDiemchitra;
    }

    public void setIdDiemchitra(String idDiemchitra) {
        this.idDiemchitra = idDiemchitra;
    }

    public String getIdNvTao() {
        return idNvTao;
    }

    public void setIdNvTao(String idNvTao) {
        this.idNvTao = idNvTao;
    }

    public Date getNgaytao() {
        return ngaytao;
    }

    public void setNgaytao(Date ngaytao) {
        this.ngaytao = ngaytao;
    }

    public String getIdValidity() {
        return idValidity;
    }

    public void setIdValidity(String idValidity) {
        this.idValidity = idValidity;
    }

    public String getDain() {
        return dain;
    }

    public void setDain(String dain) {
        this.dain = dain;
    }

    public BigInteger getSolanin() {
        return solanin;
    }

    public void setSolanin(BigInteger solanin) {
        this.solanin = solanin;
    }

    public String getIdNvDuyet() {
        return idNvDuyet;
    }

    public void setIdNvDuyet(String idNvDuyet) {
        this.idNvDuyet = idNvDuyet;
    }

    public String getIdDuyet() {
        return idDuyet;
    }

    public void setIdDuyet(String idDuyet) {
        this.idDuyet = idDuyet;
    }

    public Date getNgayduyet() {
        return ngayduyet;
    }

    public void setNgayduyet(Date ngayduyet) {
        this.ngayduyet = ngayduyet;
    }

    public String getRecordNote() {
        return recordNote;
    }

    public void setRecordNote(String recordNote) {
        this.recordNote = recordNote;
    }

    public String getIdNvMoikhach() {
        return idNvMoikhach;
    }

    public void setIdNvMoikhach(String idNvMoikhach) {
        this.idNvMoikhach = idNvMoikhach;
    }

    public String getIdMoikhach() {
        return idMoikhach;
    }

    public void setIdMoikhach(String idMoikhach) {
        this.idMoikhach = idMoikhach;
    }

    public Date getNgaymoikhach() {
        return ngaymoikhach;
    }

    public void setNgaymoikhach(Date ngaymoikhach) {
        this.ngaymoikhach = ngaymoikhach;
    }

    public String getIdNvChitien() {
        return idNvChitien;
    }

    public void setIdNvChitien(String idNvChitien) {
        this.idNvChitien = idNvChitien;
    }

    public String getIdChitien() {
        return idChitien;
    }

    public void setIdChitien(String idChitien) {
        this.idChitien = idChitien;
    }

    public Date getNgaychitien() {
        return ngaychitien;
    }

    public void setNgaychitien(Date ngaychitien) {
        this.ngaychitien = ngaychitien;
    }

    public String getIdNvHuychi() {
        return idNvHuychi;
    }

    public void setIdNvHuychi(String idNvHuychi) {
        this.idNvHuychi = idNvHuychi;
    }

    public String getIdHuychi() {
        return idHuychi;
    }

    public void setIdHuychi(String idHuychi) {
        this.idHuychi = idHuychi;
    }

    public Date getNgayhuychi() {
        return ngayhuychi;
    }

    public void setNgayhuychi(Date ngayhuychi) {
        this.ngayhuychi = ngayhuychi;
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
        if (!(object instanceof QlqTquyChitien)) {
            return false;
        }
        QlqTquyChitien other = (QlqTquyChitien) object;
        if ((this.idCode == null && other.idCode != null) || (this.idCode != null && !this.idCode.equals(other.idCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EntitiesBean.QlqTquyChitien[ idCode=" + idCode + " ]";
    }
    
}
