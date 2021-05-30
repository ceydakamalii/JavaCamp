package kodlamaio.hrmsJava.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrmsJava.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer>{
	
	List<JobAdvertisement> getByjobTitle(String title);
	List<JobAdvertisement> getByEnableTrue();
	List<JobAdvertisement> getByEnableTrueOrderByCreatedAtDesc();
	List<JobAdvertisement> getByEnableTrueAndCompany_CompanyName(String companyName);
	
}
