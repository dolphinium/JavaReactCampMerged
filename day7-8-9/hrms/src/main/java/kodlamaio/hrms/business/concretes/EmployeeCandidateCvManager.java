package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.EmployeeCandidateCvService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployeeCandidateCvDao;
import kodlamaio.hrms.entities.concretes.EmployeeCandidateCv;
import kodlamaio.hrms.entities.dtos.EmployeeCandidateCvAddDto;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeCandidateCvManager implements EmployeeCandidateCvService {

    private final EmployeeCandidateCvDao employeeCandidateCvDao;
    private final ModelMapper modelMapper;

    @Override
    public DataResult<List<EmployeeCandidateCv>> getAll() {
        return new SuccessDataResult<>("Success", employeeCandidateCvDao.findAll());
    }

    @Override
    public Result add(EmployeeCandidateCvAddDto employeeCandidateCvAddDto) {
        EmployeeCandidateCv employeeCandidateCv = modelMapper.map(employeeCandidateCvAddDto, EmployeeCandidateCv.class);
        employeeCandidateCv.setCandidateId(employeeCandidateCvAddDto.getCandidateId());
        employeeCandidateCvDao.save(employeeCandidateCv);
        return new SuccessResult("Success");
    }
}
