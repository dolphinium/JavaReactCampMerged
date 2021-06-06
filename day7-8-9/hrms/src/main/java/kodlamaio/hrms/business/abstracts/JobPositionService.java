package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobPosition;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface JobPositionService {
    DataResult<List<JobPosition>> getAll();

    Result add(JobPosition jobPosition);
}