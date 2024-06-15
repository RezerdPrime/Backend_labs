package com.example.laba3.User;

//import com.example.ab3.Exceptions.BannedUserException;
//import com.example.ab3.Exceptions.EmptyInputException;
//import com.example.ab3.Exceptions.UserNotFoundException;

import com.example.laba3.UserDTO.MainDataUserDTO;
import com.example.laba3.UserDTO.GetUserDTO;
import com.example.laba3.UserDTO.ResponseUserDTO;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final ModelMapper modelMapper;

    @GetMapping("/user/{id}")
    public ResponseEntity<GetUserDTO> getUser(@PathVariable Long id){

        var user = UserService.getUser(id);
        var userDTO = modelMapper.map(user, GetUserDTO.class);

        return ResponseEntity.ok(userDTO);
    }

    @PostMapping("/user/")
    public ResponseEntity<ResponseUserDTO> createUser(@RequestBody MainDataUserDTO user){

        var user_ = modelMapper.map(user, UserModel.class);
        UserService.createUser(user_);

        return ResponseEntity.ok(modelMapper.map(user_, ResponseUserDTO.class));
    }

    @PutMapping("/user/{id}")
    public ResponseEntity<ResponseUserDTO>
    updateUser(@PathVariable Long id, @RequestBody MainDataUserDTO user){

        UserService.updateUser(id, user);

        return ResponseEntity.ok(
                modelMapper.map(UserService.getUser(id), ResponseUserDTO.class)
        );
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<ResponseUserDTO> deleteUser(@PathVariable Long id){

        var userDTO = modelMapper.map(UserService.getUser(id), ResponseUserDTO.class);
        UserService.deleteUser(id);

        return ResponseEntity.ok(userDTO);
    }
}
