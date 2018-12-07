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
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author TamChauDAMTC
 */
@Embeddable
public class QlCloseChinhanhPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID_CHINHANH")
    private String idChinhanh;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NGAY")
    @Temporal(TemporalType.DATE)
    private Date ngay;

    public QlCloseChinhanhPK() {
    }

    public QlCloseChinhanhPK(String idChinhanh, Date ngay) {
        this.idChinhanh = idChinhanh;
        this.ngay = ngay;
    }

    public String getIdChinhanh() {
        return idChinhanh;
    }

    public void setIdChinhanh(String idChinhanh) {
        this.idChinhanh = idChinhanh;
    }

    public Date getNgay() {
        return ngay;
    }

    public void setNgay(Date ngay) {
        this.ngay = ngay;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idChinhanh != null ? idChinhanh.hashCode() : 0);
        hash += (ngay != null ? ngay.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof QlCloseChinhanhPK)) {
            return false;
        }
        QlCloseChinhanhPK other = (QlCloseChinhanhPK) object;
        if ((this.idChinhanh == null && other.idChinhanh != null) || (this.idChinhanh != null && !this.idChinhanh.equals(other.idChinhanh))) {
            return false;
        }
        if ((this.ngay == null && other.ngay != null) || (this.ngay != null && !this.ngay.equals(other.ngay))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EntitiesBean.QlCloseChinhanhPK[ idChinhanh=" + idChinhanh + ", ngay=" + ngay + " ]";
    }
    
}
