package com.infosys.ecommerce.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.ecommerce.model.Product;
import com.infosys.ecommerce.repository.ProductRepository;
import com.infosys.ecommerce.service.ProductService;

@Service
public class ProductServiceImp implements ProductService {

	@Autowired
	private ProductRepository repository;
	
//	save product
	@Override
	public Product saveProduct(Product product) {
		return repository.save(product);
	}

//	update product
	@Override
	public Product updateProduct(Product product, int id) {
		Product prod = getProductById(id);
		if(product.getName() != null) {
			prod.setName(product.getName());
		}
		if(product.getPrice() != null) {
			prod.setPrice(product.getPrice());
		}
		if(product.getDescription() != null) {
			prod.setDescription(product.getDescription());
		}
		if(product.getBrand() != null) {
			prod.setBrand(product.getBrand());
		}
		return repository.save(prod);
	}

//	get all products
	@Override
	public List<Product> getAllProduct() {
		return repository.findAll();
	}

//	get product by id
	@Override
	public Product getProductById(int id) {
		return repository.findById(id).get();
	}

//	delete product
	@Override
	public String deleteProduct(int id) {
		repository.deleteById(id);
		return "Product with ID " + id + " has been deleted";
	}
	
//============{ Custom Finder Methods }============

//	find by name
	@Override
	public List<Product> findByName(String name) {
		return repository.findByName(name);
	}

//	find by price
	@Override
	public List<Product> findByPrice(String price) {
		return repository.findByPrice(price);
	}

//	find by brand
	@Override
	public List<Product> findByBrand(String brand) {
		return repository.findByBrand(brand);
	}
}