package com.suman;

import org.apache.camel.component.servlet.CamelHttpTransportServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	@Bean
	ServletRegistrationBean servletRegistrationBean() {
	final ServletRegistrationBean servlet = new ServletRegistrationBean(
	new CamelHttpTransportServlet(), "/javaoutofbounds/*");
	servlet.setName("CamelServlet");
	return servlet;
	}
	

}


