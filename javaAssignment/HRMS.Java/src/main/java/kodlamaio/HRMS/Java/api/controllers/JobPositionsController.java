package kodlamaio.HRMS.Java.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import kodlamaio.HRMS.Java.business.abstracts.JobPositionsService;
import kodlamaio.HRMS.Java.entities.concretes.JobPositions;

@RestController //Controller oldugunu söyler
@RequestMapping("/api/jobpositions")
public class JobPositionsController {
	
	private JobPositionsService jobPositionsService;
	
	@Autowired
	public JobPositionsController(JobPositionsService jobPositionsService) {
		super();
		this.jobPositionsService = jobPositionsService;
	}
	
	@GetMapping("/getall")
	public List<JobPositions> getAll(){
		return this.jobPositionsService.getAll();
	}
	
	
	

}
