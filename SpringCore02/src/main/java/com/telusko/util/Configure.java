package com.telusko.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configure {
	
	public Configure() {
		System.out.println("configure obj is created");
	}
	@Bean
	public void generateAlgo() {
		Password p = new Password("SHA1");
	}

}
