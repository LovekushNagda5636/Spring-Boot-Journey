package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.exception.UserNotFoundException;
import com.example.demo.repository.UserRepo;
import com.example.demo.service.Crud;

@Service
public class CrudImpl implements Crud{
		
	@Autowired
	private UserRepo user1;
	@Override
	public User createUser(User user) {
		return user1.save(user);
	}

	@Override
	public List<User> allUser() {
		return user1.findAll();
	}

	@Override
	public User updateUser(String id, User user){
		User u1 =user1.findById(id).get();
		if(user!=null){
			u1.setName(user.getName());
			u1.setUserName(user.getUserName());		
			return user1.save(u1); 
		}
		throw new UserNotFoundException("User with ID " + id + " not found.");
	}

	@Override
	public User deleteUser(String id) {
		User u1=user1.findById(id).get();
		if(u1!=null) {
			user1.delete(u1);
			return u1;
		}
		throw new UserNotFoundException("User with ID " + id + " not found.");
	}
	
}