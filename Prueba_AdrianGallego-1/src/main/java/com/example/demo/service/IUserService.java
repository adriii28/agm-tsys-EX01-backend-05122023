package com.example.demo.service;

import com.example.demo.dto.User;

public interface IUserService {

	public User findById(Integer id);
	
	public User saveUser(User u);
	
	public User findByUsername(String username);

}
