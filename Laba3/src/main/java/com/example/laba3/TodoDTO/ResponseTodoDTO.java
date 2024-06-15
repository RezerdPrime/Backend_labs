package com.example.laba3.TodoDTO;

public class ResponseTodoDTO {

    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ResponseTodoDTO(Long id) {
        this.id = id;
    }

    public ResponseTodoDTO(){};
}
