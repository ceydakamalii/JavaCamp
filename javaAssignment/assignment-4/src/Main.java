
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import core.abstracts.BaseService;
import core.concretes.GoogleManagerAdapter;
import dataAccess.abstracts.UserDao;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;
import google.GoogleManager;
import business.abstracts.UserService;
import business.concretes.*;
public class Main {

	public static void main(String[] args) {
		
		User user1=new User(1,"ceyda","kamali","ceydakamali@gmail.com","123456");
		
		User user2=new User(2,"ceyda","kamali","ceydakamali@gmail.com","123456");
		
		User user3=new User(3,"ceyda","kamali","cjakdglmd.com","12345");
		
		User user4=new User();
		user4.setId(4);
		user4.setFirstName("ceyda");
		user4.seteMail("ceydakamali3@gmail.com");
		
		User user5=new User(5,"ceyda","kamali","ceydakamali@gmail.com","123456");
		
		BaseService service1=new BaseManager(new EmailManager(),new ValidationManager(),new UserManager(new HibernateUserDao()));
		
		service1.signUp(user1);
		service1.logIn(user1);
		
		System.out.println("--------");
		service1.signUp(user2);
		
		System.out.println("--------");
		service1.signUp(user3);
		
		System.out.println("--------");
		BaseService service2=new GoogleManagerAdapter();
		service2.logIn(user4);
		
		System.out.println("--------");
		service2.signUp(user4);
		
		System.out.println("--------");
		service2.logIn(user5);
		
		
		
		
		
	
  }


}



