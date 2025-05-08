package com.example.demo.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.service.UserService;
import com.example.demo.entity.User;

@Service
public class ServiceImpl implements UserService {
	List<User> li=new ArrayList<>(); 
	@Override
	public User createUser(User user) {
		li.add(user);
		return user;
	}
}