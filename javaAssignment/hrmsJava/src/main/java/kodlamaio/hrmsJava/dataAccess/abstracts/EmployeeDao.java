package kodlamaio.hrmsJava.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrmsJava.entities.concretes.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer>{
	
}
