package com.springboot.restAPIDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RestApiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(RestApiDemoApplication.class, args);

		for (String names : applicationContext.getBeanDefinitionNames()) {
			System.out.println("****************** Beans: ***************** " + names);
		}
	}

}
