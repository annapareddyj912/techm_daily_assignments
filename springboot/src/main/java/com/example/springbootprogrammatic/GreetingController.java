package com.example.springbootprogrammatic;
@RestController
static class GreetingController {

    @GetMapping("/greet")
    public String greet() {
        return "Hello, welcome to Spring Boot!";
    }
}
