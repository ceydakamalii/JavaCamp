package intro;

public class Main {

	public static void main(String[] args) {
		//camelCase(ilk kelimenin ilk harfi k���k di�er kelimelerin ilk harfi b�y�k)
		//Don't repeat yourself
		String internetSubeButonu="�nternet �ubesi";
		double dolarDun=8.20;
		double dolarBugun=8.20;
		int vade=36;
		boolean dustuMu=false;
		
		System.out.println(internetSubeButonu);
		
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar d��t� resmi");
		}else if(dolarBugun==dolarDun) {
			System.out.println("Dolar e�ittir resmi");
		}
		else {
			System.out.println("Dolar y�kseldi resmi");
		}
		
		String kredi1="H�zl� Kredi";
		String kredi2="Mutlu emekli Kredisi";
		String kredi3="Konut Kredisi";
		String kredi4="�ift�i Kredisi";
		String kredi5="Msb Kredisi";
		String kredi6="Meb Kredisi";
		String kredi7="K�lt�r bakanl��� Kredisi";
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		System.out.println(kredi6);
		System.out.println(kredi7);
		
		String[] krediler=
			{
				"H�zl� Kredi",
				"Mutlu emekli Kredisi",
				"Konut Kredisi",
				"�it�i Kredisi",
				"Msb Kredisi",
				"Meb Kredisi",
				"K�lt�r bakanl��� Kredisi"
			};
		//foreach
		for(String kredi : krediler) {
			System.out.println(kredi);
		}
		
		for(int i=0;i<krediler.length;i++) {
			System.out.println(krediler[i]);
		}
		// Referans Tipler ve De�er Tipleri
		//De�er Tipleri : int,double,boolean...Stackte �al���rlar atamalar de�eri �zerinden yap�l�r.
		//De�er tiplerinde de�er atamas� yap�ld�ktan sonra ba�lant� kopar.
		int sayi1=10;
		int sayi2=20;
		sayi1=sayi2;
		sayi2=100;
		System.out.println(sayi1);//20
		//Referans Tipler: Array,String,Class,Interface,Abstract
		//Hem stack hem Heapte �al���r.
		//E�itlikte asl�nda adresler e�itlenir yani heapte ikiside ayn� adreste bulunuyo olur.
		//Adresler e�itlendikten sonrada ba�lant� kopmaz.
		//E�itlik sonras� bo� kalan sayilar1 heap alan� garbage collectionla yok edilir.
		int[] sayilar1= {1,2,3,4,5};
		int[] sayilar2= {20,30,40,50};
		sayilar1=sayilar2;
		sayilar2[0]=100;
		System.out.println(sayilar1[0]);//100
		//Stringler referans tipi olsada de�er tipi gibi �al���yor istisnaa
		String sehir1="Ankara";
		String sehir2="�stanbul";
		sehir1=sehir2;
		sehir2="�zmir";
		System.out.println(sehir1);//�stanbul
		
	}

}
