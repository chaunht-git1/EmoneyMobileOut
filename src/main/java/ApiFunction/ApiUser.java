 
package ApiFunction;

 
 
import Entities.UserModel;
import com.google.gson.Gson;
 
public class ApiUser {
    
//    public static void main(String[] args) {
//        
//        ApiUser apiUser=new ApiUser();
//        UserModel model= new UserModel();
//        model= apiUser.laythongUser("DUNGTH");        
//    }
//    
    
 private final String linkbasic="http://rest.dongamoneytransfer.com.vn/ApiCoreJava/apicore";
 
 public  UserModel laythongUser(String username) {
      
       
       try {
         UserModel userModel=new UserModel(); 

         NetClientGet clientGet = new NetClientGet();
         Gson gson=new Gson();
         String kq = clientGet.getClientJson(linkbasic + "/vwsmtbuserlist/" + username,true);
         userModel= gson.fromJson(kq, UserModel.class);
         return userModel;
         
     } catch (Exception e) {
             return null;
     }
       
     }

}
    
    

