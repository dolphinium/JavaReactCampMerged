package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    DataResult<List<User>> getAll();
}