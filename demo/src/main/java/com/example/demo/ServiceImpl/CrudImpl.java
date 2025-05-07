package com.example.demo.ServiceImpl;

import com.example.demo.entity.User;
import com.example.demo.exception.UserNotFoundException;
import com.example.demo.service.Crud;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CrudImpl implements Crud {
    List<User> users = new ArrayList<>();

    @Override
    public User createUser(User user) {
        users.add(user);
        return user;
    }

    @Override
    public List<User> getAllUser() {
        return users;
    }

    @Override
    public User updateUser(String id, User user) {
        for (User u : users) {
            if (u.getId().equals(id)) {
                u.setName(user.getName());
                u.setUserName(user.getUserName());
                u.setPassword(user.getPassword());
                return u;
            }
        }
        throw new UserNotFoundException("This id:"+id+" do not exist,Please add this Id or change Id");
    }

    @Override
    public User deleteUser(String id) {
        for (User u : users) {
            if (u.getId().equals(id)) {
                users.remove(u);
                return u;
            }
        }
        throw new UserNotFoundException("This id:"+id+" do not exist,Please add this Id or change Id");
    }
}