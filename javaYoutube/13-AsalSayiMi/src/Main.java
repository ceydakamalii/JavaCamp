import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Bir sayi giriniz : ");
		int number = reader.nextInt();
		int remainder;
		boolean isPrime=true;//number asal
		if(number<1) {
			System.out.println("Geçersiz sayidir.");
			return;
		}
		if(number==1) {
			isPrime=false;
		}
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				isPrime=false;
			}
		}
		if(isPrime) {
			System.out.println("Sayi asaldýr.");
		}else {
			System.out.println("Sayi asal deðil.");
		}
		
	}

}
