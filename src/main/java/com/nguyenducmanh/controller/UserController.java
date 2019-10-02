package com.nguyenducmanh.controller;

import com.nguyenducmanh.entity.User;
import com.nguyenducmanh.model.request.UserRequest;
import com.nguyenducmanh.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> getAllUser(){
        List<User> users = userService.findAll();
        return users;
    }
    @GetMapping("/managerUser")
    public List<User> getManagerUser(){
        List<User> users=userService.findManagerUser();
        return users;
    }

    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public ResponseEntity<Void> insert(@RequestBody UserRequest userRequest){
        userService.insert(userRequest);
        return ResponseEntity.noContent().build();
    }
}
