
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mesaj="Bug�n hava �ok g�zel";
		System.out.println(mesaj);
		System.out.println("Eleman Say�s� = "+mesaj.length());
		System.out.println("5.Eleman = "+ mesaj.charAt(4));
		System.out.println(mesaj.concat(". Ya�as�n!"));
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("."));
		char[] karakteler=new char[5];
		mesaj.getChars(0, 5, karakteler, 0);
		System.out.println(karakteler);
		System.out.println(mesaj.indexOf('a'));
		System.out.println(mesaj.indexOf("av"));
		System.out.println(mesaj.lastIndexOf('l'));
		System.out.println(mesaj.lastIndexOf('a'));
		System.out.println(mesaj.lastIndexOf("av"));
		
		
		
	}

}
