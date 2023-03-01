package com.example.demo.persona.web.repo;

import java.util.List;

import com.example.demo.persona.web.modelo.Persona;

public interface IPersonaRepo {
	
	
	

	
	public List<Persona> buscar();
	
	public Persona buscarPorId(Integer id);
	public void actualizar(Persona persona);
	public void eliminar(Integer id);
	public void crear(Persona persona);

}
