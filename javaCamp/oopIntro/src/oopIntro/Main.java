package oopIntro;



public class Main {

	public static void main(String[] args) {
		//Classlar referans tiptir
		//Classlar özellik tutan ve iþ yapan(metot) olmak üzere ikiye ayrýlr.
		
		Product product1=new Product(1,"Lenova V14",15000,"16 GB Ram",10);//Referans Oluþturma,instance
		//product1.id=1;
		//product1.name="Lenovo V14";
		//product1.unitPrice=15000;
		//product1.detail="16 GB Ram";
		
		Product product2=new Product(); //Referans Oluþturma,instance
		product2.setId(2);
		product2.setName("Lenova V15");
		product2.setDetail("16 GB Ram");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		Category category1=new Category();
		category1.setId(1);
		category1.setName("Ýcecek");
		
		Category category2=new Category();
		category2.setId(2);
		category2.setName("Yiyecek");
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());
		
		ProductManager productManager=new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		
		
		
		
		
	}

}
