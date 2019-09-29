package com.niit.dao;

import java.util.List;

import com.niit.model.User;

public interface UserDAO {
	public List<User> getUserList();
	public boolean createUser(User user);
	public User getUserById(String userId);
	public boolean updateUser(User user);
	public boolean deleteUser(User user);
	public List<User> getUserListByName (String username);
	public User authUser (String userId, String password);
		
}
