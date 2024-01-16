package com.rahul.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rahul.bean.Employee;

public class LaunchApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");

Employee e = context.getBean("emp1",Employee.class);
System.out.println(e.empActivity());
System.out.println("********************************");

Employee e1 = context.getBean("emp1",Employee.class);
System.out.println(e1.empActivity());
System.out.println("********************************");

Employee e2 = context.getBean("emp1",Employee.class);
System.out.println(e2.empActivity());
System.out.println("********************************");

Employee e3 = context.getBean("emp1",Employee.class);
System.out.println(e3.empActivity());
System.out.println("********************************");



	}


}
