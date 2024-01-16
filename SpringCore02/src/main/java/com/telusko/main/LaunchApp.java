package com.telusko.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//these two are not getting in the import option i have to hard code these imports

import com.telusko.util.Password;


public class LaunchApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		Password p =context.getBean(Password.class);
		p.display();
	}

}
