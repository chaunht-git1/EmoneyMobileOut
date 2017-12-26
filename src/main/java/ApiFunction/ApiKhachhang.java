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
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;




 
public class ApiKhachhang {
 
        private WebTarget webTarget;
        private Client client;
        private static final String BASE_URI ="http://"+BASE_DOMAIN+"/ApiCoreJava/apicore";

        
    public static void main(String[] args) {
        String tienstr="Fri Feb 01 00:00:00 ICT 1980";
        DateFormat formatter = new SimpleDateFormat("E MMM dd HH:mm:ss Z yyyy");
            try {
                //String dataRisposta = "Tue Jul 13 00:00:00 CST 2010";
                Date date = (Date)formatter.parse(tienstr);
            } catch (ParseException ex) {
                Logger.getLogger(ApiKhachhang.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
     
      
   
 public  List<VwKhachhangttListTemp> dskhchitiet(String userid,String loaitk ) {
        
        WebTarget webTarget;
        Client client;
        String Full_base =BASE_URI+"/vwkhachhangttlisttemp/user/"+userid+"/"+loaitk;
        

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
 