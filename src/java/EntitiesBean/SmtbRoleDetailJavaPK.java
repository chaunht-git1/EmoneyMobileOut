/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntitiesBean;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author TamChauDAMTC
 */
@Embeddable
public class SmtbRoleDetailJavaPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "ROLE_FUNCTION")
    private String roleFunction;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "ROLE_ID")
    private String roleId;

    public SmtbRoleDetailJavaPK() {
    }

    public SmtbRoleDetailJavaPK(String roleFunction, String roleId) {
        this.roleFunction = roleFunction;
        this.roleId = roleId;
    }

    public String getRoleFunction() {
        return roleFunction;
    }

    public void setRoleFunction(String roleFunction) {
        this.roleFunction = roleFunction;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (roleFunction != null ? roleFunction.hashCode() : 0);
        hash += (roleId != null ? roleId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SmtbRoleDetailJavaPK)) {
            return false;
        }
        SmtbRoleDetailJavaPK other = (SmtbRoleDetailJavaPK) object;
        if ((this.roleFunction == null && other.roleFunction != null) || (this.roleFunction != null && !this.roleFunction.equals(other.roleFunction))) {
            return false;
        }
        if ((this.roleId == null && other.roleId != null) || (this.roleId != null && !this.roleId.equals(other.roleId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EntitiesBean.SmtbRoleDetailJavaPK[ roleFunction=" + roleFunction + ", roleId=" + roleId + " ]";
    }
    
}
