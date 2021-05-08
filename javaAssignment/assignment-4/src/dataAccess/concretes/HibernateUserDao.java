package dataAccess.concretes;


import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao {



	@Override
	public void signUp(User user) {
		System.out.println("You subscribed to the system : "+user.geteMail());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Deleted from the system : "+user.geteMail());
	
		
	}


	public void logIn(User user) {
		System.out.println("You logged in to the system : "+user.geteMail());
	}

	@Override
	public User getByEmail(String eMail) {

		return null;
	}


}
