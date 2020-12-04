package com.springboot.userpostsrestAPI;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserService {

	private static List<User> userList = new ArrayList<User>();

	static {
		userList.add(new User(1, "David", new Date()));
		userList.add(new User(2, "Jaffar", new Date()));
		userList.add(new User(3, "Mike", new Date()));
	}

	public List<User> getAllUsers() {
		return userList;
	}
}
