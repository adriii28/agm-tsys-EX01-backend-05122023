package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Party;

public interface IPartyService {
	public Party findById(Integer id);
	
	public Party saveParty (Party p);
	
	public List<Party> getByVideogame(String videogame);
}
