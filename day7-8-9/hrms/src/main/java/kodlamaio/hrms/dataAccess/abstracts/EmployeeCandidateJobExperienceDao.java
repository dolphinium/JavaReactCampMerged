package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.EmployeeCandidateJobExperience;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeCandidateJobExperienceDao extends JpaRepository<EmployeeCandidateJobExperience, Integer> {
}