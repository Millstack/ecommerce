package com.infosys.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.infosys.ecommerce.model.Product;

@RepositoryRestResource (collectionResourceRel = "product", path = "product")
public interface ProductRepository extends JpaRepository<Product, Integer> {

//	Custom Finder Methods
	
//	find by name
	public List<Product> findByName (String name); 
	
//	find by price
	public List<Product> findByPrice(String price);
	
//	find by brand
	public List<Product> findByBrand (String brand);
}