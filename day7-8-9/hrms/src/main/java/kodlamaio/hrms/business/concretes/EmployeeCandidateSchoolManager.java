package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.EmployeeCandidateSchoolService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployeeCandidateSchoolDao;
import kodlamaio.hrms.entities.concretes.EmployeeCandidateSchool;
import kodlamaio.hrms.entities.dtos.EmployeeCandidateSchoolAddDto;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class EmployeeCandidateSchoolManager implements EmployeeCandidateSchoolService {

    private final EmployeeCandidateSchoolDao employeeCandidateSchoolDao;
    private final ModelMapper modelMapper;

    @Override
    public DataResult<List<EmployeeCandidateSchool>> getAll() {
        return new SuccessDataResult<>("Success!",employeeCandidateSchoolDao.findAll());
    }

    @Override
    public DataResult<List<EmployeeCandidateSchool>> getAllSortedDesc() {
        Sort sort = Sort.by(Sort.Direction.DESC,"graduationYear");
        return new SuccessDataResult<>("Success!",employeeCandidateSchoolDao.findAll(sort));
    }

    @Override
    public Result add(EmployeeCandidateSchoolAddDto employeeCandidateSchoolAddDto) {
        EmployeeCandidateSchool employeeCandidateSchool= modelMapper.map(employeeCandidateSchoolAddDto,EmployeeCandidateSchool.class);
        employeeCandidateSchool.setCandidateIdSchoolIdDepartmentId(employeeCandidateSchoolAddDto.getCandidateId(),
                employeeCandidateSchoolAddDto.getSchoolId(), employeeCandidateSchoolAddDto.getDepartmentId());
        employeeCandidateSchoolDao.save(employeeCandidateSchool);
        return new SuccessResult("Success!");
    }
}
