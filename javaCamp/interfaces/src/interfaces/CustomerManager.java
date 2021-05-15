package interfaces;

public class CustomerManager {
	
	// 2 tip bagimlilik var , kodlarin losly olmasini isteriz.
	// 1-loosly 
	// 2-tightly coupled
	
	private Logger[] loggers;//loosly , Dependency injection
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}
	public void add(Customer customer) {
		System.out.println("Müsteri eklendi "+customer.getFirstName());
		
		//Tightly
		//DatabaseLogger logger=new DatabaseLogger();
		//logger.log(customer.getFirstName() + " veri tabanina loglandi.");
		
		//for(Logger logger: loggers) {
			//logger.log(customer.getFirstName());
		//}Kod tekrarý azaltmak içinyeni bir class olusturduk utils classý

		Utils.runLoggers(loggers, customer.getFirstName());
		//static metotlarý newlemeye gerek yok
		//Javada en ust classý static veremeyiz.
		
	}
	public void delete(Customer customer ) {
		System.out.println("Müsteri silindi "+customer.getFirstName());
		
		//Tightly
		//DatabaseLogger logger=new DatabaseLogger();
		//logger.log(customer.getFirstName() + " veri tabanina loglandi.");
		
		Utils.runLoggers(loggers, customer.getFirstName());
		
		
	}

}
