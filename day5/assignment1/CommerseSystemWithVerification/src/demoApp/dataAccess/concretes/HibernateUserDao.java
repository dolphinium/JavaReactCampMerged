package demoApp.dataAccess.concretes;

import demoApp.dataAccess.abstracts.UserDao;
import demoApp.entities.concretes.User;

import java.util.List;

public class HibernateUserDao implements UserDao {
    @Override
    public void add(User user) {
        System.out.println("Saved to database through hibernate");
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }


}
