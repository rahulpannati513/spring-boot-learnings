package com.rahul.beans;

public class BlueDart implements CourierService{
//	static {
//		System.out.println("BlueDart  Class is loaded");
//	}

	public BlueDart() {
		System.out.println("BlueDart class obj is Created");
	}
	@Override
	public boolean services(double amnt) {
		System.out.println("Courier Delivered through FirstFlight and amount paid is "+amnt);
		
		return true;
	}
	

}
