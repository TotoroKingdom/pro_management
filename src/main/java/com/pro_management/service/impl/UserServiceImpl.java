package com.pro_management.service.impl;

import com.pro_management.mapper.UserMapper;
import com.pro_management.model.User;
import com.pro_management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void insertUser(User user) {
        userMapper.insertUser(user);
    }

    @Override
    public User getByIdUser(int userId) {
        return userMapper.getByIdUser(userId);
    }

    @Override
    public List<User> listUser() {
        return userMapper.listUser();
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    @Override
    public void deleteUser(int userId) {
        userMapper.deleteUser(userId);
    }
}
