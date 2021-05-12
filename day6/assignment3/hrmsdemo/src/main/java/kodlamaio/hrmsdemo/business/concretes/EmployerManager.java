package kodlamaio.hrmsdemo.business.concretes;

import kodlamaio.hrmsdemo.business.abstracts.EmployerService;
import kodlamaio.hrmsdemo.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrmsdemo.entities.concretes.Employer;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Data
@Service
public class EmployerManager implements EmployerService {

    @Autowired
    private EmployerDao employerDao;


    @Override
    public List<Employer> getAll() {
        return employerDao.findAll();
    }
}
