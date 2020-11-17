package com.pro_management.service;

import com.pro_management.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface UserService {

    public void insertUser(User user);
    public User getByIdUser(int userId);
    public List<User> listUser();
    public void updateUser(User user);
    public void deleteUser(int userId);
}
