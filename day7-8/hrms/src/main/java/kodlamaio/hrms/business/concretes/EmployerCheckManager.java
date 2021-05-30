package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.EmployerCheckService;
import kodlamaio.hrms.entities.concretes.Employer;
import org.springframework.stereotype.Service;

@Service
public class EmployerCheckManager implements EmployerCheckService {

    @Override
    public boolean areAllFieldsFilled(Employer employer) {
        return employer.getId() != 0 && employer.getEmail() != null && employer.getPassword() != null && employer.getCompanyName() != null
                && employer.getWebSite() != null && employer.getPhoneNumber() != null;
    }

    @Override
    public boolean isCompatibleWebSiteAndEmail(Employer employer){
        // I am not sure about where the domain is :)
        String emailDomain = employer.getEmail().split("@")[0];
        String webSiteDomain = employer.getWebSite().split("\\.")[1];
        return emailDomain.equals(webSiteDomain);
    }

}