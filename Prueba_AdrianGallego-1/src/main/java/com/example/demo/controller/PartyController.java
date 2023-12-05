package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Party;
import com.example.demo.dto.PartyDTO;
import com.example.demo.service.IPartyServiceImpl;

@RestController
@RequestMapping("/party")
public class PartyController {
	
	@Autowired
	IPartyServiceImpl impl;
	
	//RF3
	@PostMapping("/addNew")
	public ResponseEntity<Party> createParty (@RequestBody PartyDTO party ) {
		
		Party p = new Party();
		
		p.setName_party(party.getName());
		p.setVideogame(party.getVideogame());
		
		return ResponseEntity.ok(impl.saveParty(p));
		
	}
	
	//RF4
	@GetMapping("/game/{name}")
	public List<Party> listByGame (@PathVariable(name="name") String videogame){
		return impl.getByVideogame(videogame);
		
	}

}
