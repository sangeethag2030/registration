package com.example.springboot.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.model.Users;
import com.example.springboot.repository.UserJpaRepository;
import com.example.springboot.repository.UserRepository;


@Service
public class UserJpaService implements UserRepository {

    @Autowired
    private UserJpaRepository userJpaRepository;
    @Override
    public Users addUser(Users user) {
        userJpaRepository.save(user);
        return user;

    }
    @Override
    public Users updatePassword() {
        // TODO Auto-generated method stub
        return null;
    }

}
