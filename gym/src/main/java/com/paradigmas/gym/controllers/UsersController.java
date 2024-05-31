package com.paradigmas.gym.controllers;

import com.paradigmas.gym.models.User;
import com.paradigmas.gym.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UsersController {
    @Autowired
    private final UserService userService;

    @PostMapping
    public User addUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userService.readAllUsers();
    }

    @GetMapping("/{cpf}")
    public User getUserByCpf(@PathVariable String cpf) {
        return userService.findUserByCpf(cpf);
    }

    @GetMapping("/{name}")
    public User getUserByName(@PathVariable String name) {
        return userService.findByName(name);
    }

}
