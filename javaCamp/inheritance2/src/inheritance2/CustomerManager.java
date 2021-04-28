package inheritance2;

public class CustomerManager {
	public void add(Logger logger) {
		
		//müþteri ekleme kodlarý
		System.out.println("Müþteri eklendi.");
		
		logger.log();
	}

}
//iþ yapan sýnýf baþka bir bir iþ yapan sýnýfý kullancaksa somut sýnýflarý(databaselogger,filelogger..) kullanmaz.
