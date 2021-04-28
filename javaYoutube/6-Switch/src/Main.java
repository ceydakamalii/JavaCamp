
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'A';
		switch (grade) {
		case 'A':
			System.out.println("Mükemmel : Geçtiniz.");
			break;
		case 'B':
		case 'C':
			System.out.println("Ýyi : Geçtiniz");
			break;
		case 'D':
			System.out.println("Fena Deðil : Geçtiniz");
			break;
		case 'F':
			System.out.println("Fena Deðil : Geçtiniz");
			break;
		default:
			System.out.println("Geçersiz not girdiniz");
		}

	}

}
