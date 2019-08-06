package com.niit.dao;

import java.util.List;

import com.niit.model.User;



public interface UserDAO {
	public List<User> getUserList();
	public boolean createUser(User user);
	public User getUserById(String userId);
	public boolean updateUser(UserDAO user);
	public boolean deleteUser(int userId);
	public List<User> getUserListByName(String username);
	public User authUser(String userId,String Password);

}