package com.application.architecture.applicationArchitecture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.application.architecture.Hello;

@SpringBootApplication
public class ApplicationArchitectureApplication {

	public static void main(String[] args) {
		Hello hello = new Hello();
		hello.setData("hello");
		String data = hello.getData();
		System.out.println(data);

		SpringApplication.run(ApplicationArchitectureApplication.class, args);
	}

}
