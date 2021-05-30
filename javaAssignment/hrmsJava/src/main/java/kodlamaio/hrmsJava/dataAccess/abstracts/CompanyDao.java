package kodlamaio.hrmsJava.dataAccess.abstracts;



import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrmsJava.entities.concretes.Company;

public interface CompanyDao extends JpaRepository<Company, Integer>{
	
	Company findByEmailEquals(String email);
	Company findByWebAddressEquals(String webSite);

}
