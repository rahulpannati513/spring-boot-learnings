package com.rahul.beans;

public class Beta {
	private Alpha alpha;
	public Beta() {
		System.out.println("Beta bean is created");
	}
//	public void setAlpha(Alpha alpha) {
//		this.alpha = alpha;
//		System.out.println("setBeta() invocked in Alpha Obj");
//	}
	public Beta(Alpha alpha) {
		super();
		this.alpha = alpha;
		System.out.println("Beta bean is created");
	}

}
