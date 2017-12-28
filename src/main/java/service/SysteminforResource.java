 
package service;

import service.Track;
import com.google.gson.Gson;
import java.sql.SQLException;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

 
@Path("systeminfor")
public class SysteminforResource {
 
    @Context
    private UriInfo context;
    
    
    Gson gson= new Gson();
   
    public SysteminforResource() {
    }

 
    @GET
    @Path("connect")
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() throws RollbackException, HeuristicMixedException, HeuristicRollbackException, SQLException {
 
            Track track= new Track("System Information","","");
            return gson.toJson(track);
      
    }
}
