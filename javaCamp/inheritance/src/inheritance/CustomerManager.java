package inheritance;

public class CustomerManager {
	public void add(Customer customer) {
		//customer onu extends eden sýnýflarýn referanslarýný tutabilir.
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
//Open Closed Principle: Projede bir deðiþiklik olduðu zaman hiçbir kodu deðiþtiremezsin yeni sýnýf oluþturabilirsin.
