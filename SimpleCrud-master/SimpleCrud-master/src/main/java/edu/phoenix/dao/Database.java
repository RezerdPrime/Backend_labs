package edu.phoenix.dao;

import edu.phoenix.model.User;

import java.util.ArrayList;
import java.util.List;

public class Database {
    public static List<User> dataBase = new ArrayList<>();

    public static void addUser(String name, String login, String password) {

        dataBase.add(new User(name, login, password));
    }

    public static User getUser(String login, String password) {

        return dataBase.stream()
                .filter(obj -> (
                        obj.getLogin().equals(login) &&
                                obj.getPassword().equals(password)))
                .findFirst().orElse(null);
    }

    public static void deleteUser(String login) throws NullUser {

        User us = dataBase.stream()
                .filter(obj -> (
                        obj.getLogin().equals(login)))
                .findFirst()
                .orElseThrow(() -> new NullUser("Юзер не сущ"));

        dataBase.remove(us);
    }

    public static void updateUser(User user) throws NullUser {

        String login = user.getLogin();

        User us = dataBase.stream().filter(obj -> (
                        obj.getLogin().equals(login)))
                .findFirst().orElse(null);

        int usindex = dataBase.indexOf(us);

        if (us == null) {
            throw new NullUser("Юзер не сущ");
        } else {
            dataBase.set(usindex, user);
        }

    }

}
