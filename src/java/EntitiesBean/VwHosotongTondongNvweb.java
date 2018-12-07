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
@Table(name = "VW_HOSOTONG_TONDONG_NVWEB")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwHosotongTondongNvweb.findAll", query = "SELECT v FROM VwHosotongTondongNvweb v"),
    @NamedQuery(name = "VwHosotongTondongNvweb.findByIdChinhanh", query = "SELECT v FROM VwHosotongTondongNvweb v WHERE v.idChinhanh = :idChinhanh"),
    @NamedQuery(name = "VwHosotongTondongNvweb.findByTenchinhanh", query = "SELECT v FROM VwHosotongTondongNvweb v WHERE v.tenchinhanh = :tenchinhanh"),
    @NamedQuery(name = "VwHosotongTondongNvweb.findByIdNvChitra", query = "SELECT v FROM VwHosotongTondongNvweb v WHERE v.idNvChitra = :idNvChitra"),
    @NamedQuery(name = "VwHosotongTondongNvweb.findByHoten", query = "SELECT v FROM VwHosotongTondongNvweb v WHERE v.hoten = :hoten"),
    @NamedQuery(name = "VwHosotongTondongNvweb.findByShs", query = "SELECT v FROM VwHosotongTondongNvweb v WHERE v.shs = :shs"),
    @NamedQuery(name = "VwHosotongTondongNvweb.findByCxm", query = "SELECT v FROM VwHosotongTondongNvweb v WHERE v.cxm = :cxm"),
    @NamedQuery(name = "VwHosotongTondongNvweb.findByDxm", query = "SELECT v FROM VwHosotongTondongNvweb v WHERE v.dxm = :dxm"),
    @NamedQuery(name = "VwHosotongTondongNvweb.findByShsconlai", query = "SELECT v FROM VwHosotongTondongNvweb v WHERE v.shsconlai = :shsconlai")})
public class VwHosotongTondongNvweb implements Serializable {
   
    @Id
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "IDCODE")
    private String idCode;
    @Size(max = 1)
    @Column(name = "HOANTHANH")
    private String hoanthanh;
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID_CHINHANH")
    private String idChinhanh;
    @Size(max = 4000)
    @Column(name = "TENCHINHANH")
    private String tenchinhanh;
    @Size(max = 20)
    @Column(name = "ID_NV_CHITRA")
    private String idNvChitra;
    @Size(max = 80)
    @Column(name = "HOTEN")
    private String hoten;
    @Column(name = "SHS")
    private BigInteger shs;
    @Column(name = "CXM")
    private BigInteger cxm;
    @Column(name = "DXM")
    private BigInteger dxm;
    @Column(name = "SHSCONLAI")
    private BigInteger shsconlai;


    public VwHosotongTondongNvweb() {
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

    public String getIdNvChitra() {
        return idNvChitra;
    }

    public void setIdNvChitra(String idNvChitra) {
        this.idNvChitra = idNvChitra;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public BigInteger getShs() {
        return shs;
    }

    public void setShs(BigInteger shs) {
        this.shs = shs;
    }

    public BigInteger getCxm() {
        return cxm;
    }

    public void setCxm(BigInteger cxm) {
        this.cxm = cxm;
    }

    public BigInteger getDxm() {
        return dxm;
    }

    public void setDxm(BigInteger dxm) {
        this.dxm = dxm;
    }

    public BigInteger getShsconlai() {
        return shsconlai;
    }

    public void setShsconlai(BigInteger shsconlai) {
        this.shsconlai = shsconlai;
    }

    public String getHoanthanh() {
        return hoanthanh;
    }

    public void setHoanthanh(String hoanthanh) {
        this.hoanthanh = hoanthanh;
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }
    
}
