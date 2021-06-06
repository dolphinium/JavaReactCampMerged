package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.DataResult;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService<User> {

    DataResult<List<User>> getAll();
}