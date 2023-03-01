package com.example.demo.persona.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.persona.web.modelo.Persona;
import com.example.demo.persona.web.repo.IPersonaRepo;

@Service
public class PersonaServiceImpl implements IPersonaService{
	@Autowired
	private IPersonaRepo iPersonaRepo;
	
	
	@Override
	public List<Persona> buscarTodos() {
		// TODO Auto-generated method stub
		return iPersonaRepo.buscar();
	}

	@Override
	public Persona buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return iPersonaRepo.buscarPorId(id);
	}

	@Override
	public void actualizar(Persona persona) {
		// TODO Auto-generated method stub
		iPersonaRepo.actualizar(persona);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		iPersonaRepo.eliminar(id);
	}

	@Override
	public void guardar(Persona persona) {
		// TODO Auto-generated method stub
		iPersonaRepo.crear(persona);
	}

}
