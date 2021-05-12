package kodlamaio.hrmsdemo.business.concretes;

import kodlamaio.hrmsdemo.business.abstracts.EmployeeService;
import kodlamaio.hrmsdemo.dataAccess.abstracts.EmployeeDao;
import kodlamaio.hrmsdemo.entities.concretes.Employee;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Data
@Service
public class EmployeeManager implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public List<Employee> getAll() {
        return employeeDao.findAll();
    }
}
