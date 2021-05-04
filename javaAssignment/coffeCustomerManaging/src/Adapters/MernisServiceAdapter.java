package Adapters;
import java.rmi.RemoteException;
import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
public class MernisServiceAdapter implements CustomerCheckService {//gercek sistemlerde kullanilir bunu kullandim.

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy client=new KPSPublicSoapProxy();
		boolean result;
		try {
			result=client.TCKimlikNoDogrula(
					Long.parseLong(customer.getNationalityId()),
					customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(),
					customer.getDateOfBirth().getYear());
			return result;
		}catch(RemoteException e){
			e.printStackTrace();
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}
		
		return false;
		
	}

}
