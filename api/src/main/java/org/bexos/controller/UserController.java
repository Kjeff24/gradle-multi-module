package org.bexos.controller;

import org.bexos.dto.UserRequest;
import org.bexos.model.User;
import org.bexos.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User addUser(@RequestBody UserRequest userRequest) {
        return userService.addUser(userRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<User> getAllUsers() {
        return userService.findAllUsers();
    }

    @GetMapping("/{userId}")
    @ResponseStatus(HttpStatus.OK)
    public User getUserById(@PathVariable("userId") Integer userId) {
        return userService.findUserById(userId);
    }

}
