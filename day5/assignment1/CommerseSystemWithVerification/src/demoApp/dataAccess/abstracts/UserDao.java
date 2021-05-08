package demoApp.dataAccess.abstracts;

import demoApp.entities.concretes.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    List<User> getAllUsers();
}
