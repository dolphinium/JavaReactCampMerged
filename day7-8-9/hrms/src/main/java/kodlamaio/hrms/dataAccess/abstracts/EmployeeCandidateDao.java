package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.EmployeeCandidate;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeCandidateDao extends JpaRepository<EmployeeCandidate,Integer> {
}
