package com.rahul.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rahul.beans.Amazon; 
public class LaunchApp {
	
	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		//applicationcontex is a eagerloading so it will create all the beans it self 
		// now we want amazon class collect it and call some of our cutom methods ...
		//
		Amazon amazon=context.getBean("amazon",Amazon.class);
		
		boolean status=amazon.intiateDelivery(34);
		
		if(status)
			System.out.println("Deliverd succesfull");
		else
			System.out.println("Failed to Deliver");
	}
	

}
