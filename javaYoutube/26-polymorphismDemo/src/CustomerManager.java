
public class CustomerManager {
	private BaseLogger baseLogger;//field de�il nesne 
	public CustomerManager(BaseLogger baseLogger) {
		this.baseLogger=baseLogger;
	}
	public void add() {
		System.out.println("M�steri eklendi");
		this.baseLogger.log("log message");
		
	}

}
