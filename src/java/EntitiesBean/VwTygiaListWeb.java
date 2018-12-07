/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntitiesBean;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "VW_TYGIA_LIST_WEB")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwTygiaListWeb.findAll", query = "SELECT v FROM VwTygiaListWeb v"),
    @NamedQuery(name = "VwTygiaListWeb.findByIdCode", query = "SELECT v FROM VwTygiaListWeb v WHERE v.idCode = :idCode"),
    @NamedQuery(name = "VwTygiaListWeb.findByTygia", query = "SELECT v FROM VwTygiaListWeb v WHERE v.tygia = :tygia"),
    @NamedQuery(name = "VwTygiaListWeb.findByIdValidity", query = "SELECT v FROM VwTygiaListWeb v WHERE v.idValidity = :idValidity"),
    @NamedQuery(name = "VwTygiaListWeb.findByDateModified", query = "SELECT v FROM VwTygiaListWeb v WHERE v.dateModified = :dateModified"),
    @NamedQuery(name = "VwTygiaListWeb.findByIdCurrency", query = "SELECT v FROM VwTygiaListWeb v WHERE v.idCurrency = :idCurrency"),
    @NamedQuery(name = "VwTygiaListWeb.findByIdLoaitygia", query = "SELECT v FROM VwTygiaListWeb v WHERE v.idLoaitygia = :idLoaitygia"),
    @NamedQuery(name = "VwTygiaListWeb.findByIdBank", query = "SELECT v FROM VwTygiaListWeb v WHERE v.idBank = :idBank"),
    @NamedQuery(name = "VwTygiaListWeb.findByGhichu", query = "SELECT v FROM VwTygiaListWeb v WHERE v.ghichu = :ghichu"),
    @NamedQuery(name = "VwTygiaListWeb.findByMakerId", query = "SELECT v FROM VwTygiaListWeb v WHERE v.makerId = :makerId"),
    @NamedQuery(name = "VwTygiaListWeb.findByNgayUpdate", query = "SELECT v FROM VwTygiaListWeb v WHERE v.ngayUpdate = :ngayUpdate"),
    @NamedQuery(name = "VwTygiaListWeb.findByNgaytao", query = "SELECT v FROM VwTygiaListWeb v WHERE v.ngaytao = :ngaytao"),
    @NamedQuery(name = "VwTygiaListWeb.findByDuyet", query = "SELECT v FROM VwTygiaListWeb v WHERE v.duyet = :duyet"),
    @NamedQuery(name = "VwTygiaListWeb.findByIdNvDuyet", query = "SELECT v FROM VwTygiaListWeb v WHERE v.idNvDuyet = :idNvDuyet"),
    @NamedQuery(name = "VwTygiaListWeb.findByNgayDuyet", query = "SELECT v FROM VwTygiaListWeb v WHERE v.ngayDuyet = :ngayDuyet"),
    @NamedQuery(name = "VwTygiaListWeb.findByNgayPh", query = "SELECT v FROM VwTygiaListWeb v WHERE v.ngayPh = :ngayPh"),
    @NamedQuery(name = "VwTygiaListWeb.findByIdNvPhuchoi", query = "SELECT v FROM VwTygiaListWeb v WHERE v.idNvPhuchoi = :idNvPhuchoi")})
public class VwTygiaListWeb implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID_CODE")
    private String idCode;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TYGIA")
    private BigDecimal tygia;
    @Size(max = 20)
    @Column(name = "ID_VALIDITY")
    private String idValidity;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATE_MODIFIED")
    @Temporal(TemporalType.DATE)
    private Date dateModified;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID_CURRENCY")
    private String idCurrency;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID_LOAITYGIA")
    private String idLoaitygia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID_BANK")
    private String idBank;
    @Size(max = 20)
    @Column(name = "GHICHU")
    private String ghichu;
    @Size(max = 20)
    @Column(name = "MAKER_ID")
    private String makerId;
    @Column(name = "NGAY_UPDATE")
    @Temporal(TemporalType.DATE)
    private Date ngayUpdate;
    @Column(name = "NGAYTAO")
    @Temporal(TemporalType.DATE)
    private Date ngaytao;
    @Size(max = 20)
    @Column(name = "DUYET")
    private String duyet;
    @Size(max = 20)
    @Column(name = "ID_NV_DUYET")
    private String idNvDuyet;
    @Column(name = "NGAY_DUYET")
    @Temporal(TemporalType.DATE)
    private Date ngayDuyet;
    @Column(name = "NGAY_PH")
    @Temporal(TemporalType.DATE)
    private Date ngayPh;
    @Size(max = 20)
    @Column(name = "ID_NV_PHUCHOI")
    private String idNvPhuchoi;

    public VwTygiaListWeb() {
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    public BigDecimal getTygia() {
        return tygia;
    }

    public void setTygia(BigDecimal tygia) {
        this.tygia = tygia;
    }

    public String getIdValidity() {
        return idValidity;
    }

    public void setIdValidity(String idValidity) {
        this.idValidity = idValidity;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    public String getIdCurrency() {
        return idCurrency;
    }

    public void setIdCurrency(String idCurrency) {
        this.idCurrency = idCurrency;
    }

    public String getIdLoaitygia() {
        return idLoaitygia;
    }

    public void setIdLoaitygia(String idLoaitygia) {
        this.idLoaitygia = idLoaitygia;
    }

    public String getIdBank() {
        return idBank;
    }

    public void setIdBank(String idBank) {
        this.idBank = idBank;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    public String getMakerId() {
        return makerId;
    }

    public void setMakerId(String makerId) {
        this.makerId = makerId;
    }

    public Date getNgayUpdate() {
        return ngayUpdate;
    }

    public void setNgayUpdate(Date ngayUpdate) {
        this.ngayUpdate = ngayUpdate;
    }

    public Date getNgaytao() {
        return ngaytao;
    }

    public void setNgaytao(Date ngaytao) {
        this.ngaytao = ngaytao;
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

    public Date getNgayPh() {
        return ngayPh;
    }

    public void setNgayPh(Date ngayPh) {
        this.ngayPh = ngayPh;
    }

    public String getIdNvPhuchoi() {
        return idNvPhuchoi;
    }

    public void setIdNvPhuchoi(String idNvPhuchoi) {
        this.idNvPhuchoi = idNvPhuchoi;
    }
    
}
