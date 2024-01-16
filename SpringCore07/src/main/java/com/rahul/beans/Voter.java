package com.rahul.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component(value = "voter")
@PropertySource(value ="com/rahul/commons/application.properties")// we are fetching values form the application.properties
public class Voter {
	
	@Value("${voter.info.name}")
	private String name;
	@Value("${voter.info.age}")
	private int age;
	
	static {
		System.out.println("Voter class loading..");
	}
	
	public Voter() {
		System.out.println("voter is Instantiated");
	}
	
	@PostConstruct //  it is from javax not from spring we need to get those from mvn repository
	public void myInit() {    //this method is intentional method which we create post obj creation 
		System.out.println("Init");// it will execute after the constructor intialization happen before method call we use this
		
	}
	

	
	//Business Logic
	public String checkEligibility() {
		
		
		System.out.println("Method call with business logic");
		if(age>=18) {
			return "Hello!"+name+"You are eligible for voting";
		}else {
			return "Hello!"+name+"You are not eligible for voting";
		}
		
		
	}
	@PreDestroy    		//PreDestroy like the name it cleans the object  
	public void destroyed() { //before the spring container will clean the object you can run the
		System.out.println("Bean Destroyed.."); //code which we wanted to run before obj is destroyed
	}

}
