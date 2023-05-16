package com.infosys.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.ecommerce.model.Cart;
import com.infosys.ecommerce.serviceimplementation.CartServiceImp;

@RestController
public class CartController {
	
	@Autowired
	private CartServiceImp service;
	
//	save cart
	@PostMapping("/cart")
	public Cart saveCart (@RequestBody Cart cart) {
		return service.saveCart(cart);
	}
	
//	get all carts
	@GetMapping("/carts")
	public List<Cart> getAllCart(){
		return service.getAllCarts();
	}
	
//	get cart by id
	@GetMapping("/cart/{id}")
	public Cart getCartById (@PathVariable int id) {
		return service.getCartById(id);
	}
	
//	delete cart
	@DeleteMapping("/cart/{id}")
	public String deleteCart (@PathVariable int id) {
		return service.deleteCart(id);
	}
}