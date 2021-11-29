package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

	
	@GetMapping("/login/{user}/{pass}")
	public String getAuth(@PathVariable("user") String id,@PathVariable("pass") String p)
	{
		String user = "Admin";
		String pass = "1234";
		if(user.equals(id)&&pass.equals(p))
		{
			return "<h1>Login successfull</h1>";
		}
		else
		{
			return "<h1>Invalid Credential</h1>";
		}
	}
}
