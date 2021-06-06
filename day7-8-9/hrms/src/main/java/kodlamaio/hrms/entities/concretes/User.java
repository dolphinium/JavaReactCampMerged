package kodlamaio.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {

    @GeneratedValue
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "email")
    private String email;

    @JsonIgnore
    @Column(name="password")
    private String password;
}
