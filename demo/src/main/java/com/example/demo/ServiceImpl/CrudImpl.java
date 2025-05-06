package com.example.demo.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.service.Crud;
import com.example.demo.entity.User;

@Service
public class CrudImpl implements Crud{
		
	List<User> li=new ArrayList<>();
	@Override
	public User createUser(User user) {
		li.add(user);
		return user;
	}

	@Override
	public List<User> allUser() {
		return li;
	}

	@Override
	public User updateUser(String id, User user) {
		for(User u:li){
			if(u.getId().equals(id)){
				u.setName(user.getName());
				u.setUserName(user.getUserName());
				return u;
			}
		}
		return null;
	}

	@Override
	public User deleteUser(String id) {
		for(User u:li){
			if(u.getId().equals(id)){
				li.remove(u);
				return u;
			}
		}
		return null;
	}
	
}