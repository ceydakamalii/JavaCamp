
public class StudentManager extends UserManager{
	
	
	
	public void addCourse(Student student,String courseName) {
		System.out.println(student.getFirstName()+" Course added : "+courseName);
	}

}
