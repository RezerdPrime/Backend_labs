package com.example.laba3.UserDTO;

public class ResponseUserDTO {

    private long id;

    public ResponseUserDTO(Long id) {
        this.id = id;
    }

    public ResponseUserDTO(){};

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
