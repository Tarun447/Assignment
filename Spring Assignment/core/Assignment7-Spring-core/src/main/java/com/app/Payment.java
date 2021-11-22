package com.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("paymentprocess")
public class Payment {

	@Value("#{orderDetails}")
	private Order order;

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	
	public void Display() {
		
		System.out.println(order.getPrice()+""+order.getItemName()+""+order.getAdreess());
	}
}
