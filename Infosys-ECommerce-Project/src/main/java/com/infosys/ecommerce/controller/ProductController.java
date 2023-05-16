package com.infosys.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.ecommerce.model.Product;
import com.infosys.ecommerce.serviceimplementation.ProductServiceImp;

@RestController
public class ProductController {

	@Autowired
	private ProductServiceImp service;
	
//	http://localhost:8080/swagger-ui/index.html
	
//	save product
	@PostMapping ("/product")
	public Product saveproduct (@RequestBody Product product) {
		return service.saveProduct(product);
	}
	
//	update product
	@PutMapping("/product/{id}")
	public Product updateProduct(@RequestBody Product product, @PathVariable int id) {
		return service.updateProduct(product, id);
	}
	
//	get all products
	@GetMapping("/products")
	public List<Product> getAllProducts(){
		return service.getAllProduct();
	}
	
//	get product by id
	@GetMapping("/product/{id}")
	public Product getProductById (@PathVariable int id) {
		return service.getProductById(id);
	}
	
//	delete product
	@DeleteMapping("/product/{id}")
	public String deleteProduct(@PathVariable int id) {
		return service.deleteProduct(id);
	}
	
//===============================================================
	
//	find by name
	@GetMapping("/product/name/{name}")
	public List<Product> findProductByName(String name){
		return service.findByName(name);
	}
	
	
//	find by price
	@GetMapping("/product/price/{price}")
	public List<Product> findProductByPrice(String price){
		return service.findByPrice(price);
	}
	
//	find by brand
	@GetMapping("/product/brand/{brand}")
	public List<Product> findProductByBrand(String brand){
		return service.findByBrand(brand);
	}	
}