package com.example.demo.presentor.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public record ApiResponse(String error_code, String message, Object result) {

    public static ApiResponse success() {
        return new ApiResponse("success", "success", null);
    }

    public static ApiResponse success(Object result) {
        return new ApiResponse("success", "success", result);
    }
}
