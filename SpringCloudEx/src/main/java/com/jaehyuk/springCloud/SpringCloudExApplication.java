package com.jaehyuk.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudExApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudExApplication.class, args);
	}

}
