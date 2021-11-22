package com.org.app;

import javax.inject.Inject;

public class Employee {
	private String name;
	private int age;

	@Inject
	private Address address;

	public Employee() {

	}

	public String getName() {
	return name;
	}

	public void setName(String name) {
	this.name = name;
	}

	public int getAge() {
	return age;
	}

	public void setAge(int age) {
	this.age = age;
	}

	public Address getAddress() {
	return address;
	}

	public void setAddress(Address address) {
	this.address = address;
	}

}
