package kodlamaio.hrmsJava.business.abstracts;

import kodlamaio.hrmsJava.core.utilities.results.DataResult;
import kodlamaio.hrmsJava.core.utilities.results.Result;
import kodlamaio.hrmsJava.entities.concretes.JobAdvertisement;
import java.util.List;
public interface JobAdvertisementService {
	Result add(JobAdvertisement jobAdvertisement);
	Result delete(int id);
	Result update(JobAdvertisement jobAdvertisement);
	DataResult<List<JobAdvertisement>> getByJobTitle_Title(String title);
	DataResult<List<JobAdvertisement>> getByIsEnableTrue();
	DataResult<List<JobAdvertisement>> getByIsEnableTrueOrderByCreatedDesc();
	DataResult<List<JobAdvertisement>> getByIsEnableTrueAndCompany_CompanyName(String companyName);
	DataResult<JobAdvertisement> getById(int id);
}
