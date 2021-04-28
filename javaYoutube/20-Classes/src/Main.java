
public class Main {

	public static void main(String[] args) {
		//Classlar Reference Typedir.(Stack+Heap)
		CustomerManager customerManager=new CustomerManager();
		CustomerManager customerManager2=new CustomerManager();
		customerManager=customerManager2;
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		//Value Type(int,double,float,boolean...)(Stack)
		int sayi1=10;
		int sayi2=20;
		sayi1=sayi2;
		sayi2=30;
		System.out.println("sayi1: "+sayi1+"  sayi2: "+sayi2);
		
		//Reference Type(arrays,String)
		int[] arr1=new int[] {1,2,3};
		int[] arr2=new int[] {4,5,6};
		arr2=arr1;
		arr1[0]=10;
		System.out.println("arr1[0]: "+arr1[0]+"  arr2[0]: "+arr2[0]);
		
		
	}

}
