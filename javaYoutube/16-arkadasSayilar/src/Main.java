import java.util.*;
public class Main {

	public static void main(String[] args) {
		/*
		 Bilinen en k���k arkada� say�lar 220-284 t�r.
		 Bir say�n�n pozitif b�len say�s� toplam� ile di�er say� e�it olucak di�er say�n�n pozitif b�len say�s� toplam� ile di�er say� e�it olucak
		 */
		Scanner reader=new Scanner(System.in);
		System.out.println("�lk sayiyi giriniz = ");
		int number1=reader.nextInt();
		System.out.println("�lk sayiyi giriniz = ");
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
			System.out.println("Bu iki sayi arkada� sayilardir.");
		}
		else {
			System.out.println("Bu iki sayi arkada� sayi de�ildir.");
		}
	
		
	}

}
