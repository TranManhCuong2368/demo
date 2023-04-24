package com.example.demo.presentor.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserDto {
    private String name;
    @JsonProperty("pass_word")
    private String password;

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}
