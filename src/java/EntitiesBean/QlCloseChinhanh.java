/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntitiesBean;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author TamChauDAMTC
 */
@Entity
@Table(name = "QL_CLOSE_CHINHANH")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "QlCloseChinhanh.findAll", query = "SELECT q FROM QlCloseChinhanh q"),
    @NamedQuery(name = "QlCloseChinhanh.findByIdChinhanh", query = "SELECT q FROM QlCloseChinhanh q WHERE q.qlCloseChinhanhPK.idChinhanh = :idChinhanh"),
    @NamedQuery(name = "QlCloseChinhanh.findByTrangthai", query = "SELECT q FROM QlCloseChinhanh q WHERE q.trangthai = :trangthai"),
    @NamedQuery(name = "QlCloseChinhanh.findByUserId", query = "SELECT q FROM QlCloseChinhanh q WHERE q.userId = :userId"),
    @NamedQuery(name = "QlCloseChinhanh.findByNgay", query = "SELECT q FROM QlCloseChinhanh q WHERE q.qlCloseChinhanhPK.ngay = :ngay"),
    @NamedQuery(name = "QlCloseChinhanh.findByGio", query = "SELECT q FROM QlCloseChinhanh q WHERE q.gio = :gio"),
    @NamedQuery(name = "QlCloseChinhanh.findByGhichu", query = "SELECT q FROM QlCloseChinhanh q WHERE q.ghichu = :ghichu"),
    @NamedQuery(name = "QlCloseChinhanh.findBySohoChitra", query = "SELECT q FROM QlCloseChinhanh q WHERE q.sohoChitra = :sohoChitra"),
    @NamedQuery(name = "QlCloseChinhanh.findBySohosoChuachi", query = "SELECT q FROM QlCloseChinhanh q WHERE q.sohosoChuachi = :sohosoChuachi"),
    @NamedQuery(name = "QlCloseChinhanh.findBySohosoXoa", query = "SELECT q FROM QlCloseChinhanh q WHERE q.sohosoXoa = :sohosoXoa"),
    @NamedQuery(name = "QlCloseChinhanh.findBySohosoGoc", query = "SELECT q FROM QlCloseChinhanh q WHERE q.sohosoGoc = :sohosoGoc"),
    @NamedQuery(name = "QlCloseChinhanh.findBySohosoDc", query = "SELECT q FROM QlCloseChinhanh q WHERE q.sohosoDc = :sohosoDc"),
    @NamedQuery(name = "QlCloseChinhanh.findBySolenhhuy", query = "SELECT q FROM QlCloseChinhanh q WHERE q.solenhhuy = :solenhhuy"),
    @NamedQuery(name = "QlCloseChinhanh.findByUserIdOpen", query = "SELECT q FROM QlCloseChinhanh q WHERE q.userIdOpen = :userIdOpen"),
    @NamedQuery(name = "QlCloseChinhanh.findBySohosoChitratam", query = "SELECT q FROM QlCloseChinhanh q WHERE q.sohosoChitratam = :sohosoChitratam"),
    @NamedQuery(name = "QlCloseChinhanh.findBySohosoChuaduyet", query = "SELECT q FROM QlCloseChinhanh q WHERE q.sohosoChuaduyet = :sohosoChuaduyet")})
public class QlCloseChinhanh implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected QlCloseChinhanhPK qlCloseChinhanhPK;
    @Size(max = 1)
    @Column(name = "TRANGTHAI")
    private String trangthai;
    @Size(max = 20)
    @Column(name = "USER_ID")
    private String userId;
    @Column(name = "GIO")
    @Temporal(TemporalType.DATE)
    private Date gio;
    @Size(max = 201)
    @Column(name = "GHICHU")
    private String ghichu;
    @Column(name = "SOHO_CHITRA")
    private Long sohoChitra;
    @Column(name = "SOHOSO_CHUACHI")
    private Long sohosoChuachi;
    @Column(name = "SOHOSO_XOA")
    private Long sohosoXoa;
    @Column(name = "SOHOSO_GOC")
    private BigInteger sohosoGoc;
    @Column(name = "SOHOSO_DC")
    private BigInteger sohosoDc;
    @Column(name = "SOLENHHUY")
    private BigInteger solenhhuy;
    @Size(max = 20)
    @Column(name = "USER_ID_OPEN")
    private String userIdOpen;
    @Column(name = "SOHOSO_CHITRATAM")
    private Long sohosoChitratam;
    @Column(name = "SOHOSO_CHUADUYET")
    private Long sohosoChuaduyet;

    public QlCloseChinhanh() {
    }

    public QlCloseChinhanh(QlCloseChinhanhPK qlCloseChinhanhPK) {
        this.qlCloseChinhanhPK = qlCloseChinhanhPK;
    }

    public QlCloseChinhanh(String idChinhanh, Date ngay) {
        this.qlCloseChinhanhPK = new QlCloseChinhanhPK(idChinhanh, ngay);
    }

    public QlCloseChinhanhPK getQlCloseChinhanhPK() {
        return qlCloseChinhanhPK;
    }

    public void setQlCloseChinhanhPK(QlCloseChinhanhPK qlCloseChinhanhPK) {
        this.qlCloseChinhanhPK = qlCloseChinhanhPK;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getGio() {
        return gio;
    }

    public void setGio(Date gio) {
        this.gio = gio;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    public Long getSohoChitra() {
        return sohoChitra;
    }

    public void setSohoChitra(Long sohoChitra) {
        this.sohoChitra = sohoChitra;
    }

    public Long getSohosoChuachi() {
        return sohosoChuachi;
    }

    public void setSohosoChuachi(Long sohosoChuachi) {
        this.sohosoChuachi = sohosoChuachi;
    }

    public Long getSohosoXoa() {
        return sohosoXoa;
    }

    public void setSohosoXoa(Long sohosoXoa) {
        this.sohosoXoa = sohosoXoa;
    }

    public BigInteger getSohosoGoc() {
        return sohosoGoc;
    }

    public void setSohosoGoc(BigInteger sohosoGoc) {
        this.sohosoGoc = sohosoGoc;
    }

    public BigInteger getSohosoDc() {
        return sohosoDc;
    }

    public void setSohosoDc(BigInteger sohosoDc) {
        this.sohosoDc = sohosoDc;
    }

    public BigInteger getSolenhhuy() {
        return solenhhuy;
    }

    public void setSolenhhuy(BigInteger solenhhuy) {
        this.solenhhuy = solenhhuy;
    }

    public String getUserIdOpen() {
        return userIdOpen;
    }

    public void setUserIdOpen(String userIdOpen) {
        this.userIdOpen = userIdOpen;
    }

    public Long getSohosoChitratam() {
        return sohosoChitratam;
    }

    public void setSohosoChitratam(Long sohosoChitratam) {
        this.sohosoChitratam = sohosoChitratam;
    }

    public Long getSohosoChuaduyet() {
        return sohosoChuaduyet;
    }

    public void setSohosoChuaduyet(Long sohosoChuaduyet) {
        this.sohosoChuaduyet = sohosoChuaduyet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (qlCloseChinhanhPK != null ? qlCloseChinhanhPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof QlCloseChinhanh)) {
            return false;
        }
        QlCloseChinhanh other = (QlCloseChinhanh) object;
        if ((this.qlCloseChinhanhPK == null && other.qlCloseChinhanhPK != null) || (this.qlCloseChinhanhPK != null && !this.qlCloseChinhanhPK.equals(other.qlCloseChinhanhPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EntitiesBean.QlCloseChinhanh[ qlCloseChinhanhPK=" + qlCloseChinhanhPK + " ]";
    }
    
}
