package com.priyanshu.Springboot_01.main;

import com.priyanshu.Springboot_01.services.Greeting;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = "com.priyanshu.Springboot_01")
public class Springboot01Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(Springboot01Application.class, args);

	}

}
