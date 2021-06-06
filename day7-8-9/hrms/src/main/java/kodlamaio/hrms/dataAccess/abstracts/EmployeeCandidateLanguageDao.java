package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.EmployeeCandidateLanguage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeCandidateLanguageDao extends JpaRepository<EmployeeCandidateLanguage, Integer> {
}