 
package ApiFunction;

 

import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;
import service.Track;
import static ConnectBean.Provider.*;
import com.google.gson.reflect.TypeToken;
 
public class ApiLogin {
 
    
 String linkbasic="http://"+ BASE_DOMAIN+"/ApiCoreJava/apicore";
     
 
  public   Boolean  validate(String username,String password) {
       
       try {
           
         NetClientGet clientGet = new NetClientGet();
         Gson gson = new Gson();
         //String passmahoa= MaHoaDuLieu.md5hash(username.toUpperCase()+password.toUpperCase());
         String kq = clientGet.getClientJson(linkbasic + "/smtbuserweb/checklogin/" + username.toUpperCase()+"/"+password.toUpperCase(),true);
         if(!kq.equalsIgnoreCase("F"))
         {
            String ketqua = gson.fromJson(kq, String.class);
            
            if(ketqua.equalsIgnoreCase("T")){
                return true; 
            }
            else{
                return false; 
            }
             
         }
         else{
             return false;
         }
         
     } catch (Exception e) {
             return false;
     }
       
  }
  
  
  public   Track  getInformationSystem( ) {
      
       try {
           
         NetClientGet clientGet = new NetClientGet();
         Gson gson = new Gson();
         //String passmahoa= MaHoaDuLieu.md5hash(username.toUpperCase()+password.toUpperCase());
         String kq = clientGet.getClientJson(linkbasic + "/systeminfor/connect",true);
         if(!kq.equalsIgnoreCase("F"))
         {
            java.lang.reflect.Type listType = new TypeToken<Track>(){}.getType();  
            Track ketqua = gson.fromJson(kq, Track.class);
            return ketqua;  
         }
         else{
             return null;
         }
         
     } catch (Exception e) {
             return null;
     }
       
  }
 
}
    
    

