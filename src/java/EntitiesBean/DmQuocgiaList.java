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
 * @author Administrator
 */
@Entity
@Table(name = "DM_QUOCGIA_LIST")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmQuocgiaList.findAll", query = "SELECT d FROM DmQuocgiaList d"),
    @NamedQuery(name = "DmQuocgiaList.findByIdCode", query = "SELECT d FROM DmQuocgiaList d WHERE d.idCode = :idCode"),
    @NamedQuery(name = "DmQuocgiaList.findByTenTiengviet", query = "SELECT d FROM DmQuocgiaList d WHERE d.tenTiengviet = :tenTiengviet"),
    @NamedQuery(name = "DmQuocgiaList.findByIdValidity", query = "SELECT d FROM DmQuocgiaList d WHERE d.idValidity = :idValidity"),
    @NamedQuery(name = "DmQuocgiaList.findByDateModified", query = "SELECT d FROM DmQuocgiaList d WHERE d.dateModified = :dateModified"),
    @NamedQuery(name = "DmQuocgiaList.findByTenTienganh", query = "SELECT d FROM DmQuocgiaList d WHERE d.tenTienganh = :tenTienganh"),
    @NamedQuery(name = "DmQuocgiaList.findByIdThitruong", query = "SELECT d FROM DmQuocgiaList d WHERE d.idThitruong = :idThitruong"),
    @NamedQuery(name = "DmQuocgiaList.findByIdCity", query = "SELECT d FROM DmQuocgiaList d WHERE d.idCity = :idCity"),
    @NamedQuery(name = "DmQuocgiaList.findByIdCtnn", query = "SELECT d FROM DmQuocgiaList d WHERE d.idCtnn = :idCtnn"),
    @NamedQuery(name = "DmQuocgiaList.findByIdMaker", query = "SELECT d FROM DmQuocgiaList d WHERE d.idMaker = :idMaker")})
public class DmQuocgiaList implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID_CODE")
    private String idCode;
    @Size(max = 200)
    @Column(name = "TEN_TIENGVIET")
    private String tenTiengviet;
    @Size(max = 20)
    @Column(name = "ID_VALIDITY")
    private String idValidity;
    @Column(name = "DATE_MODIFIED")
    @Temporal(TemporalType.DATE)
    private Date dateModified;
    @Size(max = 200)
    @Column(name = "TEN_TIENGANH")
    private String tenTienganh;
    @Size(max = 20)
    @Column(name = "ID_THITRUONG")
    private String idThitruong;
    @Size(max = 20)
    @Column(name = "ID_CITY")
    private String idCity;
    @Size(max = 20)
    @Column(name = "ID_CTNN")
    private String idCtnn;
    @Size(max = 20)
    @Column(name = "ID_MAKER")
    private String idMaker;

    public DmQuocgiaList() {
    }

    public DmQuocgiaList(String idCode) {
        this.idCode = idCode;
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    public String getTenTiengviet() {
        return tenTiengviet;
    }

    public void setTenTiengviet(String tenTiengviet) {
        this.tenTiengviet = tenTiengviet;
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

    public String getTenTienganh() {
        return tenTienganh;
    }

    public void setTenTienganh(String tenTienganh) {
        this.tenTienganh = tenTienganh;
    }

    public String getIdThitruong() {
        return idThitruong;
    }

    public void setIdThitruong(String idThitruong) {
        this.idThitruong = idThitruong;
    }

    public String getIdCity() {
        return idCity;
    }

    public void setIdCity(String idCity) {
        this.idCity = idCity;
    }

    public String getIdCtnn() {
        return idCtnn;
    }

    public void setIdCtnn(String idCtnn) {
        this.idCtnn = idCtnn;
    }

    public String getIdMaker() {
        return idMaker;
    }

    public void setIdMaker(String idMaker) {
        this.idMaker = idMaker;
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
        if (!(object instanceof DmQuocgiaList)) {
            return false;
        }
        DmQuocgiaList other = (DmQuocgiaList) object;
        if ((this.idCode == null && other.idCode != null) || (this.idCode != null && !this.idCode.equals(other.idCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ConnectBean.DmQuocgiaList[ idCode=" + idCode + " ]";
    }
    
}
