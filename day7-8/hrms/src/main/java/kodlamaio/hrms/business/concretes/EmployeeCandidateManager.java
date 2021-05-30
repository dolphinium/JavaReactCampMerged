package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.EmployeeCandidateCheckService;
import kodlamaio.hrms.business.abstracts.EmployeeCandidateService;
import kodlamaio.hrms.core.abstracts.EmailService;
import kodlamaio.hrms.core.adapters.MernisServiceAdapter;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployeeCandidateDao;
import kodlamaio.hrms.entities.concretes.EmployeeCandidate;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class EmployeeCandidateManager implements EmployeeCandidateService {

    private final EmployeeCandidateDao employeeCandidateDao;
    private final EmployeeCandidateCheckService employeeCandidateCheckService;
    private final MernisServiceAdapter mernisServiceAdapter;
    private final EmailService emailService;

    @Override
    public DataResult<List<EmployeeCandidate>> getAll() {
        return new SuccessDataResult<>("Success", employeeCandidateDao.findAll());
    }

    public Result register(EmployeeCandidate employeeCandidate, String passwordRepeat){

        if(!employeeCandidateCheckService.areAllFieldsFilled(employeeCandidate)){
            return new ErrorResult("There is empty fields!");
        } else if(!employeeCandidate.getPassword().equals(passwordRepeat)){
            return new ErrorResult("Password repetition mismatch");
        } else if (mernisServiceAdapter.isNatIdReal(employeeCandidate.getNationalityId(),
                employeeCandidate.getFirstName(), employeeCandidate.getLastName(), employeeCandidate.getBirthYear())){
            return new ErrorResult("Incompatible Nationality ID, Name, Surname And Birth Year!");
        }

        try {
            emailService.sendVerificationMail(employeeCandidate.getEmail());
            employeeCandidateDao.save(employeeCandidate);
            return new SuccessResult("Email verified...\nCandidate Saved.");
        } catch (Exception exception){
            exception.printStackTrace();
            return new ErrorResult("An Error Has Occurred - Registration Failed");
        }

    }
}