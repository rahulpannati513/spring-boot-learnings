package com.rahul.beans;

public class Alpha {
	private Beta beta;
	
	public Alpha() {
		System.out.println("Alpha bean is created");
	}

	public void setBeta(Beta beta) {
		this.beta = beta;
		System.out.println("SetAlpha() invocked in beta obj");
		
	}
	//as we know that setter will inject after the constructor loading 
	//

//	public Alpha(Beta beta) {
//		super();
//		this.beta = beta;
//		System.out.println("alpha bean is created ");
//	}
//	
	//new we are trying constructor injection
	
	
	
	

}
