package com.example.laba3.Todo;

import com.example.laba3.User.UserModel;
import jakarta.persistence.*;

@Entity
@Table(name="ToDo")
public class TodoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name="user_id")
    private UserModel user;

//    @Column(name="userid")
//    private long userid;
//    @Column(name="user_id")
//    private long user_id;

    @Column(name="title")
    private String title;

    @Column(name="text")
    private String text;

    public TodoModel(){}

    public TodoModel(UserModel user, String title, String text){
        this.title = title;
        this.text = text;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public UserModel getUser() {
        return this.user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

