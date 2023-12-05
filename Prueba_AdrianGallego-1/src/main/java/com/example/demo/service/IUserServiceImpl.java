package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IUserDAO;
import com.example.demo.dto.User;

@Service
public class IUserServiceImpl implements IUserService{

	@Autowired
	IUserDAO dao;
	
	@Override
	public User findById(Integer id) {
		return dao.findById(id).get();
	}

	@Override
	public User saveUser(User u) {
		return dao.save(u);
	}

	@Override
	public User findByUsername(String username) {
		return dao.findByUsername(username);
	}

}
