package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.SystemStaffService;
import kodlamaio.hrms.core.utilities.results.*;
import kodlamaio.hrms.dataAccess.abstracts.SystemStaffDao;
import kodlamaio.hrms.entities.concretes.SystemStaff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SystemStaffManager implements SystemStaffService {

    private final SystemStaffDao systemStaffDao;

    @Autowired
    public SystemStaffManager(SystemStaffDao systemStaffDao) {
        this.systemStaffDao = systemStaffDao;
    }

    @Override
    public DataResult<List<SystemStaff>> getAll() {
        return new SuccessDataResult<>("Success", systemStaffDao.findAll());
    }

    @Override
    public Result add(SystemStaff systemStaff) {

        try {
            systemStaffDao.save(systemStaff);
            return new SuccessResult("System Employee Saved");
        } catch (Exception exception){
            exception.printStackTrace();
            return new ErrorResult("Registration Failed");
        }

    }
}