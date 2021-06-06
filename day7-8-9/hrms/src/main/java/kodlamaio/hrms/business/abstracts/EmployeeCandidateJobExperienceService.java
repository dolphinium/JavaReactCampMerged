package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.EmployeeCandidateJobExperience;
import kodlamaio.hrms.entities.dtos.EmployeeCandidateJobExperienceAddDto;

import java.util.List;

public interface EmployeeCandidateJobExperienceService {
    DataResult<List<EmployeeCandidateJobExperience>> getAll();

    DataResult<List<EmployeeCandidateJobExperience>> getAllSortedDesc();

    Result add(EmployeeCandidateJobExperienceAddDto employeeCandidateJobExperienceAddDto);
}
