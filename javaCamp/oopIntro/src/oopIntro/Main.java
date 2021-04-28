package oopIntro;



public class Main {

	public static void main(String[] args) {
		//Classlar referans tiptir
		//Classlar �zellik tutan ve i� yapan(metot) olmak �zere ikiye ayr�lr.
		Product product1=new Product(1,"Lenova V14",15000,"16 GB Ram");//Referans Olu�turma,instance
		//product1.id=1;
		//product1.name="Lenovo V14";
		//product1.unitPrice=15000;
		//product1.detail="16 GB Ram";
		
		Product product2=new Product();//Referans Olu�turma,instance
		product2.id=2;
		product2.name="Lenovo V15";
		product2.unitPrice=16000;
		product2.detail="32 GB Ram";
		
		Product product3=new Product();//Referans Olu�turma,instance
		product3.id=3;
		product3.name="Hp 5";
		product3.unitPrice=10000;
		product3.detail="8 GB Ram";
		
		//Olu�turdu�umuz product1,product2,product3 Stackte bulunur fakat bunlar�n id,name,unitPrice,detaili Heapte bulunur.
		Product[] products= {product1,product2,product3};
		
	    for(Product product: products) {
	    	System.out.println(product.name);
	    }
		
		System.out.println(products.length);
		
		
		Category category1=new Category();
		category1.id=1;
		category1.name="Bilgisayar";
		
		Category category2=new Category();
		category2.id=2;
		category2.name="Ev/Bah�e";
		
		
		ProductManager productManager=new ProductManager();
		productManager.addToCart(product1);
		
		productManager.addToCart(product2);
		
		productManager.addToCart(product3);
		
		
		
	}

}
