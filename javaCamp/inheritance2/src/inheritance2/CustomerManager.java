package inheritance2;

public class CustomerManager {
	public void add(Logger logger) {
		
		//m��teri ekleme kodlar�
		System.out.println("M��teri eklendi.");
		
		logger.log();
	}

}
//i� yapan s�n�f ba�ka bir bir i� yapan s�n�f� kullancaksa somut s�n�flar�(databaselogger,filelogger..) kullanmaz.
