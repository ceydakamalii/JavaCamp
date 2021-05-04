
public class Main {

	public static void main(String[] args) {
		Student student1=new Student(1,"Ceyda","Kamali","ceydakamali@gmail.com","123","0123456789");
		Student student2=new Student();
		student2.setId(2);
		student2.setFirstName("Batuhan");
		student2.setLastName("Sahin");
		student2.seteMail("batusahin@gmail.com");
		student2.setPassword("456");
		student2.setCreditCardNo("123456789");
		
		String[] courseName=new String[] {"C#","Java+React","Python"};
		Instructor instructor=new Instructor(1,"Engin","Demirog","engin@gmail.com","789",courseName);
		
		Course course1=new Course(1,"C#","Engin Demirog");
		Course course2=new Course();
		course2.setId(2);
		course2.setName("Java+React");
		course2.setInstructorName("Engin Demirog");
		
		CourseManager courseManager=new CourseManager();
		courseManager.createCourse(course1);
		courseManager.removeCourse(course2);
		courseManager.updateCourse(course1);
		
		UserManager userManager=new UserManager();
		StudentManager studentManager=new StudentManager();
		InstructorManager instructorManager=new InstructorManager();
		userManager.logIn(instructor);
		userManager.logIn(student1);
		userManager.logIn(student2);
		userManager.logOut(instructor);
		userManager.logOut(student1);
		userManager.logOut(student2);
		studentManager.watchLesson(student1);
		studentManager.watchLesson(student2);
		instructorManager.createInstructor(instructor);
		instructorManager.updateInstructor(instructor);
		instructorManager.removeInstructor(instructor);
		instructorManager.startLesson(instructor);
		instructorManager.finishLesson(instructor);
		
		
	

		
		
	
		
	
		
		

	
	}

}
