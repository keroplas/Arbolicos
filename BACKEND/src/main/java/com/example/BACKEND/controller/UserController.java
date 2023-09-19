package com.example.BACKEND.controller;


import com.example.BACKEND.entity.User;
import com.example.BACKEND.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
@CrossOrigin("*")

public class UserController {
    @Autowired
    private UserServiceImpl userServiceImpl;
    @Autowired
    private UserServiceImpl userService;

    @PostMapping("/save")
    public User saveUser(@RequestBody User user) {
        return (userServiceImpl.save(user));
    }

    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable Long id) {
        return (userServiceImpl.findById(id));
    }

    @GetMapping
    public List<User> findAll() {
        return (userServiceImpl.findAll());

    }

    @PutMapping("/{id}")
    public User updateUserById(@PathVariable Long id, @RequestBody User userDetails) {

        Optional<User> toUpdateUser =userService.findById(id);

        if (toUpdateUser.isPresent()) {
            User user = toUpdateUser.get();
            user.setUsername(userDetails.getUsername());
            user.setDirection(userDetails.getDirection());
            user.setPopulation(userDetails.getPopulation());
            user.setProvince(userDetails.getProvince());
            user.setCp(userDetails.getCp());
            user.setEmail(userDetails.getEmail());
            user.setPhone(userDetails.getPhone());
            user.setInfo(userDetails.getInfo());
            return userService.save(user);
        }else {
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable Long id) {
        userServiceImpl.deleteUserById(id);
    }


}
