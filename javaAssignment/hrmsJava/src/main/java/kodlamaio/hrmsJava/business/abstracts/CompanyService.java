package kodlamaio.hrmsJava.business.abstracts;
import java.util.List;

import kodlamaio.hrmsJava.core.utilities.results.DataResult;
import kodlamaio.hrmsJava.core.utilities.results.Result;
import kodlamaio.hrmsJava.entities.concretes.Company;
public interface CompanyService {
	
	DataResult<List<Company>> getAll();
	Result add(Company company);

}
