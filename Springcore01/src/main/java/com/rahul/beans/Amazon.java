package com.rahul.beans;

public class Amazon {
	private CourierService service;
	
//	static {
//		System.out.println("Amazon Class is loaded ");
//	}
	
	public Amazon() {
		System.out.println("Amazon  obj is created");
	}
	
	public Amazon(CourierService service) {
		this.service =service;
	}
	
	public void setService(CourierService service) {
		this.service =service;
	}
	
	public boolean intiateDelivery(double amount) {
		return service.services(amount);
	}

}
