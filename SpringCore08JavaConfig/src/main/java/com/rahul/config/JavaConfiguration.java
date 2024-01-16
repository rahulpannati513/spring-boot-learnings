package com.rahul.config;



import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.rahul"})
public class JavaConfiguration {
	
	public JavaConfiguration() {
		System.out.println("Java config Instaintiated");
	
	}
	
	@Bean
	public LocalDateTime createBean() {
		System.out.println("LocalDateTime obj is dev");
		return LocalDateTime.now();
	}
	

}
