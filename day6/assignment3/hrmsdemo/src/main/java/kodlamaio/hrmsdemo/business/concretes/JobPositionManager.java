package kodlamaio.hrmsdemo.business.concretes;

import kodlamaio.hrmsdemo.business.abstracts.JobPositionService;
import kodlamaio.hrmsdemo.dataAccess.abstracts.JobPositionDao;
import kodlamaio.hrmsdemo.entities.concretes.JobPosition;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class JobPositionManager implements JobPositionService {

    @Autowired
    private JobPositionDao jobPositionDao;

    @Override
    public List<JobPosition> getAll() {
        return jobPositionDao.findAll();
    }
}
