package kodlamaio.hrmsJava.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrmsJava.business.abstracts.EmployeeService;
import kodlamaio.hrmsJava.core.utilities.results.DataResult;
import kodlamaio.hrmsJava.core.utilities.results.Result;
import kodlamaio.hrmsJava.core.utilities.results.SuccessDataResult;
import kodlamaio.hrmsJava.core.utilities.results.SuccessResult;
import kodlamaio.hrmsJava.dataAccess.abstracts.EmployeeDao;
import kodlamaio.hrmsJava.entities.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService{
	private EmployeeDao employeeDao;
	
	@Autowired
	public EmployeeManager(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}
	@Override
	public DataResult<List<Employee>> getAll() {
		
		return new SuccessDataResult<List<Employee>>(this.employeeDao.findAll(), "Sistem calisanlari basarili bir sekilde listelendi.");
	}
	@Override
	public Result add(Employee employee) {
		this.employeeDao.save(employee);
		return new SuccessResult("Sisteme "+employee.getFirstName()+" "+employee.getLastName()+" calisan olarak eklendi.");
	}

}
