package kodlamaio.hrms.core.constants;

public class Messages {
	//User
    public static String USER_ERROR_EMAIL_IS_BLANK = "User's email address is blank";
    public static String USER_ERROR_EMAIL_IS_NOT_VALID = "User's email is not valid";
    public static String USER_ERROR_EMAIL_ALREADY_EXISTS = "User's email already exists";
    public static String USER_ERROR_PASSWORD_IS_BLANK = "User's password is blank";

    // Job Position
    public static String JOB_POSITION_SUCCESS_DATA_LISTED = "Job positions Listed";
    public static String JOB_POSITION_SUCCESS_ADDED = "Job position added";
    public static String JOB_POSITION_ERROR_ALREADY_EXISTS = "Job position already exists";

    //Candidate
    public static String CANDIDATE_SUCCESS_DATA_LISTED = "Candidates listed";
    public static String CANDIDATE_SUCCESS_ADDED = "Candidate added";

    public static String CANDIDATE_ERROR_NAME_IS_BLANK = "Candidate's name is blank";
    public static String CANDIDATE_ERROR_SURNAME_IS_BLANK = "Candidate's surname is blank";
    public static String CANDIDATE_ERROR_IDENTITY_NUMBER_IS_BLANK = "Candidate's identity number is blank";
    public static String CANDIDATE_ERROR_YEAR_OF_BIRTH_IS_BLANK = "Candidate's year of birth is blank";
    public static String CANDIDATE_ERROR_IDENTITY_NUMBER_ALREADY_EXISTS = "Candidate's identity number already exists";

    //Employer
    public static String EMPLOYER_SUCCESS_DATA_LISTED = "Employers listed";
    public static String EMPLOYER_SUCCESS_ADDED = "Employer added";
    public static String EMPLOYER_ERROR_COMPANY_NAME_IS_BLANK = "Employer's company name is blank";
    public static String EMPLOYER_ERROR_WEBSITE_IS_BLANK = "Employer's website is blank";
    public static String EMPLOYER_ERROR_TELEPHONE_IS_BLANK = "Employer's telephone number is blank";
}
