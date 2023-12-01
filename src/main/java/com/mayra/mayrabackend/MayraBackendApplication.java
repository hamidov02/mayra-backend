package com.mayra.mayrabackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MayraBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(MayraBackendApplication.class, args);
	}

}
