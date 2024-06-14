package com.example;

import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {
    public void registerUser(String username) {
        System.out.println("User registered: " + username);
    }
}
