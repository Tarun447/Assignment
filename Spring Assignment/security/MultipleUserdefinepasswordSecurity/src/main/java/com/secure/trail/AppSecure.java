package com.secure.trail;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity

public class AppSecure extends WebSecurityConfigurerAdapter{
	
	
	

	@Bean
	@Override
	protected UserDetailsService userDetailsService() {
		
		Collection<UserDetails> users = new ArrayList<>();
		
		users.add(User.withDefaultPasswordEncoder().username("Tarun").password("1234").roles("USER").build());
		users.add(User.withDefaultPasswordEncoder().username("Ashu").password("12345").roles("USER").build());
		users.add(User.withDefaultPasswordEncoder().username("Rahul").password("5678").roles("USER").build());
		
		
		return new InMemoryUserDetailsManager(users);
	}
	
	

}
