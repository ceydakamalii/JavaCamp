package kodlamaio.hrmsJava.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrmsJava.business.abstracts.CompanyService;
import kodlamaio.hrmsJava.core.adapters.abstracts.EmailValidationService;
import kodlamaio.hrmsJava.core.adapters.abstracts.EmployeeValidationService;
import kodlamaio.hrmsJava.core.adapters.abstracts.RegexService;
import kodlamaio.hrmsJava.core.utilities.results.DataResult;
import kodlamaio.hrmsJava.core.utilities.results.ErrorResult;
import kodlamaio.hrmsJava.core.utilities.results.Result;
import kodlamaio.hrmsJava.core.utilities.results.SuccessDataResult;
import kodlamaio.hrmsJava.core.utilities.results.SuccessResult;
import kodlamaio.hrmsJava.dataAccess.abstracts.CompanyDao;
import kodlamaio.hrmsJava.entities.concretes.Company;

@Service
public class CompanyManager implements CompanyService {
	private CompanyDao companyDao;
	private RegexService regexService;
	private EmployeeValidationService employeeValid;
	private EmailValidationService emailValidationService;

	@Autowired
	public CompanyManager(CompanyDao companyDao, RegexService regexService, EmployeeValidationService employeeValid,
			EmailValidationService emailValidationService) {
		super();
		this.companyDao = companyDao;
		this.regexService = regexService;
		this.employeeValid = employeeValid;
		this.emailValidationService = emailValidationService;
	}

	@Override
	public DataResult<List<Company>> getAll() {
		return new SuccessDataResult<List<Company>>(this.companyDao.findAll(),
				"Sistemde kayitli olan sirketler listelendi.");
	}

	@Override
	public Result add(Company company) {
		if (company.getCompanyName().isEmpty() || company.getWebAddress().isEmpty()
				|| company.getPhoneNumber().isEmpty() || company.getEmail().isEmpty()
				|| company.getPassword().isEmpty()) {
			return new ErrorResult("Sisteme sirket ekleme isi basarisiz, Bos alan birakmamalisin.");
		}
		String email = company.getEmail();
		String[] emailSplit = email.split("@");
		if (!emailSplit[1].equals(company.getWebAddress())) {
			return new ErrorResult("Sisteme sirket ekleme isi basarisiz, email ve web adres ayni domainde olmali.");
		}
		if (companyDao.findByEmailEquals(company.getEmail()) != null
				|| companyDao.findByWebAddressEquals(company.getWebAddress()) != null) {
			return new ErrorResult("Sisteme sirket ekleme isi basarisiz, sistemde mevcut olan email veya web adresi girdiniz.");
		}
		if (!regexService.isPhoneNumberFormat(company.getPhoneNumber())) {
			return new ErrorResult(
					"Sisteme sirket ekleme isi basarisiz, girilen telefon numarası istenilen formatta degil");
		}

		if (companyDao.findByWebAddressEquals(company.getWebAddress()) != null) {
			return new ErrorResult("Sisteme sirket ekleme isi basarisiz, sistemde mevcut olan web site girdiniz");
		}
		if (!emailValidationService.emailValidation(company.getEmail())) {
			return new ErrorResult("Sisteme sirket ekleme isi basarisiz, email alani istenilen formatta degil.");
		}
		if (!employeeValid.isConfirmByEmployee(company)) {
			return new ErrorResult("Sisteme sirket ekleme isi basarisiz, hesabiniz dogrulanmadi.");
		} else {
			this.companyDao.save(company);
			return new SuccessResult("Sisteme " + company.getCompanyName() + " sirketi basarili sekilde eklendi.");
		}

	}

}
