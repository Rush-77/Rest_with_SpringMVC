package com.carDemo.model;

public class User {
	private int userId;
	private String username;
	private String password;
	
	public User(int userId) {
		super();
		this.userId = userId;
	}
	
		
	public User(int userId, String username, String password) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
	}

	public int getId() {
		return userId;
	}
	public void setId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Car [userId=" + userId + ", username=" + username + ", password=" + password + "]";
	}
	

}
