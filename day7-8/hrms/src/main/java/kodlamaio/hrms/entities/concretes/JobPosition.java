package kodlamaio.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import javax.persistence.*;
import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "positions")
public class JobPosition {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    private String title;

    @Column(name = "detail")
    private String detail;

    @JsonIgnore
    @Column(name = "created_at")
    private LocalDate createdAt;

}