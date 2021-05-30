package kodlamaio.hrms.entities.concretes;

import lombok.*;
import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor


@Entity
@Table(name = "system_employees")
@PrimaryKeyJoinColumn(name = "system_employee_id",referencedColumnName = "id")
public class SystemStaff extends User{


    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    public SystemStaff(int id, String email, String password, String firstName, String lastName){
        super(id,email,password);
        this.firstName = firstName;
        this.lastName = lastName;
    }


}
