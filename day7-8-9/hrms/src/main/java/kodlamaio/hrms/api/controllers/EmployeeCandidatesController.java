package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.EmployeeCandidateService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorDataResult;
import kodlamaio.hrms.entities.concretes.EmployeeCandidate;
import kodlamaio.hrms.entities.dtos.EmployeeCandidateAddDto;
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

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/candidates")
public class EmployeeCandidatesController {

    private final EmployeeCandidateService employeeCandidateService;

    @GetMapping("/getAll")
    public DataResult<List<EmployeeCandidate>> getAll(){
        return employeeCandidateService.getAll();
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@Valid @RequestBody EmployeeCandidateAddDto employeeCandidateAddDto) {
        return ResponseEntity.ok(employeeCandidateService.add(employeeCandidateAddDto));
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