
public class Course {
	private int id;
	private String name;
	private String instructorName;
	
	public Course() {
		
	}
	
	public Course(int id, String name, String instructorName) {
		this.id = id;
		this.name = name;
		this.instructorName = instructorName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
	
	
	
	
	

}
