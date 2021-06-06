package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.EmployeeCandidateSoftwareKnowledge;
import kodlamaio.hrms.entities.dtos.EmployeeCandidateSoftwareKnowledgeAddDto;

import java.util.List;

public interface EmployeeCandidateSoftwareKnowledgeService {
    DataResult<List<EmployeeCandidateSoftwareKnowledge>> getAll();

    Result add(EmployeeCandidateSoftwareKnowledgeAddDto employeeCandidateSoftwareKnowledgeAddDto);
}
