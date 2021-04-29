
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//EmailLogger logger=new EmailLogger();
		//logger.Log(" Log Message ");
		
		//BaseLogger[] loggers=new BaseLogger[] {new FileLogger(),new EmailLogger(),new DatabaseLogger(),new ConsoleLogger()};
		//for(BaseLogger logger:loggers) {
			//logger.Log("Log message");
			
		//}
		
		CustomerManager customerManager=new CustomerManager(new DatabaseLogger());
		customerManager.add();
		CustomerManager customerManager2=new CustomerManager(new FileLogger());
		customerManager2.add();

	}

}
