package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.EmployeeCandidateService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.EmployeeCandidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/candidates")
public class EmployeeCandidatesController {

    private final EmployeeCandidateService employeeCandidateService;

    @Autowired
    public EmployeeCandidatesController(EmployeeCandidateService employeeCandidateService) {
        this.employeeCandidateService = employeeCandidateService;
    }

    @GetMapping("/getall")
    public DataResult<List<EmployeeCandidate>> getAll(){
        return employeeCandidateService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody EmployeeCandidate employeeCandidate, @RequestParam String passwordRepeat){
        return employeeCandidateService.register(employeeCandidate, passwordRepeat);
    }
}