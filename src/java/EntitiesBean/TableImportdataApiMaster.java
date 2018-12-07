/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntitiesBean;

import java.io.Serializable;
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
@Table(name = "TABLE_IMPORTDATA_API_MASTER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TableImportdataApiMaster.findAll", query = "SELECT t FROM TableImportdataApiMaster t"),
    @NamedQuery(name = "TableImportdataApiMaster.findByIdCode", query = "SELECT t FROM TableImportdataApiMaster t WHERE t.idCode = :idCode"),
    @NamedQuery(name = "TableImportdataApiMaster.findByIdDoitac", query = "SELECT t FROM TableImportdataApiMaster t WHERE t.idDoitac = :idDoitac"),
    @NamedQuery(name = "TableImportdataApiMaster.findByShs", query = "SELECT t FROM TableImportdataApiMaster t WHERE t.shs = :shs"),
    @NamedQuery(name = "TableImportdataApiMaster.findByUsd", query = "SELECT t FROM TableImportdataApiMaster t WHERE t.usd = :usd"),
    @NamedQuery(name = "TableImportdataApiMaster.findByCad", query = "SELECT t FROM TableImportdataApiMaster t WHERE t.cad = :cad"),
    @NamedQuery(name = "TableImportdataApiMaster.findByGbp", query = "SELECT t FROM TableImportdataApiMaster t WHERE t.gbp = :gbp"),
    @NamedQuery(name = "TableImportdataApiMaster.findByVnd", query = "SELECT t FROM TableImportdataApiMaster t WHERE t.vnd = :vnd"),
    @NamedQuery(name = "TableImportdataApiMaster.findByEur", query = "SELECT t FROM TableImportdataApiMaster t WHERE t.eur = :eur"),
    @NamedQuery(name = "TableImportdataApiMaster.findByAud", query = "SELECT t FROM TableImportdataApiMaster t WHERE t.aud = :aud"),
    @NamedQuery(name = "TableImportdataApiMaster.findByUserid", query = "SELECT t FROM TableImportdataApiMaster t WHERE t.userid = :userid"),
    @NamedQuery(name = "TableImportdataApiMaster.findByPass", query = "SELECT t FROM TableImportdataApiMaster t WHERE t.pass = :pass"),
    @NamedQuery(name = "TableImportdataApiMaster.findByKeyapi", query = "SELECT t FROM TableImportdataApiMaster t WHERE t.keyapi = :keyapi"),
    @NamedQuery(name = "TableImportdataApiMaster.findByDatevalue", query = "SELECT t FROM TableImportdataApiMaster t WHERE t.datevalue = :datevalue"),
    @NamedQuery(name = "TableImportdataApiMaster.findByStatus", query = "SELECT t FROM TableImportdataApiMaster t WHERE t.status = :status"),
    @NamedQuery(name = "TableImportdataApiMaster.findBySignalture", query = "SELECT t FROM TableImportdataApiMaster t WHERE t.signalture = :signalture"),
    @NamedQuery(name = "TableImportdataApiMaster.findByNgaytao", query = "SELECT t FROM TableImportdataApiMaster t WHERE t.ngaytao = :ngaytao"),
    @NamedQuery(name = "TableImportdataApiMaster.findByMaQlds", query = "SELECT t FROM TableImportdataApiMaster t WHERE t.maQlds = :maQlds"),
    @NamedQuery(name = "TableImportdataApiMaster.findByMaloaifile", query = "SELECT t FROM TableImportdataApiMaster t WHERE t.maloaifile = :maloaifile")})
public class TableImportdataApiMaster implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "ID_CODE")
    private String idCode;
    @Size(max = 20)
    @Column(name = "ID_DOITAC")
    private String idDoitac;
    @Size(max = 200)
    @Column(name = "SHS")
    private String shs;
    @Size(max = 400)
    @Column(name = "USD")
    private String usd;
    @Size(max = 400)
    @Column(name = "CAD")
    private String cad;
    @Size(max = 400)
    @Column(name = "GBP")
    private String gbp;
    @Size(max = 400)
    @Column(name = "VND")
    private String vnd;
    @Size(max = 400)
    @Column(name = "EUR")
    private String eur;
    @Size(max = 400)
    @Column(name = "AUD")
    private String aud;
    @Size(max = 400)
    @Column(name = "USERID")
    private String userid;
    @Size(max = 400)
    @Column(name = "PASS")
    private String pass;
    @Size(max = 400)
    @Column(name = "KEYAPI")
    private String keyapi;
    @Size(max = 400)
    @Column(name = "DATEVALUE")
    private String datevalue;
    @Size(max = 1)
    @Column(name = "STATUS")
    private String status;
    @Size(max = 400)
    @Column(name = "SIGNALTURE")
    private String signalture;
    @Column(name = "NGAYTAO")
    @Temporal(TemporalType.DATE)
    private Date ngaytao;
    @Size(max = 40)
    @Column(name = "MA_QLDS")
    private String maQlds;
    @Size(max = 40)
    @Column(name = "MALOAIFILE")
    private String maloaifile;

    public TableImportdataApiMaster() {
    }

    public TableImportdataApiMaster(String idCode) {
        this.idCode = idCode;
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    public String getIdDoitac() {
        return idDoitac;
    }

    public void setIdDoitac(String idDoitac) {
        this.idDoitac = idDoitac;
    }

    public String getShs() {
        return shs;
    }

    public void setShs(String shs) {
        this.shs = shs;
    }

    public String getUsd() {
        return usd;
    }

    public void setUsd(String usd) {
        this.usd = usd;
    }

    public String getCad() {
        return cad;
    }

    public void setCad(String cad) {
        this.cad = cad;
    }

    public String getGbp() {
        return gbp;
    }

    public void setGbp(String gbp) {
        this.gbp = gbp;
    }

    public String getVnd() {
        return vnd;
    }

    public void setVnd(String vnd) {
        this.vnd = vnd;
    }

    public String getEur() {
        return eur;
    }

    public void setEur(String eur) {
        this.eur = eur;
    }

    public String getAud() {
        return aud;
    }

    public void setAud(String aud) {
        this.aud = aud;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getKeyapi() {
        return keyapi;
    }

    public void setKeyapi(String keyapi) {
        this.keyapi = keyapi;
    }

    public String getDatevalue() {
        return datevalue;
    }

    public void setDatevalue(String datevalue) {
        this.datevalue = datevalue;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSignalture() {
        return signalture;
    }

    public void setSignalture(String signalture) {
        this.signalture = signalture;
    }

    public Date getNgaytao() {
        return ngaytao;
    }

    public void setNgaytao(Date ngaytao) {
        this.ngaytao = ngaytao;
    }

    public String getMaQlds() {
        return maQlds;
    }

    public void setMaQlds(String maQlds) {
        this.maQlds = maQlds;
    }

    public String getMaloaifile() {
        return maloaifile;
    }

    public void setMaloaifile(String maloaifile) {
        this.maloaifile = maloaifile;
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
        if (!(object instanceof TableImportdataApiMaster)) {
            return false;
        }
        TableImportdataApiMaster other = (TableImportdataApiMaster) object;
        if ((this.idCode == null && other.idCode != null) || (this.idCode != null && !this.idCode.equals(other.idCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EntitiesBean.TableImportdataApiMaster[ idCode=" + idCode + " ]";
    }
    
}
