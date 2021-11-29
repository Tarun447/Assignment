package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

	

	@Autowired  
	private AddressDaoService service;  
	@GetMapping("/add")  
	public List<Address> retriveAllUsers()  
	{  
	return service.findAll();  
	}  
	@GetMapping("/add/{id}")  
	public Address retriveUser(@PathVariable int id)  
	{  
	return service.findOne(id);  
	}  
}
