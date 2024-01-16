package com.rahul.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rahul.beans.GreetMe;
import com.rahul.config.JavaConfiguration;

import org.springframework.context.ApplicationContext;

public class LaunchApp {

	public static void main(String[] args) {
		
		ApplicationContext ac =new AnnotationConfigApplicationContext(JavaConfiguration.class);
		GreetMe greet=ac.getBean(GreetMe.class);
		String greetings = greet.generateGreeting("Rahul");
		System.out.println(greetings);

	}

}
