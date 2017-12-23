package ApiFunction;


import static ConnectBean.Provider.BASE_DOMAIN;
import Entities.ChitietgiaodichModel;
import com.google.gson.Gson;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;

 
public class ApiGiaophieu {
 
        private WebTarget webTarget;
        private Client client;
        private static final String BASE_URI ="http://"+BASE_DOMAIN+"/ApiCoreJava/apicore";

      
    public String capnhatsocmnd(ChitietgiaodichModel chitietgiaodichModel) {
        try {

            /**
             * Khai báo client .
             */
            com.sun.jersey.api.client.Client client = com.sun.jersey.api.client.Client.create();
            Gson gson = new Gson();
            WebResource webResource = client.resource(BASE_URI + "/postdata/capnhatsocmnd");
            String input = gson.toJson(chitietgiaodichModel);

            ClientResponse response = webResource.type("application/json").post(ClientResponse.class, input);

            if (response.getStatus() != 201) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatus());
            }
            String output = response.getEntity(String.class);
//		System.out.println("Output from Server .... \n");
//		String output = response.getEntity(String.class);
//		System.out.println(output);
            return output;
        } catch (Exception e) {
            return e.getMessage();
        }

    }
     

	}
 