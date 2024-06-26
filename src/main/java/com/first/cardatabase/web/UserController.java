package com.first.cardatabase.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.first.cardatabase.domain.User;
import com.first.cardatabase.domain.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class UserController {
    @Autowired
    UserRepository UserRepos;

    @GetMapping("/users")
    public Iterable<User> getMethodName() {
        return UserRepos.findAll();
    }

}
