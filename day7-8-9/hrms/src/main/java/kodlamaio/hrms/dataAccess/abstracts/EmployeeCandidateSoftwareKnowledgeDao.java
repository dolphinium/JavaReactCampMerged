package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.EmployeeCandidateSoftwareKnowledge;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeCandidateSoftwareKnowledgeDao extends JpaRepository<EmployeeCandidateSoftwareKnowledge, Integer> {
}