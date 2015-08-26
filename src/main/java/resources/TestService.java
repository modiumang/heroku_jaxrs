package resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.SecurityContext;

@Path("/test")
public class TestService {

    @GET
    @Produces("text/plain")
    public String handleTest() {
    	return "Tested OK";
    }
    
}
