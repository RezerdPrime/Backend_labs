package edu.phoenix.dao;

import edu.phoenix.model.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DatabaseTest {
  private static final String NAME = "Name";
  private static final String LOGIN = "login";
  private static final String PASSWORD = "password";

  @Test
  void shouldAddUser() {
    assertTrue(Database.dataBase.isEmpty());

    Database.addUser(NAME, LOGIN, PASSWORD);

    assertEquals(1, Database.dataBase.size());

    User user = Database.dataBase.get(0);

    assertEquals(NAME, user.getName());
    assertEquals(LOGIN, user.getLogin());
    assertEquals(PASSWORD, user.getPassword());

    Database.dataBase.remove(0);

    assertTrue(Database.dataBase.isEmpty());
  }

  @Test
  void shouldReturnUser() {
    assertTrue(Database.dataBase.isEmpty());

    Database.dataBase.add(new User(NAME, LOGIN, PASSWORD));

    User user = Database.getUser(LOGIN, PASSWORD);

    assertNotNull(user);

    assertEquals(NAME, user.getName());
    assertEquals(LOGIN, user.getLogin());
    assertEquals(PASSWORD, user.getPassword());

    Database.dataBase.remove(0);

    assertTrue(Database.dataBase.isEmpty());
  }

  @Test
  void shouldDeleteUser() throws NullUser {
    assertTrue(Database.dataBase.isEmpty());

    Database.dataBase.add(new User(NAME, LOGIN, PASSWORD));

    Database.deleteUser(LOGIN);

    assertTrue(Database.dataBase.isEmpty());
  }

  @Test
  void shouldUpdateUser() throws NullUser {
    assertTrue(Database.dataBase.isEmpty());

    Database.dataBase.add(new User(NAME, LOGIN, PASSWORD));

    String updatedName = "new name";
    String updatedPassword = "new password";

    User updated = new User(updatedName, LOGIN, updatedPassword);

    Database.updateUser(updated);

    User fromDB = Database.dataBase.get(0);

    assertEquals(updatedName, fromDB.getName());
    assertEquals(updatedPassword, fromDB.getPassword());

    Database.dataBase.remove(0);

    assertTrue(Database.dataBase.isEmpty());
  }

  @Test
  void a() throws NullUser {

    Database.addUser("nam", "ln1337", "1223dfdv");
    System.out.println(Database.getUser("ln1337", "1223dfdv").getName());

    Database.updateUser(new User("сущ", "ln1337", "1111"));
    System.out.println(Database.getUser("ln1337", "1111").getName());

    Database.dataBase.remove(0);

    assertTrue(Database.dataBase.isEmpty());
  }
}