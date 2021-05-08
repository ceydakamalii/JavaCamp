package business.abstracts;

public interface EmailService {
	void send(String message);//Dogrulama mesaj
	void reply(String message);//cevap mesaj

}