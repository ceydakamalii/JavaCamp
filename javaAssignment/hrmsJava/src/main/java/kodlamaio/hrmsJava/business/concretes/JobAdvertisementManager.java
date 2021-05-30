package kodlamaio.hrmsJava.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrmsJava.business.abstracts.JobAdvertisementService;
import kodlamaio.hrmsJava.core.utilities.results.DataResult;
import kodlamaio.hrmsJava.core.utilities.results.ErrorResult;
import kodlamaio.hrmsJava.core.utilities.results.Result;
import kodlamaio.hrmsJava.core.utilities.results.SuccessDataResult;
import kodlamaio.hrmsJava.core.utilities.results.SuccessResult;
import kodlamaio.hrmsJava.dataAccess.abstracts.JobAdvertisementDao;
import kodlamaio.hrmsJava.entities.concretes.JobAdvertisement;

@Service
public class JobAdvertisementManager implements JobAdvertisementService{
	
	private JobAdvertisementDao jobAdvertisementDao;
	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
	}

	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("is ilani sisteme eklendi");
	}

	@Override
	public Result delete(int id) {
		if(!getById(id).getData().isEnable()) {
			this.jobAdvertisementDao.deleteById(id);
			return new SuccessResult("is ilani sistemden kaldirildi.");
		}else {
			return new ErrorResult("is ilani sistemden kaldirilamadi.");
		}
	}

	@Override
	public Result update(JobAdvertisement jobAdvertisement) {
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("is ilani guncellendi");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByJobTitle_Title(String title) {
		
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByjobTitle(title), "Listelendi");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByIsEnableTrue() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByEnableTrue(), "Listelendi.");
		
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByIsEnableTrueOrderByCreatedDesc() {
		// TODO Auto-generated method stub
		
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByEnableTrueOrderByCreatedAtDesc(),"Listelendi.");
	}
	@Override
	public DataResult<List<JobAdvertisement>> getByIsEnableTrueAndCompany_CompanyName(String companyName) {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByEnableTrueAndCompany_CompanyName(companyName),"Listelendi.");
		
	}

	@Override
	public DataResult<JobAdvertisement> getById(int id) {
		return new SuccessDataResult<JobAdvertisement>(this.jobAdvertisementDao.getOne(id));
	
	}

}
