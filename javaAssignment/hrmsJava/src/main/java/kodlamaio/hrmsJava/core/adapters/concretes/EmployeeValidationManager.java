package kodlamaio.hrmsJava.core.adapters.concretes;

import org.springframework.stereotype.Service;

import kodlamaio.hrmsJava.core.adapters.abstracts.EmployeeValidationService;
import kodlamaio.hrmsJava.entities.concretes.Company;
@Service
public class EmployeeValidationManager implements EmployeeValidationService{

	@Override
	public boolean isConfirmByEmployee(Company company) {
		System.out.println("Sistem calisani "+company.getCompanyName()+" sirketinin kayit onayini gerceklestirdi.");
		return true;
	}

}
