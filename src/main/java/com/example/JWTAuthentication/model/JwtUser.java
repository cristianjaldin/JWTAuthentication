package com.example.curso.model;

public class JwtUser {
	private String username;
	private long id;
	private String role;
	
	public String getUsername() {
		return userName;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}
