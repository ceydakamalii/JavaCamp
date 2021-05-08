package business.concretes;

import java.util.ArrayList;
import java.util.List;

import business.abstracts.UserService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService{
	private UserDao userDao;
	private List<User> users=new ArrayList<User>();
	public UserManager(UserDao userDao) {
		this.userDao=userDao;
	}
	@Override
	public void signUp(User user) {
		users.add(user);
		userDao.signUp(user);
		
	}

	@Override
	public void delete(User user) {
		users.remove(user);
		
	}

	@Override
	public void logIn(User user) {
		if(user.geteMail() == null || user.getPassword()==null) {
			System.out.println("Warning : enter your e-mail and password.");
			return ;
		}
		userDao.logIn(user);
		
	}
	@Override
	public User getByEmail(User user) {
		for(User user1 :users) {
			if(user1.geteMail().equals(user.geteMail())) {
				System.out.println("Warning : This e-mail address is used.");
				return null ;
			}
		}
		return user;
	}

}
