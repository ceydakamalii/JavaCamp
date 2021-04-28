
public class Main {

	public static void main(String[] args) {
		String mesaj="Bugün hava çok güzel.";
		String yeniMesaj= mesaj.substring(0,2);
		System.out.println(yeniMesaj);
		int sayi=topla(5,7);
		System.out.println("Sayi: "+sayi);
		String sehir=sehirVer();
		System.out.println("Þehir: "+sehir);
		int toplam=topla2(1,2,3,4,5,6,7,8,9,10);
		System.out.println("Toplam: "+toplam);
		int toplam2=topla2();
		System.out.println("Toplam: "+toplam2);
		

	}
	public static void ekle()
	{
		System.out.println("Eklendi");
	}
	public static void sil()
	{
		System.out.println("Silindi");
	}
	public static void guncelle()
	{
		System.out.println("Güncellendi");
	}
	public static int topla(int a,int b) {
		return a+b;
	}
	//Variable Arguments
	public static int topla2(int... sayilar) {//birden fazla gelebilir demek için bu yapý kullanýlýr.
		int toplam=0;
		for(int sayi:sayilar) {
			toplam+=sayi;
		}
		return toplam;
	}
	public static String sehirVer() {
		return "Ýstanbul";
	}
	
}
