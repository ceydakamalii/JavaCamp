package kodlamaio.HRMS.Java.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.Java.entities.concretes.JobPositions;

public interface JobPositionsDao extends JpaRepository<JobPositions, Integer> {

}
