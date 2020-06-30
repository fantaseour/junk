package ru.jpoint.vmix.sessions.boundary;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ru.jpoint.vmix.sessions.entity.Speaker;

@Path("sessions")
public class SessionResource {

    @Inject
    SpeakerService speaker;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Speaker expose() {
        return this.speaker.talk();
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public void accept(Speaker speaker) {
        System.out.println(" " + speaker);
    }
    
}