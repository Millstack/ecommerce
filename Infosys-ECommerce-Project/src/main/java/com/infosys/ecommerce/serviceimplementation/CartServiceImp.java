package com.infosys.ecommerce.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.ecommerce.model.Cart;
import com.infosys.ecommerce.repository.CartRepository;
import com.infosys.ecommerce.service.CartService;

@Service
public class CartServiceImp implements CartService{

	@Autowired
	private CartRepository repository;
	
//	save cart
	@Override
	public Cart saveCart(Cart cart) {
		return repository.save(cart);
	}

//	get all carts
	@Override
	public List<Cart> getAllCarts() {
		return repository.findAll();
	}

//	get cart by id
	@Override
	public Cart getCartById(int id) {
		return repository.findById(id).get();
	}

//	delete cart
	@Override
	public String deleteCart(int id) {
		repository.deleteById(id);
		return "Cart with ID " + id + " has been deleted";
	}
}