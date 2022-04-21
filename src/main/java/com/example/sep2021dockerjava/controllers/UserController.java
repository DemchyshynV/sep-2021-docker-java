package com.example.sep2021dockerjava.controllers;

import com.example.sep2021dockerjava.dao.UserRepository;
import com.example.sep2021dockerjava.models.UserModel;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {
    private UserRepository userRepository;

    @GetMapping
    public List<UserModel> getAll(){
        return userRepository.findAll();
    }

    @PostMapping
    public UserModel create(@RequestBody UserModel user){
        return userRepository.save(user);
    }
}
