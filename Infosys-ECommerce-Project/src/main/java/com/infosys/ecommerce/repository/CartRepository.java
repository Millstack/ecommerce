package com.infosys.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.ecommerce.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer> {

}