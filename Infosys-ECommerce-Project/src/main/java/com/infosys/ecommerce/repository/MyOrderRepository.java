package com.infosys.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.ecommerce.model.MyOrder;

public interface MyOrderRepository extends JpaRepository<MyOrder, Integer> {

}