package com.afonsomarques.wsspringjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.afonsomarques.wsspringjpa.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
	
	
}
