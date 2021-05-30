package kodlamaio.hrmsJava.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrmsJava.business.abstracts.JobTitleService;
import kodlamaio.hrmsJava.core.utilities.results.DataResult;
import kodlamaio.hrmsJava.core.utilities.results.ErrorResult;
import kodlamaio.hrmsJava.core.utilities.results.Result;
import kodlamaio.hrmsJava.core.utilities.results.SuccessDataResult;
import kodlamaio.hrmsJava.core.utilities.results.SuccessResult;
import kodlamaio.hrmsJava.dataAccess.abstracts.JobTitleDao;
import kodlamaio.hrmsJava.entities.concretes.JobTitle;

@Service
public class JobTitleManager implements JobTitleService {
	
	private JobTitleDao jobTitleDao;
	
	@Autowired
	public JobTitleManager(JobTitleDao jobTitleDao) {
		super();
		this.jobTitleDao = jobTitleDao;
	}
	@Override
	public DataResult<List<JobTitle>> getAll() {
		
		return new SuccessDataResult<List<JobTitle>>(this.jobTitleDao.findAll(), "Sistemde bulunan isler basarili sekilde listelendi.");
	}

	@Override
	public Result add(JobTitle jobTitle) {
		if(jobTitleDao.findAllByTitle(jobTitle.getTitle()).stream().count()!=0) {
			return new ErrorResult("İs ekleme Basarisiz, Sistemde mevcut olan bir isi sisteme tekrardan ekleyemezsiniz. ");
		}
		this.jobTitleDao.save(jobTitle);
		return new SuccessResult("Sisteme "+jobTitle.getTitle()+" isi basarili bir sekilde eklendi.");
	}

}
