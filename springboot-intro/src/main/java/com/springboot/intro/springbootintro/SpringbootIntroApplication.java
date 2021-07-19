package com.springboot.intro.springbootintro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

// @SpringBootApplication enables Component Scan in the package; detects that it's Spring Context
@SpringBootApplication
public class SpringbootIntroApplication {

	public static void main(String[] args) {

		// returns Application Context
		ApplicationContext applicationContext = SpringApplication.run(SpringbootIntroApplication.class, args);

		for (String name : applicationContext.getBeanDefinitionNames()) {
			System.out.println(name);
		}
	}

}
