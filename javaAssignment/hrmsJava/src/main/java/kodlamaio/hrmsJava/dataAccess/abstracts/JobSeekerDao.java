package kodlamaio.hrmsJava.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrmsJava.entities.concretes.JobSeeker;

public interface JobSeekerDao extends JpaRepository<JobSeeker, Integer> {
	List<JobSeeker> findByEmailEquals(String email);
	List<JobSeeker> findByNationalityIdEquals(String nationalityId);

}
