package com.example.demospringsecurity.dao;

//import ru.kata.spring.boot_security.demo.models.User;

import com.example.demospringsecurity.models.User;

import java.util.List;
import java.util.Optional;

public interface UserDao {
    void addUser(User user);
    List<User> listUsers();
    User getUser(Long id);
    void editUser(Long id, User user);
    void deleteUser(Long id);
    User findByUsername(String username);
}