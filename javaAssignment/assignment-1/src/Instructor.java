
public class Instructor {
	int id;
	String name;
	public Instructor(int id,String name) {
		System.out.println("Instructor constructor");
		this.id=id;
		this.name=name;
	}
	public Instructor() {
		System.out.println("Instructor constructor without parameter ");
	}
}

