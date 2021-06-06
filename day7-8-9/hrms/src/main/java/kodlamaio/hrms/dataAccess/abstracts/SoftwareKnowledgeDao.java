package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.SoftwareKnowledge;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SoftwareKnowledgeDao extends JpaRepository<SoftwareKnowledge, Integer> {
}