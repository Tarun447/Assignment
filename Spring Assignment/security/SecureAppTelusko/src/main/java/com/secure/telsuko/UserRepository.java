package com.secure.telsuko;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {

//	User find By user Name
	User findByUsername(String username);
}
