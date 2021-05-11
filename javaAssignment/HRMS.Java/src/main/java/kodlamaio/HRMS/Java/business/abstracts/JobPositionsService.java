package kodlamaio.HRMS.Java.business.abstracts;
import java.util.List;
import kodlamaio.HRMS.Java.entities.concretes.JobPositions;

public interface JobPositionsService {
	List <JobPositions> getAll();

}
