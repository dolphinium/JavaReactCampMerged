package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.EmployeeCandidateLanguageService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployeeCandidateLanguageDao;
import kodlamaio.hrms.entities.concretes.EmployeeCandidateLanguage;
import kodlamaio.hrms.entities.dtos.EmployeeCandidateLanguageAddDto;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeCandidateLanguageManager implements EmployeeCandidateLanguageService {

    private final EmployeeCandidateLanguageDao employeeCandidateLanguageDao;
    private final ModelMapper modelMapper;

    @Override
    public DataResult<List<EmployeeCandidateLanguage>> getAll() {
        return new SuccessDataResult<>("Success",employeeCandidateLanguageDao.findAll());
    }

    @Override
    public Result add(EmployeeCandidateLanguageAddDto employeeCandidateLanguageAddDto) {
        EmployeeCandidateLanguage employeeCandidateLanguage = modelMapper.map(employeeCandidateLanguageAddDto, EmployeeCandidateLanguage.class);
        employeeCandidateLanguage.setCandidateIdLanguageId(employeeCandidateLanguageAddDto.getCandidateId(), employeeCandidateLanguageAddDto.getLanguageId());
        employeeCandidateLanguageDao.save(employeeCandidateLanguage);
        return new SuccessResult("Success");
    }
}
