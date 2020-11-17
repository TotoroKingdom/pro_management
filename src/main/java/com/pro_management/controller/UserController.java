package com.pro_management.controller;

import com.pro_management.model.User;
import com.pro_management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("insertUser")
    public String insertUser(User user){
        userService.insertUser(user);
        return "redirect:user";
    }

    @GetMapping("getByIdUser")
    public String getByIdUser(int userId, Model model){
        User user = userService.getByIdUser(userId);
        model.addAttribute("user",user);
        return "updateUser";
    }

    @GetMapping("user")
    public String listUser(Model model){
        List<User> listUser = userService.listUser();
        model.addAttribute("listUser",listUser);
        return "user";
    }

    @PostMapping("updateUser")
    public String updateUser(User user){
        userService.updateUser(user);
        return "redirect:user";
    }

    @GetMapping("deleteUser")
    public String deleteUser(int userId){
        userService.deleteUser(userId);
        return "redirect:user";
    }
}
