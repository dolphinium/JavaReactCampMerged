package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.core.entities.User;
import kodlamaio.hrms.core.utilities.results.DataResult;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UsersController {

    private final UserService<User> userService;

    @GetMapping("/getAll")
    public DataResult<List<User>> getAll(){
        return userService.getAll();
    }

}