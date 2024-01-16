package com.rahul.main;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class LaunchLazyLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource = new ClassPathResource("applicationcontext.xml");
		XmlBeanFactory factory = new XmlBeanFactory(resource);
		

	}

}
