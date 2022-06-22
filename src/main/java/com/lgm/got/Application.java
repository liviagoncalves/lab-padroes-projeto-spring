package com.lgm.got;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Gerado via Spring Initializr
 * Com os seguintes módulos
 * 		Spring Data JPA
 * 		Spring Web
 * 		H2 Database
 * 		OpenFeign
 *
 * @author liviagoncalves
 */
@EnableFeignClients
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
