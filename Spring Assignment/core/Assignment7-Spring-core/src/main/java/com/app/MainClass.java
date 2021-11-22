package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
//ApplicationContext context = new AnnotationConfigApplicationContext( AppConfig.class);
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Payment obj = (Payment) context.getBean(Payment.class,"paymentprocess");
		obj.Display();

	}

}
