
public class Main {

	public static void main(String[] args) {
		//abstarct siniflar referans tutucu görevi vardýr tek baslarina bir sey ifade etmez.
		//abstract siniflar newlenemez.
		//newlenmesi için abstarct sinifin operasyonlarini ezmemiz gerekir.Bu yöntemi kullanmayiz.
		
		//GameCalculator gameCalculator=new GameCalculator() {
			//@Override
			//public void hesapla() {
			//}
		//};
		
		GameCalculator gameCalculator=new WomanGameCalculator();
		//Bu sekilde yapildiginda WomanGameCalculator sinifina ozel metotlari kullanamayiz.

	}

}
