
public class Main {

	public static void main(String[] args) {
		
		//Product product=new Product();
		//product.setName("Laptop");
		//product.setId(1);
		//product.setDescription("Asus Laptop");
		//product.setPrice(5000);
		//product.setStockAmount(3);
		
		Product product=new Product(1,"Laptop","Asus Laptop",5000,3,"Black");
		
		ProductManager productManager=new ProductManager();
		productManager.Ekle(product);
		
		System.out.println("Code: "+product.getCode());
	}

}
