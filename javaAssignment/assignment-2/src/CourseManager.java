
public class CourseManager {
	public void createCourse(Course course) {
		System.out.println("Course created : "+course.getName());
	}
	public void updateCourse(Course course) {
		System.out.println("Course updated : "+course.getName());
	}
	public void removeCourse(Course course) {
		System.out.println("Course removed : "+course.getName());
	}

}
