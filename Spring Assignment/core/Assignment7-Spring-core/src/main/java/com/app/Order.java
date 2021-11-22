package com.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("orderDetails")
public class Order {
	@Value("Mobile")
	private String itemName;
	@Value("20000")
	private String price;
	@Value("Bhubaneswar")
	private String adreess;
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getAdreess() {
		return adreess;
	}
	public void setAdreess(String adreess) {
		this.adreess = adreess;
	}
}
