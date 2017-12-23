 
package Entities;

import java.io.Serializable;
import java.math.BigInteger;
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

 

public class VwKshbHosonvchinhaAll implements Serializable {

    private BigInteger soluonghbmobile;
    private BigInteger slmoneygramdot1;
    private BigInteger slmoneygram;
    private String chinhahoanthanh;
    private BigInteger shsguixm;
    private String idChinhanh;
    private String tenchinhanh;
    private String idNvChitra;
    private String hoten;
    private BigInteger dachitra;
    private BigInteger chuachitra;
    private BigInteger shs;
    private BigInteger daquyetbn;
    private BigInteger choduyetbn;
    private BigInteger thieutt;
    private BigInteger errorbn;   
    private BigInteger dachitrachuabn;
    private String hoanthanh;
    private BigInteger shstondong;
    private BigInteger shsxacminh;
    private String idCode;

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }
 
    public VwKshbHosonvchinhaAll() {
    }

    public BigInteger getShsxacminh() {
        return shsxacminh;
    }

    public void setShsxacminh(BigInteger shsxacminh) {
        this.shsxacminh = shsxacminh;
    }
    
    
    

    public String getIdChinhanh() {
        return idChinhanh;
    }

    public void setIdChinhanh(String idChinhanh) {
        this.idChinhanh = idChinhanh;
    }

    public String getTenchinhanh() {
        return tenchinhanh;
    }

    public void setTenchinhanh(String tenchinhanh) {
        this.tenchinhanh = tenchinhanh;
    }

    public String getIdNvChitra() {
        return idNvChitra;
    }

    public void setIdNvChitra(String idNvChitra) {
        this.idNvChitra = idNvChitra;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public BigInteger getDachitra() {
        return dachitra;
    }

    public void setDachitra(BigInteger dachitra) {
        this.dachitra = dachitra;
    }

    public BigInteger getChuachitra() {
        return chuachitra;
    }

    public void setChuachitra(BigInteger chuachitra) {
        this.chuachitra = chuachitra;
    }

    public BigInteger getShs() {
        return shs;
    }

    public void setShs(BigInteger shs) {
        this.shs = shs;
    }

    public BigInteger getDaquyetbn() {
        return daquyetbn;
    }

    public void setDaquyetbn(BigInteger daquyetbn) {
        this.daquyetbn = daquyetbn;
    }

    public BigInteger getChoduyetbn() {
        return choduyetbn;
    }

    public void setChoduyetbn(BigInteger choduyetbn) {
        this.choduyetbn = choduyetbn;
    }

    public BigInteger getThieutt() {
        return thieutt;
    }

    public void setThieutt(BigInteger thieutt) {
        this.thieutt = thieutt;
    }

    public BigInteger getErrorbn() {
        return errorbn;
    }

    public void setErrorbn(BigInteger errorbn) {
        this.errorbn = errorbn;
    }

    public BigInteger getDachitrachuabn() {
        return dachitrachuabn;
    }

    public void setDachitrachuabn(BigInteger dachitrachuabn) {
        this.dachitrachuabn = dachitrachuabn;
    }

    public String getHoanthanh() {
        return hoanthanh;
    }

    public void setHoanthanh(String hoanthanh) {
        this.hoanthanh = hoanthanh;
    }

    public BigInteger getShstondong() {
        return shstondong;
    }

    public void setShstondong(BigInteger shstondong) {
        this.shstondong = shstondong;
    }

    public BigInteger getShsguixm() {
        return shsguixm;
    }

    public void setShsguixm(BigInteger shsguixm) {
        this.shsguixm = shsguixm;
    }

    public String getChinhahoanthanh() {
        return chinhahoanthanh;
    }

    public void setChinhahoanthanh(String chinhahoanthanh) {
        this.chinhahoanthanh = chinhahoanthanh;
    }

    public BigInteger getSlmoneygram() {
        return slmoneygram;
    }

    public void setSlmoneygram(BigInteger slmoneygram) {
        this.slmoneygram = slmoneygram;
    }

    public BigInteger getSlmoneygramdot1() {
        return slmoneygramdot1;
    }

    public void setSlmoneygramdot1(BigInteger slmoneygramdot1) {
        this.slmoneygramdot1 = slmoneygramdot1;
    }

    public BigInteger getSoluonghbmobile() {
        return soluonghbmobile;
    }

    public void setSoluonghbmobile(BigInteger soluonghbmobile) {
        this.soluonghbmobile = soluonghbmobile;
    }
    
}
