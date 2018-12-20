package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Personal;
 
public interface PersonalRepository extends JpaRepository<Personal, Long> {
	
	Personal findByExpediente(String expediente);
	
}
