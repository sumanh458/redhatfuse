package com.suman;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

import com.processor.MyProcessor;

@Component
public class StudentRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		System.out.println("suman in route");
		restConfiguration().component("servlet").bindingMode(RestBindingMode.json);

		rest("/student").produces("application/json").get("/hello/{name}").route().transform()
				.simple("Hello ${header.name}, Welcome to Suman Kingdom").endRest()

				.get("/records/{name}").to("direct:records");
		from("direct:records").process(new MyProcessor());		
	}

}
