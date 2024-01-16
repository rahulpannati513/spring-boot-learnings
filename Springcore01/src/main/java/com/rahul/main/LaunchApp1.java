package com.rahul.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rahul.beans.Amazon;

public class LaunchApp1 {

	public static void main(String[] args) {
	
		// we have two container bean factory and applciation contex
		// now we are using application context
		
		//application Context is a interface there are many implementing classes in application context
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		//this will give me application context as a parent 
		//spring container will need to implement 
		//we are activating the spring container to take care of obj creation and dependency creation
		//spring container which obj that it need to take care all that information we are kept in configuration file
		//in our case applicationcontext.xml
		// as we are creating creating obj any where no where right so we achieved 
		//three way to create the obj
		Amazon amz =context.getBean("amazon",Amazon.class);
		
		boolean status =amz.intiateDelivery(456.44);
		if(status) {
			System.out.println("Order Delivered");
		}else {
			System.out.println("Failed to Deliver");
		}
	
		
		

	}

}
