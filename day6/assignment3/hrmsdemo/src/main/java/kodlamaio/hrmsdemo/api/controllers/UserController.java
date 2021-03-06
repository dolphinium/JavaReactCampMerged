package kodlamaio.hrmsdemo.api.controllers;

import kodlamaio.hrmsdemo.business.abstracts.UserService;
import kodlamaio.hrmsdemo.entities.concretes.User;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/users")
@Data
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/getall")
    public List<User> getAll() {
        return userService.getAll();
    }

}
