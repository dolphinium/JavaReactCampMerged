package kodlamaio.hrms.business.abstracts;
import kodlamaio.hrms.entities.concretes.Employer;
import org.springframework.stereotype.Service;

@Service
public interface EmployerCheckService {

    boolean areAllFieldsFilled(Employer employer);

    boolean isCompatibleWebSiteAndEmail(Employer employer);
}