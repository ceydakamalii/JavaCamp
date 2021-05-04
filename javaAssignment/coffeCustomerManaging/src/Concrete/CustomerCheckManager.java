package Concrete;
import Abstract.CustomerCheckService;
import Entities.Customer;


public class CustomerCheckManager implements CustomerCheckService {//Test ortami icin bunu kullanmadim 

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
	}

	
}
