package com.example.laba3.UserDTO;

public class GetUserDTO {

    private long id;
    private String username;

    public GetUserDTO(Long id, String username) {
        this.id = id;
        this.username = username;
    }

    public GetUserDTO(){};

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}