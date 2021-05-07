package com.afonsomarques.wsspringjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.afonsomarques.wsspringjpa.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	
	
}
