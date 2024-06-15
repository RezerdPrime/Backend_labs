package com.example.laba3.CustomExceptions;

//import com.example.laba3.TodoDTO.*;
//import com.example.laba3.UserDTO.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(ApiException.class)
    public ResponseEntity<String> handleCreationException(
            ApiException exception
    ) {
//        var error = ErrorDto.builder()
//                .message(exception.getMessage())
//                .build();
//
//        var result = new ErrorResponseDto().setError(error);
//
//        return ResponseEntity
//                .status(exception.getHttpStatus())
//                .body(result);

        var error = exception.getMessage();
        return ResponseEntity
                .status(exception.getHttpStatus())
                .body(error);

    }

}