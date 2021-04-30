
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
		Instructor instructor=new Instructor(1,"Engin","Demiroğ","engin@gmail.com","789",courseName);
		UserManager userManager=new UserManager();
		StudentManager studentManager=new StudentManager();
		InstructorManager instructorManager=new InstructorManager();
		userManager.logIn(instructor);
		userManager.logIn(student1);
		userManager.logIn(student2);
		userManager.logOut(instructor);
		userManager.logOut(student1);
		userManager.logOut(student2);
		studentManager.addCourse(student1, courseName[0]);
		studentManager.addCourse(student1, courseName[1]);
		instructorManager.createCourse(instructor, courseName[2]);
		instructorManager.updateCourse(instructor, courseName[1]);
		instructorManager.removeCourse(instructor, courseName[0]);
		
	

		
		
	
		
	
		
		

	
	}

}
