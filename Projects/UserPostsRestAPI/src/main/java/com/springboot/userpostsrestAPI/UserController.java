package com.springboot.userpostsrestAPI;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/getAllUsers")
	public List<User> findAllUsers() {
		return userService.getAllUsers();
	}

	@GetMapping("/getUser/{userId}")
	public User findUser(@PathVariable long userId) {
		return userService.getUser(userId);
	}

	@PostMapping("/saveUser")
	public User createUser(@RequestBody User user) {
		return userService.saveUser(user);
	}

	@DeleteMapping("/deleteUser/{userId}")
	public User deleteUser(@PathVariable long userId) {
		return userService.deleteUser(userId);
	}
}
