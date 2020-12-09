package com.springboot.userpostsrestAPI;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.springboot.userexception.UserNotFoundException;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/getAllUsers")
	public List<User> findAllUsers() throws Exception {
		throw new Exception("All Users Does Not Exists!!! ");
	}

	@GetMapping("/getUser/{userId}")
	public User findUser(@PathVariable long userId) {
		User getUser = userService.getUser(userId);
		if (getUser == null) {
			throw new UserNotFoundException("User Does Not Exists!!! " + userId);
		}
		return userService.getUser(userId);
	}

	@PostMapping("/saveUser")
	public ResponseEntity createUser(@RequestBody User user) {
		User savedUser = userService.saveUser(user);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().fromPath("/getUser").path("/{id}")
				.buildAndExpand(savedUser.getId()).toUri();
		return ResponseEntity.created(location).build();
	}

	@DeleteMapping("/deleteUser/{userId}")
	public User deleteUser(@PathVariable long userId) {
		return userService.deleteUser(userId);
	}
}
