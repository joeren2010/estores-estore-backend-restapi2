package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication (scanBasePackages = "com")	// Enable @Restcontroller, @Service and @Repository annotation 
@EnableJpaRepositories(basePackages = "com.simplilearn.estore.repository")
@EntityScan(basePackages = "com.simplilearn.estore.entity")		// @Entity classes enable in spring boot 
public class EstoreBackendRestapi2Application {

	public static void main(String[] args) {
		SpringApplication.run(EstoreBackendRestapi2Application.class, args);
		System.out.println("Server Up");
	}
}
