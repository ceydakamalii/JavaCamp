package kodlamaio.hrms.services;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Service;

@Service
public class FakeMernis {
	public static boolean validate(String tcNo) {

		 String regex = "^[0-9]+$";
	     Pattern pattern = Pattern.compile(regex);
	     Matcher matcher = pattern.matcher(tcNo);
	     
		if(tcNo.length() > 11) {
			return false;
		}
		
		else if(matcher.matches() && !tcNo.startsWith("0")) {
			return true;
		}
		
		
		
		else {
			return false;
		}
		
	}
}
