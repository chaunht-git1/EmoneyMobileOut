 
package ApiFunction;

import static ConnectBean.Provider.BASE_DOMAIN;
import DanhmucModel.DistrictList;
import DanhmucModel.DmCitylist;
import Entities.UserModel;
import Entities.VwKshbHosonvchinhaAll;
import Entities.VwTondongNvAllWeb;
import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;

 
public class ApiDanhmuc {
    
 
  
     private String  linkbasic="http://rest.dongamoneytransfer.com.vn/ApiCoreJava/apicore";
    
     public  UserModel layThongUser(String username) {
      
       UserModel model=new UserModel(); 
       try {
       
         NetClientGet clientGet = new NetClientGet();
         Gson gson = new Gson();
         LinkedTreeMap bientam = new LinkedTreeMap();
         String kq = clientGet.getClientJson(linkbasic + "/vwsmtbuserlist/" + username,true);
         if(!kq.equalsIgnoreCase("Error"))
         {
             java.lang.reflect.Type listType = new TypeToken<ArrayList<UserModel>>(){}.getType();
             model = gson.fromJson(kq, listType);
         }
         else{
             return null;
         }
         
         return model;
         
     } catch (Exception e) {
             return null;
     }
       
     }
    
 public  List<DmCitylist> dscitylist() {
        

         List<DmCitylist> dsKq= new ArrayList<>();
         List<DmCitylist> dsKq1= new ArrayList<>();
         dsKq = new ArrayList<>();
     try {

         NetClientGet clientGet=new NetClientGet();
         LinkedTreeMap bientam = new LinkedTreeMap();
         String kq = clientGet.getClientJson(linkbasic +"/citylist" ,true);
         if(!kq.equalsIgnoreCase("Error"))
         {      
         Gson gson = new Gson();
         java.lang.reflect.Type listType = new TypeToken<ArrayList<DmCitylist>>(){}.getType();
         dsKq = new Gson().fromJson(kq, listType);
         //dsKq = gson.fromJson(kq, List.class);
             
         }
 
         
         return dsKq;
     } catch (Exception e) {
         return dsKq;
     }
     
    } 

 public  List<VwTondongNvAllWeb> dsdondongchitiet(String chinhanh,String nvchitra,String loaitk) {
        
        WebTarget webTarget;
        Client client;
        String BASE_URI ="http://"+BASE_DOMAIN+"/ApiCoreJava/apicore/vwtondongnvallweb/dschinhanhtheonv/"+chinhanh+"/"+nvchitra;
        

         List<VwTondongNvAllWeb> dsKq;
         dsKq = new ArrayList<>();
     try {
         
        // String linkbasic="http://rest.dongamoneytransfer.com.vn/ApiCoreJava/apicore/vwtondongnvallweb/dschinhanhtheonv/"+chinhanh+"/"+nvchitra;
         
         NetClientGet clientGet=new NetClientGet();
         String kq = clientGet.getClientJson(BASE_URI,true);


         if(!kq.equalsIgnoreCase("Error"))
         {
               Gson gson = new Gson();
               Type listType = new TypeToken<ArrayList<VwTondongNvAllWeb>>(){}.getType();
               dsKq =new Gson().fromJson(kq, listType);
         }
 
         
         return dsKq;
     } catch (Exception e) {
         return dsKq;
     }
     
    }
  
    public static  List<VwKshbHosonvchinhaAll> dsthongkenhanvien(String chinhanh,String nvchitra,String loaitk) {
        
        List<VwKshbHosonvchinhaAll>  dsKq= new ArrayList<>();
       
        try {
            String linkbasic = "http://rest.dongamoneytransfer.com.vn/ServerRestKieuhoi/webresources/vwkshbhosonvchinhaall/dshstheonv/" + chinhanh + "/" + nvchitra;
            NetClientGet clientGet = new NetClientGet();
            LinkedTreeMap bientam = new LinkedTreeMap();
            String kq = clientGet.getClientJson(linkbasic, true);
            Gson gson = new Gson();
            dsKq = gson.fromJson(kq, List.class);
            return dsKq;
        } catch (Exception e) {
            return null;
        }
      
   
}
        
 public  List<DistrictList> dsdistrict() {
        

         List<DistrictList> dsKq= new ArrayList<>();
         dsKq = new ArrayList<>();
     try {

         NetClientGet clientGet=new NetClientGet();
         LinkedTreeMap bientam = new LinkedTreeMap();
         String kq = clientGet.getClientJson(linkbasic +"/districtlist" ,true);
         if(!kq.equalsIgnoreCase("Error"))
         {      
         Gson gson = new Gson();
         java.lang.reflect.Type listType = new TypeToken<ArrayList<DistrictList>>(){}.getType();
         dsKq = new Gson().fromJson(kq, listType);
         //dsKq = gson.fromJson(kq, List.class);
             
         }
 
         
         return dsKq;
     } catch (Exception e) {
         return dsKq;
     }
     
    } 
      
    
}
