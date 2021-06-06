package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.SystemStaff;
import kodlamaio.hrms.entities.dtos.SystemStaffAddDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SystemStaffService extends UserService<SystemStaff>{

    Result add(SystemStaffAddDto systemStaffAddDto);
}
