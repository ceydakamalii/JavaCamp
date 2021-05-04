
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//interface onu implemet eden classin referansini tutabilir.
		CustomerManager customerManager=new CustomerManager(new MsSqlCustomerDal());
		customerManager.add();
		
			
			

	}

}
