package com.afonsomarques.wsspringjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.afonsomarques.wsspringjpa.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	
	
}
