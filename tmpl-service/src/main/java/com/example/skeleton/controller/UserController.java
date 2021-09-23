package com.example.skeleton.controller;


import com.example.skeleton.model.dto.UserDto;
import com.example.skeleton.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Slf4j
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<UserDto> getUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/users")
    public UserDto addUser(@RequestBody @Valid UserDto userDto) {
        return userService.addUser(userDto);
    }

    @PutMapping("/users/{userId}")
    public UserDto updateUser(@PathVariable Long userId,
                              @RequestBody @Valid UserDto userDto) {
        return userService.changeUser(userId, userDto);
    }

}
