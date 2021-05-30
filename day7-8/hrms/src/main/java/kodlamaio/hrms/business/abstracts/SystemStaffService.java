package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.SystemStaff;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SystemStaffService {

    DataResult<List<SystemStaff>> getAll();

    Result add(SystemStaff systemStaff);
}
