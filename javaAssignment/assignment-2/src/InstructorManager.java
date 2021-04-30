
public class InstructorManager extends UserManager{
	

	public void createCourse(Instructor instructor,String courseName) {
		System.out.println(instructor.getFirstName()+" Course created : "+courseName);
	}
	public void updateCourse(Instructor instructor,String courseName) {
		System.out.println(instructor.getFirstName()+" Course updated : "+courseName);
	}
	public void removeCourse(Instructor instructor,String courseName) {
		System.out.println(instructor.getFirstName()+" Course removed : "+courseName);
	}
}
