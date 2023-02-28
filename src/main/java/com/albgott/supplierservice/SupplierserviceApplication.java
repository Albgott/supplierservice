package com.albgott.supplierservice;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

import java.util.TimeZone;

@SpringBootApplication
@RefreshScope
public class SupplierserviceApplication {

	@PostConstruct
	void init() {
		TimeZone.setDefault(TimeZone.getTimeZone("GMT"));
	}

	public static void main(String[] args) {
		SpringApplication.run(SupplierserviceApplication.class, args);
	}

}
