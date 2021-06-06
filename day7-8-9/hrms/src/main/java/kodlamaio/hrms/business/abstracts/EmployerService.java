package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Employer;
import kodlamaio.hrms.entities.dtos.EmployerAddDto;


public interface EmployerService extends UserService<Employer>{
    Result add(EmployerAddDto employerAddDto);
}