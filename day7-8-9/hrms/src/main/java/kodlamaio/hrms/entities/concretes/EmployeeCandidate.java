package kodlamaio.hrms.entities.concretes;

import kodlamaio.hrms.core.entities.User;
import lombok.*;
import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)

@Entity
@Table(name = "candidates")
@PrimaryKeyJoinColumn(name = "user_id", referencedColumnName = "id")
public class EmployeeCandidate extends User {

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "nationality_id", nullable = false, unique = true)
    private String nationalityId;

    @Column(name = "birth_year", nullable = false)
    private short birthYear;

    @Column(name = "github_account_link")
    private String githubAccountLink;

    @Column(name = "linkedin_account_link")
    private String linkedinAccountLink;

    @OneToMany(mappedBy = "employeeCandidate")
    private List<EmployeeCandidateCv> employeeCandidateCvs;

    @OneToMany(mappedBy = "employeeCandidate")
    private List<EmployeeCandidateImage> employeeCandidateImages;

    @OneToMany(mappedBy = "employeeCandidate")
    private List<EmployeeCandidateJobExperience> employeeCandidateJobExperiences;

    @OneToMany(mappedBy = "employeeCandidate")
    private List<EmployeeCandidateLanguage> employeeCandidateLanguages;

    @OneToMany(mappedBy = "employeeCandidate")
    private List<EmployeeCandidateSchool> employeeCandidateSchools;

    @OneToMany(mappedBy = "employeeCandidate")
    private List<EmployeeCandidateSoftwareKnowledge> employeeCandidateSoftwareKnowledges;

    public EmployeeCandidate(int id) {
        super(id);
    }

}