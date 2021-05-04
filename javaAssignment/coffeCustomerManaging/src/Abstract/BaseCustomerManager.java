package Abstract;
import Entities.Customer;
public abstract class BaseCustomerManager implements  CustomerService{
	//Kodun icerigi ayni kalicaksa abstract sinif olustururuz amac kodun implementasyonu yapmaktir.
	@Override
	public void save(Customer customer) throws Exception{
		System.out.println("Saved to database : "+customer.getFirstName()+" "+customer.getLastName());
	}

	
}
