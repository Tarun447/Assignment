package com.app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

	      Test obj = (Test) context.getBean("test");
	      obj.getMessage();
	      context.registerShutdownHook();
	}

}
