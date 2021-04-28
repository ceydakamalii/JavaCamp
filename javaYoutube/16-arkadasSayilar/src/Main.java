import java.util.*;
public class Main {

	public static void main(String[] args) {
		/*
		 Bilinen en küçük arkadaþ sayýlar 220-284 tür.
		 Bir sayýnýn pozitif bölen sayýsý toplamý ile diðer sayý eþit olucak diðer sayýnýn pozitif bölen sayýsý toplamý ile diðer sayý eþit olucak
		 */
		Scanner reader=new Scanner(System.in);
		System.out.println("Ýlk sayiyi giriniz = ");
		int number1=reader.nextInt();
		System.out.println("Ýlk sayiyi giriniz = ");
		int number2=reader.nextInt();
		int total1=0;
		int total2=0;
		for(int i=1;i<number1;i++) {
			if(number1%i==0) {
				total1+=i;
			}
		}
		for(int j=1;j<number2;j++) {
			if(number2%j==0) {
				total2+=j;
			}
		}
		System.out.println("total1 = "+total1);
		System.out.println("total2 = "+total2);
		if(number1==total2&&number2==total1) {
			System.out.println("Bu iki sayi arkadaþ sayilardir.");
		}
		else {
			System.out.println("Bu iki sayi arkadaþ sayi deðildir.");
		}
	
		
	}

}
