package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.EmployeeCandidateSchool;
import kodlamaio.hrms.entities.dtos.EmployeeCandidateSchoolAddDto;

import java.util.List;

public interface EmployeeCandidateSchoolService {
    DataResult<List<EmployeeCandidateSchool>> getAll();

    DataResult<List<EmployeeCandidateSchool>> getAllSortedDesc();

    Result add(EmployeeCandidateSchoolAddDto employeeCandidateSchoolAddDto);
}
