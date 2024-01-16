package com.rahul.beans;

public class FedEx implements CourierService {
//	static {
//		System.out.println("FedEx  Class is loaded");
//	}

	public FedEx() {
		System.out.println("FedEx class obj is Created");
	}
	@Override
	public boolean services(double amnt) {
		System.out.println("Courier Delivered through FedEx and amount paid "+amnt);
		return true;
	}

}
