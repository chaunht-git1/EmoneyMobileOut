package PksTest;

import Entities.ChitietgiaodichModel;
import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class JerseyClientPost {

  public static void main(String[] args) {

	try {

		Client client = Client.create();
                Gson gson= new Gson();
                ChitietgiaodichModel chitietgiaodichModel= new ChitietgiaodichModel();
                chitietgiaodichModel.setChinhanh("003");
                chitietgiaodichModel.setHoten("NGUYEN HUU TAM cHAU");
                chitietgiaodichModel.setSophieu("01111111111111111");
                chitietgiaodichModel.setStt(1);
		WebResource webResource = client.resource("http://localhost:8080/ApiCoreJava/apicore/json/metallica/post");
   
		String input = gson.toJson(chitietgiaodichModel);

		ClientResponse response = webResource.type("application/json")
		   .post(ClientResponse.class, input);

		if (response.getStatus() != 201) {
			throw new RuntimeException("Failed : HTTP error code : "
			     + response.getStatus());
		}

		System.out.println("Output from Server .... \n");
		String output = response.getEntity(String.class);
		System.out.println(output);

	  } catch (Exception e) {

		e.printStackTrace();

	  }

	}
}