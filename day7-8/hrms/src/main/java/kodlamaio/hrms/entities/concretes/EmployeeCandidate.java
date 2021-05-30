package kodlamaio.hrms.entities.concretes;

import lombok.*;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)

@Entity
@Table(name = "candidates")
@PrimaryKeyJoinColumn(name = "candidate_id", referencedColumnName = "id")
public class EmployeeCandidate extends User {

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "nationality_id")
    private String nationalityId;

    @Column(name = "birth_year")
    private short birthYear;

    public EmployeeCandidate(int id, String email, String password, String firstName, String lastName, String nationalityId, short birthYear){
        super(id,email,password);
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalityId = nationalityId;
        this.birthYear = birthYear;
    }

}