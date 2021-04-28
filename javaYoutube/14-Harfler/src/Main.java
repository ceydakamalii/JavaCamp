import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bir harf giriniz: ");
		Scanner reader=new Scanner(System.in);
		String letter=reader.nextLine();
		letter=letter.toUpperCase();
		char newletter=letter.charAt(0);
		switch(newletter) {
		case 'A':
		case 'I':
		case 'U':
		case 'O':
			System.out.println("Girilen harf kalýn sesli harftir.");
			break;
		case 'E':
		case 'Ý':
		case 'Ü':
		case 'Ö':
			System.out.println("Girilen harf ince sesli harftir.");
			break;
		default:
			System.out.println("Girilen harf sesli bir harf deðildir.");
		}
		
		
	}

}
