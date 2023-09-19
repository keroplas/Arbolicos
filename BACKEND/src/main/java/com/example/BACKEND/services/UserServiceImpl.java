package com.example.BACKEND.services;

import com.example.BACKEND.entity.User;
import com.example.BACKEND.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository usersRepository;

    @Override
    @Transactional
    public List<User> findAll() {
        return usersRepository.findAll();
    }

    @Override
    @Transactional
    public Optional<User> findById(Long id) {
        return usersRepository.findById(id);
    }

    @Override
    @Transactional
    public User save(User user) {
        return usersRepository.save(user);
    }

    @Override
    public User updateUserById(Long id, User userDetails) {

            return null;

    }


    @Override
    public void deleteUserById(Long id) {
        usersRepository.deleteById(id);
    }

}
