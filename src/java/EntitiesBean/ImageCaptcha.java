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
 * @author Administrator
 */
@Entity
@Table(name = "IMAGE_CAPTCHA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImageCaptcha.findAll", query = "SELECT i FROM ImageCaptcha i"),
    @NamedQuery(name = "ImageCaptcha.findByIdCode", query = "SELECT i FROM ImageCaptcha i WHERE i.idCode = :idCode"),
    @NamedQuery(name = "ImageCaptcha.findByFilename", query = "SELECT i FROM ImageCaptcha i WHERE i.filename = :filename"),
    @NamedQuery(name = "ImageCaptcha.findByFilevalue", query = "SELECT i FROM ImageCaptcha i WHERE i.filevalue = :filevalue"),
    @NamedQuery(name = "ImageCaptcha.findByMakerId", query = "SELECT i FROM ImageCaptcha i WHERE i.makerId = :makerId"),
    @NamedQuery(name = "ImageCaptcha.findByNgayKhoitao", query = "SELECT i FROM ImageCaptcha i WHERE i.ngayKhoitao = :ngayKhoitao"),
    @NamedQuery(name = "ImageCaptcha.findByDateModified", query = "SELECT i FROM ImageCaptcha i WHERE i.dateModified = :dateModified"),
    @NamedQuery(name = "ImageCaptcha.findByDuyet", query = "SELECT i FROM ImageCaptcha i WHERE i.duyet = :duyet"),
    @NamedQuery(name = "ImageCaptcha.findByIdNvDuyet", query = "SELECT i FROM ImageCaptcha i WHERE i.idNvDuyet = :idNvDuyet"),
    @NamedQuery(name = "ImageCaptcha.findByNgayDuyet", query = "SELECT i FROM ImageCaptcha i WHERE i.ngayDuyet = :ngayDuyet"),
    @NamedQuery(name = "ImageCaptcha.findByIdValidity", query = "SELECT i FROM ImageCaptcha i WHERE i.idValidity = :idValidity"),
    @NamedQuery(name = "ImageCaptcha.findByIdLock", query = "SELECT i FROM ImageCaptcha i WHERE i.idLock = :idLock"),
    @NamedQuery(name = "ImageCaptcha.findByIdNvDelete", query = "SELECT i FROM ImageCaptcha i WHERE i.idNvDelete = :idNvDelete"),
    @NamedQuery(name = "ImageCaptcha.findByNgayDelete", query = "SELECT i FROM ImageCaptcha i WHERE i.ngayDelete = :ngayDelete"),
    @NamedQuery(name = "ImageCaptcha.findByLydoDelete", query = "SELECT i FROM ImageCaptcha i WHERE i.lydoDelete = :lydoDelete"),
    @NamedQuery(name = "ImageCaptcha.findByRecordNote", query = "SELECT i FROM ImageCaptcha i WHERE i.recordNote = :recordNote"),
    @NamedQuery(name = "ImageCaptcha.findByPathWindows", query = "SELECT i FROM ImageCaptcha i WHERE i.pathWindows = :pathWindows"),
    @NamedQuery(name = "ImageCaptcha.findByPathLinux", query = "SELECT i FROM ImageCaptcha i WHERE i.pathLinux = :pathLinux")})
public class ImageCaptcha implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "ID_CODE")
    private String idCode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "FILENAME")
    private String filename;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "FILEVALUE")
    private String filevalue;
    @Size(max = 100)
    @Column(name = "MAKER_ID")
    private String makerId;
    @Column(name = "NGAY_KHOITAO")
    @Temporal(TemporalType.DATE)
    private Date ngayKhoitao;
    @Column(name = "DATE_MODIFIED")
    @Temporal(TemporalType.DATE)
    private Date dateModified;
    @Size(max = 100)
    @Column(name = "DUYET")
    private String duyet;
    @Size(max = 100)
    @Column(name = "ID_NV_DUYET")
    private String idNvDuyet;
    @Column(name = "NGAY_DUYET")
    @Temporal(TemporalType.DATE)
    private Date ngayDuyet;
    @Size(max = 1)
    @Column(name = "ID_VALIDITY")
    private String idValidity;
    @Size(max = 1)
    @Column(name = "ID_LOCK")
    private String idLock;
    @Size(max = 40)
    @Column(name = "ID_NV_DELETE")
    private String idNvDelete;
    @Column(name = "NGAY_DELETE")
    @Temporal(TemporalType.DATE)
    private Date ngayDelete;
    @Size(max = 500)
    @Column(name = "LYDO_DELETE")
    private String lydoDelete;
    @Size(max = 500)
    @Column(name = "RECORD_NOTE")
    private String recordNote;
    @Size(max = 500)
    @Column(name = "PATH_WINDOWS")
    private String pathWindows;
    @Size(max = 500)
    @Column(name = "PATH_LINUX")
    private String pathLinux;

    public ImageCaptcha() {
    }

    public ImageCaptcha(String idCode) {
        this.idCode = idCode;
    }

    public ImageCaptcha(String idCode, String filename, String filevalue) {
        this.idCode = idCode;
        this.filename = filename;
        this.filevalue = filevalue;
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFilevalue() {
        return filevalue;
    }

    public void setFilevalue(String filevalue) {
        this.filevalue = filevalue;
    }

    public String getMakerId() {
        return makerId;
    }

    public void setMakerId(String makerId) {
        this.makerId = makerId;
    }

    public Date getNgayKhoitao() {
        return ngayKhoitao;
    }

    public void setNgayKhoitao(Date ngayKhoitao) {
        this.ngayKhoitao = ngayKhoitao;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    public String getDuyet() {
        return duyet;
    }

    public void setDuyet(String duyet) {
        this.duyet = duyet;
    }

    public String getIdNvDuyet() {
        return idNvDuyet;
    }

    public void setIdNvDuyet(String idNvDuyet) {
        this.idNvDuyet = idNvDuyet;
    }

    public Date getNgayDuyet() {
        return ngayDuyet;
    }

    public void setNgayDuyet(Date ngayDuyet) {
        this.ngayDuyet = ngayDuyet;
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

    public String getIdNvDelete() {
        return idNvDelete;
    }

    public void setIdNvDelete(String idNvDelete) {
        this.idNvDelete = idNvDelete;
    }

    public Date getNgayDelete() {
        return ngayDelete;
    }

    public void setNgayDelete(Date ngayDelete) {
        this.ngayDelete = ngayDelete;
    }

    public String getLydoDelete() {
        return lydoDelete;
    }

    public void setLydoDelete(String lydoDelete) {
        this.lydoDelete = lydoDelete;
    }

    public String getRecordNote() {
        return recordNote;
    }

    public void setRecordNote(String recordNote) {
        this.recordNote = recordNote;
    }

    public String getPathWindows() {
        return pathWindows;
    }

    public void setPathWindows(String pathWindows) {
        this.pathWindows = pathWindows;
    }

    public String getPathLinux() {
        return pathLinux;
    }

    public void setPathLinux(String pathLinux) {
        this.pathLinux = pathLinux;
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
        if (!(object instanceof ImageCaptcha)) {
            return false;
        }
        ImageCaptcha other = (ImageCaptcha) object;
        if ((this.idCode == null && other.idCode != null) || (this.idCode != null && !this.idCode.equals(other.idCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ConnectBean.ImageCaptcha[ idCode=" + idCode + " ]";
    }
    
}
