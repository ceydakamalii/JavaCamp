package kodlamaio.hrmsJava.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import kodlamaio.hrmsJava.entities.concretes.User;
import kodlamaio.hrmsJava.business.abstracts.UserService;
import kodlamaio.hrmsJava.core.utilities.results.DataResult;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	private UserService userService;
	@Autowired
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@GetMapping("/getAll")
	@ResponseBody
	public DataResult<List<User>>  getAll(){
		return this.userService.getAll();
	}
}
