package com.cloudConfigueServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CloudConfigueServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfigueServerApplication.class, args);
	}

}
