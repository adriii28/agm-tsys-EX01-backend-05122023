package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Party;
import com.example.demo.dto.User;

public interface IPartyDao extends JpaRepository<Party, Integer>{
	
	List<Party> findByVideogame(String videogame);

}
