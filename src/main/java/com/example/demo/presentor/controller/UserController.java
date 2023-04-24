package com.example.demo.presentor.controller;


import com.example.demo.persistence.entity.User;
import com.example.demo.presentor.dto.ApiResponse;
import com.example.demo.presentor.dto.UserDto;
import com.example.demo.service.UserService;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("")
    public ApiResponse getUser(@RequestParam(required = false) String name, @RequestParam(required = false ,name = "pass_word") String password) {
        User user = userService.getUser(name, password);
        return ApiResponse.success(user);
    }
}
