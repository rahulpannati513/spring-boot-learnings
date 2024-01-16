package com.rahul.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rahul.beans.Voter;


public class LaunchApp {

	public static void main(String[] args) {
		System.out.println("Container Started");
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		Voter voter= (Voter) context.getBean("voter");
		System.out.println(voter.checkEligibility());

		
		context.close();
		System.out.println("Container is Stopped");
	}

}
