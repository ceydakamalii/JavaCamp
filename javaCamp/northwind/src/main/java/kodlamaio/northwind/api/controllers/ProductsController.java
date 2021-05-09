package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.entities.concretes.Product;

@RestController //sen bi controllersin demek.
@RequestMapping("/api/products") 
public class ProductsController {
	
	private ProductService productService;
	
	@Autowired
	public ProductsController(ProductService productService) {
		this.productService=productService;
	}
	
	@GetMapping("/getall")
	public List<Product> getAll(){
		return this.productService.getAll();
	}

}
//RequestMapping("")
//kodlama.io/api/products boyle bir istek gelirse bunu ProductsController karsilasin demek için RequestMapping("/api/products") yazarız.
//http istekleri ikiye ayrilir bir bana veriyi ver ,iki veriyi degistir.
//veri ver istegi icin GetMapping yapariz