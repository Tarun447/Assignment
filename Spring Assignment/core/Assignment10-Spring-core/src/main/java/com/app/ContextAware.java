package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


public class ContextAware implements ApplicationContextAware {
	ApplicationContext context;
	public ApplicationContext getContext() {
		return context;
	}
	public void setApplicationContext(ApplicationContext context)
	 {
		this.context=context;
	}
}  
