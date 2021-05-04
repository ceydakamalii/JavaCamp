package Abstract;
import Entities.Customer;

public interface CustomerService {//Temel interface gorevi gorcek
	
	void save(Customer customer) throws Exception ;//database kayit

}
