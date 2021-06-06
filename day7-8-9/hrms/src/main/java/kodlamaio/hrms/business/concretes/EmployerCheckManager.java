package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.EmployerCheckService;
import kodlamaio.hrms.entities.dtos.EmployerAddDto;
import org.springframework.stereotype.Service;

@Service
public class EmployerCheckManager implements EmployerCheckService {

    @Override
    public boolean isCompatibleWebSiteAndEmail(EmployerAddDto employerAddDto) {
        String emailDomain = employerAddDto.getEmail().substring(employerAddDto.getEmail().indexOf("@") + 1);
        return employerAddDto.getWebsite().contains(emailDomain);
    }

}