package com.rahul.beans;
// It is our target class
public class Amazon {
	private CourierService service;
	

	
	public Amazon() {
		System.out.println("Amazon  obj is created");
	}
//	
//	public Amazon(CourierService service) {
//		this.service =service;
//	}
//	
	public void setService(CourierService service) {
		this.service =service;
		System.out.println("Setter is involked to perform injection");
		
	}
	
	public boolean intiateDelivery(double amount) {
		return service.services(amount);
	}

}
