package homeworkWeek2;

public class CardManager {
	public  void addToCard(Card card) {	
		System.out.println("Card Added: "+card.courseName);

	}
	public void removeCard(Card card) {
	
		System.out.println("Card Removed: "+card.courseName);
	
		
	}
	public void updateCard(Card card) {
		System.out.println("Card Updated: "+card.courseName);
		
	}
}
