package inheritance;

public class CustomerManager {
	public void add(Customer customer) {
		//customer onu extends eden s�n�flar�n referanslar�n� tutabilir.
		System.out.println(customer.customerNumber+" kaydedildi");
	}
	
	//bulk insert
	public void addMultiple(Customer[] customers) {
		for(Customer customer:customers) {
			add(customer);
		}
	}
}
//SOLID
//Open Closed Principle: Projede bir de�i�iklik oldu�u zaman hi�bir kodu de�i�tiremezsin yeni s�n�f olu�turabilirsin.
