/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntitiesBean;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author TamChauDAMTC
 */
@Entity
@Table(name = "VW_DSHOSO_DAGIAOPHIEU_NV")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwDshosoDagiaophieuNv.findAll", query = "SELECT v FROM VwDshosoDagiaophieuNv v"),
    @NamedQuery(name = "VwDshosoDagiaophieuNv.findByIdNvChitra", query = "SELECT v FROM VwDshosoDagiaophieuNv v WHERE v.idNvChitra = :idNvChitra"),
    @NamedQuery(name = "VwDshosoDagiaophieuNv.findByIdChinhanh", query = "SELECT v FROM VwDshosoDagiaophieuNv v WHERE v.idChinhanh = :idChinhanh"),
    @NamedQuery(name = "VwDshosoDagiaophieuNv.findByTennv", query = "SELECT v FROM VwDshosoDagiaophieuNv v WHERE v.tennv = :tennv"),
    @NamedQuery(name = "VwDshosoDagiaophieuNv.findByShs", query = "SELECT v FROM VwDshosoDagiaophieuNv v WHERE v.shs = :shs"),
    @NamedQuery(name = "VwDshosoDagiaophieuNv.findByUsd", query = "SELECT v FROM VwDshosoDagiaophieuNv v WHERE v.usd = :usd"),
    @NamedQuery(name = "VwDshosoDagiaophieuNv.findByCad", query = "SELECT v FROM VwDshosoDagiaophieuNv v WHERE v.cad = :cad"),
    @NamedQuery(name = "VwDshosoDagiaophieuNv.findByGbp", query = "SELECT v FROM VwDshosoDagiaophieuNv v WHERE v.gbp = :gbp"),
    @NamedQuery(name = "VwDshosoDagiaophieuNv.findByEur", query = "SELECT v FROM VwDshosoDagiaophieuNv v WHERE v.eur = :eur"),
    @NamedQuery(name = "VwDshosoDagiaophieuNv.findByAud", query = "SELECT v FROM VwDshosoDagiaophieuNv v WHERE v.aud = :aud"),
    @NamedQuery(name = "VwDshosoDagiaophieuNv.findByThanhtien", query = "SELECT v FROM VwDshosoDagiaophieuNv v WHERE v.thanhtien = :thanhtien")})
public class VwDshosoDagiaophieuNv implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Size(max = 80)
    @Column(name = "IDCODE")
    private String idcode;
    @Size(max = 20)
    @Column(name = "ID_NV_CHITRA")
    private String idNvChitra;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID_CHINHANH")
    private String idChinhanh;
    @Size(max = 4000)
    @Column(name = "TENNV")
    private String tennv;
    @Column(name = "SHS")
    private BigInteger shs;
    @Column(name = "USD")
    private BigInteger usd;
    @Column(name = "CAD")
    private BigInteger cad;
    @Column(name = "GBP")
    private BigInteger gbp;
    @Column(name = "EUR")
    private BigInteger eur;
    @Column(name = "AUD")
    private BigInteger aud;
    @Column(name = "THANHTIEN")
    private BigInteger thanhtien;

    public String getIdcode() {
        return idcode;
    }

    public void setIdcode(String idcode) {
        this.idcode = idcode;
    }
    
    
    

    public VwDshosoDagiaophieuNv() {
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

    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    public BigInteger getShs() {
        return shs;
    }

    public void setShs(BigInteger shs) {
        this.shs = shs;
    }

    public BigInteger getUsd() {
        return usd;
    }

    public void setUsd(BigInteger usd) {
        this.usd = usd;
    }

    public BigInteger getCad() {
        return cad;
    }

    public void setCad(BigInteger cad) {
        this.cad = cad;
    }

    public BigInteger getGbp() {
        return gbp;
    }

    public void setGbp(BigInteger gbp) {
        this.gbp = gbp;
    }

    public BigInteger getEur() {
        return eur;
    }

    public void setEur(BigInteger eur) {
        this.eur = eur;
    }

    public BigInteger getAud() {
        return aud;
    }

    public void setAud(BigInteger aud) {
        this.aud = aud;
    }

    public BigInteger getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(BigInteger thanhtien) {
        this.thanhtien = thanhtien;
    }
    
}
