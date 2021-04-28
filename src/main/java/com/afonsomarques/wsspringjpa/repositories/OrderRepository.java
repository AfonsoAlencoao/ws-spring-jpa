package com.afonsomarques.wsspringjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.afonsomarques.wsspringjpa.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
	
	
}
