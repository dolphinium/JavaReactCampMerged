import business.concretes.UserCheckManager;
import business.concretes.UserManager;
import core.concretes.EmailManager;
import core.concretes.GoogleAuthManagerAdapter;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {
    public static void main(String[] args) {

        User user1 = new User(1, "Yunus Emre", "KORKMAZ", "yunusemrekorkmaz@eskisehir.edu.tr", "1823af23ADSF12");
        User user2 = new User(2, "Müslüm", "Gürses", "sasdf.as12@hotmail.com", "56213423");
        User user3 = new User(3,"Ferdi","Tayfur","aoskdfokpaso@gmail.com","s123jıasıdjofa");

        System.out.println();

        UserManager userManager1 = new UserManager(new HibernateUserDao(), new UserCheckManager(new EmailManager()));
        userManager1.register(user1);
        userManager1.login(user1.getEmail(), user1.getPassword());

        System.out.println();

        userManager1.register(user2);
        userManager1.login(user2.getEmail(), user2.getPassword());

        System.out.println();

       // login phase with google
        UserManager userManager2 = new UserManager(new HibernateUserDao(), new UserCheckManager(new GoogleAuthManagerAdapter(), new EmailManager()));
        userManager2.register(user3);
        userManager2.login(user3.getEmail(), user3.getPassword());
    }
}
