package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.EmployeeCandidateCvService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorDataResult;
import kodlamaio.hrms.entities.concretes.EmployeeCandidateCv;
import kodlamaio.hrms.entities.dtos.EmployeeCandidateCvAddDto;
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
@RequestMapping("/api/cvs")
@RequiredArgsConstructor
public class EmployeeCandidateCvsController {

    private final EmployeeCandidateCvService employeeCandidateCvService;

    @GetMapping("/getAll")
    public DataResult<List<EmployeeCandidateCv>> getAll() {
        return employeeCandidateCvService.getAll();
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@Valid @RequestBody EmployeeCandidateCvAddDto employeeCandidateCvAddDto) {
        return ResponseEntity.ok(employeeCandidateCvService.add(employeeCandidateCvAddDto));
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

