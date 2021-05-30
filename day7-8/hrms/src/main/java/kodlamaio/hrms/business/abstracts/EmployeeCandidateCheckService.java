package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.entities.concretes.EmployeeCandidate;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeCandidateCheckService {

    boolean areAllFieldsFilled(EmployeeCandidate employeeCandidate);
}