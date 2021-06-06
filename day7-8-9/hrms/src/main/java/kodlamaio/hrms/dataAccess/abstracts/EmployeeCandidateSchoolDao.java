package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.EmployeeCandidateSchool;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeCandidateSchoolDao extends JpaRepository<EmployeeCandidateSchool, Integer> {
}