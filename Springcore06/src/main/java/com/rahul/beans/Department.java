package com.rahul.beans;

public class Department {
	
	private  Integer depNo;
	private String depName;
	
	public Department() {
		System.out.println("Deparetment obj is created ");
	}

	public Department(Integer depNo, String depName) {
		super();
		this.depNo = depNo;
		this.depName = depName;
		System.out.println("Names are read");
	}


	

}
