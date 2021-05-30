package kodlamaio.hrmsJava.core.adapters.abstracts;

import kodlamaio.hrmsJava.entities.concretes.Company;

public interface EmployeeValidationService {
	
	boolean isConfirmByEmployee(Company company);
}
