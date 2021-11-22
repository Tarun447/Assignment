package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
public static void main(String[] args) {
	AbstractApplicationContext  context = new ClassPathXmlApplicationContext("applicationContext"
			+ ".xml");
	ContextAware appcontext= (ContextAware)context.getBean("context");
	ApplicationContext appCon =appcontext.getContext();
	Test a= (Test)appCon.getBean("pro");
	a.doTask();	
}
}
