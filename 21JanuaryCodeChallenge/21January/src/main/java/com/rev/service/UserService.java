package com.rev.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rev.beans.User;
import com.rev.beans.User_Role;
import com.rev.repository.UserDao;

@Service
public class UserService {
	private UserDao userDao;
	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public User findUser(String username)
	{
		User user = null;
		List<User> userList = userDao.findAll();
		if (username != null) {
			for (User u : userList) {
				if (username.equals(u.getUsername())) {
					user = u;
					return user;
				}
			}
		}
		return user;
	}
	public User findUserById(int id)
	{
		User user = null;
		List<User> userList = userDao.findAll();
		if (id != 100) {
			for (User u : userList) {
				if (id == u.getId()) {
					user = u;
					return user;
				}
			}
		}
		return user;
	}
	public List<User> findAllUser()
	{
		return userDao.findAll();
	}
	public List<User> findAllUsersByRole(int id)
	{
		return userDao.getByUserRole(new User_Role(id, null));
	}
	public void addUser(User user)
	{
		userDao.save(user);
	}
	public void updateUser(String username,String changedUsername, String password)
	{
		User u = findUser(username);
		u.setUsername(changedUsername);
		u.setPassword(password);
	}
	public void removeUser(String username)
	{
		User u = findUser(username);
		userDao.delete(u);
	}}