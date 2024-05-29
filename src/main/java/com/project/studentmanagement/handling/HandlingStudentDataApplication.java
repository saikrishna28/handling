package com.project.studentmanagement.handling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableSwagger2
public class HandlingStudentDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(HandlingStudentDataApplication.class, args);
	}
//	@Bean
//	public Docket productApi() {
//		return new Docket(DocumentationType.SWAGGER_2).select()
//				.apis(RequestHandlerSelectors.basePackage("com.tutorialspoint.swaggerdemo")).build();
//	}
}
