package kodlamaio.hrms.business.abstracts;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.EmployeeCandidate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeCandidateService {

    DataResult<List<EmployeeCandidate>> getAll();

    Result register(EmployeeCandidate employeeCandidate, String passwordRepeat);
}