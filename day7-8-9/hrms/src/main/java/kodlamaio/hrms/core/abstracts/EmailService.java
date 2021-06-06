package kodlamaio.hrms.core.abstracts;

import org.springframework.stereotype.Component;

@Component
public interface EmailService {

    void sendVerificationMail(String email);

}
