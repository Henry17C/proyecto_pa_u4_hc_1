package com.example.demo;


import java.util.ArrayList;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.persona.web.modelo.Persona;
import com.example.demo.persona.web.repo.IPersonaRepo;







@SpringBootApplication
public class ProyectoPaP4HcApplication implements CommandLineRunner{

	@Autowired
	IPersonaRepo iPersonaRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaP4HcApplication.class, args);
	}
	
	



	@Override
	public void run(String... args) throws Exception {
	/*
		Persona per = new Persona();
		
		per.setApellido("Mendez");
		per.setCedula("12345");
		per.setGenero("M");
		per.setNombre("Jose");
		
		iPersonaRepo.crear(per);*/
		
		ArrayList <Persona> lp=(ArrayList<Persona>) iPersonaRepo.buscar();
		
		for (Persona persona : lp) {
			System.out.println(persona);
		}
		
		
		
		
		
	}

}
