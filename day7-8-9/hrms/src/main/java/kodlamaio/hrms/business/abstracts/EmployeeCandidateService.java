package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.EmployeeCandidate;
import kodlamaio.hrms.entities.dtos.EmployeeCandidateAddDto;
import org.springframework.stereotype.Service;


@Service
public interface EmployeeCandidateService extends UserService<EmployeeCandidate> {

    Result add(EmployeeCandidateAddDto candidateAddDto);
}