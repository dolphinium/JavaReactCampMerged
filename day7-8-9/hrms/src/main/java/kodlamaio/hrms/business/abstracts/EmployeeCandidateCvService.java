package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.EmployeeCandidateCv;
import kodlamaio.hrms.entities.dtos.EmployeeCandidateCvAddDto;

import java.util.List;

public interface EmployeeCandidateCvService {
    DataResult<List<EmployeeCandidateCv>> getAll();

    Result add(EmployeeCandidateCvAddDto employeeCandidateCvAddDto);
}
