package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.EmployeeCandidateCv;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeCandidateCvDao extends JpaRepository<EmployeeCandidateCv, Integer> {
}