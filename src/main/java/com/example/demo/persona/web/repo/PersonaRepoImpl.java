package com.example.demo.persona.web.repo;

import java.util.List;

import org.springframework.stereotype.Repository;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import com.example.demo.persona.web.modelo.Persona;



@Repository
@Transactional
public class PersonaRepoImpl implements IPersonaRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public List<Persona> buscar() {
		
		Query query=this.entityManager.createNativeQuery("SELECT * FROM persona", Persona.class);
		
		return query.getResultList();
	}

	@Override
	public Persona buscarPorId(Integer id) {
		
		return this.entityManager.find(Persona.class, id);
	}

	@Override
	public void actualizar(Persona persona) {
		this.entityManager.merge(persona);
		
	}

	@Override
	public void eliminar(Integer id) {
		Persona persona= buscarPorId(id);
		this.entityManager.remove(persona);
		
	}

	@Override
	public void crear(Persona persona) {
		this.entityManager.persist(persona);
		
	}

}
