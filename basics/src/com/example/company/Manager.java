
package com.example.company;

public class Manager {
    private String name;
    private int age;

    public Manager(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Manager Name: " + name);
        System.out.println("Manager Age: " + age);
    }
}

