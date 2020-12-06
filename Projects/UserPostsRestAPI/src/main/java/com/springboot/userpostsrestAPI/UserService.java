package com.springboot.userpostsrestAPI;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserService {

	private static List<User> userList = new ArrayList<User>();
	int userCount = 0;

	static {
		userList.add(new User((long) 1, "David", new Date()));
		userList.add(new User((long) 2, "Jaffar", new Date()));
		userList.add(new User((long) 3, "Mike", new Date()));
	}

	public List<User> getAllUsers() {
		return userList;
	}

	public User getUser(long id) {
		for (User user : userList) {
			if (user.getId() == id) {
				return user;
			}
		}
		return null;
	}

	public User saveUser(User user) {
		if (user.getId() != null) {
			userList.add(user);
		} else {
			userCount = userList.size();
			user.setId((long) ++userCount);
			userList.add(user);
		}
		return user;
	}

	public User deleteUser(long id) {
		Iterator<User> itr = userList.iterator();
		while (itr.hasNext()) {
			User user = itr.next();
			if (user.getId() == id) {
				itr.remove();
				return user;
			}
		}
		return null;
	}
}
