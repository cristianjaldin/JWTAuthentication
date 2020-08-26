package com.example.JWTAuthentication.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;

@RestController
@RequestMapping("/api")
public class ResourceController {
	
	@GetMapping("/data")
	@ApiOperation (value = "Get dummy by id.", authorizations = { @Authorization(value="apiKey") })
	public ResponseEntity<?> getInformacionBancaria(){

		return new ResponseEntity<>("secret data", HttpStatus.OK);
		
	}
	
}
