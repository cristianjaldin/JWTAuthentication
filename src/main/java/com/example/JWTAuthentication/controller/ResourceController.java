package com.example.JWTAuthentication.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ResourceController {
	
	@GetMapping("/data")
	public ResponseEntity<?> getInformacionBancaria(){
		List<String> data = Arrays.asList("Cristian", "Juan", "Pedro");
		return new ResponseEntity<>(data, HttpStatus.OK);
		
	}
	
}
