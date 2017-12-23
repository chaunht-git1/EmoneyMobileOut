/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

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
 * @author chaunht
 */
@Entity
@Table(name = "VW_SMTB_USER_LIST")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwSmtbUserList.findAll", query = "SELECT v FROM VwSmtbUserList v")
    , @NamedQuery(name = "VwSmtbUserList.findByUserId", query = "SELECT v FROM VwSmtbUserList v WHERE v.userId = :userId")
    , @NamedQuery(name = "VwSmtbUserList.findByUserName", query = "SELECT v FROM VwSmtbUserList v WHERE v.userName = :userName")
    , @NamedQuery(name = "VwSmtbUserList.findByHomeBranch", query = "SELECT v FROM VwSmtbUserList v WHERE v.homeBranch = :homeBranch")})
public class VwSmtbUserList implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "USER_ID")
    @Id
    private String userId;
    @Size(max = 35)
    @Column(name = "USER_NAME")
    private String userName;
    @Size(max = 3)
    @Column(name = "HOME_BRANCH")
    private String homeBranch;

    public VwSmtbUserList() {
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

    public String getHomeBranch() {
        return homeBranch;
    }

    public void setHomeBranch(String homeBranch) {
        this.homeBranch = homeBranch;
    }
    
}
