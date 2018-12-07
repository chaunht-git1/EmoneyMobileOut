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
@Table(name = "VW_DS_NHNAVIENCT_WEB")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwDsNhnavienctWeb.findAll", query = "SELECT v FROM VwDsNhnavienctWeb v"),
    @NamedQuery(name = "VwDsNhnavienctWeb.findByUserId", query = "SELECT v FROM VwDsNhnavienctWeb v WHERE v.userId = :userId"),
    @NamedQuery(name = "VwDsNhnavienctWeb.findByUserName", query = "SELECT v FROM VwDsNhnavienctWeb v WHERE v.userName = :userName"),
    @NamedQuery(name = "VwDsNhnavienctWeb.findByUsercn", query = "SELECT v FROM VwDsNhnavienctWeb v WHERE v.usercn = :usercn"),
    @NamedQuery(name = "VwDsNhnavienctWeb.findByHomeBranch", query = "SELECT v FROM VwDsNhnavienctWeb v WHERE v.homeBranch = :homeBranch"),
    @NamedQuery(name = "VwDsNhnavienctWeb.findByTenCn", query = "SELECT v FROM VwDsNhnavienctWeb v WHERE v.tenCn = :tenCn"),
    @NamedQuery(name = "VwDsNhnavienctWeb.findByUsercnBranch", query = "SELECT v FROM VwDsNhnavienctWeb v WHERE v.homeBranch = :homeBranch AND v.usercn = :usercn ")})
public class VwDsNhnavienctWeb implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "USER_ID")
    private String userId;
    @Size(max = 35)
    @Column(name = "USER_NAME")
    private String userName;
    @Size(max = 1)
    @Column(name = "USERCN")
    private String usercn;
    @Size(max = 3)
    @Column(name = "HOME_BRANCH")
    private String homeBranch;
    @Size(max = 4000)
    @Column(name = "TEN_CN")
    private String tenCn;

    public VwDsNhnavienctWeb() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUsercn() {
        return usercn;
    }

    public void setUsercn(String usercn) {
        this.usercn = usercn;
    }

    public String getHomeBranch() {
        return homeBranch;
    }

    public void setHomeBranch(String homeBranch) {
        this.homeBranch = homeBranch;
    }

    public String getTenCn() {
        return tenCn;
    }

    public void setTenCn(String tenCn) {
        this.tenCn = tenCn;
    }
    
}
