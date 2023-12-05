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
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String username;
	private String user_password;
	private String steam_name;
	private String discord_name;
	
	@OneToMany
    @JoinColumn(name="id")
    private List<UserParty> userParty;
	
	public User() {
		
	}
	
	public User(int id, String username, String user_password, String steam_name, String discord_name) {
		this.id = id;
		this.username = username;
		this.user_password = user_password;
		this.steam_name = steam_name;
		this.discord_name = discord_name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public String getSteam_name() {
		return steam_name;
	}

	public void setSteam_name(String steam_name) {
		this.steam_name = steam_name;
	}

	public String getDiscord_name() {
		return discord_name;
	}

	public void setDiscord_name(String discord_name) {
		this.discord_name = discord_name;
	}
	
	

}
