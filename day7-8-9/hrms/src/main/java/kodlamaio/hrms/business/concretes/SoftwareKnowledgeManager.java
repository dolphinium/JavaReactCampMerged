package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.SoftwareKnowledgeService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.SoftwareKnowledgeDao;
import kodlamaio.hrms.entities.concretes.SoftwareKnowledge;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SoftwareKnowledgeManager implements SoftwareKnowledgeService {

    private final SoftwareKnowledgeDao softwareKnowledgeDao;

    @Override
    public DataResult<List<SoftwareKnowledge>> getAll() {
        return new SuccessDataResult<>("Success", softwareKnowledgeDao.findAll());
    }

    @Override
    public Result add(SoftwareKnowledge softwareKnowledge) {
        softwareKnowledgeDao.save(softwareKnowledge);
        return new SuccessResult("Success");
    }
}