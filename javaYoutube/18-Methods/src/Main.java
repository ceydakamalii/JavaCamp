import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sayiBulmaca();

	}
	public static void sayiBulmaca() {
		int[] numbers=new int[] {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		System.out.println("Aranacak sayiyi giriniz = ");
		Scanner reader=new Scanner(System.in);
		int number=reader.nextInt();
		boolean varMi=false;
		for(int n: numbers) {
			if(number==n) {
				varMi=true;
				break;
			}
		}
		if(varMi==true) {
			mesajVer("Girilen eleman dizide mevcut: "+number);
		}
		else {
			mesajVer("Girilen eleman dizide mevcut deðil: "+number);
		
		}
	}
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
}
