package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IPartyDao;
import com.example.demo.dto.Party;

@Service
public class IPartyServiceImpl implements IPartyService{

	@Autowired
	IPartyDao dao;
	
	@Override
	public Party findById(Integer id) {
		return dao.findById(id).get();
	}

	@Override
	public Party saveParty(Party p) {
		return dao.save(p);
	}
	
	@Override
	public List<Party> getByVideogame(String videogame) {
		return dao.findByVideogame(videogame);

	}

	

}
