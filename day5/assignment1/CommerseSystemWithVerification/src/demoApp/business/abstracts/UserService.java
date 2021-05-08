package demoApp.business.abstracts;

import demoApp.entities.concretes.User;

import java.util.List;

public interface UserService {
    void add(User user);
    List<User> getAllUsers();

}
