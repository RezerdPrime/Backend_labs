package com.example.laba3.User;

import jakarta.persistence.*;

@Entity
@Table(name="Users")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="username")
    private String username;

    @Column(name="password")
    private String password;

    public UserModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public UserModel(){};

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
