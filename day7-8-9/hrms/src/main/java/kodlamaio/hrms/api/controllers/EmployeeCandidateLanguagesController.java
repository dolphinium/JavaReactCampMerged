package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.EmployeeCandidateLanguageService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorDataResult;
import kodlamaio.hrms.entities.concretes.EmployeeCandidateLanguage;
import kodlamaio.hrms.entities.dtos.EmployeeCandidateLanguageAddDto;
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
@RequestMapping("/api/cvsLanguages")
@RequiredArgsConstructor
public class EmployeeCandidateLanguagesController {

    private final EmployeeCandidateLanguageService employeeCandidateLanguageService;

    @GetMapping("/getAll")
    public DataResult<List<EmployeeCandidateLanguage>> getAll() {
        return employeeCandidateLanguageService.getAll();
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@Valid @RequestBody EmployeeCandidateLanguageAddDto employeeCandidateLanguageAddDto) {
        return ResponseEntity.ok(employeeCandidateLanguageService.add(employeeCandidateLanguageAddDto));
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
