package kodlamaio.hrms.entities.concretes;

import kodlamaio.hrms.core.entities.User;
import lombok.*;
import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor


@Entity
@Table(name = "system_employees")
@PrimaryKeyJoinColumn(name = "user_id",referencedColumnName = "id")
public class SystemStaff extends User {

    @Column(name = "first_name", length = 50)
    private String firstName;

    @Column(name = "last_name", length = 50)
    private String lastName;



}
