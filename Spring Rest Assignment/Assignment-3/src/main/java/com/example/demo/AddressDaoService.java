package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class AddressDaoService {

	public static int usersCount=5;  
	 
	private static List<Address> users=new ArrayList<>();  
	 
	static  
	{  
	
	users.add(new Address(13, "Hyderabad","TS","INDIA"));
	users.add(new Address(22, "Banglore","KA","INDIA"));
	users.add(new Address(14, "odisha","OD","INDIA"));
	users.add(new Address(90, "kolkata","KL","INDIA"));
	
	}  
	
	public List<Address> findAll()  
	{  
	return users;  
	}  
	  
	public Address save(Address user)  
	{  
	if(user.getId()==null)  
	{  
	 
	user.setId(++usersCount);  
	}  
	users.add(user);  
	return user;  
	}  
	 
	public Address findOne(int id)  
	{  
	for(Address user:users)  
	{  
	if(user.getId()==id)  
	return user;  
	}  
	return null;  
	}  
}
