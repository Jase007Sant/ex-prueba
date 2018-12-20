package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Moscoso;
import com.example.demo.repository.MoscosoRepository;

@Service
public class MoscosoService {

	@Autowired
	MoscosoRepository dao;
	
	public Moscoso save(Moscoso moscoso){
		System.out.println("****** Gravar Moscoso **");
		return dao.saveAndFlush(moscoso);
	}
	
	public List<Moscoso> listadoMoscosos(){
		System.out.println("****** Listado Moscosos **");
		return dao.findAll();
	}
	
}
