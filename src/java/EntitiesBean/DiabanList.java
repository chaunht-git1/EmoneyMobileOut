 
package EntitiesBean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Cacheable;
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
@Table(name = "DIABAN_LIST")
@Cacheable
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DiabanList.findAll", query = "SELECT d FROM DiabanList d"),
    @NamedQuery(name = "DiabanList.findByIdCode", query = "SELECT d FROM DiabanList d WHERE d.idCode = :idCode"),
    @NamedQuery(name = "DiabanList.findByDiengiai", query = "SELECT d FROM DiabanList d WHERE d.diengiai = :diengiai"),
    @NamedQuery(name = "DiabanList.findByDateModified", query = "SELECT d FROM DiabanList d WHERE d.dateModified = :dateModified"),
    @NamedQuery(name = "DiabanList.findByIdValidity", query = "SELECT d FROM DiabanList d WHERE d.idValidity = :idValidity")})
public class DiabanList implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID_CODE")
    private String idCode;
    @Size(max = 60)
    @Column(name = "DIENGIAI")
    private String diengiai;
    @Column(name = "DATE_MODIFIED")
    @Temporal(TemporalType.DATE)
    private Date dateModified;
    @Size(max = 20)
    @Column(name = "ID_VALIDITY")
    private String idValidity;

    public DiabanList() {
    }

    public DiabanList(String idCode) {
        this.idCode = idCode;
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    public String getDiengiai() {
        return diengiai;
    }

    public void setDiengiai(String diengiai) {
        this.diengiai = diengiai;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    public String getIdValidity() {
        return idValidity;
    }

    public void setIdValidity(String idValidity) {
        this.idValidity = idValidity;
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
        if (!(object instanceof DiabanList)) {
            return false;
        }
        DiabanList other = (DiabanList) object;
        if ((this.idCode == null && other.idCode != null) || (this.idCode != null && !this.idCode.equals(other.idCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ConnectBean.DiabanList[ idCode=" + idCode + " ]";
    }
    
}
