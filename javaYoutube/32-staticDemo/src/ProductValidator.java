
public class ProductValidator {
	
	static {
		System.out.println("Static Constructor");
	}
	
	public ProductValidator() {
		System.out.println("Constructor");
	}
	public static boolean isValid(Product product) {
		if(product.price>0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	public void operasyon() {
		System.out.println("Operasyon");
	}
	
	//public static class operasyon2 {//inner class yapisi
		//public static void sil() {
			
		//}
	//}
}
