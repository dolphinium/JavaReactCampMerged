package kodlamaio.hrmsdemo.business.concretes;


import kodlamaio.hrmsdemo.business.abstracts.UserService;
import kodlamaio.hrmsdemo.dataAccess.abstracts.UserDao;
import kodlamaio.hrmsdemo.entities.concretes.User;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class UserManager implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getAll() {
        return userDao.findAll();
    }
}
