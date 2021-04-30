
public class Student extends User{
	private String creditCardNo;
	
	public Student() {
		
	}

	public Student(int id, String firstName, String lastName, String eMail, String password, String creditCardNo) {
		super(id, firstName, lastName, eMail, password);
		this.creditCardNo = creditCardNo;
	}

	public String getCreditCardNo() {
		return creditCardNo;
	}

	public void setCreditCardNo(String creditCardNo) {
		this.creditCardNo = creditCardNo;
	}
	

	
	

}
