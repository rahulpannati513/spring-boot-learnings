package com.rahul.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Launch {
	
	public static void main(String[] args) {
		//we are going with eager loading 
		//thats why we use application context

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
	}

}
