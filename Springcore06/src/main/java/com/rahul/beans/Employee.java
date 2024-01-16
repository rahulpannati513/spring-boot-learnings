package com.rahul.beans;

public class Employee {
	private Integer id;
	private String name;
	private Integer age;
	private Department  department;
	
	private Employee() {
		System.out.println("Employee obj is created");
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
	
	

}
