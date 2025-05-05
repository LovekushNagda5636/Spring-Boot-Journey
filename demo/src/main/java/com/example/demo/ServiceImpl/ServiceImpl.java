package com.example.demo.ServiceImpl;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;


@Service
public class ServiceImpl implements UserService {
	List<User> li=new ArrayList<>(); 
	public User createUser(User user) {
		li.add(user);
		return user;
	}
}
