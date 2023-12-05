package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Party;
import com.example.demo.dto.User;
import com.example.demo.dto.UserParty;

public interface IUserPartyService {

	public List<UserParty> listAll();
	
	public UserParty newUserParty (UserParty up);
	
	public void deleteUserParty (Integer id);
}
