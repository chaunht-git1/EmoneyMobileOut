package ApiFunction;


import static ConnectBean.Provider.BASE_DOMAIN;
import Entities.ChitietgiaodichModel;
import Entities.VwTondongNvAllWeb;
import Entitieskhout.VwKhachhangttListTemp;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;

 
public class ApiKhachhang {
 
        private WebTarget webTarget;
        private Client client;
        private static final String BASE_URI ="http://"+BASE_DOMAIN+"/ApiCoreJava/apicore";

      
   
 public  List<VwKhachhangttListTemp> dskhchitiet(String userid ) {
        
        WebTarget webTarget;
        Client client;
        String Full_base =BASE_URI+"/vwkhachhangttlisttemp/user/"+userid;
        

         List<VwKhachhangttListTemp> dsKq;
         dsKq = new ArrayList<>();
     try {
         
        // String linkbasic="http://rest.dongamoneytransfer.com.vn/ApiCoreJava/apicore/vwtondongnvallweb/dschinhanhtheonv/"+chinhanh+"/"+nvchitra;
         
         NetClientGet clientGet=new NetClientGet();
         String kq = clientGet.getClientJson(Full_base,true);


         if(!kq.equalsIgnoreCase("Error"))
         {
               Gson gson = new Gson();
               Type listType = new TypeToken<ArrayList<VwKhachhangttListTemp>>(){}.getType();
               dsKq =new Gson().fromJson(kq, listType);
         }
 
         
         return dsKq;
     } catch (Exception e) {
         return dsKq;
     }
     
    }
     
  public String capnhatkhachhang(VwKhachhangttListTemp khachhangttListTemp) {
        try {

            com.sun.jersey.api.client.Client client = com.sun.jersey.api.client.Client.create();
            Gson gson = new Gson();
            WebResource webResource = client.resource(BASE_URI + "/vwkhachhangttlisttemp/capnhatkh");
            String input = gson.toJson(khachhangttListTemp);

            ClientResponse response = webResource.type("application/json").post(ClientResponse.class, input);

            if (response.getStatus() != 201) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatus());
            }
            String output = response.getEntity(String.class);
            return output;
        } catch (Exception e) {
            return e.getMessage();
        }

    }
	}
 