package com.sportyshoes.ecommerce.controller;

import com.sportyshoes.ecommerce.model.User;
import com.sportyshoes.ecommerce.repository.UserRepository;
import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/users")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping(value = { "", "/" })
    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
    }

    @PostMapping(value = { "", "/" })
    void addUser(@RequestBody User user) {
        userRepository.save(user);
    }
}
