package kodlamaio.hrmsdemo.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="employees")
public class Employee {
    @Id
    @GeneratedValue

    @Column(name="id")
    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="nationality_id")
    private String nationalityId;

    @Column(name="birth_year")
    private int birthYear;

    @Column(name="position_id")
    private int positionId;

}
