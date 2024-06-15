package com.example.laba3.TodoDTO;

import com.example.laba3.User.UserModel;
import com.example.laba3.UserDTO.GetUserDTO;

public class MainDataTodoDTO {

    private String title;

    private String text;

//    private long user_id;

    private GetUserDTO user;

    public MainDataTodoDTO(){}

    public MainDataTodoDTO(GetUserDTO user, String title, String text){
//        this.user_id = user.getId();
        this.user = user;
        this.title = title;
        this.text = text;
    }

//    public MainDataTodoDTO(String title, String text, Long user_id){
//        this.user_id = user_id;
//        this.title = title;
//        this.text = text;
//    }

//    public long getUserId() { return this.user_id; }

    public GetUserDTO getUser() {
        return this.user;
    }

    public void setUser(GetUserDTO user) {
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


