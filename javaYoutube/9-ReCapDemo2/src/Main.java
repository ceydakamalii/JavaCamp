
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// double[] myList=new double[4];
		double[] myList = { 1.1, 2.3, 5.6, 4.5 };
		double doubleTotal = 0;
		double max = myList[0];
		for (double number : myList) {
			if (max < number) {
				max = number;
			}
			doubleTotal += number;
			System.out.println(number);
		}
		System.out.println("Toplamlarý = " + doubleTotal);
		System.out.println("En büyük sayi = " + max);
	}

}
