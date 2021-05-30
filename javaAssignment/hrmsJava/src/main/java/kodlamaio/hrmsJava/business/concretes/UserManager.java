package kodlamaio.hrmsJava.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrmsJava.business.abstracts.UserService;
import kodlamaio.hrmsJava.core.utilities.results.DataResult;
import kodlamaio.hrmsJava.dataAccess.abstracts.UserDao;
import kodlamaio.hrmsJava.entities.concretes.User;
import kodlamaio.hrmsJava.core.utilities.results.SuccessDataResult;

@Service
public class UserManager implements UserService{
	
	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao=userDao;
	}
	
	@Override
	public DataResult<List<User>> getAll() {
		
		return new SuccessDataResult<List<User>>(this.userDao.findAll(),"Kullanicilar Listelendi.");
	}

}
