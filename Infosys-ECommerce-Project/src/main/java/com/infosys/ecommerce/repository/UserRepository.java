package com.infosys.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.ecommerce.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}