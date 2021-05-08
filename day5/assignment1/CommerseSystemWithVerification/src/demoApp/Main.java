package demoApp;

import demoApp.business.concretes.UserManager;
import demoApp.core.EmailLogger;
import demoApp.dataAccess.concretes.HibernateUserDao;
import demoApp.entities.concretes.User;

public class Main {

    public static void main(String[] args) {
        User emre = new User(1, "Yunus Emre", "KORKMAZ", "1324567", "dolphongame@gmail.com");
        UserManager userManager=new UserManager(new HibernateUserDao(),new EmailLogger());
        userManager.add(emre);

    }
}