package com.rev.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rev.beans.User;
import com.rev.repository.UserDao;

@Service
public class AuthService {
	private UserDao userDao;
	
	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public User isValidUser(String username, String password) {
		User user = null;
		List<User> userList = userDao.findAll();
		if (username != null && password != null) {
			for (User u : userList) {
				if (username.equals(u.getUsername()) && password.equals(u.getPassword())) {
					user = u;
					return user;
				}
			}
		}
		return user;
	}
}
