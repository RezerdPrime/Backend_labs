package com.example.laba3.Todo;

import com.example.laba3.TodoDTO.GetTodoDTO;
import com.example.laba3.TodoDTO.MainDataTodoDTO;
import com.example.laba3.TodoDTO.ResponseTodoDTO;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class TodoController {

    private final ModelMapper modelMapper;

    @GetMapping("/todo/{id}")
    public ResponseEntity<GetTodoDTO> getTodo(@PathVariable Long id){

        var todo = TodoService.getTodo(id);
        var todoDTO = modelMapper.map(todo, GetTodoDTO.class);

        return ResponseEntity.ok(todoDTO);
    }

    @PostMapping("/todo/")
    public ResponseEntity<ResponseTodoDTO> createTodo(@RequestBody MainDataTodoDTO todo){

        var todo_ = modelMapper.map(todo, TodoModel.class);
        TodoService.createTodo(todo_);

        return ResponseEntity.ok(modelMapper.map(todo_, ResponseTodoDTO.class));
    }

    @PutMapping("/todo/{id}")
    public ResponseEntity<ResponseTodoDTO>
    updateTodo(@PathVariable Long id, @RequestBody MainDataTodoDTO todo){

        TodoService.updateTodo(id, todo);

        return ResponseEntity.ok(
                modelMapper.map(TodoService.getTodo(id), ResponseTodoDTO.class)
        );
    }

    @DeleteMapping("/todo/{id}")
    public ResponseEntity<ResponseTodoDTO> deleteTodo(@PathVariable Long id){

        var todoDTO = modelMapper.map(TodoService.getTodo(id), ResponseTodoDTO.class);
        TodoService.deleteTodo(id);

        return ResponseEntity.ok(todoDTO);
    }
}
