package intro;

public class Main {

	public static void main(String[] args) {
		//camelCase(ilk kelimenin ilk harfi küçük diðer kelimelerin ilk harfi büyük)
		//Don't repeat yourself
		String internetSubeButonu="Ýnternet Þubesi";
		double dolarDun=8.20;
		double dolarBugun=8.20;
		int vade=36;
		boolean dustuMu=false;
		
		System.out.println(internetSubeButonu);
		
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar düþtü resmi");
		}else if(dolarBugun==dolarDun) {
			System.out.println("Dolar eþittir resmi");
		}
		else {
			System.out.println("Dolar yükseldi resmi");
		}
		
		String kredi1="Hýzlý Kredi";
		String kredi2="Mutlu emekli Kredisi";
		String kredi3="Konut Kredisi";
		String kredi4="Çiftçi Kredisi";
		String kredi5="Msb Kredisi";
		String kredi6="Meb Kredisi";
		String kredi7="Kültür bakanlýðý Kredisi";
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		System.out.println(kredi6);
		System.out.println(kredi7);
		
		String[] krediler=
			{
				"Hýzlý Kredi",
				"Mutlu emekli Kredisi",
				"Konut Kredisi",
				"Çitçi Kredisi",
				"Msb Kredisi",
				"Meb Kredisi",
				"Kültür bakanlýðý Kredisi"
			};
		//foreach
		for(String kredi : krediler) {
			System.out.println(kredi);
		}
		
		for(int i=0;i<krediler.length;i++) {
			System.out.println(krediler[i]);
		}
		// Referans Tipler ve Deðer Tipleri
		//Deðer Tipleri : int,double,boolean...Stackte çalýþýrlar atamalar deðeri üzerinden yapýlýr.
		//Deðer tiplerinde deðer atamasý yapýldýktan sonra baðlantý kopar.
		int sayi1=10;
		int sayi2=20;
		sayi1=sayi2;
		sayi2=100;
		System.out.println(sayi1);//20
		//Referans Tipler: Array,String,Class,Interface,Abstract
		//Hem stack hem Heapte çalýþýr.
		//Eþitlikte aslýnda adresler eþitlenir yani heapte ikiside ayný adreste bulunuyo olur.
		//Adresler eþitlendikten sonrada baðlantý kopmaz.
		//Eþitlik sonrasý boþ kalan sayilar1 heap alaný garbage collectionla yok edilir.
		int[] sayilar1= {1,2,3,4,5};
		int[] sayilar2= {20,30,40,50};
		sayilar1=sayilar2;
		sayilar2[0]=100;
		System.out.println(sayilar1[0]);//100
		//Stringler referans tipi olsada deðer tipi gibi çalýþýyor istisnaa
		String sehir1="Ankara";
		String sehir2="Ýstanbul";
		sehir1=sehir2;
		sehir2="Ýzmir";
		System.out.println(sehir1);//Ýstanbul
		
	}

}
