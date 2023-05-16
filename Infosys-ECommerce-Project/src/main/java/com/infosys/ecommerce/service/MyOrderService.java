package com.infosys.ecommerce.service;

import java.util.List;

import com.infosys.ecommerce.model.MyOrder;

public interface MyOrderService {

//	save order
	public MyOrder saveMyOrder(MyOrder order);

//	update order
	public MyOrder updateMyOrder(MyOrder order, int id);

//	get all orders
	public List<MyOrder> getAllMyOrders();

//	get order by id
	public MyOrder getMyOrderById(int id);

//	delete order
	public String deleteMyOrder(int id);
}