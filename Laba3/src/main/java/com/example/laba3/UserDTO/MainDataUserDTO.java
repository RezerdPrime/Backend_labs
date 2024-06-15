package com.example.laba3.UserDTO;

public class MainDataUserDTO {

    private String username;
    private String password;

    public MainDataUserDTO(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public MainDataUserDTO(){};


    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }


    public void setUsername(String username) { this.username = username; }

    public void setPassword(String password) {
        this.password = password;
    }
}
