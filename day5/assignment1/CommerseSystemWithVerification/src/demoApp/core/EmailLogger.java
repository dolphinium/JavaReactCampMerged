package demoApp.core;

import demoApp.entities.concretes.User;

public class EmailLogger implements LoggerService{

    @Override
    public void log(User user) {
        System.out.println("Email gönderildi: "+ user.getFirstName());
    }
}

