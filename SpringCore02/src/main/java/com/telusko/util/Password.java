package com.telusko.util;

import org.springframework.context.annotation.Bean;

public class Password {
	
	public Password(String algo) {
		System.out.println("Algo is used is"+algo);
	}
	
	
	public void display() {
		System.out.println("Password is created by dev still its a bean"
				+ " and managed by spring container");
	}

}
