package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.EmployerCheckService;
import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.core.abstracts.EmailService;
import kodlamaio.hrms.core.utilities.results.*;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.entities.concretes.Employer;
import kodlamaio.hrms.entities.dtos.EmployerAddDto;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployerManager implements EmployerService {

    private final EmployerDao employerDao;
    private final EmployerCheckService employerCheckService;
    private final EmailService emailService;
    private final ModelMapper modelMapper;


    @Override
    public DataResult<List<Employer>> getAll() {
        return new SuccessDataResult<>("Success", employerDao.findAll());
    }

    @Override
    public Result add(EmployerAddDto employerAddDto) {
        if (!employerCheckService.isCompatibleWebSiteAndEmail(employerAddDto)) {
            return new ErrorResult("Incompatible Web Site & E-mail!");
        } else if (!employerAddDto.getPassword().equals(employerAddDto.getPasswordRepeat())){
            return new ErrorResult("Password repetition mismatch");
        }
        simplifyPhoneNumber(employerAddDto);
        Employer employer = modelMapper.map(employerAddDto, Employer.class);
        emailService.sendVerificationMail(employerAddDto.getEmail());
        employerDao.save(employer);
        return new SuccessResult("Employer Saved, your account will be available after our employees confirmed you.");
    }

    public void simplifyPhoneNumber(EmployerAddDto employerAddDto){
        String simplePhone = employerAddDto.getPhoneNumber().replaceAll("[\\s-]","");
        if (simplePhone.length() > 11 && simplePhone.charAt(0) != '+') simplePhone = "+" + simplePhone;
        employerAddDto.setPhoneNumber(simplePhone);
    }

}