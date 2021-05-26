package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmailVerificationService;
import kodlamaio.hrms.business.abstracts.EmployersService;
import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.core.constants.Messages;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.entities.concretes.EmailVerification;
import kodlamaio.hrms.entities.concretes.Employer;
import kodlamaio.hrms.entities.concretes.User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class EmployerManager implements EmployersService {
	private EmployerDao employerDao;
	private EmailVerificationService emailVerificationService;
	private UserService userService;

    @Autowired
    public EmployerManager(EmployerDao employerDao, EmailVerificationService emailVerificationService,
			UserService userService) {
		super();
		this.employerDao = employerDao;
		this.emailVerificationService = emailVerificationService;
		this.userService = userService;
	}

    @Override
    public DataResult<List<Employer>> getAll() {
        return new SuccessDataResult<>(this.employerDao.findAll(), Messages.EMPLOYER_SUCCESS_DATA_LISTED);
    }

    @Override
    public Result add(Employer employer) {
        if (employer.getEmail().isEmpty()) {
            return new ErrorResult(Messages.USER_ERROR_EMAIL_IS_BLANK);
        }
        if(!companyNameChecker(employer)) {
        	return new ErrorResult(Messages.EMPLOYER_ERROR_COMPANY_NAME_IS_BLANK);
        }
        if(!webSiteChecker(employer)) {
        	 return new ErrorResult(Messages.EMPLOYER_ERROR_WEBSITE_IS_BLANK);
        }
        if(!isRealEmployer(employer)) {
        	return new ErrorResult(Messages.USER_ERROR_EMAIL_IS_NOT_VALID);
        }
        if(!passwordNullChecker(employer)) {
        	return new ErrorResult(Messages.USER_ERROR_PASSWORD_IS_BLANK);
        }
        if(!isRealPhoneNumber(employer)) {
        	return new ErrorResult(Messages.EMPLOYER_ERROR_TELEPHONE_IS_BLANK);
        }
        if(!isEmailAlreadyRegistered(employer)) {
        	return new ErrorResult(Messages.USER_ERROR_EMAIL_ALREADY_EXISTS);
        }
        User savedUser = this.userService.add(employer);
		this.emailVerificationService.generateCode(new EmailVerification(),savedUser.getId());
        this.employerDao.save(employer);
        System.out.println("verification code sent ID : "+employer.getId());
        return new SuccessResult(Messages.EMPLOYER_SUCCESS_ADDED);
    }
    private boolean companyNameChecker(Employer employer) {
		if(employer.getCompanyName().isBlank() || employer.getCompanyName() == null) {
			return false;
		}
		return true;
	}
	
	private boolean webSiteChecker(Employer employer) {
		if(employer.getWebAddress().isBlank() || employer.getWebAddress() == null) {
			return false;
		}
		return true;
	}
	
	private boolean isRealEmployer(Employer employer) {
		 String regex = "^(.+)@(.+)$";
	     Pattern pattern = Pattern.compile(regex);
	     Matcher matcher = pattern.matcher(employer.getEmail());
	     if(!matcher.matches()) {
	    	 return false;
	     }
	     else if(!employer.getEmail().contains(employer.getWebAddress())) {
	    	return false; 
	     }
	     return true;
	     
	}
	
	private boolean isEmailAlreadyRegistered(Employer employer) {
		if(employerDao.findAllByEmail(employer.getEmail()).stream().count() != 0) {
			return false;
		}
		return true;
	}
	
	private boolean passwordNullChecker(Employer employer) {
		if(employer.getPassword().isBlank() || employer.getPassword() == null) {
			return false;
		}
		return true;
	}
	
	private boolean isRealPhoneNumber(Employer employer) {
		String patterns 
	      = "^(\\+\\d{1,3}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$" 
	      + "|^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?){2}\\d{3}$" 
	      + "|^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?)(\\d{2}[ ]?){2}\\d{2}$";
		Pattern pattern = Pattern.compile(patterns);
		Matcher matcher = pattern.matcher(employer.getPhoneNumber());
		if(!matcher.matches()) {
			return false;
		}
		return true;
		
	}
}