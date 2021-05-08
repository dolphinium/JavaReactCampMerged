package demoApp.business.concretes;

import demoApp.business.abstracts.UserService;
import demoApp.core.LoggerService;
import demoApp.dataAccess.abstracts.UserDao;
import demoApp.entities.concretes.User;

import java.util.List;
import java.util.regex.Pattern;

public class UserManager implements UserService {

    UserDao userDao;
    LoggerService loggerService;

    public UserManager(UserDao userDao, LoggerService loggerService) {
        this.userDao = userDao;
        this.loggerService = loggerService;
    }

    @Override
    public void add(User user) {
        if(!userControl(user)){
            System.out.println("Kayıt başarısız!");
            return;
        }
        userDao.add(user);
        System.out.println("Kayıt başarılı!");

    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    public boolean userControl(User user){
        if(!nameSurnameCheck(user)){
            System.out.println("Ad ve soyad en az 3 karakterden oluşmalıdır!");
            return false;
        }else if(!passwordCheck(user)){
            System.out.println("Parola 6 karakterden fazla olmalıdır");
            return false;
        }else if(!emailRegexControl(user)){
            System.out.println("Email formatı yanlış!");
            return false;
        }else if(!emailControl(user)){
            System.out.println("Bu email daha önce kullanılmıştır"+user.getEmail());
        }
            return true;

    }

    public boolean nameSurnameCheck(User user){
        return user.getFirstName().length()>2 && user.getLastName().length()>2;
    }

    public boolean passwordCheck(User user){
        return user.getPassword().length()>6;
    }

    public boolean emailRegexControl(User user){
        String emailRegex = "^[A-Z0-9._]+@[A-Z0-9.]+\\.[A-Z]{2,6}$";
        Pattern pat = Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
        if(user.getEmail()==null) return false;
        return pat.matcher(user.getEmail()).matches();
    }
    public boolean emailControl(User user){
        List<User>users = getAllUsers();
        if(users!=null){
            for(User user2:users){
                if(user2.getEmail().equals(user.getEmail()))
                    return false;
            }
        }
        return true;
    }

}
