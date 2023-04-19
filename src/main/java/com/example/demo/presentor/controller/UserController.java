package com.example.demo.presentor.controller;


import com.example.demo.presentor.dto.ApiResponse;
import com.example.demo.presentor.dto.UserDto;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("")
    public ApiResponse createUser(@RequestBody UserDto userDto) {
        userService.createUser(userDto);
        return ApiResponse.success();
    }
}
