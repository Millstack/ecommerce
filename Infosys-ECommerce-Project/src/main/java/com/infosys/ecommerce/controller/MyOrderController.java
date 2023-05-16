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

import com.infosys.ecommerce.model.MyOrder;
import com.infosys.ecommerce.serviceimplementation.MyOrderServiceImp;

@RestController
public class MyOrderController {

	@Autowired
	private MyOrderServiceImp service;
	
//	save order
	@PostMapping("/order")
	public MyOrder saveMyOrder(@RequestBody MyOrder order) {
		return service.saveMyOrder(order);
	}
	
//	update order
	@PutMapping("/order/{id}")
	public MyOrder updateMyOrder (@RequestBody MyOrder order, @PathVariable int id) {
		return service.updateMyOrder(order, id);
	}
	
//	get all orders
	@GetMapping("/orders")
	public List<MyOrder> getAllMyOrder(){
		return service.getAllMyOrders();
	}
	
//	get order by id
	@GetMapping("/order/{id}")
	public MyOrder getMyOrderById (@PathVariable int id) {
		return service.getMyOrderById(id);
	}
	
//	delete order by id
	@DeleteMapping("/order/{id}")
	public String deleteMyOrder (@PathVariable int id) {
		return service.deleteMyOrder(id);
	}
}