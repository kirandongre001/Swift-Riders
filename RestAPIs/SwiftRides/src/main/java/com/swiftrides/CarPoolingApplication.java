package com.swiftrides;

	import org.springframework.boot.SpringApplication;
	import org.springframework.boot.autoconfigure.SpringBootApplication;
	import org.springframework.context.annotation.ComponentScan;
	import org.springframework.web.bind.annotation.CrossOrigin;

	@SpringBootApplication
	@ComponentScan(basePackages = "com.swiftrides.*")

	public class CarPoolingApplication {

		public static void main(String[] args) {
			SpringApplication.run(CarPoolingApplication.class, args);
		}

	}

