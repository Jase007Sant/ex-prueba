package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Personal;
import com.example.demo.repository.PersonalRepository;

@Service
public class PersonalService {

	@Autowired
	PersonalRepository dao;  

	public Personal save(Personal persona){
		return dao.saveAndFlush(persona);
	}
	
	public List<Personal> listadoPersonal(){
		System.out.println("******Listado");
		return (List<Personal>) dao.findAll();
	}
	
	public Personal findByExpediente(String expediente){
		System.out.println("******findByExpediente");
		return dao.findByExpediente(expediente);
	}
	
	public Personal findId(Long id){
		System.out.println("****** findId **");
		return dao.findById(id).orElse(null);
	}
	
}
