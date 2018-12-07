/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntitiesBean;

import java.io.Serializable;
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
@Table(name = "VW_DOITAC_GP_WEB")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwDoitacGpWeb.findAll", query = "SELECT v FROM VwDoitacGpWeb v"),
    @NamedQuery(name = "VwDoitacGpWeb.findByIdCode", query = "SELECT v FROM VwDoitacGpWeb v WHERE v.idCode = :idCode"),
    @NamedQuery(name = "VwDoitacGpWeb.findByDescription", query = "SELECT v FROM VwDoitacGpWeb v WHERE v.description = :description")})
public class VwDoitacGpWeb implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID_CODE")
    private String idCode;
    @Size(max = 60)
    @Column(name = "DESCRIPTION")
    private String description;

    public VwDoitacGpWeb() {
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
