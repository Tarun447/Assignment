package com.secure.telsuko;

import javax.persistence.Entity;
import javax.persistence.Id;

// Db Intraction Class
@Entity
public class User {

	@Id
	private String id;
	private String username;
	private String Password;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
}
