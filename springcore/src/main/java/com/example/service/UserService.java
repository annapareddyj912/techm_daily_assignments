package com.example.service;

public class UserService {
    private UserDao userDao;

    // Default constructor
    public UserService() {}

    // Setter method
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void registerUser(String username) {
        userDao.saveUser(username);
        System.out.println("User registered: " + username);
    }
}

package com.example.dao;

public class UserDao {
    public void saveUser(String username) {
        // Logic to save the user
        System.out.println("User saved: " + username);
    }
}
