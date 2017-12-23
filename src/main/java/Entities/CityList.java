 
package Entities;

import java.util.Date;
import javax.persistence.Cacheable;

@Cacheable 
public class CityList {
    
    private String idCode;
    private String cityName;
    private String idValidity;
    private Date dateModified;
    private String districtDefault;
    private String idNvUpdate;
    private String idCityOmex;
    private String idArea;
    private String idHoiso;

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
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

    public String getDistrictDefault() {
        return districtDefault;
    }

    public void setDistrictDefault(String districtDefault) {
        this.districtDefault = districtDefault;
    }

    public String getIdNvUpdate() {
        return idNvUpdate;
    }

    public void setIdNvUpdate(String idNvUpdate) {
        this.idNvUpdate = idNvUpdate;
    }

    public String getIdCityOmex() {
        return idCityOmex;
    }

    public void setIdCityOmex(String idCityOmex) {
        this.idCityOmex = idCityOmex;
    }

    public String getIdArea() {
        return idArea;
    }

    public void setIdArea(String idArea) {
        this.idArea = idArea;
    }

    public String getIdHoiso() {
        return idHoiso;
    }

    public void setIdHoiso(String idHoiso) {
        this.idHoiso = idHoiso;
    }

    
    
}
