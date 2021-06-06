package kodlamaio.hrms.core.concretes;

import kodlamaio.hrms.core.abstracts.EmailService;
import org.springframework.stereotype.Component;

@Component
public class EmailManager implements EmailService {

    @Override
    public void sendVerificationMail(String email) {
        //sent..
    }

}