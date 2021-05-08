package business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import business.abstracts.EmailService;
import business.abstracts.UserService;
import business.abstracts.ValidationService;
import core.abstracts.BaseService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class BaseManager implements BaseService{
	private EmailService emailService;
	private ValidationService validationService;
	private UserService userService;

	public BaseManager(EmailService emailService, ValidationService validationService,UserService userService) {
		this.emailService = emailService;
		this.validationService = validationService;
		this.userService=userService;
	}
	

	@Override
	public void signUp(User user) {
		if(validationService.validitycheck(user)==false) {
			System.out.println("Error : registration failed");
			return;
		}
		if(userService.getByEmail(user)==null) {
			System.out.println("Error : registration failed");
			return ;
		}
		emailService.send(user.geteMail());
		System.out.println("Click on the links , 1(verify) or 2(cancel) ?");
		Scanner inp=new Scanner(System.in);
		int reply=inp.nextInt();
		if(reply==2) {
			System.out.println("Warning : Your account is not verified");
			System.out.println("Error : registration failed");
			return ;
		}
		if(reply==1) {
			emailService.reply(user.geteMail());
			userService.signUp(user);
		}
		
	}
	
	@Override
	public void logIn(User user) {
		// TODO Auto-generated method stub
		if(user.geteMail() == null || user.getPassword()==null) {
			System.out.println("Error : registration failed");
			return ;
		}
		userService.logIn(user);
		
	}

}