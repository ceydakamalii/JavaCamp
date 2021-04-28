package homeworkWeek2;

public class StudentManager {
	public void addStudent(Student student) {
		System.out.println("Student Added: "+student.name);
	}
	public void removeStudent(Student student) {
		System.out.println("Student Removed: "+student.name);
	}
	public void signIn(Student student) {
		System.out.println("Login : "+student.name+student.surname);
	}
	public void signOut(Student student) {
		System.out.println("Exit : "+student.name+student.surname);
	}

}
