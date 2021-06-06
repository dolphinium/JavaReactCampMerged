package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.SoftwareKnowledge;

import java.util.List;

public interface SoftwareKnowledgeService {
    DataResult<List<SoftwareKnowledge>> getAll();
    Result add(SoftwareKnowledge softwareKnowledge);
}
