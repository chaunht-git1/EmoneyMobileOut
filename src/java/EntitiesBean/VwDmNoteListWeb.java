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
@Table(name = "VW_DM_NOTE_LIST_WEB")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwDmNoteListWeb.findAll", query = "SELECT v FROM VwDmNoteListWeb v"),
    @NamedQuery(name = "VwDmNoteListWeb.findByIdCode", query = "SELECT v FROM VwDmNoteListWeb v WHERE v.idCode = :idCode"),
    @NamedQuery(name = "VwDmNoteListWeb.findByDescription", query = "SELECT v FROM VwDmNoteListWeb v WHERE v.description = :description"),
    @NamedQuery(name = "VwDmNoteListWeb.findByDesEng", query = "SELECT v FROM VwDmNoteListWeb v WHERE v.desEng = :desEng"),
    @NamedQuery(name = "VwDmNoteListWeb.findByIdKhac", query = "SELECT v FROM VwDmNoteListWeb v WHERE v.idKhac = :idKhac"),
    @NamedQuery(name = "VwDmNoteListWeb.findByPlXacminh", query = "SELECT v FROM VwDmNoteListWeb v WHERE v.plXacminh = :plXacminh"),
    @NamedQuery(name = "VwDmNoteListWeb.findByIdXmDt", query = "SELECT v FROM VwDmNoteListWeb v WHERE v.idXmDt = :idXmDt"),
    @NamedQuery(name = "VwDmNoteListWeb.findByIdLoaixm", query = "SELECT v FROM VwDmNoteListWeb v WHERE v.idLoaixm = :idLoaixm"),
    @NamedQuery(name = "VwDmNoteListWeb.findByIdDiemchitra", query = "SELECT v FROM VwDmNoteListWeb v WHERE v.idDiemchitra = :idDiemchitra"),
    @NamedQuery(name = "VwDmNoteListWeb.findByPhamvixm", query = "SELECT v FROM VwDmNoteListWeb v WHERE v.phamvixm = :phamvixm")})
public class VwDmNoteListWeb implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID_CODE")
    private String idCode;
    @Size(max = 500)
    @Column(name = "DESCRIPTION")
    private String description;
    @Size(max = 500)
    @Column(name = "DES_ENG")
    private String desEng;
    @Size(max = 1)
    @Column(name = "ID_KHAC")
    private String idKhac;
    @Size(max = 20)
    @Column(name = "PL_XACMINH")
    private String plXacminh;
    @Size(max = 20)
    @Column(name = "ID_XM_DT")
    private String idXmDt;
    @Size(max = 20)
    @Column(name = "ID_LOAIXM")
    private String idLoaixm;
    @Size(max = 20)
    @Column(name = "ID_DIEMCHITRA")
    private String idDiemchitra;
    @Size(max = 3)
    @Column(name = "PHAMVIXM")
    private String phamvixm;

    public VwDmNoteListWeb() {
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

    public String getDesEng() {
        return desEng;
    }

    public void setDesEng(String desEng) {
        this.desEng = desEng;
    }

    public String getIdKhac() {
        return idKhac;
    }

    public void setIdKhac(String idKhac) {
        this.idKhac = idKhac;
    }

    public String getPlXacminh() {
        return plXacminh;
    }

    public void setPlXacminh(String plXacminh) {
        this.plXacminh = plXacminh;
    }

    public String getIdXmDt() {
        return idXmDt;
    }

    public void setIdXmDt(String idXmDt) {
        this.idXmDt = idXmDt;
    }

    public String getIdLoaixm() {
        return idLoaixm;
    }

    public void setIdLoaixm(String idLoaixm) {
        this.idLoaixm = idLoaixm;
    }

    public String getIdDiemchitra() {
        return idDiemchitra;
    }

    public void setIdDiemchitra(String idDiemchitra) {
        this.idDiemchitra = idDiemchitra;
    }

    public String getPhamvixm() {
        return phamvixm;
    }

    public void setPhamvixm(String phamvixm) {
        this.phamvixm = phamvixm;
    }
    
}
