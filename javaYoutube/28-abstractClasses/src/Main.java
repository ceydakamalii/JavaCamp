
public class Main {

	public static void main(String[] args) {
		//abstarct siniflar referans tutucu g�revi vard�r tek baslarina bir sey ifade etmez.
		//abstract siniflar newlenemez.
		//newlenmesi i�in abstarct sinifin operasyonlarini ezmemiz gerekir.Bu y�ntemi kullanmayiz.
		
		//GameCalculator gameCalculator=new GameCalculator() {
			//@Override
			//public void hesapla() {
			//}
		//};
		
		GameCalculator gameCalculator=new WomanGameCalculator();
		//Bu sekilde yapildiginda WomanGameCalculator sinifina ozel metotlari kullanamayiz.

	}

}
