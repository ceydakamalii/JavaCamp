package business.concretes;

import business.abstracts.EmailService;

public class EmailManager implements EmailService {

	@Override
	public void send(String message) {
		System.out.println("verification email : "+ message);
	}
	public void reply(String message) {
		System.out.println("Your account has been verified. "+message);
	}


}
