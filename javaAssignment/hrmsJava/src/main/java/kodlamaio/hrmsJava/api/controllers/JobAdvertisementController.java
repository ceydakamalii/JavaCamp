package kodlamaio.hrmsJava.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrmsJava.business.abstracts.JobAdvertisementService;
import kodlamaio.hrmsJava.core.utilities.results.DataResult;
import kodlamaio.hrmsJava.core.utilities.results.Result;
import kodlamaio.hrmsJava.entities.concretes.JobAdvertisement;

@RestController
@RequestMapping("/api/jobAdvertisement")
public class JobAdvertisementController {
	
	private JobAdvertisementService jobAdvertisementService;
	@Autowired
	public JobAdvertisementController(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService = jobAdvertisementService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobAdvertisement jobAdvertisement) {
		
		return this.jobAdvertisementService.add(jobAdvertisement);
	}
	@PostMapping("/delete")
	public Result delete(int id) {
		
		return this.jobAdvertisementService.delete(id);
	}
	@PostMapping("/update")
	public Result update(JobAdvertisement jobAdvertisement) {
		return this.jobAdvertisementService.update(jobAdvertisement);
	}
	@GetMapping("/getByIsTrue")
	public DataResult<List<JobAdvertisement>> getByIsEnableTrue(){
		return this.jobAdvertisementService.getByIsEnableTrue();
	}
	@GetMapping("/getByJobTitle")
	public DataResult<List<JobAdvertisement>> getByJobTitle_Title(String title){
		return this.jobAdvertisementService.getByJobTitle_Title(title);
	}
	@GetMapping("/orderByCreatedAtDesc")
	public DataResult<List<JobAdvertisement>> getByIsEnableTrueOrderByCreatedDesc(){
		return this.jobAdvertisementService.getByIsEnableTrueOrderByCreatedDesc();
	}
	@GetMapping("/getByCompanyName")
	public DataResult<List<JobAdvertisement>> getByIsEnableTrueAndCompany_CompanyName(String companyName){
		return this.jobAdvertisementService.getByIsEnableTrueAndCompany_CompanyName(companyName);
	}

}
