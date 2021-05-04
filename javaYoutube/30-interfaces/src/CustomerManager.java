
public class CustomerManager {
	private ICustomerDal customerDal;
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal=customerDal;
	}
	public void add() {
		//is kodlari yazilir.
		System.out.println("Veri eklenmeye basladi...");
		customerDal.add();
		
	}

}
