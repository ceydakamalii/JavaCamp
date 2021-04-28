package homeworkWeek2;

public class Category {
	int id;
	String name;
	
	public Category(int id,String name) {
		System.out.println("Category constructor");
		this.id=id;
		this.name=name;
	}
	public Category() {
		System.out.println("Category constructor without parameter");
	}

}
