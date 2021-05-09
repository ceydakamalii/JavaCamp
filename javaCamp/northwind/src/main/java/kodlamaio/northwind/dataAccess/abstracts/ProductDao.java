package kodlamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product,Integer>{
//JpaRepository bir tablo(nesne) ve o tablodaki primarykey typesini alir.Bunun icinde CRUD islemleri vardir.
}
