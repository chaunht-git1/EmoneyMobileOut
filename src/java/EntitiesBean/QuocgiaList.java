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
@Table(name = "QUOCGIA_LIST")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "QuocgiaList.findAll", query = "SELECT q FROM QuocgiaList q"),
    @NamedQuery(name = "QuocgiaList.findByMaQuocgia", query = "SELECT q FROM QuocgiaList q WHERE q.maQuocgia = :maQuocgia"),
    @NamedQuery(name = "QuocgiaList.findByTenQuocgia", query = "SELECT q FROM QuocgiaList q WHERE q.tenQuocgia = :tenQuocgia"),
    @NamedQuery(name = "QuocgiaList.findByIdValidity", query = "SELECT q FROM QuocgiaList q WHERE q.idValidity = :idValidity"),
    @NamedQuery(name = "QuocgiaList.findByDateModified", query = "SELECT q FROM QuocgiaList q WHERE q.dateModified = :dateModified"),
    @NamedQuery(name = "QuocgiaList.findByEnglishName", query = "SELECT q FROM QuocgiaList q WHERE q.englishName = :englishName"),
    @NamedQuery(name = "QuocgiaList.findByIdArea", query = "SELECT q FROM QuocgiaList q WHERE q.idArea = :idArea"),
    @NamedQuery(name = "QuocgiaList.findByIdCtnn", query = "SELECT q FROM QuocgiaList q WHERE q.idCtnn = :idCtnn"),
    @NamedQuery(name = "QuocgiaList.findByIdMaker", query = "SELECT q FROM QuocgiaList q WHERE q.idMaker = :idMaker")})
public class QuocgiaList implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "MA_QUOCGIA")
    private String maQuocgia;
    @Size(max = 100)
    @Column(name = "TEN_QUOCGIA")
    private String tenQuocgia;
    @Size(max = 20)
    @Column(name = "ID_VALIDITY")
    private String idValidity;
    @Column(name = "DATE_MODIFIED")
    @Temporal(TemporalType.DATE)
    private Date dateModified;
    @Size(max = 200)
    @Column(name = "ENGLISH_NAME")
    private String englishName;
    @Size(max = 20)
    @Column(name = "ID_AREA")
    private String idArea;
    @Size(max = 20)
    @Column(name = "ID_CTNN")
    private String idCtnn;
    @Size(max = 20)
    @Column(name = "ID_MAKER")
    private String idMaker;

    public QuocgiaList() {
    }

    public QuocgiaList(String maQuocgia) {
        this.maQuocgia = maQuocgia;
    }

    public String getMaQuocgia() {
        return maQuocgia;
    }

    public void setMaQuocgia(String maQuocgia) {
        this.maQuocgia = maQuocgia;
    }

    public String getTenQuocgia() {
        return tenQuocgia;
    }

    public void setTenQuocgia(String tenQuocgia) {
        this.tenQuocgia = tenQuocgia;
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

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getIdArea() {
        return idArea;
    }

    public void setIdArea(String idArea) {
        this.idArea = idArea;
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
        hash += (maQuocgia != null ? maQuocgia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof QuocgiaList)) {
            return false;
        }
        QuocgiaList other = (QuocgiaList) object;
        if ((this.maQuocgia == null && other.maQuocgia != null) || (this.maQuocgia != null && !this.maQuocgia.equals(other.maQuocgia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EntitiesBean.QuocgiaList[ maQuocgia=" + maQuocgia + " ]";
    }
    
}
