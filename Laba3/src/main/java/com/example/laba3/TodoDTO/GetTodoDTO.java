package com.example.laba3.TodoDTO;

import com.example.laba3.User.UserModel;
import com.example.laba3.UserDTO.GetUserDTO;

public class GetTodoDTO {

    private long id;
    private GetUserDTO user;
    private String title;

    public GetTodoDTO(){}

    public GetTodoDTO(Long id, GetUserDTO user, String title){
        this.id = id;
        this.user = user;
        this.title = title;
    }

//    public GetTodoDTO(Long id, long userid, String title){
//        this.id = id;
//        this.user_id = userid;
//        this.title = title;
//    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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
}
