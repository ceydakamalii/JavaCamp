package core.concretes;

import core.abstracts.BaseService;
import entities.concretes.User;
import google.GoogleManager;

public class GoogleManagerAdapter implements BaseService{

	GoogleManager googleManager=new GoogleManager();
	@Override
	public void signUp(User user) {
		if(user.geteMail()==null || user.getPassword()==null) {
			System.out.println("Warning : You have to enter an e-mail and password field !");
			System.out.println("Error : registration failed");
			return ;
		}
		googleManager.signUp(user.geteMail());
		
	}

	@Override
	public void logIn(User user) {
		if(user.geteMail()==null || user.getPassword()==null) {
			System.out.println("Warning : You have to enter an e-mail and password field !");
			System.out.println("Error : login failed");
			return ;
		}
		googleManager.logIn(user.geteMail());
		
	}

}
