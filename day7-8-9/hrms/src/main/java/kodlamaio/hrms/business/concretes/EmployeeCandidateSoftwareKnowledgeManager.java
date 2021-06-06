package kodlamaio.hrms.business.concretes;


import kodlamaio.hrms.business.abstracts.EmployeeCandidateSoftwareKnowledgeService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployeeCandidateSoftwareKnowledgeDao;
import kodlamaio.hrms.entities.concretes.EmployeeCandidateSoftwareKnowledge;
import kodlamaio.hrms.entities.dtos.EmployeeCandidateSoftwareKnowledgeAddDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeCandidateSoftwareKnowledgeManager implements EmployeeCandidateSoftwareKnowledgeService {
    private final EmployeeCandidateSoftwareKnowledgeDao employeeCandidateSoftwareKnowledgeDao;

    @Override
    public DataResult<List<EmployeeCandidateSoftwareKnowledge>> getAll() {
        return new SuccessDataResult<>("Success!",employeeCandidateSoftwareKnowledgeDao.findAll());
    }

    @Override
    public Result add(EmployeeCandidateSoftwareKnowledgeAddDto employeeCandidateSoftwareKnowledgeAddDto) {
        EmployeeCandidateSoftwareKnowledge employeeCandidateSoftwareKnowledge = new EmployeeCandidateSoftwareKnowledge
                (employeeCandidateSoftwareKnowledgeAddDto.getCandidateId(), employeeCandidateSoftwareKnowledgeAddDto.getSoftwareKnowledgeId());
        employeeCandidateSoftwareKnowledgeDao.save(employeeCandidateSoftwareKnowledge);
        return new SuccessResult("Added to Database Successfully!");
    }
}
