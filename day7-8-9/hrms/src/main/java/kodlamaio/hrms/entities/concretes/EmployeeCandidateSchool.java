package kodlamaio.hrms.entities.concretes;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "candidates_schools")
public class EmployeeCandidateSchool {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "candidates_schools_id_generator")
    @SequenceGenerator(name = "candidates_schools_id_generator", sequenceName = "candidates_schools_id_seq", allocationSize = 1)
    @JsonIgnore
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "candidate_id")
    private EmployeeCandidate employeeCandidate;

    @ManyToOne
    @JoinColumn(name = "school_id")
    private School school;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    @Column(name = "school_start_year")
    private short schoolStartYear;

    @Column(name = "graduation_year")
    private short graduationYear;

    //temporary will be edited later
    public void setCandidateIdSchoolIdDepartmentId(int candidateId, int schoolId, short departmentId){
        this.employeeCandidate.setId(candidateId);
        this.school.setId(schoolId);
        this.department.setId(departmentId);
    }
}