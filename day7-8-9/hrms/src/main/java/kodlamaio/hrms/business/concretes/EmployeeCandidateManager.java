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
import kodlamaio.hrms.entities.dtos.EmployeeCandidateAddDto;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class EmployeeCandidateManager implements EmployeeCandidateService {

    private final EmployeeCandidateDao employeeCandidateDao;
    private final MernisServiceAdapter mernisServiceAdapter;
    private final EmailService emailService;
    private final ModelMapper modelMapper;

    @Override
    public DataResult<List<EmployeeCandidate>> getAll() {
        return new SuccessDataResult<>("Success", employeeCandidateDao.findAll());
    }

    @Override
    public Result add(EmployeeCandidateAddDto employeeCandidateAddDto) {
        if (!mernisServiceAdapter.isNatIdReal(employeeCandidateAddDto.getNationalityId(),
                employeeCandidateAddDto.getFirstName(), employeeCandidateAddDto.getLastName(), employeeCandidateAddDto.getBirthYear())) {
            return new ErrorResult("Mernis verification failed.");
        } else if (!employeeCandidateAddDto.getPassword().equals(employeeCandidateAddDto.getPasswordRepeat())) {
            return new ErrorResult("Password repetition mismatch.");
        }
        EmployeeCandidate employeeCandidate = modelMapper.map(employeeCandidateAddDto, EmployeeCandidate.class);
        emailService.sendVerificationMail(employeeCandidateAddDto.getEmail());
        employeeCandidateDao.save(employeeCandidate);
        return new SuccessResult("Email verified...  Candidate Saved.");
    }
}