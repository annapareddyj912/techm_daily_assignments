package com.example;

import com.example.service.UserService;
org.springframework.context.ApplicationContext;
org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Load the Spring application context from the XML configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve the UserService bean by its id
        UserService userService = (UserService) context.getBean("userService");

        // Use the UserService bean
        userService.registerUser("JohnDoe");
    }
}
