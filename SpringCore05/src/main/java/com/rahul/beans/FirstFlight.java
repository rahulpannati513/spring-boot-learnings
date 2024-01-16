package com.rahul.beans;

public class FirstFlight implements CourierService {
	
public FirstFlight() {
	System.out.println("First class obj is Created");
}
	@Override
	public boolean services(double amnt) {
		
		System.out.println("Courier delivered through FirstFlight and amoutn paid is "+amnt);
		return true;
	}

}
