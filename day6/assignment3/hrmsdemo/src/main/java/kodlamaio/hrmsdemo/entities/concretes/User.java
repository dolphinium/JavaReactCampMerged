package kodlamaio.hrmsdemo.entities.concretes;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="users")
@Data
public class User {
    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="email_adress")
    private String emailAdress;

    @Column(name="password")
    private String password;
}
