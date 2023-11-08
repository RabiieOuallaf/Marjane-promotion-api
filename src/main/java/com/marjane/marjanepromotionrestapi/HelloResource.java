package com.marjane.marjanepromotionrestapi;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/hello-world")
public class HelloResource {
    @GET
    @Produces("text/plain")
    public void hello() {
        System.out.println("Hello, World!");
    }
}