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
 * @author Administrator
 */
@Entity
@Table(name = "SMTB_MENU_JAVA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SmtbMenuJava.findAll", query = "SELECT s FROM SmtbMenuJava s"),
    @NamedQuery(name = "SmtbMenuJava.findByMenuId", query = "SELECT s FROM SmtbMenuJava s WHERE s.menuId = :menuId"),
    @NamedQuery(name = "SmtbMenuJava.findByMenuName", query = "SELECT s FROM SmtbMenuJava s WHERE s.menuName = :menuName"),
    @NamedQuery(name = "SmtbMenuJava.findByLinkPage", query = "SELECT s FROM SmtbMenuJava s WHERE s.linkPage = :linkPage"),
    @NamedQuery(name = "SmtbMenuJava.findByIdCode", query = "SELECT s FROM SmtbMenuJava s WHERE s.idCode = :idCode"),
    @NamedQuery(name = "SmtbMenuJava.findByIdValidity", query = "SELECT s FROM SmtbMenuJava s WHERE s.idValidity = :idValidity"),
    @NamedQuery(name = "SmtbMenuJava.findByIdLock", query = "SELECT s FROM SmtbMenuJava s WHERE s.idLock = :idLock")})
public class SmtbMenuJava implements Serializable {
    private static final long serialVersionUID = 1L;
    @Size(max = 40)
    @Column(name = "MENU_ID")
    private String menuId;
    @Size(max = 100)
    @Column(name = "MENU_NAME")
    private String menuName;
    @Size(max = 200)
    @Column(name = "LINK_PAGE")
    private String linkPage;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "ID_CODE")
    private String idCode;
    @Size(max = 1)
    @Column(name = "ID_VALIDITY")
    private String idValidity;
    @Size(max = 1)
    @Column(name = "ID_LOCK")
    private String idLock;

    public SmtbMenuJava() {
    }

    public SmtbMenuJava(String idCode) {
        this.idCode = idCode;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getLinkPage() {
        return linkPage;
    }

    public void setLinkPage(String linkPage) {
        this.linkPage = linkPage;
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    public String getIdValidity() {
        return idValidity;
    }

    public void setIdValidity(String idValidity) {
        this.idValidity = idValidity;
    }

    public String getIdLock() {
        return idLock;
    }

    public void setIdLock(String idLock) {
        this.idLock = idLock;
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
        if (!(object instanceof SmtbMenuJava)) {
            return false;
        }
        SmtbMenuJava other = (SmtbMenuJava) object;
        if ((this.idCode == null && other.idCode != null) || (this.idCode != null && !this.idCode.equals(other.idCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ConnectBean.SmtbMenuJava[ idCode=" + idCode + " ]";
    }
    
}
