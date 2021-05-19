package edu.pingpong;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import org.jboss.resteasy.annotations.jaxrs.PathParam;

import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/hello")
public class GreetingResource {

    @Inject
    GreetingService service;

    @ConfigProperty(name="greetings.message")
    String msg;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String helloUpper() {
        return service.toUpperCase(msg);
    }






}

