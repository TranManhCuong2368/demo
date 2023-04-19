package com.example.demo.common;

import com.example.demo.presentor.dto.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = {BusinessException.class})
    ResponseEntity<ApiResponse> handleBusinessException(BusinessException exception) {
        return new ResponseEntity<>(new ApiResponse("BUSINESS_EXCEPTION", exception.getMessage(), null), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = {Exception.class})
    ResponseEntity<ApiResponse> handleBusinessException(Exception exception) {
        String message = "Bạn hãy vui lòng thử lại. Nếu vẫn không thành công, hay liên hệ CSKH theo hotline 19001009";
        return new ResponseEntity<>(new ApiResponse("SYSTEM_EXCEPTION", message, null), HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
