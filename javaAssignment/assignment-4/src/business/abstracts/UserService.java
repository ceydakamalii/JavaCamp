package business.abstracts;

import entities.concretes.User;

public interface UserService {
	void signUp(User user);
	void delete(User user);
	void logIn(User user);
	User getByEmail(User user);
}