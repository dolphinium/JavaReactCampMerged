package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.JobPositionService;
import kodlamaio.hrms.core.utilities.results.*;
import kodlamaio.hrms.dataAccess.abstracts.JobPositionDao;
import kodlamaio.hrms.entities.concretes.JobPosition;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class JobPositionManager implements JobPositionService {

    private final JobPositionDao jobPositionDao;

    @Override
    public DataResult<List<JobPosition>> getAll() {
        return new SuccessDataResult<>("Success", jobPositionDao.findAll());
    }

    @Override
    public Result add(JobPosition jobPosition) {
        jobPositionDao.save(jobPosition);
        return new SuccessResult("New Job Position Saved to database successfully");
    }


}


