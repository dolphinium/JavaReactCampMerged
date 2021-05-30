package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.SystemStaffService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.SystemStaff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/system_staffs")
public class SystemStaffsController {

    private final SystemStaffService systemStaffService;

    @Autowired
    public SystemStaffsController(SystemStaffService systemStaffService) {
        this.systemStaffService = systemStaffService;
    }

    @GetMapping("/getall")
    public DataResult<List<SystemStaff>> getAll(){
        return systemStaffService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody SystemStaff systemStaff){
        return systemStaffService.add(systemStaff);
    }
}