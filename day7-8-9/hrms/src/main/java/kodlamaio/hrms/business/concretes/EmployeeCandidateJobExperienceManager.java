package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.EmployeeCandidateJobExperienceService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployeeCandidateJobExperienceDao;
import kodlamaio.hrms.entities.concretes.EmployeeCandidateJobExperience;
import kodlamaio.hrms.entities.dtos.EmployeeCandidateJobExperienceAddDto;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class EmployeeCandidateJobExperienceManager implements EmployeeCandidateJobExperienceService {

    private final EmployeeCandidateJobExperienceDao employeeCandidateJobExperienceDao;
    private final ModelMapper modelMapper;

    @Override
    public DataResult<List<EmployeeCandidateJobExperience>> getAll() {
        return new SuccessDataResult<>("Success", employeeCandidateJobExperienceDao.findAll());
    }

    @Override
    public DataResult<List<EmployeeCandidateJobExperience>> getAllSortedDesc() {
        Sort sort = Sort.by(Sort.Direction.DESC,"quitYear");
        return new SuccessDataResult<>("Success", employeeCandidateJobExperienceDao.findAll(sort));
    }

    @Override
    public Result add(EmployeeCandidateJobExperienceAddDto employeeCandidateJobExperienceAddDto) {
        EmployeeCandidateJobExperience employeeCandidateJobExperience = modelMapper.map(employeeCandidateJobExperienceAddDto, EmployeeCandidateJobExperience.class);
        employeeCandidateJobExperience.setCandidateIdPositionId(employeeCandidateJobExperienceAddDto.getCandidateId(), employeeCandidateJobExperienceAddDto.getPositionId());
        employeeCandidateJobExperienceDao.save(employeeCandidateJobExperience);
        return new SuccessResult("Success");
    }
}
