package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.persona.web.modelo.Persona;
import com.example.demo.persona.web.service.IPersonaService;

@Controller
@RequestMapping("/personas")//manejamos el recurso persona, se maneja el recurso el plural
public class PersonaController {
	
	@Autowired
	private IPersonaService iPersonaService;
	
	/*    /personas/nuevaPersona  */
	
	@GetMapping("/nuevaPersona")
	public String paginaNuevaPersona(Persona persona) {
		
		
		return "vistaNuevaPersona";
	}
	
	
	@PostMapping("/insertar")
	public String insertarPersona(Persona persona) {
		this.iPersonaService.guardar(persona);
		
		return "guardado";
	}
	
	@GetMapping("/buscar")
	public String buscarTodos(Model modelo) {
		List<Persona> lista=this.iPersonaService.buscarTodos();
		modelo.addAttribute("personas",lista);
		return "vistaListaPersonas";
	}
	
	
	@DeleteMapping("/borrar/{id}")
	public String borrarPersona(@PathVariable("id") Integer id) {
		
		this.iPersonaService.eliminar(id);
		return "redirect:/personas/buscar";// regirge a buscar y se actualiza a la nueva lista sin el elemnto eliminado
		
	}
	
	@GetMapping("/buscarPorId/{id}")
	public String buscarPorId(@PathVariable("id") Integer id, Model modelo) {
		Persona persona=this.iPersonaService.buscarPorId(id);
		modelo.addAttribute("persona",persona);
		return "vistaPersona";
		
		
		
	}

	
	@PutMapping("/actualizar/{idPersona}")
	public String actualizarPersona(@PathVariable("idPersona") Integer id, Persona persona) {
		persona.setId(id);
		this.iPersonaService.actualizar(persona);
		return "redirect:/personas/buscar";
	}
	
	
	
	

}
