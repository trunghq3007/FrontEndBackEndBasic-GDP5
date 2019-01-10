package com.cmc.service;

import java.util.List;

import com.cmc.entity.User;

public interface UserService {
	void save(User user);

    static User findByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<User> getAllUser();
	
	public User login(User user);
	
	public User signup(User user);

	
}
