package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IUserPartyDao;
import com.example.demo.dto.Party;
import com.example.demo.dto.User;
import com.example.demo.dto.UserParty;

@Service
public class IUserPartyServiceImpl implements IUserPartyService{

	@Autowired
	IUserPartyDao dao;
	
	@Override
	public List<UserParty> listAll() {
		return dao.findAll();
	}

	@Override
	public UserParty newUserParty(UserParty up) {
		return dao.save(up);
	}

	@Override
	public void deleteUserParty(Integer id) {
		dao.deleteById(id);
		
	}
	
	

}
