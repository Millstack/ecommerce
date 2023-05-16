package com.infosys.ecommerce.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.ecommerce.model.MyOrder;
import com.infosys.ecommerce.repository.MyOrderRepository;
import com.infosys.ecommerce.service.MyOrderService;

@Service
public class MyOrderServiceImp implements MyOrderService{

	@Autowired
	private MyOrderRepository repository;
	
//	save order
	@Override
	public MyOrder saveMyOrder(MyOrder order) {
		return repository.save(order);
	}

//	update order
	@Override
	public MyOrder updateMyOrder(MyOrder order, int id) {
		MyOrder mo = getMyOrderById(id);
		if(order.getAmount() != 0) {
			mo.setAmount(order.getAmount());
		}
		return repository.save(mo);
	}

//	get all orders
	@Override
	public List<MyOrder> getAllMyOrders() {
		return repository.findAll();
	}

//	get order by id
	@Override
	public MyOrder getMyOrderById(int id) {
		return repository.findById(id).get();
	}

//	delete order
	@Override
	public String deleteMyOrder(int id) {
		repository.deleteById(id);
		return "Order with ID " + id + " has been deleted";
	}
}