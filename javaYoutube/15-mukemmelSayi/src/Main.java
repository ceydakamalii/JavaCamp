import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        /*
         M�kemmel sayi:kendisinden k���k pozitif b�len sayisi toplam� kendisine e�it olan sayilar.
         6=1+2+3
         28=1+2+4+7+14 
        */
		System.out.println("Bir sayi giriniz = ");
		Scanner reader=new Scanner(System.in);
		int number=reader.nextInt();
		int total=0;
		for(int i=1;i<number;i++) {
			if(number%i==0) {
				total+=i;
			}
		}
		System.out.println("total = "+total);
		if(number==total) {
			System.out.println(number+" m�kemmel sayidir.");
		}
		else {
			System.out.println(number+" m�kemmel sayi de�ildir.");
		}
	}

}
