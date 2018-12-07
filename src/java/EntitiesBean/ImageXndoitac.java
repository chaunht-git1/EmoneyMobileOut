/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntitiesBean;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
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
@Table(name = "IMAGE_XNDOITAC")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImageXndoitac.findAll", query = "SELECT i FROM ImageXndoitac i"),
    @NamedQuery(name = "ImageXndoitac.findByKhoa", query = "SELECT i FROM ImageXndoitac i WHERE i.khoa = :khoa"),
    @NamedQuery(name = "ImageXndoitac.findByIdChinhanh", query = "SELECT i FROM ImageXndoitac i WHERE i.idChinhanh = :idChinhanh"),
    @NamedQuery(name = "ImageXndoitac.findBySophieu", query = "SELECT i FROM ImageXndoitac i WHERE i.sophieu = :sophieu"),
    @NamedQuery(name = "ImageXndoitac.findByStt", query = "SELECT i FROM ImageXndoitac i WHERE i.stt = :stt"),
    @NamedQuery(name = "ImageXndoitac.findByMaNguoinhan", query = "SELECT i FROM ImageXndoitac i WHERE i.maNguoinhan = :maNguoinhan"),
    @NamedQuery(name = "ImageXndoitac.findBySobn", query = "SELECT i FROM ImageXndoitac i WHERE i.sobn = :sobn"),
    @NamedQuery(name = "ImageXndoitac.findByFilename", query = "SELECT i FROM ImageXndoitac i WHERE i.filename = :filename")})
public class ImageXndoitac implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "KHOA")
    private String khoa;
    @Lob
    @Column(name = "HINH_BN")
    private Serializable hinhBn;
    @Lob
    @Column(name = "HINH_DC")
    private Serializable hinhDc;
    @Size(max = 40)
    @Column(name = "ID_CHINHANH")
    private String idChinhanh;
    @Size(max = 100)
    @Column(name = "SOPHIEU")
    private String sophieu;
    @Column(name = "STT")
    private BigInteger stt;
    @Size(max = 40)
    @Column(name = "MA_NGUOINHAN")
    private String maNguoinhan;
    @Size(max = 40)
    @Column(name = "SOBN")
    private String sobn;
    @Size(max = 500)
    @Column(name = "FILENAME")
    private String filename;
    @Lob
    @Column(name = "MAVACH")
    private Serializable mavach;

    public ImageXndoitac() {
    }

    public ImageXndoitac(String khoa) {
        this.khoa = khoa;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public Serializable getHinhBn() {
        return hinhBn;
    }

    public void setHinhBn(Serializable hinhBn) {
        this.hinhBn = hinhBn;
    }

    public Serializable getHinhDc() {
        return hinhDc;
    }

    public void setHinhDc(Serializable hinhDc) {
        this.hinhDc = hinhDc;
    }

    public String getIdChinhanh() {
        return idChinhanh;
    }

    public void setIdChinhanh(String idChinhanh) {
        this.idChinhanh = idChinhanh;
    }

    public String getSophieu() {
        return sophieu;
    }

    public void setSophieu(String sophieu) {
        this.sophieu = sophieu;
    }

    public BigInteger getStt() {
        return stt;
    }

    public void setStt(BigInteger stt) {
        this.stt = stt;
    }

    public String getMaNguoinhan() {
        return maNguoinhan;
    }

    public void setMaNguoinhan(String maNguoinhan) {
        this.maNguoinhan = maNguoinhan;
    }

    public String getSobn() {
        return sobn;
    }

    public void setSobn(String sobn) {
        this.sobn = sobn;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Serializable getMavach() {
        return mavach;
    }

    public void setMavach(Serializable mavach) {
        this.mavach = mavach;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (khoa != null ? khoa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImageXndoitac)) {
            return false;
        }
        ImageXndoitac other = (ImageXndoitac) object;
        if ((this.khoa == null && other.khoa != null) || (this.khoa != null && !this.khoa.equals(other.khoa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ConnectBean.ImageXndoitac[ khoa=" + khoa + " ]";
    }
    
}
