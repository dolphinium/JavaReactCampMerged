package kodlamaio.hrms.business.concretes;


import kodlamaio.hrms.business.abstracts.EmployeeCandidateCheckService;
import kodlamaio.hrms.entities.concretes.EmployeeCandidate;
import org.springframework.stereotype.Service;

@Service
public class EmployeeCandidateCheckManager implements EmployeeCandidateCheckService {

    @Override
    public boolean areAllFieldsFilled(EmployeeCandidate employeeCandidate) {
        return employeeCandidate.getId() != 0 && employeeCandidate.getEmail() != null && employeeCandidate.getPassword() != null && employeeCandidate.getFirstName() != null
                && employeeCandidate.getLastName() != null && employeeCandidate.getNationalityId() != null && employeeCandidate.getBirthYear() != 0;
    }
}