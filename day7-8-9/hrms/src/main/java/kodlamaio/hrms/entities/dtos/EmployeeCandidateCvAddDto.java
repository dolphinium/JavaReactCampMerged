package kodlamaio.hrms.entities.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Positive;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeCandidateCvAddDto {

    @Positive(message = "Please enter a positive integer (Candidate id).")
    private int candidateId;

    private String coverLetter;

    private List<EmployeeCandidateJobExperienceAddDto> candidateJobExperiences;

    private List<EmployeeCandidateLanguageAddDto> candidateLanguages;

    private List<EmployeeCandidateSchoolAddDto> candidateSchools;

    private List<EmployeeCandidateSoftwareKnowledgeAddDto> candidateSoftwareKnowledgeList;

}