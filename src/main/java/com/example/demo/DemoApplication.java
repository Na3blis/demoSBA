package com.example.demo;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	ResourceConfig getJerseyConfig() {
		HashMap<String, Object> jerseyProperties = new HashMap();
		jerseyProperties.put(ServletProperties.FILTER_FORWARD_ON_404, true);
		return new ResourceConfig().setProperties(jerseyProperties);

	}
}
