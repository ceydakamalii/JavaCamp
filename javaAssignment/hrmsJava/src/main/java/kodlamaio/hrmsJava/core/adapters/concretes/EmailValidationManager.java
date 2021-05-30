package kodlamaio.hrmsJava.core.adapters.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrmsJava.core.adapters.abstracts.EmailValidationService;
import kodlamaio.hrmsJava.core.adapters.abstracts.RegexService;

@Service
public class EmailValidationManager implements EmailValidationService{
	
	private RegexService regexService;
	
	@Autowired
	public EmailValidationManager(RegexService regexService) {
		super();
		this.regexService = regexService;
	}

	@Override
	public boolean emailValidation(String email) {
		return this.regexService.isEmailFormat(email);
	}

	@Override
	public boolean emailButtonClick(String email) {
		System.out.println("Dogrulama islemini onayladiniz, sisteme kaydiniz gerceklesti.");
		return true;
	}
	


}
