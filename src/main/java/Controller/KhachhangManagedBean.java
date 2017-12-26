 
package Controller;

import ApiFunction.ApiKhachhang;
import DanhmucModel.DistrictList;
import DanhmucModel.DmCitylist;
import DaoDanhmuc.VwKhachhangttListTempDao;
import Entitieskhout.KhachhangttListTemp;
import Entitieskhout.VwKhachhangttListTemp;
import Global.ConstantCodes;
import Global.RepeatPaginator;
import Global.SessionBean;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

 
@Named(value = "khachhangManagedBean")
@SessionScoped
public class KhachhangManagedBean implements Serializable {

     List<VwKhachhangttListTemp> khachhangttListTemps = new ArrayList<>();
     private RepeatPaginator paginator;
     private VwKhachhangttListTemp khachhangttListTemp=new  VwKhachhangttListTemp();
     List<DmCitylist> dscitylist=  ConstantCodes.mmcitylist;
     List<DistrictList> dsdistrictlist=  ConstantCodes.dsdistrictlist;
     List<DistrictList> dsdistrictcity=   new ArrayList<>();
     private  String loaitk="N";
     public String chuyentrang() {
       
        this.getdskhachhanguser(loaitk);
        return "successkh";
     
    }
    
    public String chuyentrangchitietkh(VwKhachhangttListTemp khTemp  ) {
          khachhangttListTemp=khTemp;
          String giatritk=null;
          giatritk=  khTemp.getTpHientai();
          if(giatritk!=null )
          {
             this.laydsdistrictcity(khTemp.getTpHientai()) ;
          }
          return "successctkh";
       
    }
    
    public  void laydsdistrictcity(String city){
        dsdistrictcity=new ArrayList<>();
         List<DistrictList> dskq = new ArrayList<>();
        for (int i = 0; i < dsdistrictlist.size(); i++) {
            if (dsdistrictlist.get(i).getIdCity().equalsIgnoreCase(city))
            {
                dskq.add(dsdistrictlist.get(i));
            }
           
        }
         
         dsdistrictcity =dskq;
      
        
    }
     
     
    public void getdskhachhanguser(String loaitktk){
        
        ApiFunction.ApiKhachhang apiKhachhang= new ApiKhachhang();
        khachhangttListTemps=apiKhachhang.dskhchitiet("DUNGTH",loaitktk);
        paginator = new RepeatPaginator(khachhangttListTemps);
 
    }
    
    public String capnhatthongtinkh(VwKhachhangttListTemp khachhangTemp){
       
       ApiKhachhang khachhangttListTempDao= new ApiKhachhang();
       String kq=  khachhangttListTempDao.capnhatkhachhang(khachhangTemp);
       
       if (kq.equalsIgnoreCase("F"))
       {
            return null;
       }
       else{
           
            this.getdskhachhanguser(loaitk);
            return "backctkh";

       }
      
 
    }

    
    public KhachhangManagedBean() {
    }

    public List<VwKhachhangttListTemp> getKhachhangttListTemps() {
        return khachhangttListTemps;
    }

    public void setKhachhangttListTemps(List<VwKhachhangttListTemp> khachhangttListTemps) {
        this.khachhangttListTemps = khachhangttListTemps;
    }

    public RepeatPaginator getPaginator() {
        return paginator;
    }

    public void setPaginator(RepeatPaginator paginator) {
        this.paginator = paginator;
    }

    public VwKhachhangttListTemp getKhachhangttListTemp() {
        return khachhangttListTemp;
    }

    public void setKhachhangttListTemp(VwKhachhangttListTemp khachhangttListTemp) {
        this.khachhangttListTemp = khachhangttListTemp;
    }

    public List<DmCitylist> getDscitylist() {
        return dscitylist;
    }

    public void setDscitylist(List<DmCitylist> dscitylist) {
        this.dscitylist = dscitylist;
    }

    public String getLoaitk() {
        return loaitk;
    }

    public void setLoaitk(String loaitk) {
        this.loaitk = loaitk;
    }

    public List<DistrictList> getDsdistrictcity() {
        return dsdistrictcity;
    }

    public void setDsdistrictcity(List<DistrictList> dsdistrictcity) {
        this.dsdistrictcity = dsdistrictcity;
    }

   
   

 
    
}
