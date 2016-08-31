package trailerserver;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("home")
public class Resource {
  @GET
  @Path("main")
  @Produces(MediaType.TEXT_PLAIN)
  public String home() {
    return "Mobile Control App!";
  } 
}