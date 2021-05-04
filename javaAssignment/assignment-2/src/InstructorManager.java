
public class InstructorManager extends UserManager{
	
	
	public void createInstructor(Instructor instructor) {
		System.out.println("Instructor created : "+instructor.getFirstName());
	}
	public void updateInstructor(Instructor instructor) {
		System.out.println("Instructor updated : "+instructor.getFirstName());
	}
	public void removeInstructor(Instructor instructor) {
		System.out.println("Instructor removed : "+instructor.getFirstName());
	}
	public void startLesson(Instructor instructor) {
		System.out.println("Lesson initiator : "+instructor.getFirstName()+" "+instructor.getLastName());
		
	}
	public void finishLesson(Instructor instructor) {
		System.out.println("Lesson finisher : "+instructor.getFirstName()+" "+instructor.getLastName());
	}
}
