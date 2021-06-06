package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.EmployeeCandidateLanguage;
import kodlamaio.hrms.entities.dtos.EmployeeCandidateLanguageAddDto;

import java.util.List;

public interface EmployeeCandidateLanguageService {
    DataResult<List<EmployeeCandidateLanguage>> getAll();

    Result add(EmployeeCandidateLanguageAddDto employeeCandidateLanguageAddDto);
}
