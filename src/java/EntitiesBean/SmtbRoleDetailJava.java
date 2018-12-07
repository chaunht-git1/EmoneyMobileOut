/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntitiesBean;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author TamChauDAMTC
 */
@Entity
@Table(name = "SMTB_ROLE_DETAIL_JAVA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SmtbRoleDetailJava.findAll", query = "SELECT s FROM SmtbRoleDetailJava s"),
    @NamedQuery(name = "SmtbRoleDetailJava.findByRoleFunction", query = "SELECT s FROM SmtbRoleDetailJava s WHERE s.smtbRoleDetailJavaPK.roleFunction = :roleFunction"),
    @NamedQuery(name = "SmtbRoleDetailJava.findByRoleId", query = "SELECT s FROM SmtbRoleDetailJava s WHERE s.smtbRoleDetailJavaPK.roleId = :roleId")})
public class SmtbRoleDetailJava implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SmtbRoleDetailJavaPK smtbRoleDetailJavaPK;

    public SmtbRoleDetailJava() {
    }

    public SmtbRoleDetailJava(SmtbRoleDetailJavaPK smtbRoleDetailJavaPK) {
        this.smtbRoleDetailJavaPK = smtbRoleDetailJavaPK;
    }

    public SmtbRoleDetailJava(String roleFunction, String roleId) {
        this.smtbRoleDetailJavaPK = new SmtbRoleDetailJavaPK(roleFunction, roleId);
    }

    public SmtbRoleDetailJavaPK getSmtbRoleDetailJavaPK() {
        return smtbRoleDetailJavaPK;
    }

    public void setSmtbRoleDetailJavaPK(SmtbRoleDetailJavaPK smtbRoleDetailJavaPK) {
        this.smtbRoleDetailJavaPK = smtbRoleDetailJavaPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (smtbRoleDetailJavaPK != null ? smtbRoleDetailJavaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SmtbRoleDetailJava)) {
            return false;
        }
        SmtbRoleDetailJava other = (SmtbRoleDetailJava) object;
        if ((this.smtbRoleDetailJavaPK == null && other.smtbRoleDetailJavaPK != null) || (this.smtbRoleDetailJavaPK != null && !this.smtbRoleDetailJavaPK.equals(other.smtbRoleDetailJavaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EntitiesBean.SmtbRoleDetailJava[ smtbRoleDetailJavaPK=" + smtbRoleDetailJavaPK + " ]";
    }
    
}
