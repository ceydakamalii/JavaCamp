package core.abstracts;

import entities.concretes.User;

public interface BaseService {
	void signUp(User user);
	void logIn(User user);
}
