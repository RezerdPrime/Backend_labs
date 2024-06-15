package com.example.laba3.CustomExceptions;

import org.springframework.http.HttpStatus;

public class UserNotFoundException extends ApiException {

    public UserNotFoundException(String str) {
        super(HttpStatus.NOT_FOUND, str);
    }

}

