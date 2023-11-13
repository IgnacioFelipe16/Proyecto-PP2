package com.FacturacionYCocinaPP2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.FacturacionYCocinaPP2.entities")
@EnableJpaRepositories(basePackages = "com.FacturacionYCocinaPP2.repositories")
@EntityScan(basePackages = "com.FacturacionYCocinaPP2.entities")
public class FacturacionYCocinaPp2Application {

	public static void main(String[] args) {
		SpringApplication.run(FacturacionYCocinaPp2Application.class, args);
	}

}
