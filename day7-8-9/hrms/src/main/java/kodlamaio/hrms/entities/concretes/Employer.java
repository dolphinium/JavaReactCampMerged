package kodlamaio.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import kodlamaio.hrms.core.entities.User;
import lombok.*;
import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)

@Entity
@Table(name = "employers")
@PrimaryKeyJoinColumn(name = "user_id", referencedColumnName = "id")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "jobAdvertisements"})
public class Employer extends User {
    @Column(name = "company_name", nullable = false, unique = true)
    private String companyName;

    @Column(name = "website", nullable = false, unique = true)
    private String website;

    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    @JsonIgnore
    @Column(name = "is_system_verified", nullable = false)
    private boolean isSystemVerified;

    @JsonIgnore
    @OneToMany(mappedBy = "employer")
    private List<JobAdvertisement> jobAdvertisements;

}