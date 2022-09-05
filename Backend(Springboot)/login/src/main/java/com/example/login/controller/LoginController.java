package com.example.login.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.login.entity.Login;
import com.example.login.repository.LoginRepository;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	LoginRepository loginRepository;
	
	@GetMapping("/user")
	public List<Login> getLogin() {
		List<Login> loginlist = loginRepository.findAll();
		System.out.println(loginlist);
		return loginlist;
	}
	
	@PostMapping("/loginUser")
	public ResponseEntity<?> loginUser(@RequestBody Login userData){
		System.out.println(userData);
		Login user=loginRepository.findByEmail(userData.getEmail());
		if(user.getPassword().equals(userData.getPassword()))
			return ResponseEntity.ok(user);
		
		return (ResponseEntity<?>) ResponseEntity.internalServerError();
	}
	
}
