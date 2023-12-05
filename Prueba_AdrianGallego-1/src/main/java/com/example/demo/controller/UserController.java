package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.RegisterDTO;
import com.example.demo.dto.User;
import com.example.demo.service.IUserServiceImpl;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	IUserServiceImpl impl;
	
	//RF1
	@PostMapping("/register")
	public ResponseEntity<User> registerUser(@RequestBody RegisterDTO user){
		User u = new User();

		u.setUsername(user.getUsername());
		u.setUser_password(user.getUser_password());
		
		return ResponseEntity.ok(impl.saveUser(u));
		
	}
	
	//RF2
	@PostMapping("/login")
	public ResponseEntity<String> loginUser(@RequestBody RegisterDTO user) {
		User uExist = impl.findByUsername(user.getUsername());
		System.out.println(uExist);
		if (uExist != null) {
	        return ResponseEntity.status(HttpStatus.FOUND).body("Has iniciado session correctamente");
		}
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Inicio de session fallido \nUsuario no encontrado");
	    
	}
	
	//RF8
	@PutMapping("/editProfile/{id_user}")
	public ResponseEntity<User> editProfile (@PathVariable(name="id_user") Integer id, @RequestBody User u){
		User u1 = impl.findById(id);
		User u2 = new User();
		
		u1.setUsername(u.getUsername());
		u1.setUser_password(u.getUser_password());
		u1.setDiscord_name(u.getDiscord_name());
		u1.setSteam_name(u.getSteam_name());
		
		u2 = impl.saveUser(u1);
		return ResponseEntity.ok(u2);
		
	}

}
