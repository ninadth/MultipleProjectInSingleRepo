package com.clover;


import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

import io.vertx.core.json.JsonObject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class ExampleResource {
	
	
	@Channel("quarkus-rabbitmq")
	Emitter<JsonObject> emitter;
	
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
    	
    	JsonObject obj=new JsonObject();
    	obj.put("hello","ninad");
    	obj.put("hello","hiii ninad");
    	emitter.send(obj);
        return "Hello from RESTEasy Reactive";
    }
}
