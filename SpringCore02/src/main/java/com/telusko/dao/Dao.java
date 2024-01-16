package com.telusko.dao;

import org.springframework.stereotype.Repository;

@Repository(value="repo")
public class Dao {

	public Dao(){
		System.out.println("Dao obj is created");
	}

}
