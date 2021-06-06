package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.SchoolService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.SchoolDao;
import kodlamaio.hrms.entities.concretes.School;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class SchoolManager implements SchoolService {

    private final SchoolDao schoolDao;

    @Override
    public DataResult<List<School>> getAll() {
        return new SuccessDataResult<>("Success",schoolDao.findAll());
    }

    @Override
    public Result add(School school) {
       schoolDao.save(school);
       return new SuccessResult("School saved to database successfully");
    }
}
