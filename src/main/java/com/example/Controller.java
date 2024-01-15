package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public String createUser(User user){
        return this.userService.createUser(user);
    }

    @GetMapping("/user")
    public User getUser(long id){
        return this.userService.getUser(id);
    }
}
