package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.entities.concretes.Employer;
import kodlamaio.hrms.entities.dtos.EmployerAddDto;


public interface EmployerCheckService extends UserCheckService<Employer>  {

    boolean isCompatibleWebSiteAndEmail(EmployerAddDto employerAddDto);
}