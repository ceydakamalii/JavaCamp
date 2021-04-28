
public class Main {

	public static void main(String[] args) {
		// For
		for(int i=1;i<10;i++) {
			System.out.println(i);
		}
		System.out.println("For Döngüsü bitti");
		// While
		int i=1;
		while(i<10) {
			System.out.println(i);
			i+=2;
		}
		System.out.println("While döngüsü bitti");
		// Do-While
		int j=1;
		do {
			System.out.println(j);
			j+=2;
		}while(j<10);
		int k=10;
		do {
			System.out.println("k = "+k);
		}while(k<5);
		
		System.out.println("Do-While döngüsü bitti");

	}

}
