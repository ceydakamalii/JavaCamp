package kodlamaio.hrms.business.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CandidatesService;
import kodlamaio.hrms.business.abstracts.EmailVerificationService;
import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.entities.concretes.Candidate;
import kodlamaio.hrms.entities.concretes.EmailVerification;
import kodlamaio.hrms.entities.concretes.User;
import kodlamaio.hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.hrms.core.constants.Messages;
@Service
public class CandidateManager implements CandidatesService {
	
    private CandidateDao candidateDao;
    private EmailVerificationService emailVerificationService;
    private UserService userService;

    @Autowired
    public CandidateManager(CandidateDao candidateDao,EmailVerificationService emailVerificationService,UserService userService) {
        super();
    	this.candidateDao = candidateDao;
        this.emailVerificationService=emailVerificationService;
        this.userService=userService;
    }

    @Override
    public DataResult<List<Candidate>> getAll() {
        return new SuccessDataResult<>(this.candidateDao.findAll(), Messages.CANDIDATE_SUCCESS_DATA_LISTED);
    }

    @Override
    public Result add(Candidate candidate) {
      
        if(!firstNameChecker(candidate)) {
        	return new ErrorResult(Messages.CANDIDATE_ERROR_NAME_IS_BLANK);
        }
        if(!lastNameChecker(candidate)) {
        	 return new ErrorResult(Messages.CANDIDATE_ERROR_SURNAME_IS_BLANK);
        }
        if (candidate.getIdentityNumber().isEmpty())
            return new ErrorResult(Messages.CANDIDATE_ERROR_IDENTITY_NUMBER_IS_BLANK);
        if(!birthDateChecker(candidate)) {
        	return new ErrorResult(Messages.CANDIDATE_ERROR_YEAR_OF_BIRTH_IS_BLANK);
        }
        if(!emailNullChecker(candidate)) {
        	 return new ErrorResult(Messages.USER_ERROR_EMAIL_IS_BLANK);
        }
        if(!isRealEmail(candidate)) {
        	return new ErrorResult(Messages.USER_ERROR_EMAIL_ALREADY_EXISTS);
        }
        if(!passwordNullChecker(candidate)) {
        	return new ErrorResult(Messages.USER_ERROR_PASSWORD_IS_BLANK);
        }
        if(candidateDao.findAllByEmail(candidate.getEmail()).stream().count() != 0) {
        	return new ErrorResult("registered e-mail in the system");
        }
        if(candidateDao.findAllByIdentityNumber(candidate.getIdentityNumber()).stream().count() != 0) {
        	return new ErrorResult(Messages.CANDIDATE_ERROR_IDENTITY_NUMBER_ALREADY_EXISTS);
        }
        
        User savedUser=this.userService.add(candidate);
        this.emailVerificationService.generateCode(new EmailVerification(), savedUser.getId());
        this.candidateDao.save(candidate);
        System.out.println("verification code sent ID : "+candidate.getId());
        return new SuccessResult(Messages.CANDIDATE_SUCCESS_ADDED);
    }
	private boolean isRealEmail(Candidate candidate) {
		 String regex = "^(.+)@(.+)$";
	     Pattern pattern = Pattern.compile(regex);
	     Matcher matcher = pattern.matcher(candidate.getEmail());
	     if(!matcher.matches()) {
	    	 return false;
	     }
	     return true;
	     
	}
	private boolean firstNameChecker(Candidate candidate) {
		if(candidate.getFirstName().isBlank() || candidate.getFirstName().equals(null)) {
			return false;
		}
		return true;
	}
	
	private boolean lastNameChecker(Candidate candidate) {
		if(candidate.getLastName().isBlank() || candidate.getLastName().equals(null)) {
			return false;
		}
		return true;
	}
	
	private boolean birthDateChecker(Candidate candidate) {
		if(candidate.getBirthOfDate().equals(null)) {
			return false;
		}
		return true;
	}
	
	private boolean emailNullChecker(Candidate candidate) {
		if(candidate.getEmail().isBlank() || candidate.getEmail().equals(null)) {
			return false;
		}
		return true;
	}
	
	private boolean passwordNullChecker(Candidate candidate) {
		if(candidate.getPassword().isBlank() || candidate.getPassword().equals(null)) {
			return false;
		}
		return true;
	}
	
	


}