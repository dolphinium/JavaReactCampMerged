package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.EmployeeCandidateSoftwareKnowledgeService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorDataResult;
import kodlamaio.hrms.entities.concretes.EmployeeCandidateSoftwareKnowledge;
import kodlamaio.hrms.entities.dtos.EmployeeCandidateSoftwareKnowledgeAddDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/candidateSoftwareKnowledge")
@RequiredArgsConstructor
public class EmployeeCandidateSoftwareKnowledgeController {

    private final EmployeeCandidateSoftwareKnowledgeService employeeCandidateSoftwareKnowledgeService;


    @GetMapping("/getAll")
    public DataResult<List<EmployeeCandidateSoftwareKnowledge>> getAll() {
        return employeeCandidateSoftwareKnowledgeService.getAll();
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@Valid @RequestBody EmployeeCandidateSoftwareKnowledgeAddDto employeeCandidateSoftwareKnowledgeAddDto) {
        return ResponseEntity.ok(employeeCandidateSoftwareKnowledgeService.add(employeeCandidateSoftwareKnowledgeAddDto));
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorDataResult<Object> handleValidationExceptions(MethodArgumentNotValidException exceptions) {
        Map<String, String> validationErrors = new HashMap<>();
        for (FieldError fieldError : exceptions.getBindingResult().getFieldErrors()) {
            validationErrors.put(fieldError.getField(), fieldError.getDefaultMessage());
        }
        return new ErrorDataResult<>("Error", validationErrors);
    }
}
