package com.example.demo.persona.web.service;

import java.util.List;

import com.example.demo.persona.web.modelo.Persona;

public interface IPersonaService {
	
	public List<Persona> buscarTodos();
	
	public Persona buscarPorId(Integer id);
	public void actualizar(Persona persona);
	public void eliminar(Integer id);
	public void guardar(Persona persona);

}
