
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mesaj=" Bugün hava çok güzel. ";
		System.out.println(mesaj);
		System.out.println(mesaj.replace(' ', '-'));
		System.out.println(mesaj.substring(2));
		System.out.println(mesaj.substring(2,4));
		for(String m: mesaj.split(" ")) {
			System.out.println(m);
		}
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim());

	}

}
