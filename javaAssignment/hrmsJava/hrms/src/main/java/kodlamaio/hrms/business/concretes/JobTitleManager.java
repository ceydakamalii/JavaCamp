package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import kodlamaio.hrms.business.abstracts.JobTitleService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobTitleDao;
import kodlamaio.hrms.entities.concretes.JobTitle;
import kodlamaio.hrms.core.constants.Messages;

@Service
public class JobTitleManager implements JobTitleService {
    private JobTitleDao jobTitleDao;

    @Autowired
    public JobTitleManager(JobTitleDao jobTitleDao) {
        this.jobTitleDao = jobTitleDao;
    }

    @Override
    public DataResult<List<JobTitle>> getAll() {
        return new SuccessDataResult<>(this.jobTitleDao.findAll(), Messages.JOB_POSITION_SUCCESS_DATA_LISTED);
    }

    @Override
    public Result add(JobTitle jobTitle) {
       
            
        if(jobTitleDao.findAllByTitle(jobTitle.getPositionName()).stream().count() !=0 ) {
        	return new ErrorResult(Messages.JOB_POSITION_ERROR_ALREADY_EXISTS);
        }
        this.jobTitleDao.save(jobTitle);
        return new SuccessResult(Messages.JOB_POSITION_SUCCESS_ADDED);
    }
	@Override
	public DataResult<List<JobTitle>> findById(int id) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<JobTitle>>(this.jobTitleDao.findById(id),"Başarı Şekilde Listelendi");
	}

	@Override
    public DataResult<List<JobTitle>> findJobTitles(String title) {
        return new SuccessDataResult<List<JobTitle>>(this.jobTitleDao.findJobTitles(title),"Başarı Şekilde Listelendi");
    }



}