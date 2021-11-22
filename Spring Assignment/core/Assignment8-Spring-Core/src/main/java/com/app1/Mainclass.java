package com.app1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainclass {

	public static void main(String[] args) {
		AbstractApplicationContext con= new ClassPathXmlApplicationContext("applicationContext.xml");
		con.registerShutdownHook();
		Customer cus= (Customer) con.getBean("customer");
		System.out.println(cus);

	}

}
