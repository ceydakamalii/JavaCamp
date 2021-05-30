package kodlamaio.hrmsJava.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrmsJava.entities.concretes.Verification;

public interface VerificationDao extends JpaRepository<Verification, Integer>{
	
	List<Verification> findByVerificationId(Integer verificationId);

}
