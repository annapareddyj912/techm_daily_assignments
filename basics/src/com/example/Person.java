package com.example;



public class Person {
 private String name;
 protected int age;
 private String address; // default/package-private
 
 // Constructor
 public Person(String name, int age, String address) {
     this.name = name;
     this.age = age;
     this.address = address;
 }
 
 // Getter method for name
 public String getName() {
     return name;
 }
 
 // Setter method for name
 public void setName(String name) {
     this.name = name;
 }
}
