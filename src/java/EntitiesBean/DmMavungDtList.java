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
@Table(name = "DM_MAVUNG_DT_LIST")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmMavungDtList.findAll", query = "SELECT d FROM DmMavungDtList d"),
    @NamedQuery(name = "DmMavungDtList.findByIdMavung", query = "SELECT d FROM DmMavungDtList d WHERE d.idMavung = :idMavung"),
    @NamedQuery(name = "DmMavungDtList.findByTenVung", query = "SELECT d FROM DmMavungDtList d WHERE d.tenVung = :tenVung"),
    @NamedQuery(name = "DmMavungDtList.findByNguoitao", query = "SELECT d FROM DmMavungDtList d WHERE d.nguoitao = :nguoitao"),
    @NamedQuery(name = "DmMavungDtList.findByNgaytao", query = "SELECT d FROM DmMavungDtList d WHERE d.ngaytao = :ngaytao")})
public class DmMavungDtList implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID_MAVUNG")
    private String idMavung;
    @Size(max = 100)
    @Column(name = "TEN_VUNG")
    private String tenVung;
    @Size(max = 20)
    @Column(name = "NGUOITAO")
    private String nguoitao;
    @Column(name = "NGAYTAO")
    @Temporal(TemporalType.DATE)
    private Date ngaytao;

    public DmMavungDtList() {
    }

    public DmMavungDtList(String idMavung) {
        this.idMavung = idMavung;
    }

    public String getIdMavung() {
        return idMavung;
    }

    public void setIdMavung(String idMavung) {
        this.idMavung = idMavung;
    }

    public String getTenVung() {
        return tenVung;
    }

    public void setTenVung(String tenVung) {
        this.tenVung = tenVung;
    }

    public String getNguoitao() {
        return nguoitao;
    }

    public void setNguoitao(String nguoitao) {
        this.nguoitao = nguoitao;
    }

    public Date getNgaytao() {
        return ngaytao;
    }

    public void setNgaytao(Date ngaytao) {
        this.ngaytao = ngaytao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMavung != null ? idMavung.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DmMavungDtList)) {
            return false;
        }
        DmMavungDtList other = (DmMavungDtList) object;
        if ((this.idMavung == null && other.idMavung != null) || (this.idMavung != null && !this.idMavung.equals(other.idMavung))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ConnectBean.DmMavungDtList[ idMavung=" + idMavung + " ]";
    }
    
}
