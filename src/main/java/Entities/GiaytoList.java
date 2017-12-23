 
package Entities;

import java.util.Date;

 
public class GiaytoList {
    
    private String maGiayto;
    private String tenGiayto;
    private String idValidity;
    private Date dateModified;

    public String getMaGiayto() {
        return maGiayto;
    }

    public void setMaGiayto(String maGiayto) {
        this.maGiayto = maGiayto;
    }

    public String getTenGiayto() {
        return tenGiayto;
    }

    public void setTenGiayto(String tenGiayto) {
        this.tenGiayto = tenGiayto;
    }

    public String getIdValidity() {
        return idValidity;
    }

    public void setIdValidity(String idValidity) {
        this.idValidity = idValidity;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }
    
    
    
}
