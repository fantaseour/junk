package airhacks.service.ping.boundary;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("ping")
public class PingResource {

    @Inject
    @ConfigProperty(name = "message")
    String message;    

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Talk ping() {
        return new Talk(this.message + " Jakarta EE 8 with MicroProfile 3+!",42);
    }

}
