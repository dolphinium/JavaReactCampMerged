package kodlamaio.hrmsdemo.entities.concretes;


import lombok.Data;

import javax.persistence.*;

@Table(name = "job_positions")
@Entity
@Data

public class JobPosition {
    @Id
    @GeneratedValue

    @Column(name = "job_id")
    private int id;
    @Column(name="name")
    String name;


}
