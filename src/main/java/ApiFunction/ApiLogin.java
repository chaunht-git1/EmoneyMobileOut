 
package ApiFunction;

 

import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;
 
public class ApiLogin {
    
    
  private final String linkbasic="http://rest.dongamoneytransfer.com.vn/RestApiOutWeb/webresources";
     
 
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
 
}
    
    

