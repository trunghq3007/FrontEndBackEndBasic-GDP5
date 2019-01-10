package com.cmc.dao;

import java.util.List;

import com.cmc.entity.User;

public interface UserDao {
	
	public List<User> getAllUser();
	
	public User login(User user);
	
	public User signup(User user);
}
