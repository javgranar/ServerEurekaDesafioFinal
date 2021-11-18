package com.everis.bootcamp.src;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerSeparadoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerSeparadoApplication.class, args);
	}

}
