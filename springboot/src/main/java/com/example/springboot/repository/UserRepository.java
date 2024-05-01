package com.example.springboot.repository;

import com.example.springboot.model.Users;

public interface UserRepository {
    Users addUser(Users user);
    Users updatePassword();

}
