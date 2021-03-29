package com.udemy.ecomdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.udemy.ecomdashboard.entity")
@EnableJpaRepositories(basePackages = "com.udemy.ecomdashboard.repositories")
public class EcomdashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcomdashboardApplication.class, args);
	}

}
