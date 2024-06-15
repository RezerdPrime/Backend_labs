package com.example.laba3.Todo;

import com.example.laba3.CustomExceptions.TodoNotFoundException;
import com.example.laba3.TodoDTO.MainDataTodoDTO;
import com.example.laba3.User.UserModel;
import com.example.laba3.User.UserService;
import com.example.laba3.UserDTO.GetUserDTO;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TodoService {
    private static TodoRepository todoRep;
//    private static final ModelMapper modelMapper = new ModelMapper();

    @Autowired
    public TodoService(TodoRepository todoRep) {
        TodoService.todoRep = todoRep;
    }

    public static void createTodo(TodoModel todo){
        todoRep.save(todo);
    }

    public static TodoModel getTodo(Long id){
        return todoRep.findById(id).orElseThrow(
                () -> new TodoNotFoundException("Задача не найдена, сорян")
        );
    }

    public static void updateTodo(Long id, MainDataTodoDTO todo){
        TodoModel searched_todo = getTodo(id);

        String newtitle = todo.getTitle();
        String newtext = todo.getText();
//        GetUserDTO newowner = todo.getUser();
        UserModel newowner = UserService.getUser(todo.getUser().getId());

        searched_todo.setTitle(newtitle);
        searched_todo.setText(newtext);
        searched_todo.setUser(newowner);

        todoRep.save(searched_todo);
    }

    public static void deleteTodo(Long id){
        TodoModel searched_todo = getTodo(id);
        todoRep.delete(searched_todo);
    }
}
