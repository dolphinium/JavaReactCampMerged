package kodlamaio.hrmsdemo.business.concretes;

import kodlamaio.hrmsdemo.business.abstracts.SystemStaffService;
import kodlamaio.hrmsdemo.dataAccess.abstracts.SystemStaffDao;
import kodlamaio.hrmsdemo.entities.concretes.SystemStaff;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class SystemStaffManager implements SystemStaffService {

    @Autowired
    private SystemStaffDao systemStaffDao;

    @Override
    public List<SystemStaff> getAll() {
        return systemStaffDao.findAll();
    }
}
