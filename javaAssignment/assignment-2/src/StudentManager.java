
public class StudentManager extends UserManager{
	
	
	
	public void watchLesson(Student student) {
		System.out.println("Lesson participant : "+student.getFirstName()+" "+student.getLastName());
	}

}
