package kodlamaio.hrms.entities.concretes;

import javax.persistence.*;

@Entity
@Table(name = "cities")
public class City {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;
}
