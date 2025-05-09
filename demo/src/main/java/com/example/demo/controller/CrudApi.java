package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ServiceImpl.CrudImpl;
import com.example.demo.entity.User;

@RestController
@RequestMapping("/users")
public class CrudApi{
	@Autowired
	private CrudImpl impl;
	@PostMapping("/user")
	public User createUser(@RequestBody User user){
		user=impl.createUser(user);
		return user;
	}
	@GetMapping("/user")
	public List<User> allUser(){
		return impl.allUser();
	}
	@PutMapping("/user/{id}")
	public User updateUser(@PathVariable String id,@RequestBody User user)
	{
		return impl.updateUser(id, user);
	}
	@DeleteMapping("/user/{id}")
	public User deleteUser(@PathVariable String id)
	{
		return impl.deleteUser(id);
	}
}