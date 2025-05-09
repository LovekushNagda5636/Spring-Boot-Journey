package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
	@Column
	private String Name;
	@Column
	private String userName;
	@Column
	private String password;
	@Id
	private String id;
	
	@Override
	public String toString() {
		return "User [Name=" + Name + ", userName=" + userName + ", password=" + password + ", id=" + id + "]";
	}
	public User() {}
	public User(String Name, String userName, String password) {
		super();
		this.Name = Name;
		this.userName = userName;
		this.password = password;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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