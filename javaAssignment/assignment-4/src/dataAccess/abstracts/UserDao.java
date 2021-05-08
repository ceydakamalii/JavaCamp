package dataAccess.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserDao {
	void signUp(User user);
	void delete(User user);
	void logIn(User user);
	User getByEmail(String eMail);	

}