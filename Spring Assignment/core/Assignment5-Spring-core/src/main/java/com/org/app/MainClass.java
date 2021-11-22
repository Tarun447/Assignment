package com.org.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/org/app/applicationContext.xml");
		Employee employee = (Employee)context.getBean("employee");

		   System.out.println("The Employee Name : " + employee.getName());
		   System.out.println("The Employee Age : " + employee.getAge());
		   System.out.println("The Employee Address : " +   employee.getAddress().getCity() + " " +employee.getAddress().getState());
		  

	}

}
