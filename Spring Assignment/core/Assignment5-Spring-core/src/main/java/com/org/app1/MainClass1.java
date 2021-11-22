package com.org.app1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass1 {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/org/app1/applicationContext.xml");
	Trail obj=(Trail) context.getBean("helloWorld");
	obj.method();


}
}
