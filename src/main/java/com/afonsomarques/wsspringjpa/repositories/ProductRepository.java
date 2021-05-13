package com.afonsomarques.wsspringjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.afonsomarques.wsspringjpa.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	
	
}
