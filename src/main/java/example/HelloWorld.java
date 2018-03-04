package example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("HelloWorld")
public class HelloWorld {

    @GET
    @Path("hello")
    @Produces("text/plain")
    public String hello(){
        return "Hello World";
    }
}
