package com.cmc.service;

import java.util.List;

import com.cmc.entity.User;

public interface UserService {
	
	public List<User> getAllUser();
	
	public User login(User user);
	
	public User signup(User user);
}
