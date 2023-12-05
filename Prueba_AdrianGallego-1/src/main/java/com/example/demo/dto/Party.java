package com.example.demo.dto;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="parties")
public class Party {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name_party;
	
	private String videogame;
	
	@OneToMany
    @JoinColumn(name="id")
    private List<UserParty> userParty;

	public Party() {
	
	}
	
	public Party(int id, String name_party, String videogame) {
		this.id = id;
		this.name_party = name_party;
		this.videogame = videogame;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName_party() {
		return name_party;
	}

	public void setName_party(String name_party) {
		this.name_party = name_party;
	}

	public String getVideogame() {
		return videogame;
	}

	public void setVideogame(String videogame) {
		this.videogame = videogame;
	}

}
