package com.example.JWTAuthentication.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.JWTAuthentication.model.JwtUser;
import com.example.JWTAuthentication.model.Login;
import com.example.JWTAuthentication.security.JwtGenerator;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/token")
public class JWTController {
	
	private JwtGenerator jwtGenerator;
	
	public JWTController(JwtGenerator jwtGenerator) {
		this.jwtGenerator = jwtGenerator;
	}
	
	@PostMapping
	public ResponseEntity<?> generate(@RequestBody final Login login){
		JwtUser jwtUser = new JwtUser();
		jwtUser = existUser(login);
		if(jwtUser != null) {
			List<String> lista = new ArrayList<>();
			lista.add(jwtGenerator.generate(jwtUser));
			return new ResponseEntity<List<String>>(lista, HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
		}
	}

	private JwtUser existUser(Login login) {
		if(login.getUser().equals("cjaldin") && login.getPassword().equals("1234")) {
			JwtUser jwtUser = new JwtUser();
			jwtUser.setUsername(login.getUser());
			jwtUser.setId(1);
			jwtUser.setRole("Admin");
			return jwtUser;
			
		}else {
			return null;
		}
	}
}
