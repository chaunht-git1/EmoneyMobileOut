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
@Table(name = "VW_KSHB_HOSONVCHINHA_TONGCN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwKshbHosonvchinhaTongcn.findAll", query = "SELECT v FROM VwKshbHosonvchinhaTongcn v"),
    @NamedQuery(name = "VwKshbHosonvchinhaTongcn.findByIdChinhanh", query = "SELECT v FROM VwKshbHosonvchinhaTongcn v WHERE v.idChinhanh = :idChinhanh"),
    @NamedQuery(name = "VwKshbHosonvchinhaTongcn.findByTenchinhanh", query = "SELECT v FROM VwKshbHosonvchinhaTongcn v WHERE v.tenchinhanh = :tenchinhanh"),
    @NamedQuery(name = "VwKshbHosonvchinhaTongcn.findByChuachitra", query = "SELECT v FROM VwKshbHosonvchinhaTongcn v WHERE v.chuachitra = :chuachitra"),
    @NamedQuery(name = "VwKshbHosonvchinhaTongcn.findByDachitra", query = "SELECT v FROM VwKshbHosonvchinhaTongcn v WHERE v.dachitra = :dachitra"),
    @NamedQuery(name = "VwKshbHosonvchinhaTongcn.findByDachitrachuabn", query = "SELECT v FROM VwKshbHosonvchinhaTongcn v WHERE v.dachitrachuabn = :dachitrachuabn"),
    @NamedQuery(name = "VwKshbHosonvchinhaTongcn.findByShstondong", query = "SELECT v FROM VwKshbHosonvchinhaTongcn v WHERE v.shstondong = :shstondong"),
    @NamedQuery(name = "VwKshbHosonvchinhaTongcn.findByShs", query = "SELECT v FROM VwKshbHosonvchinhaTongcn v WHERE v.shs = :shs"),
    @NamedQuery(name = "VwKshbHosonvchinhaTongcn.findByDaquyetbn", query = "SELECT v FROM VwKshbHosonvchinhaTongcn v WHERE v.daquyetbn = :daquyetbn"),
    @NamedQuery(name = "VwKshbHosonvchinhaTongcn.findByChoduyetbn", query = "SELECT v FROM VwKshbHosonvchinhaTongcn v WHERE v.choduyetbn = :choduyetbn"),
    @NamedQuery(name = "VwKshbHosonvchinhaTongcn.findByErrorbn", query = "SELECT v FROM VwKshbHosonvchinhaTongcn v WHERE v.errorbn = :errorbn"),
    @NamedQuery(name = "VwKshbHosonvchinhaTongcn.findByThieutt", query = "SELECT v FROM VwKshbHosonvchinhaTongcn v WHERE v.thieutt = :thieutt"),
    @NamedQuery(name = "VwKshbHosonvchinhaTongcn.findBySonv", query = "SELECT v FROM VwKshbHosonvchinhaTongcn v WHERE v.sonv = :sonv"),
    @NamedQuery(name = "VwKshbHosonvchinhaTongcn.findByChuahoanthanh", query = "SELECT v FROM VwKshbHosonvchinhaTongcn v WHERE v.chuahoanthanh = :chuahoanthanh"),
    @NamedQuery(name = "VwKshbHosonvchinhaTongcn.findByDahoanthanh", query = "SELECT v FROM VwKshbHosonvchinhaTongcn v WHERE v.dahoanthanh = :dahoanthanh")})
public class VwKshbHosonvchinhaTongcn implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID_CHINHANH")
    private String idChinhanh;
    @Size(max = 4000)
    @Column(name = "TENCHINHANH")
    private String tenchinhanh;
    @Column(name = "CHUACHITRA")
    private BigInteger chuachitra;
    @Column(name = "DACHITRA")
    private BigInteger dachitra;
    @Column(name = "DACHITRACHUABN")
    private BigInteger dachitrachuabn;
    @Column(name = "SHSTONDONG")
    private BigInteger shstondong;
    @Column(name = "SHS")
    private BigInteger shs;
    @Column(name = "DAQUYETBN")
    private BigInteger daquyetbn;
    @Column(name = "CHODUYETBN")
    private BigInteger choduyetbn;
    @Column(name = "ERRORBN")
    private BigInteger errorbn;
    @Column(name = "THIEUTT")
    private BigInteger thieutt;
    @Column(name = "SONV")
    private BigInteger sonv;
    @Column(name = "CHUAHOANTHANH")
    private BigInteger chuahoanthanh;
    @Column(name = "DAHOANTHANH")
    private BigInteger dahoanthanh;

    public VwKshbHosonvchinhaTongcn() {
    }

    public String getIdChinhanh() {
        return idChinhanh;
    }

    public void setIdChinhanh(String idChinhanh) {
        this.idChinhanh = idChinhanh;
    }

    public String getTenchinhanh() {
        return tenchinhanh;
    }

    public void setTenchinhanh(String tenchinhanh) {
        this.tenchinhanh = tenchinhanh;
    }

    public BigInteger getChuachitra() {
        return chuachitra;
    }

    public void setChuachitra(BigInteger chuachitra) {
        this.chuachitra = chuachitra;
    }

    public BigInteger getDachitra() {
        return dachitra;
    }

    public void setDachitra(BigInteger dachitra) {
        this.dachitra = dachitra;
    }

    public BigInteger getDachitrachuabn() {
        return dachitrachuabn;
    }

    public void setDachitrachuabn(BigInteger dachitrachuabn) {
        this.dachitrachuabn = dachitrachuabn;
    }

    public BigInteger getShstondong() {
        return shstondong;
    }

    public void setShstondong(BigInteger shstondong) {
        this.shstondong = shstondong;
    }

    public BigInteger getShs() {
        return shs;
    }

    public void setShs(BigInteger shs) {
        this.shs = shs;
    }

    public BigInteger getDaquyetbn() {
        return daquyetbn;
    }

    public void setDaquyetbn(BigInteger daquyetbn) {
        this.daquyetbn = daquyetbn;
    }

    public BigInteger getChoduyetbn() {
        return choduyetbn;
    }

    public void setChoduyetbn(BigInteger choduyetbn) {
        this.choduyetbn = choduyetbn;
    }

    public BigInteger getErrorbn() {
        return errorbn;
    }

    public void setErrorbn(BigInteger errorbn) {
        this.errorbn = errorbn;
    }

    public BigInteger getThieutt() {
        return thieutt;
    }

    public void setThieutt(BigInteger thieutt) {
        this.thieutt = thieutt;
    }

    public BigInteger getSonv() {
        return sonv;
    }

    public void setSonv(BigInteger sonv) {
        this.sonv = sonv;
    }

    public BigInteger getChuahoanthanh() {
        return chuahoanthanh;
    }

    public void setChuahoanthanh(BigInteger chuahoanthanh) {
        this.chuahoanthanh = chuahoanthanh;
    }

    public BigInteger getDahoanthanh() {
        return dahoanthanh;
    }

    public void setDahoanthanh(BigInteger dahoanthanh) {
        this.dahoanthanh = dahoanthanh;
    }
    
}
