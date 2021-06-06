package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.LanguageService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.LanguageDao;
import kodlamaio.hrms.entities.concretes.Language;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LanguageManager implements LanguageService {

    private final LanguageDao languageDao;

    @Override
    public DataResult<List<Language>> getAll() {
        return new SuccessDataResult<>("Success", languageDao.findAll());
    }

    @Override
    public Result add(Language language) {
        languageDao.save(language);
        return new SuccessResult("Language added to database Successfully!");
    }
}
