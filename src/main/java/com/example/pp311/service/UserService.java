package com.example.pp311.service;


import com.example.pp311.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User getUserById(Long id);

    void saveUser(User user);

    void deleteUser(Long id);

}
