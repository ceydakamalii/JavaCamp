
public class Instructor extends User{
	private String[] courseName;
	public Instructor() {
		
	}
	public Instructor(int id, String firstName, String lastName, String eMail, String password, String[] courseName) {
		super(id, firstName, lastName, eMail, password);
		this.courseName = courseName;
	}
	public String[] getCourseName() {
		return courseName;
	}
	public void setCourseName(String[] courseName) {
		this.courseName = courseName;
	}
	

}
