package homeworkWeek2;

public class Main {

	public static void main(String[] args) {
		System.out.println("*****************************************");
		
		Student student1=new Student(1,"Ceren","Yilmaz","12345@gmail.com");
		
		Student student2=new Student();
		student2.id=2;
		student2.name="Murat";
		student2.surname="Ay";
		student2.eMail="67890@gmail.com";
		
		Student[] students={student1,student2};
		for(Student student:students) {
			System.out.println(student.id+"-Student name and surname : "+student.name+" "+student.surname);
		}
		
		System.out.println("*****************************************");
		
		Instructor instructor1=new Instructor(1,"Engin Demiroð");
		
		Instructor instructor2=new Instructor();
		instructor2.id=2;
		instructor2.name="Can Sahin";
		
		Instructor[] instructors=new Instructor[] {instructor1,instructor2};
		for(Instructor instructor:instructors) {
			System.out.println(instructor.id+"-Instructor name : "+instructor.name);
		}
		
		System.out.println("*****************************************");
		
		Category category1=new Category(1,"My courses");
		Category category2=new Category(2,"All courses");
		Category category3=new Category(3,"Preparing for the camp");
		Category category4=new Category(4,"Frequently asked Questions");
		
		Category[] categories= {category1,category2,category3,category4};
		for(Category category:categories) {
			System.out.println(category.id+"-Category name : "+category.name);
		}
		
		System.out.println("*****************************************");
		
		Card card1=new Card(1,
						"Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)",
						"2 ay sürecek Yazýlým Geliþtirici Yetiþtirme Kampýmýzýn takip, döküman ve duyurularýný... ",
						"Engin Demiroð",
						"Ücretsiz");
		Card card2=new Card(2,
				"Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)",
				"2 ay sürecek Yazýlým Geliþtirici Yetiþtirme Kampýmýzýn takip, döküman ve duyurularýný... ",
				"Engin Demiroð",
				"Ücretsiz");
		Card card3=new Card(3,
				"Programlamaya giriþ için Temel Kurs",
				"Python,Java,C# gibi tüm programlama dilleri için temel programlama mantýðý anlaþýlýr.",
				"Engin Demiroð",
				"Ücretsiz");
		
		Card[] cards= {card1,card2,card3};
		for(Card card:cards) {
			System.out.println(card.id+"-Course name : "+card.courseName);
		}
		
		System.out.println("*****************************************");
		
		CardManager cardManager=new CardManager();
		cardManager.addToCard(card1);
		cardManager.removeCard(card3);
		cardManager.updateCard(card2);
		
		System.out.println("*****************************************");
		
		StudentManager studentManager=new StudentManager();
		studentManager.addStudent(student1);
		studentManager.removeStudent(student2);
		studentManager.signIn(student1);
		studentManager.signOut(student2);
		
		System.out.println("*****************************************");
		
		CategoryManager categoryManager=new CategoryManager();
		categoryManager.addCategory(category4);
		categoryManager.removeCategory(category3);
		categoryManager.updateCategory(category1);
		
		System.out.println("*****************************************");
		
		
		
		
		
		
		

	}

}
