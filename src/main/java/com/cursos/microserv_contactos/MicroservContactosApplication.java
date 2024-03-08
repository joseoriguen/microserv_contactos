package com.cursos.microserv_contactos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = {"com.cursos.controller","com.cursos.dao;","com.cursos.services"})
@EntityScan(basePackages = {"com.cursos.model"})
@EnableJpaRepositories(basePackages = {"com.cursos.dao"})
@SpringBootApplication
public class MicroservContactosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservContactosApplication.class, args);
	}

}
