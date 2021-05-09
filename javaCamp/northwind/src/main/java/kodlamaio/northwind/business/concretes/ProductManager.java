package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;

@Service //Bu class servis gorevi gorcek demek.
public class ProductManager implements ProductService{
	
	private ProductDao productDao;
	
	@Autowired //ProductDao'nun instancesi olmadigindan arka tarafta bu ProductDaoya instance olusturur.Bagimlilik olusturur.
	//kısaca productDao nun ne oldugunu benim sana verebilmem icin bunun üstüne Autowired ekle diyo
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao=productDao;
	}
	
	@Override
	public List<Product> getAll() {
		
		return this.productDao.findAll();
	}

}
