package com.infosys.ecommerce.service;

import java.util.List;

import com.infosys.ecommerce.model.Cart;

public interface CartService {

//	save cart
	public Cart saveCart(Cart cart);

//	get all carts
	public List<Cart> getAllCarts();

//	get cart by id
	public Cart getCartById(int id);

//	delete cart
	public String deleteCart(int id);
}