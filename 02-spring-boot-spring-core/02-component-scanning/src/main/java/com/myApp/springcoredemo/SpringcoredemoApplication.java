package com.myApp.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//below annotation composed of --> @EnableAutoConfiguration, @ComponentScan, @Configuration
//@EnableAutoConfiguration --> Enables Spring Boot's auto-configuration support
//@ComponentScan --> Enables components scanning of current package. Also, recursively scans sub-packages
//@Configuration --> Able to register extra bean with @Bean or import other configuration classes.

//@SpringBootApplication(
//        scanBasePackages = {"com.myApp.springcoredemo",
//        "com.myApp.util"}
//)

//if we have use package(i.e com.myApp.util) which is outside our
// current package(com.myApp.springcoredemo) then we have to explicitly define it under
//@SpringBootApplication (as shown above).

@SpringBootApplication
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
