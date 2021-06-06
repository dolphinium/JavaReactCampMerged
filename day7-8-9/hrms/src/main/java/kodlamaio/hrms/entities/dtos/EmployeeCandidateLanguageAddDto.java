package kodlamaio.hrms.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeCandidateLanguageAddDto {

    @Positive(message = "Please enter a positive integer (CV id).")
    private int candidateId;

    @Positive(message = "Please enter a positive integer (Language id).")
    private short languageId;

    @Pattern(regexp = "[ABC][12]", message = "Please enter a english level according to the common european framework (A1, A2 etc.)")
    private String languageLevel;
}