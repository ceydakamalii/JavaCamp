package homeworkWeek2;

public class Card {
	int id;
	String courseName;
	String description;
	String instructor;
	String price;
	
	public Card(int id,String courseName,String description,String instructor,String price) {
		System.out.println("Card constructor");
		this.id=id;
		this.courseName=courseName;
		this.description=description;
		this.instructor=instructor;
		this.price=price;
	}
	public Card() {
		System.out.println("Card constructor without parameter");
	}
	

}
