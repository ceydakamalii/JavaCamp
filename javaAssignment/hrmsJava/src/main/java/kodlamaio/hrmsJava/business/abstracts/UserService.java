package kodlamaio.hrmsJava.business.abstracts;

import java.util.List;

import kodlamaio.hrmsJava.core.utilities.results.DataResult;
import kodlamaio.hrmsJava.entities.concretes.User;

public interface UserService {
	
	DataResult<List<User>> getAll();
	

}
