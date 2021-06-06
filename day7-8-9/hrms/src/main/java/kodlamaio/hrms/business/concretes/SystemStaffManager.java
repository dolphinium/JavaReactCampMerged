package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.SystemStaffService;
import kodlamaio.hrms.core.utilities.results.*;
import kodlamaio.hrms.dataAccess.abstracts.SystemStaffDao;
import kodlamaio.hrms.entities.concretes.SystemStaff;
import kodlamaio.hrms.entities.dtos.SystemStaffAddDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SystemStaffManager implements SystemStaffService {

    private final SystemStaffDao systemStaffDao;
    private final ModelMapper modelMapper;

    @Override
    public DataResult<List<SystemStaff>> getAll() {
        return new SuccessDataResult<>("Success", systemStaffDao.findAll());
    }

    @Override
    public Result add(SystemStaffAddDto systemStaffAddDto) {
        SystemStaff systemStaff = modelMapper.map(systemStaffAddDto, SystemStaff.class);
        try {
            systemStaffDao.save(systemStaff);
            return new SuccessResult("System staff Saved");
        } catch (Exception exception){
            exception.printStackTrace();
            return new ErrorResult("Registration Failed");
        }
    }
}