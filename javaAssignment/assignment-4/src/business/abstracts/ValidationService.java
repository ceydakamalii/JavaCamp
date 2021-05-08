package business.abstracts;

import entities.concretes.User;

public interface ValidationService {
	boolean validitycheck(User user);

}