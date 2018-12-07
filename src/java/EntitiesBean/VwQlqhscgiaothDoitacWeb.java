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
@Table(name = "VW_QLQHSCGIAOTH_DOITAC_WEB")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwQlqhscgiaothDoitacWeb.findAll", query = "SELECT v FROM VwQlqhscgiaothDoitacWeb v"),
    @NamedQuery(name = "VwQlqhscgiaothDoitacWeb.findByIdNvChitra", query = "SELECT v FROM VwQlqhscgiaothDoitacWeb v WHERE v.idNvChitra = :idNvChitra"),
    @NamedQuery(name = "VwQlqhscgiaothDoitacWeb.findByTenNhanvien", query = "SELECT v FROM VwQlqhscgiaothDoitacWeb v WHERE v.tenNhanvien = :tenNhanvien"),
    @NamedQuery(name = "VwQlqhscgiaothDoitacWeb.findByIdChinhanh", query = "SELECT v FROM VwQlqhscgiaothDoitacWeb v WHERE v.idChinhanh = :idChinhanh"),
    @NamedQuery(name = "VwQlqhscgiaothDoitacWeb.findByShs", query = "SELECT v FROM VwQlqhscgiaothDoitacWeb v WHERE v.shs = :shs"),
    @NamedQuery(name = "VwQlqhscgiaothDoitacWeb.findBySlDain", query = "SELECT v FROM VwQlqhscgiaothDoitacWeb v WHERE v.slDain = :slDain"),
    @NamedQuery(name = "VwQlqhscgiaothDoitacWeb.findBySlChuain", query = "SELECT v FROM VwQlqhscgiaothDoitacWeb v WHERE v.slChuain = :slChuain"),
    @NamedQuery(name = "VwQlqhscgiaothDoitacWeb.findByLoaihs", query = "SELECT v FROM VwQlqhscgiaothDoitacWeb v WHERE v.loaihs = :loaihs")})
public class VwQlqhscgiaothDoitacWeb implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(max = 20)
    @Column(name = "ID_NV_CHITRA")
    private String idNvChitra;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(max = 4)
    @Column(name = "LOAIHS")
    private String loaihs;
    @Size(max = 4000)
    @Column(name = "TEN_NHANVIEN")
    private String tenNhanvien;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID_CHINHANH")
    private String idChinhanh;
    @Column(name = "SHS")
    private BigInteger shs;
    @Column(name = "SL_DAIN")
    private BigInteger slDain;
    @Column(name = "SL_CHUAIN")
    private BigInteger slChuain;
   

    public VwQlqhscgiaothDoitacWeb() {
    }

    public String getIdNvChitra() {
        return idNvChitra;
    }

    public void setIdNvChitra(String idNvChitra) {
        this.idNvChitra = idNvChitra;
    }

    public String getTenNhanvien() {
        return tenNhanvien;
    }

    public void setTenNhanvien(String tenNhanvien) {
        this.tenNhanvien = tenNhanvien;
    }

    public String getIdChinhanh() {
        return idChinhanh;
    }

    public void setIdChinhanh(String idChinhanh) {
        this.idChinhanh = idChinhanh;
    }

    public BigInteger getShs() {
        return shs;
    }

    public void setShs(BigInteger shs) {
        this.shs = shs;
    }

    public BigInteger getSlDain() {
        return slDain;
    }

    public void setSlDain(BigInteger slDain) {
        this.slDain = slDain;
    }

    public BigInteger getSlChuain() {
        return slChuain;
    }

    public void setSlChuain(BigInteger slChuain) {
        this.slChuain = slChuain;
    }

    public String getLoaihs() {
        return loaihs;
    }

    public void setLoaihs(String loaihs) {
        this.loaihs = loaihs;
    }
    
}
