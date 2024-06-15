package com.example.laba3.CustomExceptions;

import org.springframework.http.HttpStatus;

public class TodoNotFoundException extends ApiException {

    public TodoNotFoundException(String str) {
        super(HttpStatus.NOT_FOUND, str);
    }
}
