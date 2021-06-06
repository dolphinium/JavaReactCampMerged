package kodlamaio.hrms.entities.dtos;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Positive;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeCandidateSoftwareKnowledgeAddDto {

    @Positive
    private int candidateId;

    @Positive
    private short softwareKnowledgeId;
}