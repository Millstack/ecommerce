package com.infosys.ecommerce.service;

import java.util.List;

import com.infosys.ecommerce.model.Product;

public interface ProductService {
	
//	save product
	public Product saveProduct (Product product);
	
//	update product
	public Product updateProduct (Product product, int id);
	
//	get all products
	public List<Product> getAllProduct();
	
//	get product by id
	public Product getProductById(int id);
	
//	delete product
	public String deleteProduct(int id);
	
//======={ Custom finder methods }=======
	
//	find by name
	public List<Product> findByName (String name);
	
//	find by price
	public List<Product> findByPrice (String price);
	
//	find by brand
	public List<Product> findByBrand (String brand);
}