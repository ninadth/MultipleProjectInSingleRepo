package com;

import org.eclipse.microprofile.reactive.messaging.Incoming;

import io.quarkus.logging.Log;
import io.vertx.core.json.JsonObject;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ReciverRabbitMq {

	@Incoming("quarkus-rabbitmq")
	public void process(JsonObject obj) {
		Log.info(obj.toString());
		System.out.println(obj.toString());
	}
	
}
