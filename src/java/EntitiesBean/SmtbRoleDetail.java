/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntitiesBean;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author TamChauDAMTC
 */
@Entity
@Table(name = "SMTB_ROLE_DETAIL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SmtbRoleDetail.findAll", query = "SELECT s FROM SmtbRoleDetail s"),
    @NamedQuery(name = "SmtbRoleDetail.findByRoleId", query = "SELECT s FROM SmtbRoleDetail s WHERE s.smtbRoleDetailPK.roleId = :roleId"),
    @NamedQuery(name = "SmtbRoleDetail.findByRoleFunction", query = "SELECT s FROM SmtbRoleDetail s WHERE s.smtbRoleDetailPK.roleFunction = :roleFunction"),
    @NamedQuery(name = "SmtbRoleDetail.findByControlString", query = "SELECT s FROM SmtbRoleDetail s WHERE s.controlString = :controlString"),
    @NamedQuery(name = "SmtbRoleDetail.findByAuthStat", query = "SELECT s FROM SmtbRoleDetail s WHERE s.authStat = :authStat")})
public class SmtbRoleDetail implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SmtbRoleDetailPK smtbRoleDetailPK;
    @Size(max = 16)
    @Column(name = "CONTROL_STRING")
    private String controlString;
    @Column(name = "AUTH_STAT")
    private Character authStat;

    public SmtbRoleDetail() {
    }

    public SmtbRoleDetail(SmtbRoleDetailPK smtbRoleDetailPK) {
        this.smtbRoleDetailPK = smtbRoleDetailPK;
    }

    public SmtbRoleDetail(String roleId, String roleFunction) {
        this.smtbRoleDetailPK = new SmtbRoleDetailPK(roleId, roleFunction);
    }

    public SmtbRoleDetailPK getSmtbRoleDetailPK() {
        return smtbRoleDetailPK;
    }

    public void setSmtbRoleDetailPK(SmtbRoleDetailPK smtbRoleDetailPK) {
        this.smtbRoleDetailPK = smtbRoleDetailPK;
    }

    public String getControlString() {
        return controlString;
    }

    public void setControlString(String controlString) {
        this.controlString = controlString;
    }

    public Character getAuthStat() {
        return authStat;
    }

    public void setAuthStat(Character authStat) {
        this.authStat = authStat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (smtbRoleDetailPK != null ? smtbRoleDetailPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SmtbRoleDetail)) {
            return false;
        }
        SmtbRoleDetail other = (SmtbRoleDetail) object;
        if ((this.smtbRoleDetailPK == null && other.smtbRoleDetailPK != null) || (this.smtbRoleDetailPK != null && !this.smtbRoleDetailPK.equals(other.smtbRoleDetailPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EntitiesBean.SmtbRoleDetail[ smtbRoleDetailPK=" + smtbRoleDetailPK + " ]";
    }
    
}
