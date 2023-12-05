package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Party;
import com.example.demo.dto.User;
import com.example.demo.dto.UserParty;
import com.example.demo.service.IPartyServiceImpl;
import com.example.demo.service.IUserPartyServiceImpl;
import com.example.demo.service.IUserServiceImpl;

@RestController
@RequestMapping("/partyuser")
public class UserPartyController {

	@Autowired
	IUserPartyServiceImpl impl;
	
	@Autowired
	IUserServiceImpl userImpl;
	
	@Autowired
	IPartyServiceImpl partyImpl;

	//RF5
	@PostMapping("/join/{idUser}/{idParty}")
	public UserParty joinParty (@PathVariable(name="idUser")Integer id_user, @PathVariable(name="idParty") Integer id_party) {
		UserParty userParty = new UserParty();
		User u = userImpl.findById(id_user);
		Party p = partyImpl.findById(id_party);
		
		userParty.setUser(u);
		userParty.setParty(p);
		
		return impl.newUserParty(userParty);
		
	}
	
	//RF5
	@DeleteMapping("/leave/{idUserParty}")
	public void leaveParty (@PathVariable(name="idUserParty")Integer idUserParty) {
		
		impl.deleteUserParty(idUserParty);
		
	}
}
