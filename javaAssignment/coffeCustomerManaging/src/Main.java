import java.sql.Date;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BaseCustomerManager baseCustomerManager=new NeroCustomerManager();
		baseCustomerManager.save(new Customer(1,"Ceyda","Kamalý",new Date(2000,7,12),"3295756096748"));
		
		BaseCustomerManager baseCustomerManager2=new StarbucksCustomerManager(new MernisServiceAdapter());
		baseCustomerManager2.save(new Customer(1,"Ceyda","Kamalý",new Date(2000,7,12),"32873096748"));
		

	}

}
