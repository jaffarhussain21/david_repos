package com.springboot.userpostsrestAPI;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/getAllUsers")
	public List<User> findAllUsers(){
		return userService.getAllUsers();		
	}

}
