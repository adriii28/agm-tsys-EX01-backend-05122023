package com.example.demo.dto;

public class PartyDTO {

	private String name;
	
	private String videogame;

	public PartyDTO() {
	
	}

	public PartyDTO(String name, String videogame) {
		super();
		this.name = name;
		this.videogame = videogame;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVideogame() {
		return videogame;
	}

	public void setVideogame(String videogame) {
		this.videogame = videogame;
	}
	

}
