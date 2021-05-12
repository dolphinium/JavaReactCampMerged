package kodlamaio.hrmsdemo.api.controllers;

import kodlamaio.hrmsdemo.business.abstracts.JobPositionService;
import kodlamaio.hrmsdemo.entities.concretes.JobPosition;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;


@RestController
@RequestMapping("/api/job-positions")
@Data
public class JobPositionController {

    @Autowired
    private JobPositionService jobPositionService;

    @GetMapping("/getall")
    public List<JobPosition> getAll() {
        return jobPositionService.getAll();
    }
}
