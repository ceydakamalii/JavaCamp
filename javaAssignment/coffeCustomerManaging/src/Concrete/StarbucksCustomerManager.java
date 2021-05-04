package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager  {
	private CustomerCheckService customerCheckService;
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService=customerCheckService;
	}
	@Override
	public void save(Customer customer) throws Exception {
		
		if(customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		}else {
			System.out.println("Not a valid person : "+customer.getFirstName()+" "+customer.getLastName());
			throw new Exception("Not a valid person this " + customer);
		}
		
				
	}


}
