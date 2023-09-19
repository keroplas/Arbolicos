package com.example.BACKEND.services;

import com.example.BACKEND.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    public List<User> findAll();

    public Optional<User> findById(Long id);

    public User save(User user);

    public User updateUserById(Long id, User userDetails);

    public void deleteUserById(Long id);
}
