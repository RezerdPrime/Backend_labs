package com.example.laba3.User;

import com.example.laba3.UserDTO.MainDataUserDTO;
import com.example.laba3.CustomExceptions.UserNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {


    private static UserRepository userRep;

    @Autowired
    public UserService(UserRepository userRep) {
        UserService.userRep = userRep;
    }

    public static void createUser(UserModel user) {
        userRep.save(user);
    }

    public static UserModel getUser(Long id) {
        return userRep.findById(id).orElseThrow(
                () -> new UserNotFoundException("Юзер не найден, сорян")
        );
    }

    public static void updateUser(Long id, MainDataUserDTO user) {
        UserModel searched_user = getUser(id);
        String newusername = user.getUsername();
        String newpassword = user.getPassword();

        searched_user.setUsername(newusername);
        searched_user.setPassword(newpassword);

        userRep.save(searched_user);
    }

    public static void deleteUser(Long id) {
        UserModel searched_user = getUser(id);
        userRep.delete(searched_user);
    }
}
