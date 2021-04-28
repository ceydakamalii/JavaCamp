
public class Main {

	public static void main(String[] args) {
		String[] ogrenciler = new String[3];
		ogrenciler[0]="Engin";
		ogrenciler[1]="Derin";
		ogrenciler[2]="Tolga";
		for(int i=0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}
		//foreach
		for(String ogrenci: ogrenciler) {
			System.out.println(ogrenci);
		}
		

	}

}
