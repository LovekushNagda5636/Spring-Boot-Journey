package com.example.demo.entity;

public class User {
	private String Name;
	private String userName;
	private String password;
	
	@Override
	public String toString() {
		return "User [Name=" + Name + ", userName=" + userName + ", password=" + password + "]";
	}
	public User(String Name, String userName, String password) {
		super();
		this.Name = Name;
		this.userName = userName;
		this.password = password;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}

