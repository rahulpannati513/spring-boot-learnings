package com.rahul.bean;

public class Employee {
	private Integer empid;
	private String empName;
	private String empCity;
	private Float empSalary;
	static {
		System.out.println("Employee class is loaded");
		
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", empCity=" + empCity + ", empSalary=" + empSalary
				+ "]";
	}
	public Employee() {
		System.out.println("Emp bean is created");
	}
	public Employee(Integer empid, String empName, String empCity, Float empSalary) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.empCity = empCity;
		this.empSalary = empSalary;
		System.out.println("Parameter empl Constructor is invocked");
	}
	
	public String empActivity() {
		System.out.println("Employee usually sleep at office hour after lunch ");
		return "If Manager is around Emp will try to act active";
	}
	

}
